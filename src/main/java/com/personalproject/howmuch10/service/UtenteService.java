package com.personalproject.howmuch10.service;

import com.personalproject.howmuch10.dto.UtenteDTO;
import com.personalproject.howmuch10.model.Utente;

import java.util.List;

public interface UtenteService {

    List<Utente> listAll();
    void addUtente(Utente utente);
    void deleteUtenteById(int id);
    void deleteUtente(UtenteDTO utenteDTO);

}
