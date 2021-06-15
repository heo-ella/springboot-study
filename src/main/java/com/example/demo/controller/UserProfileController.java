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

    // 각 사용자별 신청한 컨퍼런스 목록으로 변경 예정
    @GetMapping("/{id}")
    public UserProfile getUserProfile(@PathVariable("id") Long id){
        return mapper.getUserProfile(id);
    }

    @GetMapping("/all")
    public List<UserProfile> getUserProfileList(){
        return mapper.getUserProfileList();
    }

    // 회원가입
    @PutMapping("/put")
    public void putUserProfile(@RequestBody UserProfile userProfile){
        mapper.insertUserProfile(userProfile.getId(), userProfile.getName(), userProfile.getPassword(), userProfile.getPhone(), userProfile.getAddress(), userProfile.getEmail() );
    }

    // 나의 정보 수정
    @PostMapping("/{id}")
    public void postUserProfile(@PathVariable("id") Long id, @RequestBody UserProfile userProfile){
        mapper.updateUserProfile(id, userProfile.getName(),  userProfile.getPassword(), userProfile.getPhone(), userProfile.getAddress(), userProfile.getEmail());
    }

    // 아이디 삭제
    @DeleteMapping("/{id}")
    public void deleteUerProfile(@PathVariable("id") Long id){
        mapper.deleteUserProfile(id);
    }
}
