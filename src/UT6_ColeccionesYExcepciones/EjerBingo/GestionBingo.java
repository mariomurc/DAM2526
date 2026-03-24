package UT6_ColeccionesYExcepciones.EjerBingo;

import java.sql.SQLOutput;
import java.util.*;

public class GestionBingo {
    Scanner teclado = new Scanner(System.in);
    HashSet<Integer> bombo;
    ArrayList<Integer> listaBolas;
    ArrayList<Jugador> jugadores;
    HashMap<String,Integer> ranking;
    ArrayList<Jugador> ganadores;


    GestionBingo(){
        this.bombo = new HashSet<>();
        this.listaBolas = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.ranking = new HashMap<>();
        this.ganadores = new ArrayList<>();
    }

    public void inicializarPartida(){
        rellenarBombo();
        repartirCartones();
    }
    private void rellenarBombo(){

        for (int i = 1; i < 10 ; i++) {
            bombo.add(i);
        }
    }
    private void repartirCartones(){

        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        String nif;
        int numCartones;
        System.out.println("INTRODUCE EL NÚMERO DE JUGADORES: ");
        int numJugadores = teclado.nextInt();
        /*System.out.println("SE ASIGNAN DOS JUGADORES POR DEFECTO");
        int numJugadores = 2;*/
        for (int i = 0; i < numJugadores; i++) {
            ArrayList<Carton> listaCart = new ArrayList<>();
            System.out.println("NIF DEL JUGADOR " + (i+1));
            nif=teclado.next();
            System.out.println("NÚMERO DE CARTONES DEL JUGADOR " + (i+1));
            numCartones= teclado.nextInt();
            //SE VAN A ASIGNAR N CARTONES AL JUGADOR CON NIF xx
            Jugador a = new Jugador(nif);
            for (int j = 0; j < numCartones ; j++) {
                Carton c = new Carton(r.nextInt(1,1000));
                while (c.getCartonJugador().size()!=4){
                    c.getCartonJugador().add(r.nextInt(1,10));
                }
                listaCart.add(c);
                a.setListaCartones(listaCart);
            }
            jugadores.add(a);
        }
    }

    public void jugarPartida(){
        System.out.println("---------------------------------------------------------");
        System.out.println("INFORMACIÓN DE LOS JUGADORES QUE PARTICIPAN EN LA PARTIDA");
        System.out.println("---------------------------------------------------------");
        for (Jugador j:jugadores){
            System.out.println(j.toString());
        }
        teclado.nextLine();
        System.out.println("SE SACARÁN BOLAS DEL BOMBO HASTA QUE HAYA GANADOR");
        boolean ganador = false;
        int numeroCantado=0;
        while (!ganador){
            numeroCantado=sacarBolaDelBombo();
            listaBolas.add(numeroCantado);
            comprobarEnCartonesJugadores(numeroCantado);
            mostrarInfoCartonesJugadores();
            this.ganadores=comprobarGanador();
            if (this.ganadores.size() !=0){
                ganador=true;
            }
            teclado.nextLine();
        }
        mostrarInfoGanadores(this.ganadores);
    }

    public void mostrarInfoGanadores(ArrayList<Jugador> listaGanadores){
        System.out.println("*********************************************");
        System.out.println("**********LISTA DE GANADOR/ES****************");
        System.out.println("***********DE LA PARTRIDA********************");
        for (Jugador g:listaGanadores){
            System.out.println("JUGADOR CON DNI: " + g.getNif() );
      }
    }

    public ArrayList comprobarGanador(){
        ArrayList<Jugador> ganadores = new ArrayList<>();
        for (Jugador j:jugadores){
            for (Carton c:j.getListaCartones()){
                if (c.getCartonJugador().isEmpty()){
                    ganadores.add(j);
                }
            }
        }

        return ganadores;
    }

    public void mostrarInfoCartonesJugadores(){
        for (Jugador j:jugadores){
            for (Carton c:j.getListaCartones()){
                System.out.println("El NIF: " + j.getNif() + " EN EL CARTON " + c.getIdCarton() +
                        " LE QUEDAN " + c.getCartonJugador().size()) ;
                }
            }
        }
    public void comprobarEnCartonesJugadores(int numero){
        for (Jugador j:jugadores){
            for (Carton c:j.getListaCartones()){
                if (c.getCartonJugador().remove(numero)){
                    System.out.println("El NIF: " + j.getNif() + " EN EL CARTON " + c.getIdCarton() + " TIENE EL NÚMERO " + numero) ;
                }
            }
        }
    }

    public int sacarBolaDelBombo(){
        // Crea un Arraylist con los elementos de bombo
        List<Integer> nBombo = new ArrayList<>(bombo);
        int select=0;
        // mientras que este vacio saca un numero
        if (!nBombo.isEmpty()){
            // coge un numero aleatiro dentro de los que hay en el aL bombo
            select = nBombo.get(new Random().nextInt(nBombo.size()));
            System.out.println("NUMERO CANTADO: " + select);
            // estos es para saber cuales ya salieron
            // lo borro de el bombo del principio para que no se repita
            bombo.remove(select);
        } else {
            // no deberia de mostrarse este print pero por si acaso
            System.out.println("EL BOMBO ESTA VACIO");
        }
        return select;
    }

    public void finalizarPartida(){
//ACTUALIZAMOS EL MAPA DE RANKING DE GANADORES
        for (Jugador j:this.ganadores){
            if (ranking.containsKey(j.getNif())){
                ranking.put(j.getNif(),ranking.get(j.getNif())+1);
            } else {
                ranking.put(j.getNif(),1);
            }
        }
        System.out.println("=====================================");
        System.out.println("LISTADO DE BOLAS SACADAS DEL BOMBO   ");
        System.out.println("=====================================");
        for (Integer lb:listaBolas){
            System.out.print(lb + " ");
        }
        System.out.println();
        System.out.println("=====================================");
//MOSTRAMOS EL RANKING. INICIALMENTE SOLO SE PUEDE JUGAR UNA PARTIDA, ASÍ QUE EN EL RANKING SOLO DEBERÍA APARECER EL GANADOR CON
//UN PUNTO
        Iterator<Map.Entry<String, Integer>> iterator = ranking.entrySet().iterator();
        while (iterator.hasNext())
        {
            // Comprueba si la siguiente entrada existe en el MAPA
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println("Jugador = " + entry.getKey() + ", PUNTOS = " + entry.getValue());
        }
        resetearEstructuras();
    }
    public void resetearEstructuras(){
        jugadores.clear();
        ganadores.clear();
        bombo.clear();
        listaBolas.clear();
    }
}
