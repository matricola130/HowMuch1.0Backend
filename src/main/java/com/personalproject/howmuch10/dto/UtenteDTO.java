package com.personalproject.howmuch10.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UtenteDTO {

    private String nome;
    private String cognome;
    private String email;
    private String user;
    private String password;

}
