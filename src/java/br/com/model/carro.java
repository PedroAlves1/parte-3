/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.model;

/**
 *
 * @author Pedro
 */
public class carro {
    private String modelo;
    private String descricao;
    private String tipo;
    private int ano;
    private float preco;
    private float consumo;
    private double ipva;
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public double getIpva() {
        return ipva;
    }

    public void setIpva(double ipva) {
        this.ipva = ipva;
    }
    
    public double CalculaIpva(){
        Integer anoatual;
        anoatual = 2014;
        if((anoatual - ano) > 20){
            ipva=0.00*preco;
        }else{
            if("G".equals(tipo)){
                ipva=0.04*preco;
            }
            else{
                ipva=0.03*preco;

            }        
    
}
        return ipva;
}
}
