package com.example.demo.mapper;
import com.example.demo.model.UserProfile;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserProfileMapper {

    @Select("SELECT * FROM UserProfile WHERE id=#{id}")
    UserProfile getUserProfile(@Param("id") Long id);

    @Select("SELECT * FROM UserProfile")
    List<UserProfile> getUserProfileList();

    @Insert("INSERT INTO UserProfile VALUES (#{id}, #{name}, #{password}, #{phone}, #{address}, #{email})")
    int insertUserProfile(@Param("id") Long id,
                          @Param("name") String name,
                          @Param("password") String password,
                          @Param("phone") String phone,
                          @Param("address") String address,
                          @Param("email") String email);

    @Update("UPDATE UserProfile SET name=#{name}, password=#{password}, phone=#{phone}, address=#{address}, email=#{email} WHERE id=#{id}")
    int updateUserProfile(@Param("id") Long id,
                          @Param("name") String name,
                          @Param("password") String password,
                          @Param("phone") String phone,
                          @Param("address") String address,
                          @Param("email") String email);

    @Delete("DELETE FROM UserProfile WHERE id=#{id}")
    int deleteUserProfile(@Param("id") Long id);
}
