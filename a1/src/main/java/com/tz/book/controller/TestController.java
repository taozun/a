/**
 * Copyright (C), 2011-2017, 微贷网.
 */
package com.tz.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator 2017/6/21 0021.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/getList.json")
    public @ResponseBody Map<String, Object> getList(HttpServletRequest request, HttpServletResponse response,
            @RequestParam(value = "name", required = true) String name) {
        System.out.println(name);
        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("name", name);
        return retMap;
    }

    @RequestMapping(value = "/string.json")
    public @ResponseBody String string(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "name", required = true) String name) {
        System.out.println(name);
        return name;
    }

    @RequestMapping(value = "/jsp.json")
    public String jsp(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "name", required = true) String name) {
        System.out.println(name);
        return "index";
    }
}