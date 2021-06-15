package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conference {

    private Integer id;
    private String title;
    private String content;
    private Long userProfileId;
    private Long companyProfileId;

}
