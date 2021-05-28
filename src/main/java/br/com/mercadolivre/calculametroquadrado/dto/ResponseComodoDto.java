package br.com.mercadolivre.calculametroquadrado.dto;

public class ResponseComodoDto {
    private String nome;
    private boolean ehMaior;
    private Double metroQuadrado;


    public ResponseComodoDto(String nome, boolean ehMaior, Double metroQuadrado) {
        this.nome = nome;
        this.ehMaior = ehMaior;
        this.metroQuadrado = metroQuadrado;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEhMaior() {
        return ehMaior;
    }

    public Double getMetroQuadrado() {
        return metroQuadrado;
    }
}
