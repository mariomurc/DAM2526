package UT6_ColeccionesYExcepciones.Ejemplos;

public class MainExcep {
    public static void main(String[] args) throws Exception {
        Persona p = new Persona();
        double resu;
        try{
            p.setEdad(-10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("LA EDAD NO ES VÁLIDA");
        }

        try{
            resu= 8/0;
        } catch (Exception e){

        }


        System.out.println("FIN DEL PROGRAMA");



    }
}
