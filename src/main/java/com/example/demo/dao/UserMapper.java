package com.example.demo.dao;

import com.example.demo.beans.User;
import com.example.demo.beans.vo.RequestPageResult;
import com.example.demo.response.ReturnData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUser(RequestPageResult requestPageResult);
}