package UT5_POOII.Agenda_Ruben;

import java.util.Scanner;

public class Menu {
    public static Scanner teclado = new Scanner(System.in);
    Agenda agenda = new Agenda();
    public void menu(){

        System.out.println("BIENVENIDO A TU AGENDA DE CONTACTOS QUE TE GUSTARÍA HACER?");
        int opcion;
        do {
            System.out.println("1. AÑADIR UN CONTACTO");
            System.out.println("2. BORRAR UN CONTACTO");
            System.out.println("3. LISTAR CONTACTOS");
            System.out.println("4. BUSCAR UN CONTACTO");
            System.out.println("5. HACER UNA LLAMADA");
            System.out.println("6. SALIR");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    agenda.listarContactos();
                    break;
                case 4:
                    opcion4();
                    break;
                case 5:
                    opcion5();
                    break;
                case 6:
                    System.out.println("SALIENDO DEL PROGRAMA...");
            }
        }while (opcion!= 6);


    }

    public void opcion1(){
        System.out.println("INTRODUCE EL NOMBRE");
        String nombre = teclado.nextLine();
        System.out.println("INTRODUCE EL NUMERO DE TELEFONO");
        String numero = teclado.nextLine();

        System.out.println("ES UNA EMPRESA O UNA PERSONA?");
        String c = teclado.nextLine();
        if (c.equalsIgnoreCase("EMPRESA")){
            System.out.println("INTRODUCE LA PAGINA WEB");
            String pag = teclado.nextLine();
            ContactoEmpresa c1 = new ContactoEmpresa(nombre, numero, pag);
            if (agenda.añadirContacto(c1)){
                System.out.println("AÑADIDO CORRECTAMENTE");
            }else {
                if (agenda.existeContacto(c1.getNombre())) {
                    System.out.println("YA HAY UN CONTACTO CON ESTE NOMBRE");
                } else {
                    System.out.println("YA NO SE PUEDEN AÑADIR MAS CONTACTOS");
                }
            }
        } else if (c.equalsIgnoreCase("PERSONA")) {
            System.out.println("INTRODUCE SU CUMPLEAÑOS");
            String cumpleaños = teclado.nextLine();
            ContactoPersona c1 = new ContactoPersona(nombre, numero, cumpleaños);
            if (agenda.añadirContacto(c1)){
                System.out.println("AÑADIDO CORRECTAMENTE");
            }else {
                if (agenda.existeContacto(c1.getNombre())) {
                    System.out.println("YA HAY UN CONTACTO CON ESTE NOMBRE");
                } else {
                    System.out.println("YA NO SE PUEDEN AÑADIR MAS CONTACTOS");
                }
            }
        } else{
            System.out.println("LO SENTIMOS, SOLO ACEPTAMOS PERSONAS Y EMPRESAS");
        }
    }
    public void opcion2(){
        System.out.println("INTRODUCE EL NOMBRE DEL CONTACTO QUE QUIERES BORRAR");
        String nombre = teclado.nextLine();
        if (agenda.eliminarContacto(nombre)){
            System.out.println("BORRADO EXITOSAMENTE");
        }else {
            System.out.println("ACTUALMENTE NO EXISTE NINGUN CONTACTO CON ESE NOMBRE");
        }
    }

    public void opcion4(){
        System.out.println("INTRODUCE EL NOMBRE DEL CONTACTO DEL QUE QUIERES SABER SU POSICION");
        String nombre = teclado.nextLine();
        if (agenda.buscaContacto(nombre) == -1){
            System.out.println("ESTE CONTACTO NO ESTA EN LA AGENDA DE CONTACTOS");
        }else{
            System.out.println(nombre + " SE ENCUENTRA EN LA POSICION " + agenda.buscaContacto(nombre));
        }
    }

    public void opcion5(){
        System.out.println("A QUIEN QUIERES LLAMAR? (INTRODUCE EL NOMBRE)");
        agenda.listarContactos();
        String nombre = teclado.nextLine();

        if (agenda.buscaContacto(nombre) != 1){
            Contacto c = agenda.getArrayContactos()[agenda.buscaContacto(nombre)];
            c.llamar();
        }else {
            System.out.println( "NO SE PUEDE LLAMAR PORQUE EL CONTACTO NO EXISTE");
        }

    }

}
