package Materii;
import Persoane.Profesor;
import Servicii.Serviciu;
import java.util.ArrayList;
import java.util.List;

public class Materie {
    protected Profesor profesor;
    protected int nr_de_ore;
    protected int medie;
    protected String nume;
    protected int nr_absente;

    public Materie(String nume, int nr_or, int medie, int nr_ore,Profesor prof,int abs) {

        this.profesor = prof;
        this.nume = nume;
        this.medie =medie;
        this.nr_de_ore= nr_ore;
        this.nr_absente= abs;
    }

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public int getMedie() {
        return medie;
    }
    public void setMedie(int medie) {
        this.medie = medie;
    }
    public int getNr_absente() {
        return nr_absente;
    }
    public void setNr_absente(int abs) {
        this.nr_absente = abs;
    }
    public int getNr_de_ore() {
        return nr_de_ore;
    }
    public void setNr_de_ore(int abs) {
        this.nr_de_ore = abs;
    }
    public Profesor getProfesor(){return profesor;}
    public void setNume(Profesor prof) {
        this.profesor = prof;
    }

}
