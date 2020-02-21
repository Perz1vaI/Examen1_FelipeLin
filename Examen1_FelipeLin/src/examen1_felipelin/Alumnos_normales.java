package examen1_felipelin;

import java.util.ArrayList;

public class Alumnos_normales extends Alumnos {

    private int conocimiento;
    private int aprendizaje;

    public Alumnos_normales() {
    }

    public Alumnos_normales(int aprendizaje, String nombre, int edad, String carrera, String lugarN, String numeroC, String usuario, String password) {
        super(nombre, edad, carrera, lugarN, numeroC, usuario, password);
        this.aprendizaje = aprendizaje;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public int getAprendizaje() {
        return aprendizaje;
    }

    public void setAprendizaje(int aprendizaje) {
        this.aprendizaje = aprendizaje;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
