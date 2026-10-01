# 🛡️ Simulador de Combate RPG en Java  
Sistema desarrollado para practicar Programación Orientada a Objetos utilizando clases, objetos, atributos, métodos, constructores y métodos estáticos.  
**Restricciones cumplidas:** No se utilizan arreglos, listas, herencia ni polimorfismo.

---

## 📌 Estructura del Proyecto
El sistema está compuesto por tres clases:

### 1. Personaje.java  
Representa a un combatiente dentro del simulador.

**Atributos de instancia**
- `nombre`  
- `puntosVida`  
- `puntosVidaMax`  
- `puntosAtaque`  
- `puntosDefensa`  
- `nivel`

**Atributo estático**
- `totalPersonajesCreados`: contador global de personajes instanciados.

**Constructores**
- **Predeterminado:** crea un “Guerrero Novato” con valores base.  
- **Parametrizado:** permite definir nombre, vida máxima, ataque y defensa.

**Métodos principales**
- `atacar(Personaje objetivo)`: calcula daño y lo aplica.  
- `recibirDano(double cantidad)`: reduce vida y evita valores negativos.  
- `curar()`: restaura vida sin exceder el máximo.  
- `estaVivo()`: indica si el personaje sigue en combate.  
- `subirNivel()`: incrementa atributos y restaura vida.  
- `mostrarEstado()`: imprime la ficha técnica del personaje.  
- `getTotalPersonajesCreados()`: retorna el contador estático.

---

### 2. Batalla.java  
Clase de soporte con métodos estáticos para acciones especiales.

**Métodos**
- `ejecutarAtaqueCritico(Personaje atacante, Personaje objetivo, double multiplicador)`  
  Multiplica el ataque base, redondea hacia abajo y aplica daño crítico.

- `iniciarPeleaAutomatica(Personaje p1, Personaje p2)`  
  Simula turnos automáticos hasta que uno de los dos muere.

---

### 3. Main.java  
Contiene el menú interactivo controlado por el usuario mediante `Scanner`.

**Opciones del menú**
1. Crear Personaje 1 (constructor predeterminado)  
2. Crear Personaje 2 (constructor parametrizado)  
3. Mostrar ficha técnica  
4. Subir nivel  
5. Curar personaje  
6. Ataque individual  
7. Batalla automática  
8. Ver total de personajes creados  
9. Salir

El programa valida que los personajes existan antes de ejecutar cualquier acción.

---

## 🎮 Flujo General del Sistema
1. El usuario crea uno o dos personajes.  
2. Puede consultar su estado, curarlos, subir nivel o hacer que se ataquen.  
3. Si ambos están vivos, puede iniciar una batalla automática.  
4. El sistema registra cuántos personajes se han creado en total.  
5. El menú continúa hasta que el usuario elige salir.

---

## 🚀 Objetivo Académico
Este proyecto refuerza:
- Encapsulamiento  
- Uso de métodos estáticos  
- Constructores  
- Control de estado interno  
- Interacción mediante consola  
- Modelado de objetos sin colecciones ni herencia  

---

## ✔️ Requisitos Técnicos Cumplidos
- No se usan arreglos  
- No se usan listas  
- No se usa herencia  
- No se usa polimorfismo  
- Menú funcional  
- Lógica de combate completa  
- Validaciones implementadas  

---

## 🏁 Conclusión
El simulador cumple con todas las especificaciones del taller y demuestra dominio de los fundamentos de POO en Java mediante un sistema interactivo, claro y totalmente funcional.

