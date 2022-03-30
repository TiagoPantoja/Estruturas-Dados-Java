/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subb_pilhafila;

/**
 *
 * @author 21070013
 */
public class SubB_PilhaFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PILHA");
        Pilha p1 = new Pilha(5);
        p1.push(2);
        p1.push(4);
        p1.push("seis");
        p1.push(6.75);
        p1.push(9);
        System.out.println(p1.toString());
        p1.pop();
        System.out.println("----------------------");
        System.out.println(p1.toString());
        
        System.out.println("FILA");
        Fila f1 = new Fila(3);
        f1.enqueue(1); f1.enqueue("três");
        f1.enqueue(5.5);
        System.out.println(f1.toString());
        f1.dequeue();f1.dequeue();
        System.out.println("----------------------");
        System.out.println(f1.toString());
        
    }
    
}
