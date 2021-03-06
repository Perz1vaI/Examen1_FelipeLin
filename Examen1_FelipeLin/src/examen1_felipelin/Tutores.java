package examen1_felipelin;

import java.util.ArrayList;

public class Tutores extends Alumnos {

    private ArrayList clases = new ArrayList();
    private int ganancias;
    private int tutorias;
    private int nivelE;

    public Tutores() {
    }

    public Tutores(int tutorias,int nivelE, String nombre, int edad, String carrera, String lugarN, String numeroC, String usuario, String password) {
        super(nombre, edad, carrera, lugarN, numeroC, usuario, password);
        this.nivelE = nivelE;
        this.tutorias = tutorias;
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

    public int getTutorias() {
        return tutorias;
    }

    public void setTutorias(int tutorias) {
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
        return nombre;
    }

}
