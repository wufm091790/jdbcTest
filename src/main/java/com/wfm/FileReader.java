package com.wfm;

import java.io.File;
import java.net.URL;

public class FileReader {
    public static void main(String[] args) {
        String path = "/Users/wufangming/tony/git_test";		//要遍历的路径
        URL url = ClassLoader.getSystemResource("");
        File file = new File(url+"/"+"tmp");
        try {
            if(!file.exists())
                file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(file.exists());
        System.out.println(file);
//        File file = new File(path);		//获取其file对象
//        func(file);
    }

    private static void func(File file){
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory())	//若是目录，则递归打印该目录下的文件
                func(f);
            if(f.isFile())	 {
                //若是文件，直接打印
                System.out.println(f);
                System.out.println(f.getAbsolutePath());
                break;
            }
            if(true) {

            }

        }
    }
}
