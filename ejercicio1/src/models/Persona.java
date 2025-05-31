package models;

public class Persona {

    private String nombre;
    private int edad;

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

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;


    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hola ");
        sb.append(nombre.toUpperCase()).append(" Tu tienes ").append(edad).append(" años ");

        return sb.toString();
    }

    public Persona() {



    }
}
