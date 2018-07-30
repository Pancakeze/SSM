package com.pancake.service.impl;

import com.pancake.dao.TraLinksMapper;
import com.pancake.pojo.TraLinks;
import com.pancake.pojo.TraLinksExample;
import com.pancake.service.EhcacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhibingze on 2018/7/9.
 */
@Service
public class EhcacheServiceImpl implements EhcacheService

{
    @Autowired
    private TraLinksMapper traLinksMapper;

    @Override
    @Cacheable(value="cacheOne",key = "#params")
    public String getTimes(String params) {

        return System.currentTimeMillis() + "";
    }

    @Override
//    @Cacheable(value="studentCache")
    public List<TraLinks> findAll() {
        TraLinksExample tle = new TraLinksExample();
        TraLinksExample.Criteria criteria = tle.createCriteria();
        List<Integer> a = new ArrayList();
        a.add(1);
        criteria.andTypeIn(a);
        return traLinksMapper.selectByExample(tle);
    }
}
