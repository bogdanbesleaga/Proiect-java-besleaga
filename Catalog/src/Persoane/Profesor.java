package Persoane;
import Servicii.Serviciu;

public class Profesor extends Persoana {
    protected String domeniu;
    protected String tip;
    public Profesor(String nume, int varsta, String materie, String tip)
    {
        super(nume,varsta);
        this.domeniu=materie;
        this.tip=tip;//suplinitor permanent etc...
    }

    public String getMaterie() {
        return domeniu;
    }

    public void setMaterie(String materie) {
        this.domeniu = materie;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public void Afisare() {
        System.out.println(this.nume+" "+this.varsta+" este Profesor la materia "+ this.domeniu +" si este profesor "+ this.tip);
    }



}