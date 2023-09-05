import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    public static String txt;
    public static int n=0;
    public static void main(String[] args) {
        Frame f=new Frame("My Game");
        Label l=new Label();
        Button b=new Button("Reset");
        Button b1=new Button();
        Button b2=new Button();
        Button b3=new Button();
        Button b4=new Button();
        Button b5=new Button();
        Button b6=new Button();
        Button b7=new Button();
        Button b8=new Button();
        Button b9=new Button();
        Font ff=new Font("Arial",Font.BOLD,30);
        b.setFont(ff);
        b1.setFont(ff);
        b2.setFont(ff);
        b3.setFont(ff);
        b4.setFont(ff);
        b5.setFont(ff);
        b6.setFont(ff);
        b7.setFont(ff);
        b8.setFont(ff);
        b9.setFont(ff);
        b1.setBackground(Color.black);
        b1.setForeground(Color.red);
        b2.setBackground(Color.black);
        b2.setForeground(Color.red);
        b3.setBackground(Color.black);
        b3.setForeground(Color.red);
        b4.setBackground(Color.black);
        b4.setForeground(Color.red);
        b5.setBackground(Color.black);
        b5.setForeground(Color.red);
        b6.setBackground(Color.black);
        b6.setForeground(Color.red);
        b7.setBackground(Color.black);
        b7.setForeground(Color.red);
        b8.setBackground(Color.black);
        b8.setForeground(Color.red);
        b9.setBackground(Color.black);
        b9.setForeground(Color.red);
        b.setBackground(Color.gray);
        b.setBounds(150,450,100,50);
        b1.setBounds(50,100,100,100);
        b2.setBounds(150,100,100,100);
        b3.setBounds(250,100,100,100);
        b4.setBounds(50,200,100,100);
        b5.setBounds(150,200,100,100);
        b6.setBounds(250,200,100,100);
        b7.setBounds(50,300,100,100);
        b8.setBounds(150,300,100,100);
        b9.setBounds(250,300,100,100);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                b1.setLabel("");
                b2.setLabel("");
                b3.setLabel("");
                b4.setLabel("");
                b5.setLabel("");
                b6.setLabel("");
                b7.setLabel("");
                b8.setLabel("");
                b9.setLabel("");
                txt="";
                n=0;
            }

        });
        b1.addActionListener(new  ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                if (b1.getLabel().equals("") && n < 9) {
                    if (n % 2 == 0) {
                        b1.setLabel("X");
                        txt = "X";
                    } else {
                        b1.setLabel("0");
                        txt = "0";
                    }
                    n++;
                }
                if(b2.getLabel().equals(txt)&&b3.getLabel().equals(txt))
                {
                    l.setText("Player "+txt+" win");
                    JOptionPane.showMessageDialog(f,"Player "+txt+" win");
                }
                else if (b4.getLabel().equals(txt)&&b7.getLabel().equals(txt))
                {
                    l.setText("Player "+txt+" win");
                    JOptionPane.showMessageDialog(f,"Player "+txt+" win");
                }
                else if (b5.getLabel().equals(txt)&&b9.getLabel().equals(txt))
                {
                    l.setText("Player "+txt+" win");
                    JOptionPane.showMessageDialog(f,"Player "+txt+" win");
                }
                else if(n==9)
                {
                    l.setText("Game drawn! Try again");
                    JOptionPane.showMessageDialog(f,"Game drawn! Try again");

                }
            }
        });
                b2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (b2.getLabel().equals("") && n < 9) {
                            if (n % 2 == 0) {
                                b2.setLabel("X");
                                txt = "X";
                            } else {
                                b2.setLabel("0");
                                txt = "0";
                            }
                            n++;
                        }
                        if (b1.getLabel().equals(txt) && b3.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b5.getLabel().equals(txt) && b8.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (n == 9) {
                            l.setText("Game drawn! Try again");
                            JOptionPane.showMessageDialog(f, "Game drawn ! Try again");

                        }
                    }
                });
                b3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (b3.getLabel().equals("") && n < 9) {
                            if (n % 2 == 0) {
                                b3.setLabel("X");
                                txt = "X";
                            } else {
                                b3.setLabel("0");
                                txt = "0";
                            }
                            n++;
                        }
                        if (b1.getLabel().equals(txt) && b2.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b6.getLabel().equals(txt) && b9.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b5.getLabel().equals(txt) && b7.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (n == 9) {
                            l.setText("Game drawn! Try again");
                            JOptionPane.showMessageDialog(f, "Game drawn ! Try again");

                        }
                    }

                }) ;
                b4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (b4.getLabel().equals("") && n < 9) {
                            if (n % 2 == 0) {
                                b4.setLabel("X");
                                txt = "X";
                            } else {
                                b4.setLabel("0");
                                txt = "0";
                            }
                            n++;
                        }
                        if (b1.getLabel().equals(txt) && b7.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b5.getLabel().equals(txt) && b6.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (n == 9) {

                            l.setText("Game drawn! Try again");
                            JOptionPane.showMessageDialog(f, "Game drawn ! Try again");

                        }
                    }
                });
                b5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (b5.getLabel().equals("") && n < 9) {
                            if (n % 2 == 0) {
                                b5.setLabel("X");
                                txt = "X";
                            } else {
                                b5.setLabel("0");
                                txt = "0";
                            }
                            n++;
                        }
                        if (b1.getLabel().equals(txt) && b9.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b3.getLabel().equals(txt) && b7.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b4.getLabel().equals(txt) && b6.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b2.getLabel().equals(txt) && b8.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");

                        } else if (n == 9) {
                            l.setText("Game drawn! Try again");
                            JOptionPane.showMessageDialog(f, "Game drawn ! Try again");

                        }
                    }
                });
                b6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (b6.getLabel().equals("") && n < 9) {
                            if (n % 2 == 0) {
                                b6.setLabel("X");
                                txt = "X";
                            } else {
                                b6.setLabel("0");
                                txt = "0";
                            }
                            n++;
                        }
                        if (b4.getLabel().equals(txt) && b5.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b3.getLabel().equals(txt) && b9.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (n == 9) {
                            l.setText("Game drawn! Try again");
                            JOptionPane.showMessageDialog(f, "Game drawn! Try again");
                        }
                    }
                });
                b7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (b7.getLabel().equals("") && n < 9) {
                            if (n % 2 == 0) {
                                b7.setLabel("X");
                                txt = "X";
                            } else {
                                b7.setLabel("0");
                                txt = "0";
                            }
                            n++;
                        }
                        if (b8.getLabel().equals(txt) && b9.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b4.getLabel().equals(txt) && b1.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b5.getLabel().equals(txt) && b3.getLabel().equals(txt)) {
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                            l.setText("Player " + txt + " win");
                        } else if (n == 9) {
                            l.setText("Game drawn! Try again");
                            JOptionPane.showMessageDialog(f, "Game drawn ! Try again");
                        }
                    }
                });
                b8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (b8.getLabel().equals("") && n < 9) {
                            if (n % 2 == 0) {
                                b8.setLabel("X");
                                txt = "X";
                            } else {
                                b8.setLabel("0");
                                txt = "0";
                            }
                            n++;
                        }
                        if (b5.getLabel().equals(txt) && b2.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b7.getLabel().equals(txt) && b9.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (n == 9) {
                            l.setText("Game drawn! Try again");
                            JOptionPane.showMessageDialog(f, "Game drawn!Try again");
                        }
                    }
                });
                b9.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (b9.getLabel().equals("") && n < 9) {
                            if (n % 2 == 0) {
                                b9.setLabel("X");
                                txt = "X";
                            } else {
                                b9.setLabel("0");
                                txt = "0";
                            }
                            n++;
                        }
                        if (b3.getLabel().equals(txt) && b6.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b7.getLabel().equals(txt) && b8.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (b1.getLabel().equals(txt) && b5.getLabel().equals(txt)) {
                            l.setText("Player " + txt + " win");
                            JOptionPane.showMessageDialog(f, "Player " + txt + " win");
                        } else if (n == 9) {
                            l.setText("Game drawn! Try again");
                            JOptionPane.showMessageDialog(f, "Game drawn! Try again");
                        }

                    }
                });
                f.setSize(600, 600);
                f.setLayout(null);
                f.setVisible(true);
            }

    }

