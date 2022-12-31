package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class JOdeme {

    static  String data[][]  = { {"Turkcell","1500"},
        {"VODAFON","1600"},
        {"İSKİ","18987"},
        {"iNTERNET","2357"},
        {"cep tel","543"},
        {"elektrik","1234"}};
    static String column[]={"Firma","Odenecek tutar"};
    public static JTable Jodeme=new JTable(data,column);
    static void JOdeme(){
        screen();
        panel.remove(labelHosgeldin);
        panel.remove(JHesabim.labelPara);
        panel.remove(JProfil.jtable);
        JButton submit = new JButton("Ödeme");
        submit.setBounds(0, 0, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);



        Jodeme.add(submit);

        Jodeme.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/10, arac.getScreenSize().width/2/7*4, arac.getScreenSize().height/2/4*2);
        panel.add(Jodeme);


    }
}
