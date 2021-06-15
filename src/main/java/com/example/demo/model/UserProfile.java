package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
    private Long id;
    private String name;
    private String password;
    private String phone;
    private String address;
    private String email;
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedBy;
}
