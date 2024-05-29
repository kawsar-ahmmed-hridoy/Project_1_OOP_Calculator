package Calculator;
import java.awt.*;
import javax.swing.*;

public class FrameCreate {
    JFrame frame = new JFrame("Hridoy's Calculator");
    JLabel l1 = new JLabel();
    JLabel l3= new JLabel();
    JTextField txt = new JTextField();

    FrameCreate() {
        BodyShape();
        DisplayPart();
        ButtonShow();
    }

    public void BodyShape() {
        frame.setSize(313, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void DisplayPart() {
        l1.setBounds(230, 0, 80, 50);
        l1.setForeground(Color.CYAN);
        frame.add(l1);

        l3.setBounds(85, 100, 300, 15);
        l3.setForeground(Color.orange);
        l3.setText("   Happy :)   ||   Sad :( ");
        frame.add(l3);

        txt.setBounds(10, 40, 279, 60);
        txt.setBackground(Color.white);
        txt.setForeground(Color.black);
        txt.setFont(new Font("Arial", Font.BOLD, 20));
        txt.setEditable(false);
        txt.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(txt);
    }

    JButton On = new JButton("ON");
    JButton AC = new JButton("AC");
    JButton Off = new JButton("OFF");
    JButton Dot = new JButton(".");
    JButton Del = new JButton("del");
    JButton Eql = new JButton("=");
    JButton Div = new JButton("/");
    JButton Mul = new JButton("X");
    JButton Sbt = new JButton("-");
    JButton Add = new JButton("+");
    JButton sqr = new JButton("x²");
    JButton Sqrt = new JButton("√");
    JButton LOG = new JButton("log");
    JButton Zero = new JButton("0");
    JButton One = new JButton("1");
    JButton Two = new JButton("2");
    JButton Three = new JButton("3");
    JButton Four = new JButton("4");
    JButton Five = new JButton("5");
    JButton Six = new JButton("6");
    JButton Seven = new JButton("7");
    JButton Eight = new JButton("8");
    JButton Nine = new JButton("9");
    JButton Sin = new JButton("sin");
    JButton Cos = new JButton("cos");
    JButton Tan = new JButton("tan");
    JButton Inverse = new JButton("1/x");

    public void ButtonShow() {
        Font f = new Font("Arial", Font.BOLD, 20);

        On.setBounds(10, 120, 60, 40);
        On.setFont(new Font("Arial",Font.BOLD,13));
        On.setBackground(Color.green);
        On.setForeground(Color.white);
        On.setFocusable(false);
        frame.add(On);

        Off.setBounds(80, 120, 60, 40);
        Off.setFont(new Font("Arial", Font.BOLD, 13));
        Off.setBackground(Color.red);
        Off.setForeground(Color.white);
        Off.setFocusable(false);
        frame.add(Off);

        AC.setBounds(220, 120, 70, 40);
        AC.setFont(new Font("Arial", Font.BOLD, 13));
        AC.setBackground(Color.cyan);
        frame.add(AC);

        Del.setBounds(150, 120, 60, 40);
        Del.setFont(new Font("Arial", Font.BOLD, 15));
        Del.setBackground(Color.yellow);
        frame.add(Del);

        One.setBounds(10, 320, 60, 40);
        One.setFont(f);
        One.setBackground(Color.lightGray);
        frame.add(One);

        Two.setBounds(80, 320, 60, 40);
        Two.setFont(f);
        Two.setBackground(Color.lightGray);
        frame.add(Two);

        Three.setBounds(150, 320, 60, 40);
        Three.setFont(f);
        Three.setBackground(Color.lightGray);
        frame.add(Three);

        Four.setBounds(10, 270, 60, 40);
        Four.setFont(f);
        Four.setBackground(Color.lightGray);
        frame.add(Four);

        Five.setBounds(80, 270, 60, 40);
        Five.setFont(f);
        Five.setBackground(Color.lightGray);
        frame.add(Five);

        Six.setBounds(150, 270, 60, 40);
        Six.setFont(f);
        Six.setBackground(Color.lightGray);
        frame.add(Six);

        Seven.setBounds(10, 220, 60, 40);
        Seven.setFont(f);
        Seven.setBackground(Color.lightGray);
        frame.add(Seven);

        Eight.setBounds(80, 220, 60, 40);
        Eight.setFont(f);
        Eight.setBackground(Color.lightGray);
        frame.add(Eight);

        Nine.setBounds(150, 220, 60, 40);
        Nine.setFont(f);
        Nine.setBackground(Color.lightGray);
        frame.add(Nine);

        Sbt.setBounds(220, 220, 70, 40);
        Sbt.setFont(new Font("Arial", Font.BOLD, 40));
        Sbt.setBackground(Color.lightGray);
        frame.add(Sbt);

        sqr.setBounds(10, 170, 60, 40);
        sqr.setFont(new Font("Arial",Font.BOLD,15));
        sqr.setBackground(Color.lightGray);
        frame.add(sqr);

        Sqrt.setBounds(80, 170, 60, 40);
        Sqrt.setFont(f);
        Sqrt.setBackground(Color.lightGray);
        frame.add(Sqrt);

        Inverse.setBounds(150, 170, 60, 40);
        Inverse.setFont(new Font("Arial",Font.BOLD,15));
        Inverse.setBackground(Color.lightGray);
        frame.add(Inverse);

        Add.setBounds(220, 170, 70, 40);
        Add.setFont(new Font("Arial", Font.BOLD, 30));
        Add.setBackground(Color.lightGray);
        frame.add(Add);

        Zero.setBounds(80, 370, 60, 40);
        Zero.setFont(f);
        Zero.setHorizontalAlignment(SwingConstants.CENTER);
        Zero.setBackground(Color.lightGray);
        frame.add(Zero);

        Dot.setBounds(10, 370, 60, 40);
        Dot.setFont(new Font("Arial", Font.BOLD, 40));
        Dot.setVerticalAlignment(SwingConstants.BOTTOM);
        Dot.setBackground(Color.lightGray);
        frame.add(Dot);

        Mul.setBounds(150, 370, 60, 40);
        Mul.setFont(f);
        Mul.setBackground(Color.lightGray);
        frame.add(Mul);

        Div.setBounds(220, 370, 70, 40);
        Div.setFont(new Font("Arial", Font.BOLD, 30));
        Div.setBackground(Color.lightGray);
        frame.add(Div);

        Eql.setBounds(220, 270, 70, 90);
        Eql.setFont(new Font("Arial", Font.BOLD, 30));
        Eql.setBackground(Color.lightGray);
        frame.add(Eql);

        Sin.setBounds(10, 420, 60, 40);
        Sin.setFont(new Font("Arial", Font.BOLD, 15));
        Sin.setBackground(Color.lightGray);
        frame.add(Sin);

        Cos.setBounds(80, 420, 60, 40);
        Cos.setFont(new Font("Arial", Font.BOLD, 14));
        Cos.setBackground(Color.lightGray);
        frame.add(Cos);

        Tan.setBounds(150, 420, 60, 40);
        Tan.setFont(new Font("Arial", Font.BOLD, 14));
        Tan.setBackground(Color.lightGray);
        frame.add(Tan);

        LOG.setBounds(220, 420, 70, 40);
        LOG.setFont(new Font("Arial", Font.BOLD, 14));
        LOG.setBackground(Color.lightGray);
        frame.add(LOG);
    }
}
