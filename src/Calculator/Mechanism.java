package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.*;
import static java.lang.Math.tan;

public class Mechanism extends FrameCreate implements ActionListener {
    Mechanism() {
        GetInput();
        turn_Off();
    }
    double a, cnt;
    int sign;

    public void turn_On() {
        On.setEnabled(false);
        Off.setEnabled(true);
        txt.setEnabled(true);
        l1.setEnabled(true);
        One.setEnabled(true);
        Two.setEnabled(true);
        Three.setEnabled(true);
        Four.setEnabled(true);
        Five.setEnabled(true);
        Six.setEnabled(true);
        Seven.setEnabled(true);
        Eight.setEnabled(true);
        Nine.setEnabled(true);
        Zero.setEnabled(true);
        Del.setEnabled(true);
        Dot.setEnabled(true);
        Add.setEnabled(true);
        Sbt.setEnabled(true);
        Mul.setEnabled(true);
        Div.setEnabled(true);
        Eql.setEnabled(true);
        AC.setEnabled(true);
        sqr.setEnabled(true);
        Sqrt.setEnabled(true);
        LOG.setEnabled(true);
        Sin.setEnabled(true);
        Cos.setEnabled(true);
        Tan.setEnabled(true);
        Inverse.setEnabled(true);
    }

    public void turn_Off() {
        On.setEnabled(true);
        Off.setEnabled(false);
        txt.setText("");
        l1.setText("");
        txt.setEnabled(false);
        l1.setEnabled(false);
        One.setEnabled(false);
        Two.setEnabled(false);
        Three.setEnabled(false);
        Four.setEnabled(false);
        Five.setEnabled(false);
        Six.setEnabled(false);
        Seven.setEnabled(false);
        Eight.setEnabled(false);
        Nine.setEnabled(false);
        Zero.setEnabled(false);
        Del.setEnabled(false);
        Dot.setEnabled(false);
        Add.setEnabled(false);
        Sbt.setEnabled(false);
        Mul.setEnabled(false);
        Div.setEnabled(false);
        Eql.setEnabled(false);
        AC.setEnabled(false);
        sqr.setEnabled(false);
        Sqrt.setEnabled(false);
        LOG.setEnabled(false);
        Sin.setEnabled(false);
        Cos.setEnabled(false);
        Tan.setEnabled(false);
        Inverse.setEnabled(false);
    }

