package com.geekster.UserManagementSystemWithValidations.repository;

import com.geekster.UserManagementSystemWithValidations.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
   private List<User> userList ;
   public UserDao() {
       userList = new ArrayList<>();
       userList.add(new User("1","Sai","2004-02-12","sai@gmail.com","8794537860","2023-04-27","3:45"));
   }

    public List<User> getDataOfUser() {
       return userList;
    }

    public boolean save(User user) {
       userList.add(user);
       return true;
    }


    public boolean remove(User user) {
       userList.remove(user);
       return true;
    }
}
