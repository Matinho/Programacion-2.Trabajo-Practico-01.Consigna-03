package ar.edu.um.programacion2.tp1_consigna3;

public class Persona {
    protected long dni;
    protected String nombre;
    protected String apellido;

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona (){}

    public Persona (long dni, String nombre, String apellido){
        System.out.println("Estoy cargando los datos en persona");
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void show (){
        System.out.println("Metodo SHOW - Nombre: "+ this.nombre + " Apellido: " + this.apellido + " DNI: " + dni);
    }

    public String toString (){
        return "Metodo toString - Nombre: " + this.nombre + " Apellido: " + this.apellido + " DNI: " + this.dni;
    }

}
