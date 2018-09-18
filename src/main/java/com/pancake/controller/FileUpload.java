package com.pancake.controller;

import com.pancake.service.LinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhibingze on 2018/8/1.
 */

@Controller
@RequestMapping("/upload")
public class FileUpload {

    @Autowired
    private LinksService linksService;


    @RequestMapping(value = "fileupload", method = RequestMethod.GET)
    @ResponseBody
    public void fileupload(@RequestParam("myfile") MultipartFile myfile, HttpServletRequest request) {
        String fileName = myfile.getName();
        String pathName = myfile.getOriginalFilename();
        System.out.println();
        System.out.println("已接收到请求!");

    }

    @RequestMapping("")
    public String fileuppage() {
        return "fileupload";
    }


    @RequestMapping("/aspject")
    public void test() {
        linksService.pointCut();
    }
}
