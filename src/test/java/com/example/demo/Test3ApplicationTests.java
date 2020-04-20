package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.response.ReturnData;
import com.example.demo.response.ReturnJson;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Test3Application.class)
class Test3ApplicationTests {

    @Test
    void contextLoads() {
        ReturnData returnData = new ReturnData();
        returnData.setStatus(200);
        returnData.setMassage("加油");
        ReturnJson returnJson = new ReturnJson();
        returnJson.setStatus(200);
        returnJson.setPageId(1);
        List list = new ArrayList<>();
        list.add(1);
        list.add("2");
        list.add("3");
        returnJson.setList(list);
        returnData.setReturnJson(returnJson);
        Object o = JSONObject.toJSON(returnData);
        /*JSONArray arr =(JSONArray) JSON.toJSON(returnData);
        System.out.println(arr);*/
        System.out.println(o);
        System.out.println(returnData);
    }

}
