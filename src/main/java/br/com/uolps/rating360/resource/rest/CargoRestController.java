package br.com.uolps.rating360.resource.rest;

import br.com.uolps.rating360.domain.Cargo;
import br.com.uolps.rating360.service.interfaces.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(
        value = "/cargos",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
)
public class CargoRestController {

    @Autowired
    private CargoService service;

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody Cargo cargo) {

        service.save(cargo);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id_cargo}")
                .buildAndExpand(cargo.getId_cargo())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cargo> listar(){
        return service.findAll();
    }
}
