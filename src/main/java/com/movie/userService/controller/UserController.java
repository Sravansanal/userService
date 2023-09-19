package com.movie.userService.controller;
import com.movie.userService.model.UserModel;
import com.movie.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/customerService")
public class UserController {
    @Autowired
    UserService userService;

    @PutMapping("/updateUserService/{id}")
    public UserModel update(@RequestBody UserModel userModel,
                            @PathVariable(value = "id")Long id){
        return this.userService.updateInfo(userModel,id);
    }
    @DeleteMapping("/deleteUserService/{id}")
    public String delete(@PathVariable(value = "id")Long id){
        return this.userService.deleteInfo(id);

    }

}
