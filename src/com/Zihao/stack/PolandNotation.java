package com.Zihao.stack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PolandNotation {
    public static void main(String[] args){
//        String suffixExpression = "3 4 + 5 * 6 -";
//        List<String> rpnList = Arrays.asList(suffixExpression.split(" "));
//        System.out.println(calculate(rpnList));
    }

    /**
     * the whole calculation function
     * @param expression
     * @return
     */
    public static int calculation(String expression){
        return calculate(parseSuffixExpressionList(toInfixExpressionList(expression)));
    }

    public static List<String> parseSuffixExpressionList(List<String> list){
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        List<String> result = new ArrayList<>();
        int counter = 0;
        while(counter < list.size()){
            String element = list.get(counter);
            if (element.matches("\\d+")){
                s2.push(element);
            }else{
                while (true){
                    if (element.equals("(") || s1.isEmpty() || s1.peek().equals("(") || isGreater(element, s1.peek())){
                        s1.push(element);
                        break;
                    }else if (element.equals(")")){
                        String peek = s1.pop();
                        while (!peek.equals("(")){
                            s2.push(peek);
                            peek = s1.pop();
                        }
                        break;
                    }else{
                        s2.push(s1.pop());
                    }
                }
            }
            counter++;
        }
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        while (!s2.isEmpty()){
            result.add(0, s2.pop());
        }
        return result;
    }

    public static boolean isGreater(String current, String peek){
        return ((current.equals("*") || current.equals("/")) && (peek.equals("+") || peek.equals("-")));
    }

    public static List<String> toInfixExpressionList(String expression){
        List<String> list = new ArrayList<>();
        int counter = 0;
        String temp = "";
        char current = ' ';
        while(counter<expression.length()){
            current = expression.charAt(counter);
            if (current<48||current>57){
                list.add(current+"");
                counter++;
            }else {
                while(current>=48 && current<=57){
                    temp += current;
//                    System.out.println(temp);
                    counter++;
                    if (counter<expression.length()){
                        current = expression.charAt(counter);
                    }else {
                        break;
                    }
                }
//                System.out.println(temp);
                list.add(temp);
                temp = "";
            }
        }
        return list;
    }

    public static int calculate(List<String> list){
//        List<String> list = Arrays.asList(suffixExpression.split(" "));
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