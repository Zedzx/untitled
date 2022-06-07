import javax.swing.*;
import java.awt.*;

public class FiveChess extends JFrame {

    JFrame jFrame = new JFrame();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JButton jButton1 = new JButton("开始游戏");
    JButton jButton2 = new JButton("悔棋");
    JButton jButton3 = new JButton("退出游戏");
    public FiveChess(){
        this.setTitle("五子棋");
        this.setSize(816,839);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.add(jPanel1);
        this.add(jPanel2);
        this.add(jPanel3);
        this.add(jPanel4);
        jPanel1.setBounds(150,0,500,150);
        jPanel2.setBounds(150,650,500,150);
        jPanel3.setBounds(650,0,150,800);
        jPanel4.setBounds(0,0,150,800);
        jPanel1.setBackground(Color.GRAY);
        jPanel2.setBackground(Color.GRAY);
        jPanel3.setBackground(Color.GRAY);
        jPanel4.setBackground(Color.GRAY);
        jPanel1.setLayout(null);
        jPanel2.setLayout(null);
        jPanel3.setLayout(null);
        jPanel4.setLayout(null);
        jPanel3.add(jButton1);
        jPanel3.add(jButton2);
        jPanel3.add(jButton3);
        jButton1.setBounds(30,170,100,50);
        jButton2.setBounds(30,370,100,50);
        jButton3.setBounds(30,570,100,50);
        this.setResizable(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("五子棋小游戏",380,110);

    }
}

