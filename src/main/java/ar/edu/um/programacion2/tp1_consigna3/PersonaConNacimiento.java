package ar.edu.um.programacion2.tp1_consigna3;

public class PersonaConNacimiento extends Persona {
    protected String nacimiento;

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public PersonaConNacimiento() {
    }

    public PersonaConNacimiento(long dni, String nombre, String apellido, String nacimiento) {
        super(dni, nombre, apellido);
        this.nacimiento = nacimiento;
    }

    public PersonaConNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void show (){
        System.out.println("Metodo SHOW - Nombre: "+ this.nombre +
                            " Apellido: " + this.apellido +
                            " DNI: " + this.dni +
                            " Fecha de Nacimiento: " + this.nacimiento);
    }

    public String toString (){
        return "Metodo toString - Nombre: " + this.nombre
                + " Apellido: " + this.apellido
                + " DNI: " + this.dni
                + " Fecha de Nacimiento: " + this.nacimiento;
    }
}
