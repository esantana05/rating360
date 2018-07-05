package br.com.uolps.rating360.resource.rest;

import br.com.uolps.rating360.domain.Cargo;
import br.com.uolps.rating360.service.CargoService;
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
        value = "/cargos",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
)
public class CargoRestController {

    @Autowired
    private CargoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cargo> listar(){
        return service.findAll();
    }
}
