package com.movie.userService.service;

import com.movie.userService.exception.IdNotFoundException;
import com.movie.userService.model.UserModel;
import com.movie.userService.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public UserModel updateInfo(UserModel userModel, Long id){
        UserModel oldData=this.userRepo.findById(id).orElseThrow(()->new IdNotFoundException("Id not found"));
        oldData.setName(userModel.getName());
        oldData.setPassword(userModel.getPassword());
        oldData.setLocation(userModel.getLocation());
        oldData.setEmailId(userModel.getEmailId());
        return this.userRepo.save(oldData);
    }
    public String deleteInfo(Long id){
        this.userRepo.deleteById(id);
        return "deleted Successfully";
    }
}
