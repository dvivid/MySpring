package com.mk.dy.service.user;

import com.mk.dy.domain.User;
import com.mk.dy.repository.UserRepository;
import org.springframework.data.domain.Page;

import java.util.List;

/**

 * @author dvivid
 * @version V1.0
 * @Title IUserService
 * @Package com.mk.dy.service
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/20
 */
public interface IUserService {

    User findByName(String name);

    List<User> save(User... users);

    void deleteUserByName(String name);

    void updateUserByName(String name);

    Page<User> findUserPage(String name,int currentPage,int pageSize);
}
