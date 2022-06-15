import java.util.ArrayList;

public class Persona implements java.io.Serializable {
        private String nombre;
        private String rut;
        private int edad;
        private String email;

        public Persona(String nombre, String rut, int edad,String email) {
            this.nombre = nombre;
            this.rut = rut;
            this.edad = edad;
            this.email=email;
        }


    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                '}';
    }
}