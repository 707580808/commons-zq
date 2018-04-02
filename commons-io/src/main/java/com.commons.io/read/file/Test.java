package com.commons.io.read.file;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Copyright (C), 2016-2017 中盈优创
 * Test
 * Author: zhuqiang
 * Date: 17/8/22
 */
public class Test {
    public static void main(String[] args) {
        List<Map<String,Object>> list=new ArrayList<>();
        Queue<Map<String,Object>> queue=new LinkedBlockingQueue<>();
        for (int i=0;i<7;i++) {
            Map<String, Object> map=new HashMap<>();
            map.put("cc","sdcs");
            list.add(map);
            queue.offer(map);
        }
    }
}
