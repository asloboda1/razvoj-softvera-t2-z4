package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    public TextField unos;
    public TextField izlaz;
    public int sumaCifara(int broj)
    {
        int cifra,sumacifri=0;
        while(broj>0)
        {
            cifra=broj%10;
            sumacifri=sumacifri+cifra;
            broj=broj/10;
        }
        return sumacifri;
    }

    public void dugme(ActionEvent actionEvent) {
        String tekst=unos.getText();

        int broj=Integer.parseInt(tekst);
        int cifra,suma;
        String izlaznitekst=new String();
        for(int i=1; i<broj; i++)
        {
              suma=sumaCifara(i);
               if(i%suma==0)
                   izlaznitekst+=i+",";

        }
        izlaz.setText(izlaznitekst);
    }
}
