package br.com.pmmh.teste.model;

import javax.persistence.*;

@Entity
@Table
public class Jogada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_JOGADA", unique = true)
    private Long id;

    @Column(name = "ID_TABULEIRO")
    private Long idTabuleiro;

    @Column(name = "ATIVA")
    private Boolean ativa;

    public Jogada() {
    }

    public Jogada(Long idTabuleiro, Boolean ativa) {
        this.idTabuleiro = idTabuleiro;
        this.ativa = ativa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTabuleiro() {
        return idTabuleiro;
    }

    public void setIdTabuleiro(Long idTabuleiro) {
        this.idTabuleiro = idTabuleiro;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
}

