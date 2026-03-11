public class MisPruebas {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.dibujar();
        c.setTipo("Figura circular");
        System.out.println("Tipo: " + c.tipo);
        Cuadrado s = new Cuadrado();
        s.dibujar();
        s.setTipo("Figura cuadrada");
        System.out.println("Tipo: " + s.tipo);
        Figura arrayFiguras [] = new Figura[3];
        arrayFiguras[0] = c;
        arrayFiguras[1] = s;

        arrayFiguras[0].dibujar();
        arrayFiguras[1].dibujar();

    }
    static abstract class Figura {
        String tipo;
        // Las subclases deben implementar el método abstracto.
        abstract void dibujar();
        void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }
    static class Circulo extends Figura {
        void dibujar() {
            System.out.println("Dibujando un círculo");
        }}
    static class Cuadrado extends Figura {
        void dibujar() {
            System.out.println("Dibujando un cuadrado");
        }}

}
