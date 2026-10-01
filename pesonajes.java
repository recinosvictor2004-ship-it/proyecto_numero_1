public class Personaje {

    private String nombre;
    private double puntosVida;
    private double puntosVidaMax;
    private double puntosAtaque;
    private double puntosDefensa;
    private int nivel;

    private static int totalPersonajesCreados = 0;

    // Constructor predeterminado
    public Personaje() {
        this.nombre = "Guerrero Novato";
        this.puntosVidaMax = 100.0;
        this.puntosVida = 100.0;
        this.puntosAtaque = 15.0;
        this.puntosDefensa = 5.0;
        this.nivel = 1;
        totalPersonajesCreados++;
    }

    // Constructor parametrizado
    public Personaje(String nombre, double puntosVidaMax, double puntosAtaque, double puntosDefensa) {
        this.nombre = nombre;
        this.puntosVidaMax = puntosVidaMax;
        this.puntosVida = puntosVidaMax;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.nivel = 1;
        totalPersonajesCreados++;
    }

    public void atacar(Personaje objetivo) {
        double dano = this.puntosAtaque - objetivo.puntosDefensa;
        if (dano <= 0) dano = 3.0;
        objetivo.recibirDano(dano);
        System.out.println(this.nombre + " atacó a " + objetivo.nombre + " causando " + dano + " de daño.");
    }

    public void recibirDano(double cantidad) {
        this.puntosVida -= cantidad;
        if (this.puntosVida < 0) this.puntosVida = 0.0;
    }

    public void curar() {
        double vidaAntes = this.puntosVida;
        this.puntosVida += 25.0;
        if (this.puntosVida > this.puntosVidaMax) this.puntosVida = this.puntosVidaMax;
        System.out.println(this.nombre + " recuperó " + (this.puntosVida - vidaAntes) + " puntos de vida. Vida actual: " + this.puntosVida);
    }

    public boolean estaVivo() {
        return this.puntosVida > 0.0;
    }

    public void subirNivel() {
        this.nivel++;
        this.puntosVidaMax += 20.0;
        this.puntosAtaque += 5.0;
        this.puntosDefensa += 2.0;
        this.puntosVida = this.puntosVidaMax;
        System.out.println(this.nombre + " subió a nivel " + this.nivel);
        System.out.println("Vida Max: " + this.puntosVidaMax + " | Ataque: " + this.puntosAtaque + " | Defensa: " + this.puntosDefensa);
    }

    public void mostrarEstado() {
        System.out.println("====================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + puntosVida + " / " + puntosVidaMax);
        System.out.println("Ataque: " + puntosAtaque);
        System.out.println("Defensa: " + puntosDefensa);
        System.out.println("====================================");
    }

    public static int getTotalPersonajesCreados() {
        return totalPersonajesCreados;
    }
}
