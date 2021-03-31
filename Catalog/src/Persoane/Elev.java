package Persoane;

import Servicii.Serviciu;
import Materii.Materie;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Elev extends Persoana implements Comparable<Elev> {
    private int clasa;
    private char litera;
    private int cod;
    List<Materie> listaMaterii = new ArrayList<>();


    public Elev(String nume, int varsta, int cod, int clasa, char litera) {
        super(nume, varsta);
        this.clasa = clasa;
        this.litera = litera;
        this.cod = cod;

    }

    public int getClasa() {
        return clasa;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public char getLitera() {
        return litera;
    }

    public void setLitera(char litera) {
        this.litera = litera;
    }
    public List<Materie> getListaMaterii(){

        return listaMaterii;

    }
    public void adaugaMaterii ( Materie c ){

        listaMaterii.add(c);

    }


    @Override
    public void Afisare() {
        System.out.println(this.nume + "cu varsta" + this.varsta + "in clasa " + this.clasa + this.litera);
    }
    @Override
    public int compareTo(Elev elev) {
        String nume = this.nume;
        String comparat = elev.nume;
        return nume.compareTo(comparat);
    }


}