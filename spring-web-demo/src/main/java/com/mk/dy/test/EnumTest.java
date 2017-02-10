package com.mk.dy.test;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title EnumTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2016/12/21
 */
public class EnumTest {

    //颜色
    enum  Color{
        RED (0,"红色"),
        YELLOW(1,"黄色");
        private int code;
        private String name;
        Color(int code,String name){
            this.code = code;
            this.name = name;
        }
    }
    //图形
    enum Shape{
        RECTANGLE,CIRCLE
    }
    public static void main(String[] args) {
        testSwitchEnum(Color.RED);

    }

   public static void testSwitchEnum(Color color){
       switch (color){
           case RED :
               System.out.println(color.code+"-"+color.name);break;
           case YELLOW:System.out.println(color.code+"-"+color.name);break;
       }
   }
}
