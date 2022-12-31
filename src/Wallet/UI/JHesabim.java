package Wallet.UI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static Wallet.UI.JProfil.jtable;
import static Wallet.UI.MainWindow.*;

public class JHesabim {
public  static     int para=12345;

    public static     JLabel labelPara = new JLabel("Bakiyeniz "+para+"TL");


    static void JHesabim(){
        screen();
        panel.remove(labelHosgeldin);
        panel.remove(jtable);
        panel.remove(JOdeme.Jodeme);

        labelPara.setFont(new Font("Para", Font.PLAIN, 36));
        labelPara.setForeground(new Color(50, 50, 10));
        labelPara.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/4, arac.getScreenSize().width/2/7*6, 100);
        panel.add(labelPara);

    }
}
