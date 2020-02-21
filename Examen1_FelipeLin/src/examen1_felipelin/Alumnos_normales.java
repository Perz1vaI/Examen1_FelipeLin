package examen1_felipelin;

import java.util.ArrayList;

public class Alumnos_normales extends Alumnos {

    private int conocimiento;
    private int aprendizaje;
    private ArrayList examenes = new ArrayList();

    public Alumnos_normales() {
    }

    public Alumnos_normales(int conocimiento, int aprendizaje) {
        this.conocimiento = conocimiento;
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

    public ArrayList getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return "Alumnos_normales{" + "conocimiento=" + conocimiento + ", aprendizaje=" + aprendizaje + ", examenes=" + examenes + '}';
    }

}