    public void GetInput() {
        On.addActionListener(this);
        Off.addActionListener(this);
        AC.addActionListener(this);
        Zero.addActionListener(this);
        One.addActionListener(this);
        Two.addActionListener(this);
        Three.addActionListener(this);
        Four.addActionListener(this);
        Five.addActionListener(this);
        Six.addActionListener(this);
        Seven.addActionListener(this);
        Eight.addActionListener(this);
        Nine.addActionListener(this);
        Del.addActionListener(this);
        Add.addActionListener(this);
        Sbt.addActionListener(this);
        Mul.addActionListener(this);
        Div.addActionListener(this);
        Dot.addActionListener(this);
        Eql.addActionListener(this);
        sqr.addActionListener(this);
        Sqrt.addActionListener(this);
        LOG.addActionListener(this);
        Sin.addActionListener(this);
        Cos.addActionListener(this);
        Tan.addActionListener(this);
        Inverse.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == On) {
            turn_On();
        } else if (obj == Off) {
            turn_Off();
        } else if (obj == AC) {
            txt.setText("");
            l1.setText("");
        } else if (obj == Del) {
            int l = txt.getText().length();
            int x = l - 1;
            if (l > 0) {
                StringBuilder s = new StringBuilder(txt.getText());
                s.deleteCharAt(x);
                txt.setText(s.toString());
            }
        } else if (obj == Zero) {
            txt.setText(txt.getText() + "0");
        } else if (obj == One) {
            txt.setText(txt.getText() + "1");
        } else if (obj == Two) {
            txt.setText(txt.getText() + "2");
        } else if (obj == Three) {
            txt.setText(txt.getText() + "3");
        } else if (obj == Four) {
            txt.setText(txt.getText() + "4");
        } else if (obj == Five) {
            txt.setText(txt.getText() + "5");
        } else if (obj == Six) {
            txt.setText(txt.getText() + "6");
        } else if (obj == Seven) {
            txt.setText(txt.getText() + "7");
        } else if (obj == Eight) {
            txt.setText(txt.getText() + "8");
        } else if (obj == Nine) {
            txt.setText(txt.getText() + "9");
        } else if (obj == Dot) {
            txt.setText(txt.getText() + ".");
        } else if (obj == Add) {
            String str = txt.getText();
            a = Double.parseDouble(txt.getText());
            txt.setText("");
            l1.setText(str + "+");
            sign = 1;
        } else if (obj == Sbt) {
            String str = txt.getText();
            a = Double.parseDouble(txt.getText());
            txt.setText("");
            l1.setText(str + "-");
            sign = 2;
        } else if (obj == Mul) {
            String str = txt.getText();
            a = Double.parseDouble(txt.getText());
            txt.setText("");
            l1.setText(str + "X");
            sign = 3;
        } else if (obj == Div) {
            String str = txt.getText();
            a = Double.parseDouble(txt.getText());
            txt.setText("");
            l1.setText(str + "/");
            sign = 4;
        } else if (obj == Sqrt) {
            a = Double.parseDouble(txt.getText());
            double sqrt = Math.sqrt(a);
            txt.setText(Double.toString(sqrt));
            l1.setText("√"+a);
        } else if (obj == sqr) {
            String str = txt.getText();
            a = Double.parseDouble(txt.getText());
            double square = Math.pow(a, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                txt.setText(string.replace(".0", ""));
            } else {
                txt.setText(string);
            }
            l1.setText("("+str+")"+"²");
        } else if (obj == LOG) {
            a = Double.parseDouble(txt.getText());
            l1.setText("log" + a);
            double reciprocal = log10(a);
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                txt.setText(string.replace(".0", ""));
            } else {
                txt.setText(string);
            }
        } else if (obj == Sin) {
            a = Double.parseDouble(txt.getText());
            l1.setText("sin(" + a + ")");
            double sinValue = sin(Math.toRadians(a));
            txt.setText(Double.toString(sinValue));
        } else if (obj == Cos) {
            a = Double.parseDouble(txt.getText());
            l1.setText("cos(" + a + ")");
            double cosValue = cos(Math.toRadians(a));
            txt.setText(Double.toString(cosValue));
        } else if (obj == Tan) {
            a = Double.parseDouble(txt.getText());
            l1.setText("tan(" + a + ")");
            double tanValue = tan(Math.toRadians(a));
            txt.setText(Double.toString(tanValue));
        } else if (obj == Inverse) {
            a = Double.parseDouble(txt.getText());
            l1.setText("1/" + a);
            double inverseValue = 1 / a;
            txt.setText(Double.toString(inverseValue));
        } else if (obj == Eql) {
            switch (sign) {
                case 1:
                    cnt = a + Double.parseDouble(txt.getText());
                    if (Double.toString(cnt).endsWith(".0")) {
                        txt.setText(Double.toString(cnt).replace(".0", ""));
                    } else {
                        txt.setText(Double.toString(cnt));
                    }
                    l1.setText("");
                    break;
                case 2:
                    cnt = a - Double.parseDouble(txt.getText());
                    if (Double.toString(cnt).endsWith(".0")) {
                        txt.setText(Double.toString(cnt).replace(".0", ""));
                    } else {
                        txt.setText(Double.toString(cnt));
                    }
                    l1.setText("");
                    break;
                case 3:
                    cnt = a * Double.parseDouble(txt.getText());
                    if (Double.toString(cnt).endsWith(".0")) {
                        txt.setText(Double.toString(cnt).replace(".0", ""));
                    } else {
                        txt.setText(Double.toString(cnt));
                    }
                    l1.setText("");
                    break;
                case 4:
                    cnt = a / Double.parseDouble(txt.getText());
                    if (Double.toString(cnt).endsWith(".0")) {
                        txt.setText(Double.toString(cnt).replace(".0", ""));
                    } else {
                        txt.setText(Double.toString(cnt));
                    }
                    l1.setText("");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + sign);
            }
        }
    }
}
