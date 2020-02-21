package examen1_felipelin;

import java.util.ArrayList;

public class Tutores extends Alumnos {

    private ArrayList clases = new ArrayList();
    private int ganancias;
    private ArrayList tutorias = new ArrayList();
    private int nivelE;

    public Tutores() {
    }

    public Tutores(int nivelE, String nombre, int edad, String carrera, String lugarN, String numeroC, String usuario, String password) {
        super(nombre, edad, carrera, lugarN, numeroC, usuario, password);
        this.nivelE = nivelE;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public ArrayList getTutorias() {
        return tutorias;
    }

    public void setTutorias(ArrayList tutorias) {
        this.tutorias = tutorias;
    }

    public int getNivelE() {
        return nivelE;
    }

    public void setNivelE(int nivelE) {
        this.nivelE = nivelE;
    }

    @Override
    public String toString() {
        return "Tutores{" + "clases=" + clases + ", ganancias=" + ganancias + ", tutorias=" + tutorias + ", nivelE=" + nivelE + '}';
    }

}
