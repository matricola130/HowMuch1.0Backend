package com.personalproject.howmuch10.controller;

import com.personalproject.howmuch10.dto.UtenteDTO;
import com.personalproject.howmuch10.model.Utente;
import com.personalproject.howmuch10.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UtenteService utenteService;

    @GetMapping("/allUtenti")
    public List<Utente> listAllUtenti(){
        return utenteService.listAll();
    }

    @PostMapping("/addUtente")
    public void addUtente(@RequestParam String nome,
                   @RequestParam String cognome,
                   @RequestParam String user,
                   @RequestParam String password,
                   @RequestParam String email){
        Utente utente = new Utente(nome,cognome,user,password,email);
        utenteService.addUtente(utente);
    }

    @DeleteMapping("/deleteUtenteById")
    public void deleteUtenteById(@RequestParam int id){
        utenteService.deleteUtenteById(id);
    }

    @DeleteMapping("/deleteUtente")
    public void deleteUtente(@RequestParam UtenteDTO utente){
        utenteService.deleteUtente(utente);
    }

}
