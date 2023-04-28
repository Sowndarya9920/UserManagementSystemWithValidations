package com.geekster.UserManagementSystemWithValidations.service;

import com.geekster.UserManagementSystemWithValidations.model.User;
import com.geekster.UserManagementSystemWithValidations.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getDataOfUser();
    }

    public String addUsers(User user) {
        boolean status = userDao.save(user);
        if(status)
            return "User's were successfully added";
        else
            return " Invalid user data's inserted";
    }

    public User getUserById(String userId) {
        List<User> listNow = userDao.getDataOfUser();
        for(User user : listNow){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;

    }

    public String deleteUserById(String userId) {
        boolean response = false;
        List<User> listNow = userDao.getDataOfUser();
        for(User user : listNow){
            if(user.getUserId().equals(userId)){
                response = userDao.remove(user);
                if(response)
                    return "User was deleted ";
                else
                    return "User was not deleted";
            }
        }
        return "Invalid user";
    }

    public String updateUser(String userId, String email) {
        List<User> listNow = userDao.getDataOfUser();
        for(User user : listNow){
            if(user.getUserId().equals(userId)){
                userDao.remove(user);
                user.setEmail(email);
                userDao.save(user);
            }
            return "updated successfully";
        }
        return " Invalid user updated";
    }
}
