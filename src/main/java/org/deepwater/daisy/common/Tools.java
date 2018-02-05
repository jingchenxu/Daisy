package org.deepwater.daisy.common;

import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;

public class Tools {

    /**
     * @description MD5加密
     * @param str
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // 确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        // 加密后的字符串
        String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

    /**
     * @description 创建各种类型的编号
     * @param flag
     * @return
     */
    public static synchronized String CreateID(String flag) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String datestr = sdf.format(new Date());

        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 10);
            array[i] = String.valueOf(x);

        }
        String l = "";
        for (int i = 0; i < array.length; i++) {
            l += array[i];

        }
        String trString = flag + datestr + l;
        return trString;
    }

    public static boolean isOSLinux() {
        Properties prop = System.getProperties();

        String os = prop.getProperty("os.name");
        if (os != null && os.toLowerCase().indexOf("linux") > -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @description 图片上传方法
     * @param file
     * @param filePath
     * @param fileName
     * @throws Exception
     */
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    public static void main(String args[]) {
        try {
            System.out.println(EncoderByMd5("123456"));
            System.out.println("===========os.name:"+isOSLinux());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
