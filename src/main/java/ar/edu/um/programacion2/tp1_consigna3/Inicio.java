package ar.edu.um.programacion2.tp1_consigna3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inicio {
    public static void main (String[] args){
        Inicio iniciar = new Inicio();
        iniciar.inicio();
    }

    public void inicio(){
        Persona persona1 = new Persona(30052419,"Matias","Figueredo");
        persona1.show();
        System.out.println(persona1.toString());


        Persona persona2 = new PersonaConNacimiento(30052419,"Matias","Figueredo","23/04/1984");
        persona2.show();
        System.out.println(persona2.toString());
    }
}