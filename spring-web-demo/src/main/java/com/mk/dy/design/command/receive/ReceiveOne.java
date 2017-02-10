package com.mk.dy.design.command.receive;

/**

 * @author dvivid
 * @version V1.0
 * @Title ReceiveOne
 * @Package com.mk.dy.design.command.receive
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/8
 */
public class ReceiveOne {

    public void doExecute(){
        System.out.println("receiveOne is executing");
    }

    public void doBack(){
        System.out.println("receiveOne is undoing");
    }
}
