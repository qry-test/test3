package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.beans.User;
import com.example.demo.beans.vo.RequestPageResult;
import com.example.demo.iservice.IUserSV;
import com.example.demo.response.ReturnData;
import com.example.demo.response.ReturnJson;
import com.github.pagehelper.PageInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @ClassName UserController
 * @Package com.example.demo.controller
 * @Description
 * @Author qurongyao
 * @Date 2020/4/16 14:31
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    IUserSV iUserSV;

    /**
     * @Author: qurongyao
     * @Description:
     * @Date: 2020/4/20 8:52
     * @Param [uid]
     * @return com.example.demo.response.ReturnData
     */
    @RequestMapping(value = "/aaa/{id}"    ,method = RequestMethod.GET)
    public ReturnData getUser(@PathVariable("id") int uid){

        ReturnData returnData = new ReturnData();
        returnData.setStatus(200);
        returnData.setMassage("ok,没毛病");

        ReturnJson returnJson = new ReturnJson();
        returnJson.setPageId(111);
        returnJson.setStatus(200);
        List list = new ArrayList();
        list.add(uid);
        list.add(2);
        list.add(3);
        returnJson.setList(list);
        returnData.setReturnJson(returnJson);
        String s = JSON.toJSONString(returnData);
        System.out.println(s);
        System.out.println(returnData+"----");
        return returnData;
    }

    /**
     * @Author: qurongyao
     * @Description:
     * @Date: 2020/4/20 8:53
     * @Param [uid]
     * @return int
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{uid}")
    public int deleteByPrimaryKey(@PathVariable("uid") Integer uid) {


        System.out.println(uid);
        return iUserSV.deleteByPrimaryKey(uid);
    }

    /**
     * @Author: qurongyao
     * @Description:
     * @Date: 2020/4/20 8:53
     * @Param [record]
     * @return int
     */
    @RequestMapping("/insert")
    public int insert(@RequestBody User record) {

        System.out.println(record);
        return iUserSV.insert(record);
    }
    @RequestMapping("/insertSelective")
    public int insertSelective(@RequestBody User record) {
        System.out.println(record);
        return iUserSV.insertSelective(record);
    }
    @GetMapping("/selectByPrimaryKey/{id}")
    public User selectByPrimaryKey(@PathVariable("id") Integer uid) {
        System.out.println(uid);
        return iUserSV.selectByPrimaryKey(uid);
    }
    @PutMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(@RequestBody User record) {
        System.out.println(record);
        return iUserSV.updateByPrimaryKeySelective(record);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestBody User record) {
        System.out.println(record);
        return iUserSV.updateByPrimaryKey(record);

    }
    @RequestMapping("/selectUser")
    public ReturnData selectUser(@RequestBody RequestPageResult requestPageResult){
        if(requestPageResult.getPageNum()==0 && requestPageResult.getPageSize()==0){
            requestPageResult.setPageNum(0);
            requestPageResult.setPageSize(5);
        }
        List<User> users = iUserSV.selectUser(requestPageResult);
        PageInfo<User> info = new PageInfo<>(users);
        info.getPageSize();
        info.getPageNum();
        info.getSize();
        info.getTotal();
        info.getPages();
        System.out.println("pages"+info.getPages());

        System.out.println("size:"+info.getSize());
        System.out.println("PageSize:"+info.getPageSize());
        System.out.println("PageNum"+info.getPageNum());
        System.out.println("Total"+info.getTotal());
        ReturnData returnData = new ReturnData();
        returnData.setResultList(info.getList());
        returnData.setTotal(info.getTotal());
        returnData.setPageSize(info.getPageSize());
        returnData.setPageNum(info.getPageNum());
        return returnData;
    }
}
