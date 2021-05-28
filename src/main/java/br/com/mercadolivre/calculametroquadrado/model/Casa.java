package br.com.mercadolivre.calculametroquadrado.model;

import br.com.mercadolivre.calculametroquadrado.dto.CasaDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Casa {
    private Double numeroTotalMetro;
    private Double valorCasa;
    private List<Comodo> comodos = new ArrayList<>();

    public Casa(CasaDto casaDto) {
         casaDto.getComodoDto().stream().forEach(c -> this.comodos.add(new Comodo(c)));
         this.calculaQuantidadeTotalMetroQuadrado();
         this.definiMaiorComodo();
         this.calculaValorDaCasa();
    }


    private void calculaQuantidadeTotalMetroQuadrado() {
        this.numeroTotalMetro = this.comodos.stream()
                .map(Comodo::getMetroQuadrado)
                .reduce(0d, Double::sum);
    }

    private void definiMaiorComodo(){
        this.comodos.stream().max(Comparator.comparing(Comodo::getMetroQuadrado)).ifPresent(m->m.setEhMaior(true));
    }

    private void calculaValorDaCasa(){
        this.valorCasa = numeroTotalMetro * 800.0;
    }

    public Double getNumeroTotalMetro() {
        return numeroTotalMetro;
    }

    public Double getValorCasa() {
        return valorCasa;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }
}
