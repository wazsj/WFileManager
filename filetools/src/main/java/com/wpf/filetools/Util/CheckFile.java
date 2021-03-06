package com.wpf.filetools.Util;

import java.io.File;

/**
 *  检查文件
 */

public class CheckFile {

    public static boolean CheckDir(String filePath) {
        File file = new File(filePath);
        return file.exists() || file.mkdirs();
    }

    //检查文件夹是否存在，不存在不创建
    public static boolean CheckDirNoMkDir(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

}