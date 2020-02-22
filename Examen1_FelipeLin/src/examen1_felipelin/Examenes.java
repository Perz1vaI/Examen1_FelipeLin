package examen1_felipelin;

public class Examenes {

    private int conocimiento = 0;
    private String tema;
    private int puntaje;
    private String clase;

    public Examenes(String tema, int puntaje, String clase) {
        this.tema = tema;
        this.puntaje = puntaje;
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return clase;
    }

}
