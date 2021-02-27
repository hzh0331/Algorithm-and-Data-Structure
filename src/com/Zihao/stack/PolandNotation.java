package com.Zihao.stack;


import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PolandNotation {
    public static void main(String[] args){
        String suffixExpression = "3 4 + 5 * 6 -";
//        List<String> rpnList = Arrays.asList(suffixExpression.split(" "));
//        System.out.println(calculate(rpnList));
    }

    public static int calculate(String suffixExpression){
        List<String> list = Arrays.asList(suffixExpression.split(" "));
//        System.out.println(calculate(rpnList));
        Stack<String> stack = new Stack<>();
        for (String element:list){
            if (element.matches("\\d+")){
                stack.push(element);
            }else{
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(calculateTwoNumber(num1, num2, element)));
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static int calculateTwoNumber(int num1, int num2, String operator){
        switch (operator){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
        }
        throw new RuntimeException("operator is error");
    }

}