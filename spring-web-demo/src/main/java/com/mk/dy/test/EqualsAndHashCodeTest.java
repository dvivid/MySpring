package com.mk.dy.test;

import com.mk.dy.domain.User;

import java.util.HashMap;
import java.util.Map;

/**

 * @author dvivid
 * @version V1.0
 * @Title EqualsAndHashCodeTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2016/12/8
 */
public class EqualsAndHashCodeTest {

    public static void main(String[] args) {
        Map<String,Object> info = new HashMap<String,Object>(){{
            put("1","1");
        }};
        User user = User.builder().setId("1").setName("1").setInfo(info).build();
        Map<User,String> test = new HashMap<User, String>();
        test.put(user,"1");
        System.out.println(user.hashCode());
        System.out.println(test.get(User.builder().setId("1").setName("1").setInfo(info).build()));

    }
}
