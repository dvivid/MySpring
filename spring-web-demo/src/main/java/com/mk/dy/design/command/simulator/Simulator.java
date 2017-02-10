package com.mk.dy.design.command.simulator;

import com.mk.dy.design.command.command.Command;
import com.mk.dy.design.command.command.impl.CommandOne;
import com.mk.dy.design.command.invoker.Invoker;
import com.mk.dy.design.command.receive.ReceiveOne;

/**

 * @author dvivid
 * @version V1.0
 * @Title Simulator
 * @Package com.mk.dy.design.command.simulator
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/8
 */
public class Simulator {


    //命令模式
    public static void main(String[] args) {
        ReceiveOne receiveOne = new ReceiveOne();
        Command commandOne = new CommandOne(receiveOne);
        Invoker invoker = new Invoker(commandOne);

        invoker.execute();
        invoker.undo();
    }
}
