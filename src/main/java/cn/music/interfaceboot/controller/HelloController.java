package cn.music.interfaceboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public Map<String,Object> index() {
        Map<String,Object> jsonMap=new HashMap<>();
        jsonMap.put("msg","hellow");
        return jsonMap;
    }

}
