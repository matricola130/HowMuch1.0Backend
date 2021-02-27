package com.personalproject.howmuch10.service;

import com.personalproject.howmuch10.dto.UtenteDTO;
import com.personalproject.howmuch10.model.Utente;
import com.personalproject.howmuch10.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteServiceImpl implements UtenteService{

    @Autowired
    UtenteRepository utenteRepository;

    @Override
    public List<Utente> listAll() {
        return utenteRepository.findAll();
    }

    @Override
    public void addUtente(Utente utente) {
        utenteRepository.save(utente);
    }

    @Override
    public void deleteUtenteById(int id){ utenteRepository.deleteById(id);}

    @Override
    public void deleteUtente(UtenteDTO utenteDTO){

        Utente utente = new Utente();

        //Binding dati
        utente.setNome(utenteDTO.getNome());
        utente.setCognome(utenteDTO.getCognome());
        utente.setEmail(utenteDTO.getEmail());
        utente.setPassword(utenteDTO.getPassword());
        utente.setUser(utenteDTO.getUser());

        utenteRepository.delete(utente);
    }
}
