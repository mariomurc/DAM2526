
package UT5_POOII.HubJuegos.hub;


import UT5_POOII.HubJuegos.modelos.Jugador;
import UT5_POOII.HubJuegos.modelos.ResultadoPartida;
import UT5_POOII.HubJuegos.juegos.Juego;
import UT5_POOII.HubJuegos.juegos.JuegoAdivinaNumero;
import UT5_POOII.HubJuegos.juegos.JuegoPPT;
import UT5_POOII.HubJuegos.juegos.JuegoTresEnRaya;

public class HubJuegos {
    public Jugador[] jugadores = new Jugador[5];
    public Jugador[] ranking = new Jugador[5];
    private int numJugadores = 0;
    private Juego[] catalogo = new Juego[]{new JuegoAdivinaNumero(),
                                           new JuegoPPT(),
                                           new JuegoTresEnRaya()};

    // --- Gestión de jugadores ---
    public void registrarJugador(String nombre) {
       if (numJugadores >= jugadores.length){
           System.out.println("LÍMITE DE JUGADORES ALCANZADO");
       } else if (buscarJugador(nombre) != null){
           System.out.println("EL JUGADOR " + nombre + " YA EXISTE EN EL SISTEMA");
       } else{
           jugadores[numJugadores] = new Jugador(nombre);
           ranking[numJugadores] = new Jugador(nombre);
           numJugadores++;
       }
    }

    public Jugador buscarJugador(String nombre) {
        for (int i = 0; i < numJugadores; i++)
            if (jugadores[i].getNombre().equals(nombre))
                return jugadores[i];
        return null;
    }

    public void listarJugadores() {
        for (int i = 0; i < numJugadores; i++){
            System.out.println(jugadores[i].getNombre());
        }
    }

    // --- Catálogo de juegos ---
    public void listarJuegos() {
        for (int i = 0; i < catalogo.length; i++){
            System.out.println(catalogo[i].getNombre());
        }
    }

    public Juego crearJuegoPorId(String id) {

        switch (id) {
            case "A1": return new JuegoAdivinaNumero();
            case "PPT1": return new JuegoPPT();
            case "T1": return new JuegoTresEnRaya();
            default: return null;
        }
    }

    // --- Ejecución de partidas ---
    public ResultadoPartida iniciar(String idJuego, String[] nombres) {
        //SUPONEMOS QUE EL ID QUE LLEGA ES CORRECTO,
        Juego juego = crearJuegoPorId(idJuego);
        if (juego == null) {
            System.out.println(("Juego no encontrado: " + idJuego));
            return null;
        }
        else {
            Jugador[] js = new Jugador[nombres.length];
            for (int i = 0; i < nombres.length; i++) {
                js[i] = buscarJugador(nombres[i]);
                if (js[i] == null)
                    System.out.println("NO EXISTE EL JUGADOR PARA PODER JUGAR LA PARTIDA");
                //SI PROBAMOS CON DATOS PARA NO FORZAR EL ERROR, ESTO NO DEBERÍA PASAR
            }
            Jugador [] j = elegirJugadores(nombres);
            juego.inicializar(j);
            ResultadoPartida rp =  juego.ejecutarPartida();
            actualizarRankingGlobal();
            return rp;
        }
    }
    public void mostrarRankingGlobal(){
        System.out.println("RANKING GLOBAL DE JUGADORES");
        for (int i = 0; i < ranking.length; i++) {
            System.out.println("PUESTO [" + (i+1) + "]");
            System.out.println("JUGADOR:"  + ranking[i].getNombre());
            System.out.println("PUNTAJE:"  + ranking[i].getEstadisticas().getPuntos());
        }
    }
    private Jugador[] elegirJugadores(String[] nombres) {
        Jugador[] jug = new Jugador [nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < jugadores.length; j++) {
                if (nombres[i].equals(jugadores[j].getNombre())){
                    jug[i] = jugadores[j];
                }
            }
        }
        return jug;
    }

    // --- Ranking simple (orden descendente por puntos) ---
    public Jugador[] actualizarRankingGlobal() {
        this.ranking = jugadores;
        // bubble sort simple
        for (int i = 0; i < ranking.length - 1; i++) {
            for (int j = 0; j < ranking.length - i - 1; j++) {
                if (ranking[j].getEstadisticas().getPuntos() < ranking[j+1].getEstadisticas().getPuntos()) {
                    Jugador aux = ranking[j];
                    ranking[j] = ranking[j+1];
                    ranking[j+1] = aux;
                }
            }
        }
        return ranking;
    }
}
