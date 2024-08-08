import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.lang.runtime.SwitchBootstraps;

public class ScientificCalculator {

    static JFrame frame;
    static JTextField textfield;
    static JPanel panel;
    static JButton [] numbers = new JButton[10];
    static JButton [] arithmeticOperations = new JButton[5];
    static JButton [] trignometicOperations = new JButton[6];
    static JButton [] logarithmicOperations = new JButton[4];
    static JButton [] powerOperation = new JButton[2];
    static JButton [] StatisticalOperation = new JButton[4];
    static JButton [] functions = new JButton[5];
    static double [] num = new double[100];
    static int count;
    static double mean;
    static double mode;
    static double median;
    static double sd;
    static String trignometicFunc;
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

        Font font = new Font("myfont",Font.BOLD,13);

        textfield = new JTextField();
        textfield.setBackground(Color.white);
        textfield.setBounds(45,25,450,70);
        textfield.setFont(font);
        textfield.setEditable(false);

        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(45, 130, 450, 500);
        panel.setLayout(new GridLayout(6, 6, 10, 10));

        addBtn = createButton("+", font);
        subBtn = createButton("-", font);
        mulBtn = createButton("*", font);
        divBtn = createButton("/", font);
        MODbtn = createButton("%", font);

        meanBtn = createButton("μ", font);
        medianBtn = createButton("M", font);
        modeBtn = createButton("Mo", font);
        SDBtn = createButton("σ", font);

        cosBtn = createButton("cos", font);
        sinBtn = createButton("sin", font);
        tanBtn = createButton("tan", font);
        cosInverseBtn = createButton("cos⁻¹", font);
        sinInverseBtn = createButton("sin⁻¹", font);
        tanInverseBtn = createButton("tan⁻¹", font);

        logBtn = createButton("log", font);
        lnBtn = createButton("ln", font);
        eBtn = createButton("e", font);

        powBtn = createButton("^", font);
        sqrtBtn = createButton("√", font);

        clrBtn = createButton("C", font);
        delBtn = createButton("D", font);
        decBtn = createButton(".", font);
        eqBtn = createButton("=", font);
        piBtn = createButton("π", font);

        for (int i = 0; i < 10; i++) {
            numbers[i] = createButton(String.valueOf(i), font);
        }

