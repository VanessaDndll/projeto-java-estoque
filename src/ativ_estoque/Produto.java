/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ_estoque;

import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class Produto {
    private int codigo, saldo, op, qtd;
    private String descricao;
    
    //CONSTRUTOR
    Produto(){
        
    }
    
    //CÓDIGO
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    
    //DESCRIÇÂO
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    //REGISTRAR ENTRADA
    public void registrarEntrada(int codigo, String descricao, int qtd, int saldo){
        //qtd = (Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto: ")));
        if(qtd < 0){
            JOptionPane.showMessageDialog(null, "Quantidade inválida!");
        }else{
            saldo = saldo + qtd;
            JOptionPane.showMessageDialog(null, "Saldo total do produto "+descricao+": "+saldo);
        }
    }
    
    //REGISTRAR SAÍDA
    public void registrarSaída(int codigo, String descricao, int qtd, int saldo){
        //qtd = (Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto: ")));
        if(qtd > saldo){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        }else{
            saldo = saldo - qtd;
            JOptionPane.showMessageDialog(null, "Saldo total do produto "+descricao+": "+saldo);
        }
    }
    
    //TESTE
    void teste(){
        JOptionPane.showMessageDialog(null, "O código do produto é: " + codigo + "\nDescrição: " + descricao);
    }
    
}
