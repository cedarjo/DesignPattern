package com.cedar.designpattern.command;

public class LightOnCommand implements Command {

    // 聚合命令的接收者
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }

}
