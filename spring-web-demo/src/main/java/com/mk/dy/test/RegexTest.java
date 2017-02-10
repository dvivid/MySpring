package com.mk.dy.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title RegexTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2016/12/22
 */
public class RegexTest {



    public static void main(String[] args) {
        checkLookingAt("hello","helloworld");
        checkLookingAt("hello","shelloworld");
        checkLookingAt("hello|shello","shelloworld");//匹配多个场景的，用|分割


        checkFind("hello","helloworld");
        checkFind("hello","shelloworld");


        //mather 表达式和字符串全匹配
        checkMatches("hello","hello");
        checkMatches("hello","helloworld");

        replaceTest();


        checkFind("\\s","helloworld \t\n\f\r"); //  \\s匹配\t\n\r\f等特殊字符
        checkFind("\\S","helloworld"); // \s的取反
    }

    /**
     * 从头部开始检查content字符串是否有匹配regex的子字符串
     * 实际是检查字符串头部开始是否有regex的字符串
     * 如 hello 在helloword中可以被匹配
     *    hello 在shello中匹配不到
     * @param regex
     * @param content
     */
    private static void checkLookingAt(String regex,String content){
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(content);
        if(matcher.lookingAt()){
            System.out.println(content + "\tlooking At:"+regex);
        }else {
            System.out.println(content + "\tnot looking At:"+regex);
        }
    }

    /**
     * 检查content字符串中是否有子字符串匹配regex，不管子字符串所在位置。
     * 如 hello 在helloworld中可以匹配，在shelloworld中也可以匹配
     * @param regex
     * @param content
     */
    private static void checkFind(String regex, String content) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        if (m.find()) {
            System.out.println(content + "\tfind： " + regex);
        } else {
            System.out.println(content + "\tnot find： " + regex);
        }
    }

    /**
     * 检查content字符串整体是否与regex匹配
     * 如hello 只能与hello匹配，无法与shello匹配
     * @param regex
     * @param content
     */
    private static void checkMatches(String regex, String content) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        if (m.matches()) {
            System.out.println(content + "\tmatches： " + regex);
        } else {
            System.out.println(content + "\tnot matches： " + regex);
        }
    }

    /**
     * 替换
     */
    private static void replaceTest(){
        String s = "选择正确的答案。|下列词语中，|选择正确的选项，";
        String content = "选择正确的选项，并填写到括号里（）。";
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(content);
        System.out.println(content);
        System.out.println(matcher.replaceAll(""));
    }
}
