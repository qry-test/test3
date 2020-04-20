package com.example.demo.beans.vo;

import com.example.demo.beans.User;
import lombok.Data;
import lombok.ToString;

/**
 * @ClassName RequestPageResult
 * @Package com.example.demo.beans.vo
 * @Description
 * @Author qurongyao
 * @Date 2020/4/17 16:40
 * @Version 1.0
 */
@Data
@ToString
public class RequestPageResult extends User {
    int pageNum;

    int pageSize;

    String uname;

    public RequestPageResult() {
    }

    public RequestPageResult(int pageNum, int pageSize,String uname) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.uname = uname;
    }
}
