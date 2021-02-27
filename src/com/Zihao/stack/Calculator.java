package com.Zihao.stack;

import java.util.Arrays;

public class Calculator {
    public static void main(String[] args){
        String expression = "3+2*6-15";
        System.out.println(removeParentheses("(3*2)+5"));
    }

    private static boolean isOperator(char current){
        return (current == '+' || current == '-' || current == '*' || current == '/');
    }

    private static int priority(int operator){
        if (operator == '*' || operator == '/'){
            return 1;
        }else if(operator == '+' || operator == '-'){
            return 0;
        }else{
            throw new RuntimeException("this char is not a operator");
        }
    }

    private static String removeParentheses(String expression){
        String result = "";
        int i = 0;
        int start = 0;
        int end;
        while (i < expression.length()){
            if (expression.charAt(i) == '('){
                start = i;
                while(expression.charAt(i) != ')'){
                    i++;
                }
                end = i;
                result += String.valueOf(calculateWithoutParentheses(expression.substring(start+1, end)));
            }else{
                result += expression.charAt(i);
            }
            i++;
        }
        return  result;
    }

    private static int calculateWithoutParentheses(String expression){
        CalculatorStack numberStack = new CalculatorStack(expression.length());
        CalculatorStack operatorStack = new CalculatorStack(expression.length());
        String number = "";
        int num1 = 0;
        int num2 = 0;
//        int res = 0;
        char current = ' ';
        for (int i = 0; i < expression.length(); i++){
            current = expression.charAt(i);
            if (isOperator(current)){
                numberStack.push(Integer.parseInt(number));
                number = "";
                if (operatorStack.isEmpty() || (priority(current) > priority(operatorStack.peek()))){
                    operatorStack.push(current);
                }else {
                    num1 = numberStack.pop();
                    num2 = numberStack.pop();
                    numberStack.push(calculate(num1, num2, operatorStack.pop()));
                    operatorStack.push(current);
                }
            }else{
                number += current - 48;
//                numberStack.push(current - 48);
            }
        }
        if (!number.equals("")){
            numberStack.push(Integer.parseInt(number));
            number = "";
        }
        while (!operatorStack.isEmpty()){
            num1 = numberStack.pop();
            num2 = numberStack.pop();
            numberStack.push(calculate(num1, num2, operatorStack.pop()));
        }
        return numberStack.pop();
    }

    private static int calculate(int num1, int num2, int operator){
        switch (operator){
            case '+':
                return num1+num2;
            case '-':
                return num2-num1;
            case '*':
                return num1*num2;
            case '/':
                return num2/num1;
        }
        throw new RuntimeException("this char is not a operator");
    }
}

class CalculatorStack{
    private int maxSize;
    private int[] stack;
    private int top;

    public CalculatorStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean push(int element){
        if (isFull()) {
            System.out.println("the stack is full");
            return false;
        }
        top++;
        stack[top] = element;
        return true;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        int temp = stack[top];
//        stack[top] = 0;
        top--;
        return temp;
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        return stack[top];
    }


    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return "CalculatorStack{" +
                "maxSize=" + maxSize +
                ", stack=" + Arrays.toString(stack) +
                ", top=" + top +
                '}';
    }
}
