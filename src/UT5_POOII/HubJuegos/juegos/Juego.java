
package UT5_POOII.HubJuegos.juegos;


import UT5_POOII.HubJuegos.modelos.EstadoPartida;
import UT5_POOII.HubJuegos.modelos.Jugador;
import UT5_POOII.HubJuegos.modelos.ResultadoPartida;
import UT5_POOII.HubJuegos.modelos.TipoJuego;
import UT5_POOII.HubJuegos.interfaces.Jugable;

/**
 * Clase abstracta base para todos los juegos del sistema.
 * Contiene el MÉTODO PLANTILLA FINAL ejecutarPartida() que NO puede ser modificado.
 */
public abstract class Juego implements Jugable {

    protected String id;
    protected String nombre;
    protected TipoJuego tipo;
    protected Jugador[] jugadores;
    protected EstadoPartida estado;

    public Juego(String id, String nombre, TipoJuego tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;

        this.estado = EstadoPartida.CREADA;
    }

    // --- métodos que cada juego debe concretar ---
    protected abstract boolean validarJugadores(Jugador[] jugadores);
    @Override public abstract void jugarTurno();
    @Override public abstract boolean estaFinalizado();
    @Override public abstract ResultadoPartida obtenerResultado();

    @Override
    public void inicializar(Jugador[] jugadores) {
        //ESTA LLAMADA COMPROBARÍA SI EL ARRAY DE JUGADORES VIENE CON UN SOLO JUGADOR
        //SI QUISIERAMOS IMPLEMENTAR ESTO, DEBERÍAMOS DAR UNA VUELTA A TODO EL PROCESO
        //validarJugadores(jugadores)){
          this.jugadores = jugadores;
    }

    /**
     * MÉTODO FINAL (no sobreescribible) que define el flujo completo:
     * 1) Validación de estado CREADA
     * 2) Transición a EN_CURSO
     * 3) Bucle de turnos (jugarTurno)
     * 4) Obtener resultado
     * 5) Transición a FINALIZADA
     * 6) Devolver resultado
     */
    public final ResultadoPartida ejecutarPartida() {
        /* SI ESTO OCURRIERA, NO DEBERÍAMOS CONTINUAR PERO LO GESTIONAREMOS CUANDO VEAMOS EXCEPCIONES
        if (estado.equals("CREADO") {
        if (estado != EstadoPartida.CREADA) {
            System.out.println("La partida no está en estado CREADA. Estado actual: " + estado);
        }
        */
        estado = EstadoPartida.EN_CURSO;
        while (!estaFinalizado()) {
            jugarTurno();
        }
        ResultadoPartida resultado = obtenerResultado();
        estado = EstadoPartida.FINALIZADA;
        return resultado;
    }


    public String getNombre() { return nombre; }

}
