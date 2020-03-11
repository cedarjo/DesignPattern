package com.cedar.designpattern.state.order;

/**
 * 状态接口
 * 
 * @author xuxschn
 * @date 2020-03-12 00:04
 */
public interface State {

    // 电审
    void checkEvent(Context context);

    // 电审失败
    void checkFailEvent(Context context);

    // 定价发布
    void makePriceEvent(Context context);

    // 接单
    void acceptOrderEvent(Context context);

    // 无人接单失效
    void notPeopleAcceptEvent(Context context);

    // 付款
    void payOrderEvent(Context context);

    // 接单有人支付失效
    void orderFailureEvent(Context context);

    // 反馈
    void feedBackEvent(Context context);

    // 获取当前状态
    String getCurrentState();

}
