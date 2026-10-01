public class Batalla {

    public static void ejecutarAtaqueCritico(Personaje atacante, Personaje objetivo, double multiplicador) {
        double ataquePotenciado = atacante.puntosAtaque * multiplicador;
        int danoCritico = (int) ataquePotenciado;
        objetivo.recibirDano(danoCritico);
        System.out.println("¡Golpe Crítico! " + atacante.nombre + " causó " + danoCritico + " de daño.");
    }

    public static void iniciarPeleaAutomatica(Personaje p1, Personaje p2) {
        System.out.println("¡Batalla automática iniciada!");
        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar(p2);
            if (p2.estaVivo()) {
                p2.atacar(p1);
            }
        }

        if (p1.estaVivo()) {
            System.out.println("El ganador es: " + p1.nombre);
        } else {
            System.out.println("El ganador es: " + p2.nombre);
        }
    }
}
