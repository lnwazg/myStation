package com.lnwazg.pressure;

import com.lnwazg.kit.http.HttpUtils;
import com.lnwazg.kit.testframework.TF;
import com.lnwazg.kit.testframework.anno.BenchmarkStage__;
import com.lnwazg.kit.testframework.anno.TestCase;

/**
 * 性能压测
 * @author nan.li
 * @version 2018年9月26日
 */
public class ServerTop
{
    public static void main(String[] args)
    {
        TF.l(ServerTop.class);
    }
    
    @BenchmarkStage__
    @TestCase
    void testHello()
    {
        String url = "http://127.0.0.1:8080/workinfo/hello.do";
        //        System.out.println(HttpUtils.doGet(url));
        HttpUtils.doGet(url);
    }
    
    @BenchmarkStage__
    @TestCase
    void testRss()
    {
        String url = "http://127.0.0.1:8080/rss/viewRss.do";
        HttpUtils.doGet(url);
    }
}
