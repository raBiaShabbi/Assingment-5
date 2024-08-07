import javax.swing.*;
import java.awt.*;

public class ScientificCalculator {

    static JFrame frame;
    static JTextField textfield;
    static JPanel panel;
    static JButton [] numbers = new JButton[9];
    static JButton [] arithmeticOperations = new JButton[5];
    static JButton [] trignometicOperations = new JButton[6];
    static JButton [] logarithmicOperations = new JButton[4];
    static JButton [] powerOperation = new JButton[2];
    static JButton [] StatisticalOperation = new JButton[4];
    static JButton [] functions = new JButton[5];
    static JButton addBtn, subBtn, mulBtn, divBtn, MODbtn,eqBtn, decBtn, clrBtn, delBtn;
    static JButton cosBtn, sinBtn, tanBtn, cosInverseBtn, sinInverseBtn, tanInverseBtn;
    static JButton powBtn, sqrtBtn, piBtn, logBtn, modeBtn, medianBtn, SDBtn, meanBtn, lnBtn, eBtn;
    static char operator;
    static double num1 = 0 , num2 = 0 , result = 0;

    public static void main(String[] args) {
        frame = new JFrame("Scientific Calculator");

        Image icon = new ImageIcon("C:\\Users\\saadm\\OneDrive\\Desktop\\summer bootcamp\\A5\\Calculator App\\Calculator Icon.png").getImage();
        frame.setIconImage(icon);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,90,550,700);
        frame.setLayout(null);
        frame.setBackground(Color.black);

        Font font = new Font("Arial",Font.BOLD,17);

        textfield = new JTextField();
        textfield.setBackground(Color.lightGray);
        textfield.setBounds(45,25,450,70);
        textfield.setFont(font);
        textfield.setEditable(false);

        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(45,130,450,500);
        panel.setLayout(new GridLayout(5, 6, 10, 10));

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        MODbtn = new JButton("%");

        meanBtn = new JButton("μ");
        medianBtn = new JButton("M");
        modeBtn = new JButton("Mo");
        SDBtn = new JButton("σ");

        cosBtn = new JButton("cos");
        sinBtn = new JButton("sin");
        tanBtn = new JButton("tan");
        cosInverseBtn = new JButton("cos⁻¹");
        sinInverseBtn = new JButton("sin⁻¹");
        tanInverseBtn = new JButton("tan⁻¹");

        logBtn = new JButton("log");
        lnBtn = new JButton("ln");
        eBtn = new JButton("e");

        powBtn = new JButton("^");
        sqrtBtn = new JButton("√");

        clrBtn = new JButton("C");
        delBtn = new JButton("D");
        decBtn = new JButton(".");
        eqBtn = new JButton("=");
        piBtn = new JButton("π");

        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(mulBtn);
        panel.add(divBtn);
        panel.add(MODbtn);

        panel.add(meanBtn);
        panel.add(medianBtn);
        panel.add(modeBtn);
        panel.add(SDBtn);

        panel.add(cosBtn);
        panel.add(sinBtn);
        panel.add(tanBtn);
        panel.add(cosInverseBtn);
        panel.add(sinInverseBtn);
        panel.add(tanInverseBtn);

        panel.add(logBtn);
        panel.add(lnBtn);
        panel.add(eBtn);

        panel.add(powBtn);
        panel.add(sqrtBtn);

        panel.add(eqBtn);
        panel.add(decBtn);
        panel.add(clrBtn);
        panel.add(delBtn);
        panel.add(piBtn);

        arithmeticOperations[0] = addBtn;
        arithmeticOperations[1] = sinBtn;
        arithmeticOperations[2] = mulBtn;
        arithmeticOperations[3] = divBtn;
        arithmeticOperations[4] = MODbtn;

        for (int i = 0; i < 4; i++) {
            arithmeticOperations[i].setFont(font);
            arithmeticOperations[i].setFocusable(false);
        }

        StatisticalOperation[0] = meanBtn;
        StatisticalOperation[1] = medianBtn;
        StatisticalOperation[2] = modeBtn;
        StatisticalOperation[3] = SDBtn;

        for (int i = 0; i < 3; i++) {
            StatisticalOperation[i].setFont(font);
            StatisticalOperation[i].setFocusable(false);
        }

        trignometicOperations[0] = cosBtn;
        trignometicOperations[1] = sinBtn;
        trignometicOperations[2] = tanBtn;
        trignometicOperations[3] = cosInverseBtn;
        trignometicOperations[4] = sinInverseBtn;
        trignometicOperations[5] = tanInverseBtn;

        for (int i = 0; i < 5; i++) {
            trignometicOperations[i].setFont(font);
            trignometicOperations[i].setFocusable(false);
        }

        logarithmicOperations[0] = logBtn;
        logarithmicOperations[1] = lnBtn;
        logarithmicOperations[2] = eBtn;

        for (int i = 0; i < 2; i++) {
            logarithmicOperations[i].setFont(font);
            logarithmicOperations[i].setFocusable(false);
        }

        powerOperation[0] = powBtn;
        powerOperation[1] = sqrtBtn;

        for (int i = 0; i < 2; i++) {
            powerOperation[i].setFont(font);
            powerOperation[i].setFocusable(false);
        }

        functions[0] = decBtn;
        functions[1] = piBtn;
        functions[2] = eqBtn;
        functions[3] = clrBtn;
        functions[4] = delBtn;

        for (int i = 0; i < 4; i++) {
            functions[i].setFont(font);
            functions[i].setFocusable(false);
        }

        frame.add(textfield);
        frame.add(panel);
        frame.setVisible(true);
    }
}