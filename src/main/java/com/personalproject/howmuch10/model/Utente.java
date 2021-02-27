package com.personalproject.howmuch10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "utente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String cognome;
    private String user;
    private String password;
    private String email;

    public Utente(String nome, String cognome, String user, String password, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.user = user;
        this.password = password;
        this.email = email;
    }
}
