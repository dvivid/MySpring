package com.mk.dy.controller.user;

import com.mk.dy.domain.User;
import com.mk.dy.service.user.impl.UserService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**

 * @author dvivid
 * @version V1.0
 * @Title UserController
 * @Package com.mk.dy.controller.user
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/21
 */
@RestController
@RequestMapping(value = "mk/dy/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 普通查询
     * @param name
     * @return
     */
    @RequestMapping(value = "/find/{name}", method = RequestMethod.GET)
    public Object findUserByName(@PathVariable String name){
        User user = this.userService.findByName(name);
        return user;
    }


    /**
     * 分页查询
     * @param name
     * @param pageSize
     * @param pageNo
     * @return
     */
    @RequestMapping(value = "/find/{pageNo}/{pageSize}/{name}", method = RequestMethod.GET)
    public Page<User> findUsersByName(@PathVariable String name,
    @PathVariable int pageSize,@PathVariable int pageNo){
        return this.userService.findUserPage(name,pageNo,pageSize);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Object saveUser(@RequestBody User... users){
        return this.userService.save(users);
    }

    @RequestMapping(value = "/update/{name}", method = RequestMethod.GET)
    public Object updateUserByName(@PathVariable String name){
        this.userService.updateUserByName(name);
        return true;
    }

    @RequestMapping(value = "/delete/{name}", method = RequestMethod.GET)
    public Object deleteUserByName(@PathVariable String name){
         this.userService.deleteUserByName(name);
         return true;
    }



}
