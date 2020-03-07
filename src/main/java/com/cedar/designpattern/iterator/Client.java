package com.cedar.designpattern.iterator;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<College> colleges = Arrays.asList(
                new ComputerCollege(),new InfoCollege());
        OutputImpl outputImpl = new OutputImpl(colleges);
        outputImpl.printCollege();
    }
    
}
