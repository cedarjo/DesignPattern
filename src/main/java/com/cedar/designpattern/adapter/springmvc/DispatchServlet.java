package com.cedar.designpattern.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }
    
    public void doDispatch() {
        // 模拟
        Controller controller = new AnnotationController();
        HandlerAdapter adapter = getHandler(controller);
        adapter.handle(controller);
    }
    
    public HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter adapter : handlerAdapters) {
            if(adapter.support(controller)) {
                return adapter;
            }
        }
        throw new RuntimeException();
    }
    
    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }

}
