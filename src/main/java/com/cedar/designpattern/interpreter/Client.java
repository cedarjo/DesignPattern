package com.cedar.designpattern.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果: " + expStr + "=" + calculator.run(var));
    }

    @SuppressWarnings("resource")
    private static Map<String, Integer> getValue(String expStr) {
        Map<String, Integer> var = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if ('+' == ch || '-' == ch) {
                continue;
            }
            System.out.println(ch + "=");
            var.put(ch + "", new Scanner(System.in).nextInt());
        }

        return var;
    }

    private static String getExpStr() throws IOException {
        System.out.println("请输入表达式: ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

}
