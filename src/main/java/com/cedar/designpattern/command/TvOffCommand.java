package com.cedar.designpattern.command;

public class TvOffCommand implements Command {

    // 聚合命令的接收者
    private TvReceiver tvReceiver;

    public TvOffCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }

}
