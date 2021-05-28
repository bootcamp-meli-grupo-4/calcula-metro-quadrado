package br.com.mercadolivre.calculametroquadrado.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseCasaDto {
    private Double metroQuadradoTotal;
    private Double valorCasa;
    private List<ResponseComodoDto> comodos = new ArrayList<>();

    public Double getMetroQuadradoTotal() {
        return metroQuadradoTotal;
    }

    public void setMetroQuadradoTotal(Double metroQuadradoTotal) {
        this.metroQuadradoTotal = metroQuadradoTotal;
    }

    public Double getValorCasa() {
        return valorCasa;
    }

    public void setValorCasa(Double valorCasa) {
        this.valorCasa = valorCasa;
    }

    public List<ResponseComodoDto> getComodos() {
        return comodos;
    }

    public void setComodos(ResponseComodoDto comodos) {
        this.comodos.add(comodos);
    }
}
