package com.mk.dy.service.user.impl;

import com.mk.dy.domain.User;
import com.mk.dy.repository.UserRepository;
import com.mk.dy.repository.impl.UserDao;
import com.mk.dy.service.user.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**

 * @author dvivid
 * @version V1.0
 * @Title UserService
 * @Package com.mk.dy.service.user
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/20
 */
@Service
public class UserService implements IUserService{

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserDao userDao;


    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    public List<User> save(User... users) {
        return userRepository.save(Arrays.asList(users));
    }

    public void deleteUserByName(String name) {
         userDao.deleteByName(name);
    }

    public void updateUserByName(String name) {
        userDao.updateByName(name);
    }

    public Page<User> findUserPage(String name,int currentPage,int pageSize) {
        return userDao.findUserByPage(name,currentPage,pageSize);
    }


}
