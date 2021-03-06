package br.com.uolps.rating360.resource.rest;

import br.com.uolps.rating360.domain.Classe;
import br.com.uolps.rating360.service.interfaces.ClasseService;
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
        value = "/classes",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
)
public class ClasseRestController {

    @Autowired
    private ClasseService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Classe> listar(){
        return service.findAll();
    }
}
