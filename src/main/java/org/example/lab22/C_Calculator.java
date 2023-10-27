package org.example.lab22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_Calculator {
    private final V_App view = new V_App();
    private final M_InfixToPostfix model = new M_InfixToPostfix();

    public String getExpression() {
        return model.getExpression();
    }

    public void setExpression(String expression) {
        model.setExpression(expression);
    }

    public void updateScreen(String item, JButton button) {
        model.setExpression(getExpression() + item);
        view.screen.setText(getExpression());
    }

    public void CalculatorInterface() {

        JButton[] buttons = {
                view.button1, view.button2, view.button3, view.button4,
                view.button5, view.button6, view.button7, view.button8,
                view.button9, view.buttonPlus,
                view.buttonSub, view.buttonMul, view.buttonDiv
        };

        // кнопки добавляющие элементы
        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateScreen(button.getText(), button);
                    System.out.println(getExpression());
                }
            });
        }
        view.button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.screen.getText().equals("0")){
                    setExpression(getExpression());
                } else {
                    updateScreen(view.button0.getText(), view.button0);
                }
                System.out.println(getExpression());
            }
        });
        view.buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.screen.getText().equals("0")) {
                    updateScreen("0.", view.buttonPoint);
                }
                if (view.screen.getText().endsWith(".") || view.screen.getText().endsWith("-") || view.screen.getText().endsWith("+") || view.screen.getText().endsWith("/") || view.screen.getText().endsWith("*")) {
                    updateScreen("", view.buttonPoint);
                } else {
                    try {
                        updateScreen(view.buttonPoint.getText(), view.buttonPoint);
                    } catch (java.lang.NumberFormatException  ignored) {
                        view.screen.setText("error");
                        setExpression("");
                    }
                }
                System.out.println(getExpression());
            }
        });
        //посчитать результат
        view.buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setExpression(M_InfixToPostfix.calculate(getExpression()));
                    view.screen.setText(getExpression());
                } catch (IllegalStateException ignored) {
                    view.screen.setText("error");
                    setExpression("");
                }
                System.out.println(getExpression());
            }
        });

        view.buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.screen.setText("0");
                model.setExpression("");
                System.out.println(getExpression());
            }
        });
    }


}
