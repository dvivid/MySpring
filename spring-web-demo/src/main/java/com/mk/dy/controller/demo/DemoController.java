package com.mk.dy.controller.demo;

import com.mk.dy.domain.User;
import com.mk.dy.service.user.impl.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author dvivid
 * @version V1.0
 * @Title DemoController
 * @Package com.mk.dy.controller.demo
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/12
 */
@RestController
@RequestMapping(value = "mk/dy/demo")
public class DemoController {



    @RequestMapping(value = "/first/{word}", method = RequestMethod.GET)
    public Object first(@PathVariable String word){
        User user = new User();
        user.setId("1");
        user.setName(word);
        Map<String,Object> map = new LinkedHashMap<String, Object>();
        map.put("sex","man");
        map.put("age",100);
        user.setInfo(map);
        return user;
    }

    @RequestMapping(value = "/first/user", method = RequestMethod.POST)
    public Object first(@RequestBody User user){
        user.setId("111");
        return user;
    }






}
