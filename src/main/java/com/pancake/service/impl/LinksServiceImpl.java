package com.pancake.service.impl;

import com.pancake.dao.TraLinksMapper;
import com.pancake.pojo.TraLinks;
import com.pancake.service.LinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by zhibingze on 2018/9/14.
 */
@Service
public class LinksServiceImpl implements LinksService {

    @Autowired
    private TraLinksMapper LinksMapper;


    @Override
   // @Transactional
    public void appoint() {
        TraLinks traLinks = new TraLinks();
        traLinks.setName("哇哈哈");
        int i = LinksMapper.insert(traLinks);

        int k = LinksMapper.deleteByPrimaryKey(44l);
        if (k == 1 || i ==1) {
           int j=1/0;
        }


    }

    @Override
    public void pointCut() {
        System.out.println("Test PointCut!!!");
    }
}
