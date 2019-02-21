/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarioworld;

import modelo.Item;
import modelo.Protagonista;

/**
 *
 * @author aluno
 */
public class SuperMarioWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Protagonista Mario = Protagonista.MARIO;
        
        Item.COGUMELO_VERMELHO.incremento.usar_item(Mario);
        System.out.println(Mario.estado);
        
        Item.YOSHI.incremento.usar_item(Mario);
        System.out.println(Mario.yoshi);
        
        System.out.println(Mario);
    }
    
}
