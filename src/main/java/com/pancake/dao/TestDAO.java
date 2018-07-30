package com.pancake.dao;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by zhibingze on 2018/7/5.
 */
public interface TestDAO {

    List<Map<String,Object>> find();

}
