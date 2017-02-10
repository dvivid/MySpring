package com.mk.dy.design.command.command;

/**

 * @author dvivid
 * @version V1.0
 * @Title Command
 * @Package com.mk.dy.design.command.command
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/8
 */
public interface Command {

    void execute();
    void undo();
}
