package gt.umg.prograII;

import sun.rmi.transport.ObjectTable;

public class Alumno implements ComparadorA {
    /**
     * Atributos
     */
    private String carne;
    private String nombre;
    private int edad;

    /**
     * Constructor
     */
    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Alumno(int edad) {
        this.edad = edad;

    }

    /**
     * Getters and Setters
     */
    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
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

    @Override
    public boolean igualque(Object par) {
        Alumno a = (Alumno) par;
        return this.edad == a.edad;
    }

    @Override
    public boolean menorque(Object par) {
        Alumno a = (Alumno) par;
        return this.edad < a.edad;
    }

    @Override
    public boolean menoriqualque(Object par) {
        Alumno a = (Alumno) par;
        return this.edad <= a.edad;
    }

    @Override
    public boolean mayorque(Object par) {
        Alumno a = (Alumno) par;
        return this.edad > a.edad;
    }

    @Override
    public boolean mayorigualque(Object par) {
        Alumno a = (Alumno) par;
        return this.edad >= a.edad;
    }
}
