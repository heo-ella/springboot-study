package com.example.demo.controller;

import com.example.demo.mapper.CompanyMapper;
import com.example.demo.model.Company;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {
    private CompanyMapper mapper;

    public CompanyController(CompanyMapper mapper) {
        this.mapper = mapper;
    }

    @PutMapping("/put")
    public void putCompany(@RequestBody Company company) {
        mapper.insertCompany(company.getId(), company.getCompanyName());
    }

    @PostMapping("/{id}")
    public void postCompany(@PathVariable("id") Long id, @RequestBody Company company){
        mapper.updateCompany(id, company.getCompanyName());
    }
}
