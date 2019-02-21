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
public enum  Protagonista {
    
    MARIO("Mario"),
    LUIGI("Luigi");
    
    public final String nome;
    public Estado estado;
    public boolean yoshi;
    
 
    private Protagonista (String nome) {
    this.nome = nome;
    this.estado = Estado.PEQUENO;
    this.yoshi = false;
    }
    
    @Override
    public String toString(){
        return "It's me " + nome;
    
}

}
