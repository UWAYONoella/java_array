import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class myForm extends JFrame{
    final private Font mainFont = new Font ("Segoes print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    JLabel lbwelcome;

     public void initiolize(){
      
        JLabel lbFirstName = new JLabel("FirstName");
        lbFirstName.setFont(mainFont);
        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("LastName");
        lbLastName.setFont(mainFont);
        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formJPanel = new JPanel();
        formJPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formJPanel.add(lbFirstName);
        formJPanel.add(tfFirstName);
        formJPanel.add(lbLastName);
        formJPanel.add(tfLastName);
        
        lbwelcome = new JLabel();
        lbwelcome.setFont(mainFont);

        JButton btOk = new JButton("Ok");
        btOk.setFont(mainFont);
        btOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbwelcome.setText("Hello" + firstName + " " + lastName); 
            }
            
        });

        JButton btClean = new JButton("Clean");
        btClean.setFont(mainFont);
        btClean.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbwelcome.setText("");
            }
            
        });
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btOk);
        buttonsPanel.add(btClean);


    JPanel mainPanel=new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(new Color(128, 128, 255)); 
    mainPanel.add(formJPanel, BorderLayout.NORTH);
    mainPanel.add(lbwelcome, BorderLayout.CENTER);
    mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

    add(mainPanel);

        setTitle("welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        myForm myFrame = new myForm();
        myFrame.initiolize();
    }
}
