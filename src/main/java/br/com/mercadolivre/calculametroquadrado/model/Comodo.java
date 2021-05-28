package br.com.mercadolivre.calculametroquadrado.model;

import br.com.mercadolivre.calculametroquadrado.dto.ComodoDto;

public class Comodo {
    private String nome;
    private boolean ehMaior;
    private Double largura;
    private Double comprimento;
    private Double metroQuadrado;


    public Comodo(ComodoDto dto){
        this(dto.getNome(), dto.getLargura(), dto.getComprimento());
    }

    private Comodo(String nome, Double largura, Double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
        this.metroQuadrado = this.largura * this.comprimento;
    }

    public void setEhMaior(boolean ehMaior) {
        this.ehMaior = ehMaior;
    }
    
    public Double getMetroQuadrado() {
        return metroQuadrado;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEhMaior() {
        return ehMaior;
    }
}
