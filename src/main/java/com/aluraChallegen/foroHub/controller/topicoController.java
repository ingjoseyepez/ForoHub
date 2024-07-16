package com.aluraChallegen.foroHub.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")

public class topicoController {
    @PostMapping
    public void registrarMedico(@RequestBody String parametro) {
        //medicoRepository.save(new Medico(datosRegistroMedico));
        System.out.println("correcto");
        System.out.println(parametro);
    }
}
