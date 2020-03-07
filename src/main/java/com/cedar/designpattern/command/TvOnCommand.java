package com.cedar.designpattern.command;

public class TvOnCommand implements Command {

    // 聚合命令的接收者
    private TvReceiver tvReceiver;

    public TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }

}
