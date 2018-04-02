package com.commons.io.read.file;

import java.io.File;

/**
 * Copyright (C), 2016-2017 中盈优创
 * FileUtils
 * Author: zhuqiang
 * Date: 17/7/28
 */
public class FileUtils {
    public static void searchFile() {
        File file = new File("/Users/apple/IdeaProjects/op/op-api");
        String[] f = file.list();
        File[] files = file.listFiles();
        if (f != null) {
            System.out.println(f.toString());
        }
    }


    public static void main(String[] args) {
        searchFile();
    }
}
