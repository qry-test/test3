package com.example.demo.response;

import com.example.demo.beans.User;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @ClassName ReturnData
 * @Package com.example.demo.response
 * @Description
 * @Author qurongyao
 * @Date 2020/4/16 14:41
 * @Version 1.0
 */
@Data
@ToString
public class ReturnData {
    int status;
    String massage;

    int pageSize;

    long total;

    int pageNum;

    List<User> resultList;

    ReturnJson returnJson = new ReturnJson();
}