        for(int i = 0;i < 10; i++){
            int finalI = i;
            numbers[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textfield.setText(textfield.getText() + numbers[finalI].getText());
                }
            });
        }

        decBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText() + ".");
            }
        });

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                operator = '+';
                textfield.setText("");
            }
        });

        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                operator = '-';
                textfield.setText("");
            }
        });

        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                operator = '*';
                textfield.setText("");
            }
        });

        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                operator = '/';
                textfield.setText("");
            }
        });

        MODbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                operator = '%';
                textfield.setText("");
            }
        });

        powBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                operator = '^';
                textfield.setText("");
            }
        });

        sqrtBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                operator = '√';
                textfield.setText("");
            }
        });

        logBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                trignometicFunc = "log";
                textfield.setText("");
            }
        });

        lnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                trignometicFunc = "ln";
                textfield.setText("");
            }
        });

        eBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Math.E;
                textfield.setText(String.valueOf(num1));
            }
        });

        piBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Math.PI;
                textfield.setText(String.valueOf(num1));
            }
        });

        cosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                trignometicFunc = "cos";
                textfield.setText("");
            }
        });

        sinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                trignometicFunc = "sin";
                textfield.setText("");
            }
        });

        tanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                trignometicFunc = "tan";
                textfield.setText("");
            }
        });

        cosInverseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                trignometicFunc = "cos⁻¹";
                textfield.setText("");
            }
        });

        sinInverseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                trignometicFunc = "sin⁻¹";
                textfield.setText("");
            }
        });

        tanInverseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textfield.getText());
                trignometicFunc = "tan⁻¹";
                textfield.setText("");
            }
        });

        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textfield.getText();
                if(s.isEmpty() == false){
                    s = s.substring(0,s.length()-1);
                    textfield.setText(s);
                }
            }
        });

        clrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText("");
                num1 = 0;
                num2 = 0;
                result = 0;
                operator = '\0';
            }
        });

        meanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textfield.getText().isEmpty() && textfield.getText() != null){
                    num[count] = Double.parseDouble(textfield.getText());
                    count++;
                    operator = 'μ';
                    textfield.setText("");
                    double sum = 0.0;
                    for(int i = 0; i < count; i++){
                        sum += num[i];
                    }
                    mean = sum/count;
                }
                else {
                    System.err.println("Error");
                }
            }
        });

        medianBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textfield.getText() != null && !textfield.getText().isEmpty()) {
                    num[count] = Double.parseDouble(textfield.getText());
                    count++;
                    operator = 'M';
                    textfield.setText("");

                    double []num_ = Arrays.stream(num).filter(value -> value != 0).toArray();
                    Arrays.sort(num_);
                    if(num_.length % 2 != 0){
                        median = num_[num_.length / 2];
                    }
                    else{
                        median = (num_[num_.length / 2] + (num_[num_.length / 2] - 1 )) / 2;
                    }
                }
                else {
                    System.err.println("Error");
                }
            }
        });

        modeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textfield.getText() != null && !textfield.getText().isEmpty()){
                    num[count] = Double.parseDouble(textfield.getText());
                    count++;
                    trignometicFunc = "Mo";
                    textfield.setText("");

                    int maxCount = 0;
                    double modeValue = num[0];

                    for (int i = 0; i < count; i++) {
                        int currentCount = 0;
                        for (int j = 0; j < count; j++) {
                            if (num[j] == num[i]) {
                                currentCount++;
                            }
                        }
                        if (currentCount > maxCount) {
                            maxCount = currentCount;
                            modeValue = num[i];
                        }
                    }

                    mode = modeValue;
                }
                else {
                    System.err.println("Error");
                }
            }
        });

        SDBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textfield.getText().isEmpty() && textfield.getText() != null){
                    num[count] = Double.parseDouble(textfield.getText());
                    count++;
                    operator = 'σ';
                    textfield.setText("");
                    double sum = 0.0;
                    for(int i = 0; i < count; i++){
                        sum += num[i];
                    }
                    mean = sum/count;

                    double varianceSum = 0.0;
                    for (int i = 0; i < count; i++) {
                        varianceSum += Math.pow(num[i] - mean, 2);
                    }

                    double variance = varianceSum / (count - 1);
                    sd = Math.sqrt(variance);
                }
                else {
                    System.err.println("Error");
                }
            }
        });

        eqBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operator) {
                    case '+':
                        result = num1 + Double.parseDouble(textfield.getText());
                        break;
                    case '-':
                        result = num1 - Double.parseDouble(textfield.getText());
                        break;
                    case '*':
                        result = num1 * Double.parseDouble(textfield.getText());
                        break;
                    case '/':
                        if (Double.parseDouble(textfield.getText()) != 0) {
                            result = num1 / Double.parseDouble(textfield.getText());
                        } else {
                            textfield.setText("Error");
                            return;
                        }
                        break;
                    case '%':
                        if (Double.parseDouble(textfield.getText()) != 0) {
                            result = num1 % Double.parseDouble(textfield.getText());
                        } else {
                            textfield.setText("Error");
                            return;
                        }
                        break;
                    case '√':
                        result = Math.sqrt(num1);
                        break;
                    case '^':
                        result = Math.pow(num1, Double.parseDouble(textfield.getText()));
                        break;
                    case 'μ':
                        result = mean;
                        break;
                    case 'M':
                        result = median;
                        break;
                    case 'σ':
                        result = sd;
                        break;
                    default:
                        switch (trignometicFunc) {
                            case "cos":
                                result = Math.cos(Math.toRadians(num1));
                                break;
                            case "sin":
                                result = Math.sin(Math.toRadians(num1));
                                break;
                            case "tan":
                                result = Math.tan(Math.toRadians(num1));
                                break;
                            case "cos⁻¹":
                                result = Math.acos(num1);
                                break;
                            case "sin⁻¹":
                                result = Math.asin(num1);
                                break;
                            case "tan⁻¹":
                                result = Math.atan(num1);
                                break;
                            case "log":
                                result = Math.log10(num1);
                                break;
                            case "ln":
                                result = Math.log(num1);
                                break;
                            case "Mo":
                                result = mode;
                                break;
                        }
                        break;
                }
                textfield.setText(String.valueOf(result));
                count = 0;
                Arrays.fill(num, 0.0);
            }
        });



        panel.add(sqrtBtn);
        panel.add(powBtn);
        panel.add(logBtn);
        panel.add(lnBtn);
        panel.add(eBtn);
        panel.add(MODbtn);

        panel.add(cosBtn);
        panel.add(sinBtn);
        panel.add(tanBtn);
        panel.add(cosInverseBtn);
        panel.add(sinInverseBtn);
        panel.add(tanInverseBtn);

        panel.add(numbers[9]);
        panel.add(numbers[8]);
        panel.add(numbers[7]);
        panel.add(meanBtn);
        panel.add(medianBtn);
        panel.add(modeBtn);

        panel.add(numbers[6]);
        panel.add(numbers[5]);
        panel.add(numbers[4]);
        panel.add(SDBtn);
        panel.add(piBtn);
        panel.add(decBtn);

        panel.add(numbers[2]);
        panel.add(numbers[3]);
        panel.add(numbers[1]);
        panel.add(addBtn);
        panel.add(subBtn);

        panel.add(numbers[0]);
        panel.add(eqBtn);
        panel.add(mulBtn);
        panel.add(divBtn);
        panel.add(delBtn);
        panel.add(clrBtn);

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
    public static JButton createButton(String text , Font font){
        JButton button = new JButton(text);
        button.setFont(font);
        button.setBackground(Color.LIGHT_GRAY);
        button.setFocusable(false);
        return button;
    }
}