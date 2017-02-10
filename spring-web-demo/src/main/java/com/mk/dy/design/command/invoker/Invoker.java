package com.mk.dy.design.command.invoker;

import com.mk.dy.design.command.command.Command;

/**

 * @author dvivid
 * @version V1.0
 * @Title Invoker
 * @Package com.mk.dy.design.command.invoker
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/8
 */
public class Invoker {

    private Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void execute(){
        command.execute();
    }
    public void undo(){
        command.undo();
    }
}
