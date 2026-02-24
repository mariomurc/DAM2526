package UT5_POOII.EjemploPolimorfismo;


    // Clase Padre
    class Animal {
        void hacerSonido() {
            System.out.println("Sonido genérico");
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
            Animal miAnimal1 = new Perro(); // Polimorfismo
            Animal miAnimal2 = new Gato();  // Polimorfismo

            miAnimal1.hacerSonido(); // Imprime: El perro ladra: ¡Guau!
            miAnimal2.hacerSonido(); // Imprime: El gato maúlla: ¡Miau!
        }
    }


