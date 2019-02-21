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
public enum Item {
    COGUMELO_VERMELHO("Cogumelo Vermelho", true, false, true, false, new EstadoIncremental(Estado.GRANDE)),
    FLOR_FOGO("Flor Fogo", true, false, true, true, new EstadoIncremental(Estado.PODEROSO)),
    YOSHI("Yoshi", true, false, false, true, new IndependenteEstado()),
    PENA("Pena", true, true, true, true, new EstadoIncremental(Estado.VOADOR)),
    MOEDA("Moeda", true, true, false, false, null);
    
    public final String nome;
    public final boolean caixa, mundo;
    public final boolean mudanca_visual, novos_controles;
    public final PowerUp incremento;

    private Item(String nome, boolean caixa, boolean mundo, boolean mudanca_visual, boolean novos_controles, PowerUp inc) {
        this.nome = nome;
        this.caixa = caixa;
        this.mundo = mundo;
        this.mudanca_visual = mudanca_visual;
        this.novos_controles = novos_controles;
        this.incremento = inc;
    }
}
