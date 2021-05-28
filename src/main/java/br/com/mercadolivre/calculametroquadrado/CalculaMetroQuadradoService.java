package br.com.mercadolivre.calculametroquadrado;

import br.com.mercadolivre.calculametroquadrado.dto.CasaDto;
import br.com.mercadolivre.calculametroquadrado.dto.ResponseCasaDto;
import br.com.mercadolivre.calculametroquadrado.dto.ResponseComodoDto;
import br.com.mercadolivre.calculametroquadrado.model.Casa;
import org.springframework.stereotype.Service;

@Service
public class CalculaMetroQuadradoService {

    public ResponseCasaDto calculaMetro(CasaDto casaDto){
        Casa casa = new Casa(casaDto);
        ResponseCasaDto responseCasaDto = new ResponseCasaDto();
        responseCasaDto.setValorCasa(casa.getValorCasa());
        responseCasaDto.setMetroQuadradoTotal(casa.getNumeroTotalMetro());
        casa.getComodos().stream()
                .forEach(c-> responseCasaDto.setComodos(new ResponseComodoDto(c.getNome(), c.isEhMaior(), c.getMetroQuadrado())));
        return responseCasaDto;
    }
}
