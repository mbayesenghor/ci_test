package sn.poste.ci_test.domain;

import java.io.Serializable;
import java.util.Date;

public class Test implements Serializable {

    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private int age;
    private double taille;

    public Test(){
        new Date();
    }
}
