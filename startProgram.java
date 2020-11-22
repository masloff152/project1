package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startProgram {

    public JFrame getProgram(){
        JFrame stp = new JFrame ("START");          // Создали входное окно
        stp.setBounds(500,200, 400, 400);

        Container contentpane = stp.getContentPane();                       // Создали контейнер
        contentpane.setPreferredSize(new Dimension(400,400));

        SpringLayout layout = new SpringLayout();           // Создали лэйауты
        contentpane.setLayout(layout);

        Component label = new JLabel("Логин");          // Создали компоненты
        Component label1 = new JLabel("Пароль");

        JTextField field = new JTextField();                 // Добавили текст на окно входа
        JTextField field1 = new JTextField();

        field.setPreferredSize(new Dimension(150,25));     // Указали размеры
        field1.setPreferredSize(new Dimension(150,25));

        JButton buttonNEXT = new JButton("ВХОД");                  // Создали кнопку
        buttonNEXT.setPreferredSize(new Dimension(100,40));  // Указали размер кнопке
        contentpane.add(buttonNEXT);
        contentpane.add(label);
        contentpane.add(label1);
        contentpane.add(field);
        contentpane.add(field1);

        layout.putConstraint(SpringLayout.WEST , label, 70,
                SpringLayout.WEST , contentpane);
        layout.putConstraint(SpringLayout.NORTH, label, 120,
                SpringLayout.NORTH, contentpane);
        layout.putConstraint(SpringLayout.NORTH, field, 120,
                SpringLayout.NORTH, contentpane);
        layout.putConstraint(SpringLayout.WEST , field, 19,
                SpringLayout.EAST , label      );
        layout.putConstraint(SpringLayout.WEST , buttonNEXT, 145,
                SpringLayout.WEST , contentpane);
        layout.putConstraint(SpringLayout.NORTH, buttonNEXT, 185,
                SpringLayout.NORTH, contentpane);
        layout.putConstraint(SpringLayout.WEST , label1, 70,
                SpringLayout.WEST , contentpane);
        layout.putConstraint(SpringLayout.NORTH, label1, 150,
                SpringLayout.NORTH, contentpane);
        layout.putConstraint(SpringLayout.NORTH, field1, 148,
                SpringLayout.NORTH, contentpane);
        layout.putConstraint(SpringLayout.WEST , field1, 9,
                SpringLayout.EAST , label1      );


        buttonNEXT.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                if (field.getText().equals("admin") && field1.getText().equals("admin"))
                    Menu.setVisible(true);
                stp.setVisible(false);
            }
        });


        stp.setVisible(true);


        return stp;
    }
}
