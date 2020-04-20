package com.example.demo.iservice;

import com.example.demo.beans.User;
import com.example.demo.beans.vo.RequestPageResult;
import com.example.demo.response.ReturnData;

import java.util.List;

/**
 * @ClassName IUserSV
 * @Package com.example.demo.iservice
 * @Description
 * @Author qurongyao
 * @Date 2020/4/17 9:16
 * @Version 1.0
 */
public interface IUserSV {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUser(RequestPageResult requestPageResult);
}
