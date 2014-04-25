package br.com.model;

/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
public class filmes {
    private String nome;
    private int oscar;
    private int estrelas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOscar() {
        return oscar;
    }

    public void setOscar(int oscar) {
        this.oscar = oscar;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public String oscarm(){
    if (oscar <= 0){
    return "Este filme não recebeu nenhum oscar!" ;
    
    }
        else{
    return "Este filme recebeu 1 oscar ou mais!";
        }
            
}
    
}
