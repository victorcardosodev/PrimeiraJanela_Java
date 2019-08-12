/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirajanela;

import javax.swing.*;
import java.awt.*;

public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela(){
        super("Nossa primeira janela"); /*titulo do programa*/
        Container tela = getContentPane(); /* trocar de tela */
        tela.setBackground(Color.blue); /* // // // // // // */
        setSize(300,150); /* tamanho */
        /* setResizable(false); tamanho fixo*/
        setVisible(true); /*visibilidade do programa na tela*/
        /* setExtendedState(ICONIFIED); inicializar minimizada*/
        setLocationRelativeTo(null); /*inicializar centralizada*/
    }

    public static void main(String args[]) {
        PrimeiraJanela app = new PrimeiraJanela();
        app.serDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
    
    

    private void serDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
