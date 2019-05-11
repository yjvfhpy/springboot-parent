package com.webull.controller;

import com.webull.BaseDao;
import com.webull.service.MineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author liujian@webull.com
 * @date 2019-05-11 00:42
 */

@RestController
public class MineController {
    @Autowired
    private MineService mineService;

    @Autowired
    private BaseDao baseDao;

    @RequestMapping("/")
    public String index() {
        List<Map<String, Object>> results =  baseDao.getJdbcTemplate().queryForList("SELECT * FROM `user` ");
        System.out.println(results);
        return mineService.sayHello();
    }
}