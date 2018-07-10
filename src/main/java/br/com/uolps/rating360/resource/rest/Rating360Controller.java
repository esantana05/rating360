package br.com.uolps.rating360.resource.rest;

import br.com.uolps.rating360.domain.Profissional;
import br.com.uolps.rating360.dao.interfaces.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rating360Controller {

    @Autowired
    private ProfissionalRepository profissionalRepository;

    @RequestMapping(path="/addProfissional", method = RequestMethod.POST)
    public void adicionarProfissional (@RequestBody Profissional profissional)
    {
        profissionalRepository.save(profissional);
    }
}

