package com.cedar.designpattern.command;

public class Client {

    public static void main(String[] args) {
        // 创建电灯命令的接收者
        LightReceiver lightReceiver = new LightReceiver();
        // 创建电灯相关的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 遥控器对象
        RemoteController remoteController = new RemoteController();
        // 为遥控器设置命令
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        // 操作
        System.out.println("--按下灯的开按钮--");
        remoteController.onBtnWasPushed(0);
        System.out.println("--按下灯的关按钮--");
        remoteController.offBtnWasPushed(0);
        System.out.println("--按下撤销按钮--");
        remoteController.undoBtnWasPushed();
        
        // 扩展电视机，新增一组类 TvReceiver TvOnCommand TvOffCommand
        TvReceiver tvReceiver = new TvReceiver();
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        // 操作
        System.out.println("--按下电视的开按钮--");
        remoteController.onBtnWasPushed(1);
        System.out.println("--按下电视的关按钮--");
        remoteController.offBtnWasPushed(1);
        System.out.println("--按下撤销按钮--");
        remoteController.undoBtnWasPushed();
    }

}
