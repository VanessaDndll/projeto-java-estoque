/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ_estoque;

import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class Ativ_estoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto pd = new Produto();
        
        pd.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto: ")));
        
        pd.setDescricao(JOptionPane.showInputDialog("Insira a descrição do produto: "));
        
        pd.teste();
    }
    
}
