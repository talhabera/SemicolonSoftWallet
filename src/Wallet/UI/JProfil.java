package Wallet.UI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class JProfil {
    static  String data[][]  = { {"Adı","Ahmet"},
            {"Soy adı","Hayri"},
            {"TC","12345678987"},
            {"ev adresi","hürriyet mah bakırcılar sok no19 daire 2"},
            {"cep tel","05380300803"},
            {"para durumu","1234"}};
    static String column[]={"Bilgiler","Icerik"};
    public static JTable jtable=new JTable(data,column);
    static void JProfil(){
    screen();
        panel.remove(labelHosgeldin);
        panel.remove(JHesabim.labelPara);
        panel.remove(JOdeme.Jodeme);





        jtable.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/10, arac.getScreenSize().width/2/7*4, arac.getScreenSize().height/2/4*2);
        panel.add(jtable);


    }
}
