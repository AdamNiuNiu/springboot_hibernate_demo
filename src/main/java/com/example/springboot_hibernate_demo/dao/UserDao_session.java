package com.example.springboot_hibernate_demo.dao;

import com.example.springboot_hibernate_demo.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDao_session {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;


    public List<User> findUserAll() {

//        NativeQuery sqlQuery = sessionFactory.getCurrentSession()
//        .createSQLQuery("select * from user ");
//        sqlQuery.setFirstResult(0);
//        sqlQuery.setMaxResults(2);
//        return sqlQuery.addEntity(User.class).list();

        Query from_user_ = sessionFactory.getCurrentSession()
        .createQuery("from User ");
        from_user_.setFirstResult(0);
        from_user_.setMaxResults(2);
        return from_user_.list();
    }

    public void saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
