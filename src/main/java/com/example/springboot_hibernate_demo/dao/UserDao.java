//package com.example.springboot_hibernate_demo.dao;
//
//import com.example.springboot_hibernate_demo.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManagerFactory;
//import java.util.List;
//
//@Repository
//public interface UserDao extends JpaRepository<User,Integer> {
//
//    //这里加nativeQuery = true的是原生sql的方式
//    @Query(nativeQuery=true,value="select * from user")
//    List<User> findUserAll();
//}
