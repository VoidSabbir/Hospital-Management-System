package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee_info extends JFrame {

    Employee_info(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setLayout(null);
        panel.setBackground(new Color(109,164,170));
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setBackground(new Color(109,164,170));
        table.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from EMP_INFO";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Name");
        label1.setBounds(21,9,70,20);
        label1.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Age");
        label2.setBounds(180,9,150,20);
        label2.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label2);

        JLabel label3 = new JLabel("Phone Number");
        label3.setBounds(340,9,150,20);
        label3.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(500,9,150,20);
        label4.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label4);

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(670,9,150,20);
        label5.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label5);

        JLabel label6 = new JLabel("NID_Number");
        label6.setBounds(830,9,150,20);
        label6.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label6);

        JButton back = new JButton("Back");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(1000, 600);
        setLayout(null);
        setLocation(350, 230);
        setVisible(true);
    }
    public static void main(String[] args){
        new Employee_info();
    }
}
