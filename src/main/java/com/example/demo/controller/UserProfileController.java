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

    @GetMapping("{id}")
    public UserProfile getUserProfile(@PathVariable("id") Long id){
        return mapper.getUserProfile(id);
    }

    @GetMapping("/all")
    public List<UserProfile> getUserProfileList(){
        return mapper.getUserProfileList();
    }

    @PutMapping("/{id}")
    public void putUserProfile(@PathVariable("id") Long id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address){
        mapper.insertUserProfile(id,name,phone,address);
    }

    @PostMapping("/{id}")
    public void postUserProfile(@PathVariable("id") Long id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address){
        mapper.updateUserProfile(id,name,phone,address);
    }

    @DeleteMapping("/{id}")
    public void deleteUerProfile(@PathVariable("id") Long id){
        mapper.deleteUserProfile(id);
    }
}
