package com.mk.dy.design.command.command.impl;

import com.mk.dy.design.command.command.Command;
import com.mk.dy.design.command.receive.ReceiveOne;
import com.mk.dy.design.decorator.wrapper.CondimentOne;

/**

 * @author dvivid
 * @version V1.0
 * @Title CommandOne
 * @Package com.mk.dy.design.command.command.impl
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/8
 */
public class CommandOne implements Command {
    private ReceiveOne receiveOne;

    public CommandOne(ReceiveOne receiveOne){
        this.receiveOne = receiveOne;
    }

    public void execute() {
        this.receiveOne.doExecute();
    }

    public void undo() {
        this.receiveOne.doBack();
    }
}
