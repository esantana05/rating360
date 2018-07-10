package br.com.uolps.rating360.resource.rest;

import br.com.uolps.rating360.domain.CriterioAvaliativo;
import br.com.uolps.rating360.service.interfaces.CriterioAvaliativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
        value = "/criterios",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
)
public class CriterioAvaliativoRestController {

    @Autowired
    private CriterioAvaliativoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CriterioAvaliativo> listar(){
        return service.findAll();
    }
}
