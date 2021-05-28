package br.com.mercadolivre.calculametroquadrado.controller;

import br.com.mercadolivre.calculametroquadrado.CalculaMetroQuadradoService;
import br.com.mercadolivre.calculametroquadrado.dto.CasaDto;
import br.com.mercadolivre.calculametroquadrado.dto.ResponseCasaDto;
import br.com.mercadolivre.calculametroquadrado.dto.ResponseComodoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculoMetroQuadradoController {
    private CalculaMetroQuadradoService service;

    public CalculoMetroQuadradoController(CalculaMetroQuadradoService service) {
        this.service = service;
    }

    @PostMapping("/")
    public ResponseEntity<ResponseCasaDto> calculaMetro(@RequestBody CasaDto casaDto){
        ResponseCasaDto responseCasaDto = this.service.calculaMetro(casaDto);
        return new ResponseEntity<>(responseCasaDto, HttpStatus.CREATED);
    }
}
