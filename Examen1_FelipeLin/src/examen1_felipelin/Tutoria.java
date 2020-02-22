package examen1_felipelin;

public class Tutoria {

    private String hora;
    private String aula;
    private int dia;
    private String clase;
    private int mes;
    private int año;
    private String tema;

    public Tutoria() {
    }

    public Tutoria(String hora, String aula, int dia, String clase, int mes, int año, String tema) {
        this.hora = hora;
        this.aula = aula;
        this.dia = dia;
        this.clase = clase;
        this.mes = mes;
        this.año = año;
        this.tema = tema;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Tutoria{" + "hora=" + hora + ", aula=" + aula + ", dia=" + dia + ", clase=" + clase + ", mes=" + mes + ", a\u00f1o=" + año + ", tema=" + tema + '}';
    }

}
