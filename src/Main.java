import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame mainFrame=new JFrame();//creating instance of JFrame

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height

        mainFrame.add(b);//adding button in JFrame

        mainFrame.setSize(400,500);//400 width and 500 height
        mainFrame.setLayout(null);//using no layout managers
        mainFrame.setVisible(true);//making the frame visible
    }
}