/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subb_pilhafila;

/**
 *
 * @author 21070013
 */
public class Pilha {
    //Atributos:
    private int topo = -1;
    private int tamanho;
    private Object[] pilha; // ou private int pilha[]; ou pode ser private int[] pilha;
        //A classe Object é a mais geral do java e é herdada por todas as classes, inclusive as quea gente cria
    //Construtor:
    public Pilha(int tamanho){
        this.tamanho = tamanho;
        pilha = new Object[tamanho];
    }
    //Métodos:
    public void push(Object valor){
        if(this.topo < this.tamanho-1){
            this.pilha[++this.topo]=valor; // primeiro o incremento para depois armazenar
            //this.pilha[this.topo++]=valor; // primeiro armazenar para depois incrementar
        }else{
            throw new RuntimeException("Erro! Pilha cheia!");
        }
    }
    public void pop(){
        if(this.topo>-1)
            this.pilha[this.topo--] = null;
        else
            throw new RuntimeException("Erro! Pilha vazia.");
    }

    @Override
    public String toString() {
        String s= "";
        for(int i = this.tamanho-1; i>=0; i--)
            s+= this.pilha[i]+"\n";
        return s; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    //Como ficar sem a identação? Só pode ficar com um elemento dentro da indentação, como é o exemplo dos dois últimos métodos.
}// fim da classe
