package com.pancake.controller;

import com.alibaba.fastjson.JSONArray;
import com.pancake.dao.TestDAO;
import com.pancake.dao.TraLinksMapper;
import com.pancake.pojo.TraLinks;
import com.pancake.pojo.TraLinksExample;
import com.pancake.service.EhcacheService;
import com.pancake.service.MyService;
import com.pancake.service.impl.MyService1Impl;
import com.pancake.utils.ResultData;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zhibingze on 2018/7/4.
 */

@Controller
@RequestMapping("/springweb")
public class FileUploadController {

    @Autowired
    private TestDAO testDAO;

    @Autowired
    private TraLinksMapper traLinksMapper;

    @Resource
    private EhcacheService ehcacheService;

//    @Resource(name = "myService1Impl")
    private MyService myService;


    /*   public MyService setBean(MyService myService) {
           return new MyService1Impl();
       }*/
    public FileUploadController(MyService myService) {
        this.myService = myService;
    }


    @RequestMapping("/first")
    @ResponseBody
    public String first(String aa) {
        List<String> list = new ArrayList();
        list.add("zhi");
        list.add("bing");
        list.add("ze");
        list.add("只炳泽");
        return list.toString();
    }

    @RequestMapping("/firsts")
    public String firsts() {

        return "first";
    }

    @RequestMapping(value="/find")
    @ResponseBody
    public String findAll() {
        List<String> a = new ArrayList();
        a.add("123");
        a.add("深深的");
        a.add("456");

        List<Map<String, Object>> map =  testDAO.find();
        ResultData rd = new ResultData(map);
        rd.setMsg("成功!");
//        rd.setData(a);
        rd.setCode(200);
        return rd.toString();
    }

    @RequestMapping("/find2")
    @ResponseBody
    public String findAll2() {
        TraLinks traLinks =traLinksMapper.selectByPrimaryKey(6L);

        TraLinksExample example = new TraLinksExample();
        List<Integer> lst = new ArrayList();
        lst.add(1);
//        lst.add(2);
        TraLinksExample.Criteria criteria = example.createCriteria();
        criteria.andTypeIn(lst);
        List<TraLinks> tt = traLinksMapper.selectByExample(example);
        ResultData rd = new ResultData(tt);
        return rd.toString();
    }

    @RequestMapping("/find3")
    @ResponseBody
    public String findAll3() {
        ResultData rd = new ResultData(ehcacheService.findAll());
        return rd.toString();
    }

    public static void main(String []args){
        Date date  = new Date();
        // System.currentTimeMillis getTime()  都是获取当前时间的时间戳
        System.out.println(System.currentTimeMillis() == date.getTime());
    }

    @RequestMapping("/thanks")
    @ResponseBody
    public String print() {
      return  myService.getContent();
    }

    @RequestMapping(value="/receive/{name}",method = RequestMethod.GET)
    public void receive( @PathVariable("name") String name) {
        System.out.println(name);
    }
}

