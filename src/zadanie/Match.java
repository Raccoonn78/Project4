package zadanie;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Match extends JFrame {
    int x=0;
    int y=0;
    String Last;
    private JButton milan= new JButton("Milan");
    private JButton madrid= new JButton("Madrid");
    private JLabel label=new JLabel("Milan  "+x);
    private JLabel label2=new JLabel("Madrid  "+y);
    private JLabel last=new JLabel("Last Scorer");
    private JLabel winner=new JLabel("Winner:");


    private String whoWin(int x, int y){
    if(x>y)return "Milan";
    if(y>x)return "Madrid";
    return "рыба";
    }

    public Match () {
        super("Milan vs Madrid");
        this.setBounds(300, 300, 450, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 3));
        container.add(label);
        container.add(label2);
        container.add(last);
        container.add(winner);
        
        ButtonGroup group = new ButtonGroup();
        group.add(milan);
        group.add(madrid);
        container.add(milan);
        container.add(madrid);

        milan.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                x = x + 1;
                y = y + 0;
                last.setText("Last Scorer Milan");
                label.setText("Milan:" + x);
                winner.setText("Winner: " + whoWin(x, y));
            }
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
                               }
        );

        madrid.addMouseListener(new MouseListener() {
                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        y = y + 1;
                                        x=x+0;
                                        last.setText("Last Scorer Madrid");
                                        label2.setText("Madrid:" + y);
                                        winner.setText("Winner: " + whoWin(x, y));
                                    }

                                    @Override
                                    public void mousePressed(MouseEvent e) {
                                    }

                                    @Override
                                    public void mouseReleased(MouseEvent e) {
                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {
                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {
                                    }


                                }
        );

    }
}
