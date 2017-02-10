package com.mk.dy.test;



import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**

 * @author dvivid
 * @version V1.0
 * @Title Md5Test
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2016/11/22
 */
public class Md5Test {


    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = messageDigest.digest("test".getBytes());
        System.out.println(byte2hex(bytes));
        System.out.println(DigestUtils.md5Hex("test"));




    }

    public static String byte2hex(byte[] bytes)
    {
        final String HEX = "0123456789abcdef";
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes)
        {
            sb.append(HEX.charAt((b >> 4) & 0x0f));
            sb.append(HEX.charAt(b & 0x0f));
        }

        return sb.toString();
    }

}
