package com.shengsiyuan.netty.seven.proto;

import com.shengsiyuan.protobuf.DataInfo;

/**
 * @author bogle
 * @version 1.0 2018/11/28 下午8:28
 */
public class ProtoBufTest {

    public static void main(String[] args) {
        DataInfo.Student student = DataInfo.Student.newBuilder()
            .setName("张三")
            .setAge(20)
            .setAddress("北京")
            .build();

    }
}
