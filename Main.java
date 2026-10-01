import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Personaje p1 = null;
        Personaje p2 = null;

        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("SIMULADOR DE COMBATE RPG");
            System.out.println("====================================");
            System.out.println("1. Crear Personaje 1 (Predeterminado)");
            System.out.println("2. Crear Personaje 2 (Parametrizado)");
            System.out.println("3. Ver ficha técnica");
            System.out.println("4. Subir de nivel");
            System.out.println("5. Curar personaje");
            System.out.println("6. Ataque individual");
            System.out.println("7. Batalla automática");
            System.out.println("8. Total de personajes creados");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    p1 = new Personaje();
                    System.out.println("Personaje 1 creado.");
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Vida Máxima: ");
                    double vidaMax = sc.nextDouble();
                    System.out.print("Ataque: ");
                    double ataque = sc.nextDouble();
                    System.out.print("Defensa: ");
                    double defensa = sc.nextDouble();
                    p2 = new Personaje(nombre, vidaMax, ataque, defensa);
                    System.out.println("Personaje 2 creado.");
                    break;

                case 3:
                    if (p1 != null) p1.mostrarEstado();
                    else System.out.println("Personaje 1 no existe.");
                    if (p2 != null) p2.mostrarEstado();
                    else System.out.println("Personaje 2 no existe.");
                    break;

                case 4:
                    System.out.print("¿Subir nivel a quién? (1 o 2): ");
                    int s = sc.nextInt();
                    if (s == 1 && p1 != null) p1.subirNivel();
                    else if (s == 2 && p2 != null) p2.subirNivel();
                    else System.out.println("Personaje no creado.");
                    break;

                case 5:
                    System.out.print("¿Curar a quién? (1 o 2): ");
                    int c = sc.nextInt();
                    if (c == 1 && p1 != null) p1.curar();
                    else if (c == 2 && p2 != null) p2.curar();
                    else System.out.println("Personaje no creado.");
                    break;

                case 6:
                    System.out.print("¿Quién ataca? (1 o 2): ");
                    int a = sc.nextInt();
                    System.out.print("¿A quién ataca? (1 o 2): ");
                    int b = sc.nextInt();

                    if (a == 1 && b == 2 && p1 != null && p2 != null) p1.atacar(p2);
                    else if (a == 2 && b == 1 && p1 != null && p2 != null) p2.atacar(p1);
                    else System.out.println("Personajes no creados.");
                    break;

                case 7:
                    if (p1 != null && p2 != null && p1.estaVivo() && p2.estaVivo()) {
                        Batalla.iniciarPeleaAutomatica(p1, p2);
                    } else {
                        System.out.println("Ambos personajes deben existir y estar vivos.");
                    }
                    break;

                case 8:
                    System.out.println("Total creados: " + Personaje.getTotalPersonajesCreados());
                    break;

                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 9);

        sc.close();
    }
}
