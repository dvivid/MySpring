package com.mk.dy.repository;

import com.mk.dy.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**

 * @author dvivid
 * @version V1.0
 * @Title UserRepository
 * @Package com.mk.dy.repository
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/20
 */
@Repository(value = "userRepository")
public interface UserRepository extends MongoRepository<User,String> {

    User findByName(String name);

}
