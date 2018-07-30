package com.pancake.service;

import com.pancake.pojo.TraLinks;

import java.util.List;

/**
 * Created by zhibingze on 2018/7/9.
 */
public interface EhcacheService {

    String getTimes(String params);

    List<TraLinks> findAll();
}
