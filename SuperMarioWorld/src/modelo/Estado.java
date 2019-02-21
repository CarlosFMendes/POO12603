/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public enum Estado {
    
    PEQUENO("Pequeno", 0),
    GRANDE("Grande", 1),
    PODEROSO("Poderoso", 2),
    VOADOR("Voador", 2);
    
    final public String nome;
    final int represent;

    private Estado(String nome, int represent){
    this.nome = nome;
    this.represent = represent;
    }

}
