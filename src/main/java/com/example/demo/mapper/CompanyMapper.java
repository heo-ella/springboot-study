package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CompanyMapper {

    @Insert("INSERT INTO Company VALUES (#{id}, #{companyName})")
    int insertCompany(@Param("id") Long id,
                      @Param("companyName") String companyName);

    @Update("UPDATE UserProfile SET name=#{name} WHERE id=#{id}")
    int updateCompany(@Param("id") Long id,
                      @Param("companyName") String companyName);
}
