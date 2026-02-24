package UT4_POOI.MiExamen;

public class GestionJJOO {
    public static Deportes[] arrayDeportes = new Deportes[5];
    public static Atleta[] arrayAtleta = new Atleta[10];
    public static int numDeportes=0;
    public static int numAtletas=0;

    public static void registrarDeporte(String dep){
        Pruebas[] arrayPruebas = new Pruebas[5];
        boolean hueco=false;
        if (numDeportes < 5){
            arrayDeportes[numDeportes]=new Deportes(dep,arrayPruebas);
            System.out.println(arrayDeportes[numDeportes].toString());
        }
        numDeportes++;
    }
    public static void registrarPruebaEnDeporte(String dep, String pru){
        int i=0;
        boolean enc=false;
        //busco el deporte
        while (arrayDeportes[i] != null && i < numDeportes && !enc){
            if (arrayDeportes[i].getNombreDeporte().equals(dep)){
                System.out.println("El deporte existe");
                enc=true;
            }else {
                i++;
            }
        }
        if (!enc){
            System.out.println("Error no existe el deporte" + dep);
        } else {
            arrayDeportes[i].añadirPrueba(pru);
        }
    }
    public static void registrarAtleta(String nombre, int codAtleta, String pais){
        arrayAtleta[numAtletas] = new Atleta(nombre,codAtleta,pais);
        System.out.println("ATLETA REGISTRADO");
        System.out.println("Nombre: " + arrayAtleta[numAtletas].getNombreAtleta());
        System.out.println("CodAtleta: " + arrayAtleta[numAtletas].getCodigoAtleta());
        System.out.println("Pais: " + arrayAtleta[numAtletas].getPais());
        numAtletas++;
    }

    public static void contarAtletasPorPais(String pais){
        int cont=0;
        for (int i = 0; i < numAtletas; i++) {
            if (arrayAtleta[i].getPais().equals(pais)){
                cont++;
            }
        }
        System.out.println("EL NÚMERO DE ATLETAS DE " + pais + " ES: " + cont);
    }
    public static void eliminarAtletaPorCodigo(int codAtleta){
        for (int i = 0; i < numAtletas; i++) {
            if (arrayAtleta[i].getCodigoAtleta() == codAtleta){
                arrayAtleta[i].setCodigoAtleta(0);
                arrayAtleta[i].setNombreAtleta(null);
                arrayAtleta[i].setPais(null);
                System.out.println("ATLETA con código " + codAtleta + " eliminado");
            }
        }
        for (int i = 0; i < numAtletas; i++) {
            System.out.println(arrayAtleta[i].toString());
        }
    }

    public static void renombrarPrueba(String deporte, String nombreActual, String nombreNuevo){

    }

    public static void quitarMedalla(String nombrePrueba, String tipo){

    }

    public static void actualizarPais(int codAtleta, String nuevoPais){

    }





}
