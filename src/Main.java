//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class Curso {
            String nombre;

            Curso(String nombre) {
                this.nombre = nombre;
            }
        }

        class Estudiante {
            String nombre;
            Curso curso; // Asociación

            Estudiante(String nombre, Curso curso) {
                this.nombre = nombre;
                this.curso = curso;
            }

            void mostrarCurso() {
                System.out.println(nombre + "esta en el curso" + curso.nombre);
            }
        }



    }
}