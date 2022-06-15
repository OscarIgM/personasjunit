import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
public class Main {



    public static void main(String[] args) {
        int cantidad;
        Scanner reg=new Scanner(System.in);
        System.out.println("Persona");
        ArrayList <Persona> personas=new ArrayList<>();
        System.out.println("Digite una opcion");

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("1. Registrar Persona");
            System.out.println("2. Mostrar a todas las personas");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Scanner entrada= new Scanner(System.in);
                        String nombre;
                        String rut;
                        int edad=0;
                        String email;
                        //ingresar datos
                        System.out.println("Ingrese datos persona");
                        System.out.println("nombre:");
                        nombre= entrada.nextLine();
                        System.out.println("rut:");
                        rut= entrada.nextLine();
                        System.out.println("edad:");
                        edad = entrada.nextInt();
                        entrada.nextLine();//al poner un nextint anterior se bugea
                        System.out.println("email:");
                        email= entrada.nextLine();
                        Persona p= new Persona(nombre,rut,edad,email);
                        System.out.println(p);
                        //meter persona a arraylist
                        personas.add(p);
                        //gson
                        Gson pGson=new Gson();
                        String stringJson= pGson.toJson(p);
                        System.out.println("stringJson= "+stringJson);
                        Persona p=pGson.fromJson(stringJson,Persona.class);
                        FileWriter writer;
                        try{
                            writer=new FileWriter("persona. json");
                            Gson gson=new GsonBuilder().create();
                            gson.toJson(p,writer);
                            writer.close();
                        }catch (IOException e) {
                            System.out.println("No se pudo crear el archivo");
                        }


                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println(personas);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }




    }


}
