package UT5_POOII.EjemploPolimorfismo;


import java.util.Scanner;

// Clase Padre
    class Animal {
        void hacerSonido() {
            System.out.println("Sonido genérico");
        }
        void comer(){
            System.out.println("Hay animales que no se comen");
        }
    }

    class Gamba extends Animal {
        void comer()
        {
            System.out.println("Las de Huelva están muy ricas");
        }
    }
    // Subclases
    class Perro extends Animal {
        @Override
        void hacerSonido() {

            System.out.println("El perro ladra: ¡Guau!");
        }
    }

    class Gato extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("El gato maúlla: ¡Miau!");
        }
    }

    // Uso del polimorfismo
    public class Main {
        public static void main(String[] args) {
            /*Animal miAnimal1 = new Perro(); // Polimorfismo
            Animal miAnimal2 = new Gato();  // Polimorfismo
            Animal miAnimal3 = new Gamba();

            miAnimal1.hacerSonido(); // Imprime: El perro ladra: ¡Guau!
            miAnimal2.hacerSonido(); // Imprime: El gato maúlla: ¡Miau!
            miAnimal3.hacerSonido();
            */

            Scanner teclado = new Scanner(System.in);
            String a;
            Animal animales [] = new Animal [3];
            int cont=0;
            do {
                System.out.println("¿Introduce un animal?");
                a= teclado.next();
                switch (a){
                    case "Gato":
                        animales[cont] = new Gato();
                        break;
                    case "Perro":
                        animales[cont] = new Perro();
                        break;
                    case "Gamba":
                        animales[cont] = new Gamba();
                        break;
                }
                cont++;
            }while(cont < 3);



            for (int i = 0; i < animales.length ; i++) {
                animales[i].hacerSonido();
                ((Animal) animales[i]).comer();
                if (animales[i] instanceof Gamba){
                    System.out.println("Si estoy aqui soy una gamba");
                    ((Gamba) animales[i]).comer();
                }
            }







            /*
          */



        }
    }


