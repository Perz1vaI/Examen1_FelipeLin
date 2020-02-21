package examen1_felipelin;

public class Alumnos {

    protected String nombre;
    protected int edad;
    protected String carrera;
    protected String lugarN;
    protected String numeroC;
    protected String usuario;
    protected String password;

    public Alumnos() {
        super();
    }

    public Alumnos(String nombre, int edad, String carrera, String lugarN, String numeroC, String usuario, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.lugarN = lugarN;
        this.numeroC = numeroC;
        this.usuario = usuario;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugarN() {
        return lugarN;
    }

    public void setLugarN(String lugarN) {
        this.lugarN = lugarN;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", lugarN=" + lugarN + ", numeroC=" + numeroC + ", usuario=" + usuario + ", password=" + password + '}';
    }

}
