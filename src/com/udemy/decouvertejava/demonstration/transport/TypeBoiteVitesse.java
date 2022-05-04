package com.udemy.decouvertejava.demonstration.transport;

public enum  TypeBoiteVitesse {
    AUTO ("Automatique"),
    SEMI_AUTO ("Semi_automatique"),
    MANUELLE ("Manuelle");

    String nomTypeBoite;

    private TypeBoiteVitesse(String nomTypeBoite){
        this.nomTypeBoite=nomTypeBoite;
    }

}
