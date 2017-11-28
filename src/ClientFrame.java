import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientFrame extends JFrame {
    private Container cp;
    private JLabel jlb=new JLabel("Server IP:");
    private JLabel jlb2=new JLabel("10.51.x.xx");
    private JLabel jlb3=new JLabel("Port:");
    private JTextField jtfR =new JTextField("");
    private JButton jbtnStart=new JButton("Start");
    private JButton jbtnStop=new JButton("Stop");
    private JButton jbtnExit=new JButton("Exit");
    private JButton jbtnSend=new JButton("Send");
    private JButton jbtn[]=new JButton[9];
    private JTextArea jta=new JTextArea("");
    private JTextField jtfBottom=new JTextField();
    private JPanel jpnCenter=new JPanel(new GridLayout(3,3,3,3));
    private JPanel jpnBottom=new JPanel(new BorderLayout(3,3));
    private JPanel jpnR=new JPanel(new GridLayout(7,1,3,3));
    private JScrollPane jsp=new JScrollPane(jta);
    public ClientFrame(){
        init();
    }
    private void init(){
        this.setTitle("Server");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(200,300,600,500);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(5,5));
        cp.add(jpnCenter, BorderLayout.CENTER);
        cp.add(jpnR, BorderLayout.EAST);
        cp.add(jpnBottom, BorderLayout.SOUTH);
        cp.add(jsp,BorderLayout.WEST);
        jta.setLineWrap(true);
        jsp.setPreferredSize(new Dimension(150,300));
        jpnBottom.add(jtfBottom,BorderLayout.CENTER);
        jpnBottom.add(jbtnSend, BorderLayout.EAST);
        jtfBottom.setPreferredSize(new Dimension(550,5));
        jpnR.add(jlb);
        jpnR.add(jlb2);
        jpnR.add(jlb3);
        jpnR.add(jtfR);
        jpnR.add(jbtnStart);
        jpnR.add(jbtnStop);
        jpnR.add(jbtnExit);
        jbtnExit.setBackground(new Color(144, 195, 255));
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        for(int i=0;i<9;i++){
            jbtn[i]=new JButton("");
            jbtn[i].setBackground(new Color(149, 97, 234));
            jbtn[i].setEnabled(false);
            jpnCenter.add(jbtn[i]);
        }



    }
}
