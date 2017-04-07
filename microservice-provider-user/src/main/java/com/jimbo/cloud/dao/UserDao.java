package com.jimbo.cloud.dao;

import com.jimbo.cloud.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @author ruihui.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/4/6
 */
@Mapper
public interface UserDao {
    @Results({
        @Result(property = "userName",column = "user_name"),
        @Result(property = "passWord",column = "password"),
        @Result(property = "id" ,id = true,column = "id")
    })
    @Select("select * from t_user u where u.id = #{id} ")
    User getUserById( Integer id);

    @Insert("insert into t_user(id,user_name,password) values(#{id},#{userName},#{passWord})")
    void save(User u);
}
