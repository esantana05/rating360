package br.com.uolps.rating360.resource.rest;

import br.com.uolps.rating360.domain.Profissional;
import br.com.uolps.rating360.dao.interfaces.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping(
        value = "/profissionais",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
)
public class ProfissionalRestController {

    @Autowired
    private ProfissionalRepository profissionalRepository;


    @PostMapping
    public ResponseEntity<Void> adicionarProfissional (@RequestBody Profissional profissional)
    {
        profissionalRepository.save(profissional);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id_profissional}")
                .buildAndExpand(profissional.getId_profissional())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/{id_profissional}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Profissional> getCargo(@PathVariable("id_profissional") Long id){
        return profissionalRepository.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Profissional> listar(){
        return profissionalRepository.findAll();
    }
}

