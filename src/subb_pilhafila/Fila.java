/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subb_pilhafila;

/**
 *
 * @author 21070013
 */
public class Fila {
    //Atributos:
    private int tamanho;
    private Object[] fila;
    private int fim = -1;
    private final int inicio = 0; // final, valor constante, imutável...
    //Construtores:
    public Fila(int tamanho){
        this.tamanho = tamanho;
        this.fila = new Object[tamanho];
    }
    //Métodos:
    public void enqueue(Object valor){
        if(this.fim < this.tamanho-1)
            this.fila[++this.fim] = valor;
        else
            throw new RuntimeException("Erro! Fila cheia");
    }
    public void dequeue(){
        if(this.fim >= 0){
            this.fila[this.inicio] = null;
            this.fim--;
            //Deslocar elementos:
            for(int i = 0; i < this.tamanho; i++)
                if(i != this.tamanho-1){
                    this.fila[i] = this.fila[i+1];
                }else{
                    this.fila[i] = null;
                }
        }else{
            throw new RuntimeException("Erro! Fila vazia");
        }}    
    @Override
    public String toString(){
        String s = "";
        for(Object f: this.fila){
            s+= f + "; ";
        }
        return s;
    }
        
    
       
}// fim da classe
