package br.com.mercadolivre.calculametroquadrado.dto;

import java.util.List;

public class CasaDto {
    private String nome;
    private EnderecoDto enderecoDto;
    private List<ComodoDto> comodoDto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoDto getEnderecoDto() {
        return enderecoDto;
    }

    public void setEndereco(EnderecoDto enderecoDto) {
        this.enderecoDto = enderecoDto;
    }

    public List<ComodoDto> getComodoDto() {
        return comodoDto;
    }

    public void setComodos(List<ComodoDto> comodoDtos) {
        this.comodoDto = comodoDtos;
    }

}
