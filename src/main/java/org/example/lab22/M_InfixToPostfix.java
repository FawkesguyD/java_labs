package org.example.lab22;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;

public class M_InfixToPostfix {
    private String expression = "";

    public M_InfixToPostfix(String expression) {
        this.expression = expression;
    }

    public M_InfixToPostfix() {
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        MyStack<Character> stack = new MyStack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char c = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                StringBuilder number = new StringBuilder();
                while (i < infixExpression.length() && (Character.isLetterOrDigit(infixExpression.charAt(i)) || infixExpression.charAt(i) == '.')) {
                    number.append(infixExpression.charAt(i));
                    i++;
                }
                postfixExpression.append(number).append(" ");
                i--;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop()).append(" ");
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Incorrect form";
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfixExpression.append(stack.pop()).append(" ");
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Incorrect form";
            }
            postfixExpression.append(stack.pop()).append(" ");
        }

        return postfixExpression.toString();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public static double calculateRPN(String postfixExpression) {
        MyStack<Double> stack = new MyStack<>();

        String[] tokens = postfixExpression.split(" ");

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            if (Character.isDigit(token.charAt(0)) || (token.length() > 1 && token.charAt(0) == '-' && Character.isDigit(token.charAt(1)))) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = applyOperator(token.charAt(0), operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static double applyOperator(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
        }
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }

    public static String calculate(String expression) {
        String postfixExpression = M_InfixToPostfix.infixToPostfix(expression);
        double number = M_InfixToPostfix.calculateRPN(postfixExpression);

        if (isInteger(number)) {
            // Если число целое, выводим только его целую часть
            return String.valueOf((int) number);
        } else {
            // В противном случае, используем DecimalFormat для форматирования с одним знаком после запятой
            DecimalFormat df = new DecimalFormat("0.0");
            return df.format(number);
        }
    }

    private static boolean isInteger(double number) {
        return number == (int) number;
    }


    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter expression: ");
            String input = in.nextLine();
            String result = calculate(input);
            System.out.println("Result of calculation: " + result);
        }
    }
}
