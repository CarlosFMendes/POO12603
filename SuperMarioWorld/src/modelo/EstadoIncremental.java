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
public class EstadoIncremental implements PowerUp {
    public final Estado estado;
    
    public EstadoIncremental(Estado estado) {
        this.estado = estado;
    }
    
    @Override
    public boolean surte_efeitos(Protagonista m) {
        return (m.estado.represent + 1) == estado.represent;
    }
    
    @Override
    public void usar_item(Protagonista m) {
        if (surte_efeitos(m)){
            m.estado = estado;
        }
    }
    
}
