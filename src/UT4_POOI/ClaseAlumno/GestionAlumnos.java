package UT4_POOI.ClaseAlumno;

public class GestionAlumnos {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Joaquin", 18,"1ºDAM",9.2, "AA3");
        Alumno a2 = new Alumno("Alex", 19,"1ºDAW",9, "AA3");
        Alumno a3 = new Alumno("Ivan", 20,"1ºASIR",5, "AA3");


        a3.mostrarInfo();
        System.out.println(a3.estaAprobado());
        a2.mostrarInfo();
        System.out.println(a2.estaAprobado());
        a1.mostrarInfo();
        System.out.println(a1.estaAprobado());

        //EDITAR
        a1.setNotaMedia(8);
        a1.mostrarInfo();
        a2.setCurso("1ºDAM");
        a2.mostrarInfo();

        if(a3.getNotaMedia() > a1.getNotaMedia())
        {
            System.out.println(a3.getNombre() + " tiene mejor nota");
        } else if (a3.getNotaMedia() < a1.getNotaMedia())
        {
            System.out.println(a1.getNombre() + " tiene mejor nota");
        } else {
            System.out.println(a1.getNombre() + " Y " + a2.getNombre() +
                    " TIENEN LA MISMA NOTA MEDIA");
        }
        a1.subirNota(3);

    }

}
