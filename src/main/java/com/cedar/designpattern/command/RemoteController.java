package com.cedar.designpattern.command;

// 遥控器
public class RemoteController {

    // 开按钮的命令数组
    private Command[] onCommands;
    // 关按钮的命令数组
    private Command[] offCommands;
    // 撤销的命令
    private Command undoCommand;

    public RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            this.onCommands[i] = new NoCommand();
            this.offCommands[i] = new NoCommand();
        }
    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        this.onCommands[no] = onCommand;
        this.offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onBtnWasPushed(int no) {
        // 找到按下开的按钮，并调用对应的方法
        this.onCommands[no].execute();
        // 记录这次的操作，用于撤销
        this.undoCommand = this.onCommands[no];
    }

    // 按下关按钮
    public void offBtnWasPushed(int no) {
        // 找到按下关的按钮，并调用对应的方法
        this.offCommands[no].execute();
        // 记录这次的操作，用于撤销
        this.undoCommand = this.offCommands[no];
    }

    // 撤销
    public void undoBtnWasPushed() {
        this.undoCommand.undo();
    }

}
