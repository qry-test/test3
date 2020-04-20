package com.example.demo.response;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ReturnJson
 * @Package com.example.demo.response
 * @Description
 * @Author qurongyao
 * @Date 2020/4/16 15:57
 * @Version 1.0
 */
@Data
@ToString
public class ReturnJson {
    int pageId;
    int status;
    List list = new ArrayList();
}
