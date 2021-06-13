package com.example.demo.controller;

import com.example.demo.mapper.UserProfileMapper;
import com.example.demo.model.UserProfile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserProfileController {

    private UserProfileMapper mapper;

    public UserProfileController(UserProfileMapper mapper){
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public UserProfile getUserProfile(@PathVariable("id") Long id){
        return mapper.getUserProfile(id);
    }

    @GetMapping("/all")
    public List<UserProfile> getUserProfileList(){
        return mapper.getUserProfileList();
    }

    @PutMapping("/put")
    public void putUserProfile(@RequestBody UserProfile userProfile){
        mapper.insertUserProfile(userProfile.getId(), userProfile.getName(), userProfile.getPhone(), userProfile.getAddress());
    }

    @PostMapping("/{id}")
    public void postUserProfile(@PathVariable("id") Long id, @RequestBody UserProfile userProfile){
        mapper.updateUserProfile(id, userProfile.getName(), userProfile.getPhone(), userProfile.getAddress());
    }

    @DeleteMapping("/{id}")
    public void deleteUerProfile(@PathVariable("id") Long id){
        mapper.deleteUserProfile(id);
    }
}
