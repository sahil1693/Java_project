import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator1 extends JFrame {
    String value;
    JTextField t1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bsub, badd, bmul, bdiv, bper, bequal, bdot, b0, bclear, bback, bpow, broot;
    Double d, a, b;
    char ch;
    Menu m1;
    MenuBar m;
    MenuItem m11, m12, m14;
    Calculator1(){    }
    Calculator1(String str) {
        super(str);
        value = "";
        d = 0.0;
        a = 0.0;
        b = 0.0;
        ch = ' ';
        m = new MenuBar();
        m1 = new Menu("file");
        m11 = new MenuItem("Standard");
        m12 = new MenuItem("Scientific");
        m1.add(m11);
        m1.add(m12);
        m.add(m1);
        setMenuBar(m);
        t1 = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0=new JButton("0");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        badd = new JButton("+");
        bdot = new JButton(".");
        bequal = new JButton("=");
        bper = new JButton("%");
        bpow = new JButton("x^y");
        bback = new JButton("X");
        bclear = new JButton("C");
        broot = new JButton("\\/-");
        setLayout(null);
        bback.setBounds(290, 140, 60, 60);
        bclear.setBounds(290, 200, 60, 60);
        bpow.setBounds(290, 260, 60, 60);
        broot.setBounds(290, 320, 60, 120);
        add(bback);
        add(bclear);
        add(bpow);
        add(broot);
        b7.setBounds(50, 200, 60, 60);
        b8.setBounds(110, 200, 60, 60);
        b9.setBounds(170, 200, 60, 60);
        b4.setBounds(50, 260, 60, 60);
        b5.setBounds(110, 260, 60, 60);
        b6.setBounds(170, 260, 60, 60);
        b1.setBounds(50, 320, 60, 60);
        b2.setBounds(110, 320, 60, 60);
        b3.setBounds(170, 320, 60, 60);
        b0.setBounds(50, 380, 120, 60);
        bper.setBounds(50, 140, 60, 60);
        bdiv.setBounds(110, 140, 60, 60);
        bmul.setBounds(170, 140, 60, 60);
        bsub.setBounds(230, 140, 60, 60);
        badd.setBounds(230, 200, 60, 120);
        bequal.setBounds(230, 320, 60, 120);
        bdot.setBounds(170, 380, 60, 60);    
        t1.setBounds(50, 100, 301, 40);
        add(b1);
        add(b2);
        add(b3);
        add(b7);
        add(b8);
        add(b4);
        add(b5);
        add(b6);
        add(b9);
        add(b0);
        add(bper);
        add(bdiv);
        add(bmul);
        add(bsub);
        add(badd);
        add(bequal);
        add(bdot);
         add(t1);
    }
    
    public void setComponents() {
      
        b0.addActionListener(new Handler());
        b1.addActionListener(new Handler());
        b2.addActionListener(new Handler());
        b3.addActionListener(new Handler());
        b4.addActionListener(new Handler());
        b5.addActionListener(new Handler());
        b6.addActionListener(new Handler());
        b7.addActionListener(new Handler());
        b8.addActionListener(new Handler());
        b9.addActionListener(new Handler());
        bsub.addActionListener(new Handler());
        bmul.addActionListener(new Handler());
        bdiv.addActionListener(new Handler());
        bper.addActionListener(new Handler());
        badd.addActionListener(new Handler());
        bequal.addActionListener(new Handler());
        bdot.addActionListener(new Handler());
        bback.addActionListener(new Handler());
        bclear.addActionListener(new Handler());
        bpow.addActionListener(new Handler());
        broot.addActionListener(new Handler());
        m11.addActionListener(new Handler());
        m12.addActionListener(new Handler());
    }
    public static void main(String args[]) {
        Calculator1 jf = new Calculator1("Cal");
        jf.setComponents();
        jf.setVisible(true);
        jf.setSize(700, 700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str13 = (String) e.getActionCommand();
            if (str13.equals("Scientific")) {
                dispose();
                Scientific s = new Scientific("Scientific");
                s.setComponents();
                s.setVisible(true);
                s.setSize(700, 700);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            if (str13.equals("Standard")) {
                dispose();
                Calculator1 c1 = new Calculator1("Standard");
                c1.setComponents();
                c1.setVisible(true);
                c1.setSize(700, 700);
                c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            if (e.getSource() == b0) {
                value += 0;
                t1.setText(value);
            }
            if (e.getSource() == b1) {
                value += 1;
                t1.setText(value);
            }
            if (e.getSource() == b2) {
                value += 2;
                t1.setText(value);
            }
            if (e.getSource() == b3) {
                value += 3;
                t1.setText(value);
            }
            if (e.getSource() == b4) {
                value += 4;
                t1.setText(value);
            }
            if (e.getSource() == b5) {
                value += 5;
                t1.setText(value);
            }
            if (e.getSource() == b6) {
                value += 6;
                t1.setText(value);
            }
            if (e.getSource() == b7) {
                value += 7;
                t1.setText(value);
            }
            if (e.getSource() == b8) {
                value += 8;
                t1.setText(value);
            }
            if (e.getSource() == b9) {
                value += 9;
                t1.setText(value);
            }
            if (e.getSource() == bdot) {
                value += ".";
                t1.setText(value);
            }
            if (e.getSource() == bback) {
                char ch[] = value.toCharArray();

                value = new String(ch, 0, ch.length - 1);
                t1.setText(value);
            }
            if (e.getSource() == bclear) {
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bpow) {
                a = Double.parseDouble(value);
                ch = '^';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == broot) {
                a = Double.parseDouble(value);
                ch = 'r';
                d = Math.sqrt(a);
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == bsub) {
                a = Double.parseDouble(value);
                ch = '-';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == badd) {
                a = Double.parseDouble(value);
                ch = '+';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bdiv) {
                a = Double.parseDouble(value);
                ch = '/';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bmul) {
                a = Double.parseDouble(value);
                ch = '*';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bper) {
                a = Double.parseDouble(value);
                ch = '%';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bequal) {
                b = Double.parseDouble(value);
                value = "";
                if (ch == '/')
                    d = a / b;
                if (ch == '-')
                    d = a - b;
                if (ch == '*')
                    d = a * b;
                if (ch == '+')
                    d = a + b;
                if (ch == '^')
                    d = Math.pow(a, b);
                t1.setText(Double.toString(d));
                value += d;
            }
        }
    }
}


class Scientific extends Calculator1 {
    JButton  sin, cos, tan, sini, cosi, tani, py, log, exp, mod, fact, deg;
    Scientific(String str) {
        super(str);
        value = "";
        d = 0.0;
        a = 0.0;
        b = 0.0;
        ch = ' ';
    }
    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str13 = (String) e.getActionCommand();
            if (str13.equals("Scientific")) {
                dispose();
                Scientific s = new Scientific("Scientific");
                s.setComponents();
                s.setVisible(true);
                s.setSize(700, 700);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            if (str13.equals("Standard")) {
                dispose();
                Calculator1 c1 = new Calculator1("Standard");
                c1.setComponents();
                c1.setVisible(true);
                c1.setSize(700, 700);
                c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            
            if (e.getSource() == b0) {
                value += 0;
                t1.setText(value);
            }
            if (e.getSource() == b1) {
                value += 1;
                t1.setText(value);
            }
            if (e.getSource() == b2) {
                value += 2;
                t1.setText(value);
            }
            if (e.getSource() == b3) {
                value += 3;
                t1.setText(value);
            }
            if (e.getSource() == b4) {
                value += 4;
                t1.setText(value);
            }
            if (e.getSource() == b5) {
                value += 5;
                t1.setText(value);
            }
            if (e.getSource() == b6) {
                value += 6;
                t1.setText(value);
            }
            if (e.getSource() == b7) {
                value += 7;
                t1.setText(value);
            }
            if (e.getSource() == b8) {
                value += 8;
                t1.setText(value);
            }
            if (e.getSource() == b9) {
                value += 9;
                t1.setText(value);
            }
            if (e.getSource() == bdot) {
                value += ".";
                t1.setText(value);
            }
            if (e.getSource() == bback) {
                char ch[] = value.toCharArray();
                value = new String(ch, 0, ch.length - 1);
                t1.setText(value);
            }
            if (e.getSource() == bclear) {
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bpow) {
                a = Double.parseDouble(value);
                ch = '^';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == broot) {
                a = Double.parseDouble(value);
                ch = 'r';
                d = Math.sqrt(a);
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == sin) {
                a = Double.parseDouble(value);
                d = Math.sin(Math.toRadians(a));
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == cos) {
                a = Double.parseDouble(value);
                d = Math.cos(Math.toRadians(a));
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == tan) {
                a = Double.parseDouble(value);
                d = Math.tan(Math.toRadians(a));
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == sini) {
                a = Double.parseDouble(value);
                d = Math.asin(Math.toRadians(a));
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == cosi) {
                a = Double.parseDouble(value);
                d = Math.acos(Math.toRadians(a));
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == tani) {
                a = Double.parseDouble(value);
                d = Math.atan(Math.toRadians(a));
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == mod) {
                a = Double.parseDouble(value);
                value = "";
                ch = 'm';
                t1.setText(value);
            }
            if (e.getSource() == exp) {
                a = Double.parseDouble(value);
                d = Math.exp(a);
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == log) {
                a = Double.parseDouble(value);
                d = Math.log(a);
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == deg) {}
            if (e.getSource() == py) {
                d = (Double) Math.PI;
                value = "";
                value += d;
                t1.setText(value);
            }
            if (e.getSource() == fact) {
                int f = 1;
                int c = Integer.parseInt(value);
                for (int i = 1; i <= (int) c; i++)
                    f = f * i;
                value = "";
                value += f;
                t1.setText(value);
            }
            if (e.getSource() == bsub) {
                a = Double.parseDouble(value);
                ch = '-';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == badd) {
                a = Double.parseDouble(value);
                ch = '+';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bdiv) {
                a = Double.parseDouble(value);
                ch = '/';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bmul) {
                a = Double.parseDouble(value);
                ch = '*';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bper) {
                a = Double.parseDouble(value);
                ch = '%';
                value = "";
                t1.setText(value);
            }
            if (e.getSource() == bequal) {
                b = Double.parseDouble(value);
                value = "";
                if (ch == '/')
                    d = a / b;
                if (ch == '-')
                    d = a - b;
                if (ch == '*')
                    d = a * b;
                if (ch == '+')
                    d = a + b;
                if (ch == '^')
                    d = Math.pow(a, b);
                if (ch == 'm') {
                    int ac = (int) Math.round(a);
                    int bc = (int) Math.round(b);
                    int dc = ac % bc;
                    t1.setText(Double.toString(dc));
                    value += dc;
                } else {
                    t1.setText(Double.toString(d));
                    value += d;
                }
            }
        }
    }
    public void setComponents() {
        sin = new JButton("sin");
        cos = new JButton("cos");
        tan = new JButton("tan");
        sini = new JButton("sin-1");
        cosi = new JButton("cos-1");
        tani = new JButton("tan-1");
        py = new JButton("py");
        mod = new JButton("mod");
        deg = new JButton("deg");
        fact = new JButton("n!");
        log = new JButton("log");
        exp = new JButton("exp");
        cosi.setBounds(350, 140, 120, 60);
        fact.setBounds(470, 140, 60, 60);
        log.setBounds(350, 200, 60, 60);
        deg.setBounds(410, 200, 60, 60);
        mod.setBounds(470, 200, 60, 60);
        sin.setBounds(350, 260, 60, 60);
        cos.setBounds(410, 260, 60, 60);
        tan.setBounds(470, 260, 60, 60);
        sini.setBounds(350, 320, 120, 60);
        py.setBounds(470, 320, 60, 60);
        tani.setBounds(350, 380, 120, 60);
        exp.setBounds(470, 380, 60, 60);
        add(log);
        add(deg);
        add(mod);
        add(sin);
        add(cos);
        add(tan);
        add(sini);
        add(cosi);
        add(tani);
        add(py);
        add(fact);
        add(exp);
        b0.addActionListener(new Handler());
        b1.addActionListener(new Handler());
        b2.addActionListener(new Handler());
        b3.addActionListener(new Handler());
        b4.addActionListener(new Handler());
        b5.addActionListener(new Handler());
        b6.addActionListener(new Handler());
        b7.addActionListener(new Handler());
        b8.addActionListener(new Handler());
        b9.addActionListener(new Handler());
        bsub.addActionListener(new Handler());
        bmul.addActionListener(new Handler());
        bdiv.addActionListener(new Handler());
        bper.addActionListener(new Handler());
        badd.addActionListener(new Handler());
        bequal.addActionListener(new Handler());
        bdot.addActionListener(new Handler());
        bback.addActionListener(new Handler());
        bclear.addActionListener(new Handler());
        bpow.addActionListener(new Handler());
        broot.addActionListener(new Handler());
        m11.addActionListener(new Handler());
        m12.addActionListener(new Handler());
        log.addActionListener(new Handler());
        deg.addActionListener(new Handler());
        exp.addActionListener(new Handler());
        sin.addActionListener(new Handler());
        cos.addActionListener(new Handler());
        tan.addActionListener(new Handler());
        sini.addActionListener(new Handler());
        cosi.addActionListener(new Handler());
        tani.addActionListener(new Handler());
        py.addActionListener(new Handler());
        fact.addActionListener(new Handler());
        mod.addActionListener(new Handler());
    }
}

