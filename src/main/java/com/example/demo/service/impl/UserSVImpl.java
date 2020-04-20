package com.example.demo.service.impl;

import com.example.demo.beans.User;
import com.example.demo.beans.vo.RequestPageResult;
import com.example.demo.dao.UserMapper;
import com.example.demo.iservice.IUserSV;
import com.example.demo.response.ReturnData;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserSVImpl
 * @Package com.example.demo.service.impl
 * @Description
 * @Author qurongyao
 * @Date 2020/4/17 9:18
 * @Version 1.0
 */
@Service
@Transactional
public class UserSVImpl  implements IUserSV {

    @Autowired
    UserMapper userMapper;

    /*@Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }*/

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> selectUser(RequestPageResult requestPageResult) {
        PageHelper.startPage(requestPageResult.getPageNum(), requestPageResult.getPageSize());
        return userMapper.selectUser(requestPageResult);
    }


}
