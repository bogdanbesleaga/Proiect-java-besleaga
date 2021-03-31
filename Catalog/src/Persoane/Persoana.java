package Persoane;


import Servicii.Serviciu;

public abstract class Persoana implements Serviciu {
    String nume;
    int varsta;
    Persoana(String nume,int varsta)
    {
        this.nume=nume;
        this.varsta=varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    abstract public void Afisare();

}