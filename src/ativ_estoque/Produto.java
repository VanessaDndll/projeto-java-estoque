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
    private int codigo, saldo;
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
    
    //teste
    void teste(){
        JOptionPane.showMessageDialog(null, "O código do produto é: " + codigo + "\nDescrição: " + descricao);
    }
    
}
