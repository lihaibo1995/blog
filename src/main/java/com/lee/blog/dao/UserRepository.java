package com.lee.blog.dao;

import com.lee.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;


//继承了JPA的增删改查，不用写sql了
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);

}
