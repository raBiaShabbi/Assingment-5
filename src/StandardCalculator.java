import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StandardCalculator{
    //declare varialbes
    static JFrame frame;
    static JTextField textField;//screen
    static JButton [] numberButtons = new JButton[10];//dynamic button array
    static JButton [] functionButtons = new JButton[8];
    static JButton addBtn,subBtn,mulBtn,divBtn,eqBtn,decBtn,clrBtn,delBtn;
    static JPanel panel;
    static double num1=0,num2=0,result=0;
    static char operator;

    public static void main(String[] args) {
        //create frame
        frame = new JFrame("Standard Calculator");

        Image icon = new ImageIcon("C:\\Users\\saadm\\OneDrive\\Desktop\\summer bootcamp\\A5\\Calculator App\\Calculatoricon.png").getImage();
        frame.setIconImage(icon);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,100,400,550);
        frame.setLayout(null);

        Font myfont = new Font("my font",Font.BOLD,30);
        textField = new JTextField();
        textField.setBounds(45,25,300,50);
        textField.setFont(myfont);
        textField.setEditable(false);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        clrBtn = new JButton("Clear");
        delBtn = new JButton("Delete");
        decBtn = new JButton(".");
        eqBtn = new JButton("=");

        functionButtons[0] = addBtn;
        functionButtons[1] = subBtn;
        functionButtons[2] = mulBtn;
        functionButtons[3] = divBtn;
        functionButtons[4] = decBtn;
        functionButtons[5] = eqBtn;
        functionButtons[6] = delBtn;
        functionButtons[7] = clrBtn;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].setFont(myfont);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i <10 ; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myfont);
            numberButtons[i].setFocusable(false);
        }
        delBtn.setBounds(45,450,150,50);
        clrBtn.setBounds(205,450,150,50);

        panel = new JPanel();
        panel.setBounds(45,100,300,300);
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.setBackground(Color.GRAY);
        panel.setVisible(true);
        //add buttons into panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addBtn);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subBtn);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulBtn);
        panel.add(decBtn);
        panel.add(numberButtons[0]);
        panel.add(divBtn);
        panel.add(eqBtn);
        //add components into frame
        frame.add(textField);
        frame.add(delBtn);
        frame.add(clrBtn);
        frame.add(panel);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            numberButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+numberButtons[finalI].getText());
                }
            });
        }
        decBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+".");
            }
        });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = '+';
                textField.setText("");
            }
        });
        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = '-';
                textField.setText("");
            }
        });
        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = '*';
                textField.setText("");
            }
        });
        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = '/';
                textField.setText("");
            }
        });
        eqBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator){
                    case '+':{
                        result = num1+num2;
                        break;
                    }
                    case '-':{
                        result = num1-num2;
                        break;
                    }
                    case '*':{
                        result = num1*num2;
                        break;
                    }
                    case '/':{
                        result = num1/num2;
                        break;
                    }
                }//end switch
                textField.setText(result+"");
                num1 = result;
            }
        });
        clrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().isEmpty()==false) {
                    String txt = textField.getText();//123
                    textField.setText("");
                    textField.setText(txt.substring(0, txt.length() - 1));//12
                }
//                String txt = textField.getText(); //123
//                textField.setText("");//""
//                for (int i = 0; i < txt.length()-1; i++) {
//                    textField.setText(textField.getText()+txt.charAt(i));
//                }

            }
        });

        frame.setVisible(true);


    }
}