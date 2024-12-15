package proyectoEntornos.asistenciaAlumno;

import java.util.Scanner;

public class asisAlumno {
public asisAlumno() {
    Scanner scanner = new Scanner(System.in);

        // Número de participantes
        System.out.print("Ingrese el número de participantes: ");
        int numParticipantes = scanner.nextInt();

        // Crear arrays para almacenar los nombres y tiempos
        String[] nombres = new String[numParticipantes];
        double[] tiempos = new double[numParticipantes];

        // Registrar participantes y sus tiempos
        for (int i = 0; i < numParticipantes; i++) {
            scanner.nextLine();  // Limpiar el buffer
            System.out.print("Ingrese el nombre del participante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese el tiempo en minutos de " + nombres[i] + ": ");
            tiempos[i] = scanner.nextDouble();
        }

        // Ordenar los tiempos y encontrar los 3 primeros lugares
        for (int i = 0; i < numParticipantes - 1; i++) {
            for (int j = i + 1; j < numParticipantes; j++) {
                if (tiempos[i] > tiempos[j]) {
                    // Intercambiar los tiempos
                    double tempTiempo = tiempos[i];
                    tiempos[i] = tiempos[j];
                    tiempos[j] = tempTiempo;

                    // Intercambiar los nombres de los participantes correspondientes
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;
                }
            }
        }

        // Mostrar los resultados del podio
        System.out.println("\nResultados de la carrera:");
        System.out.println("1er Lugar: " + nombres[0] + " con " + tiempos[0] + " minutos.");
        System.out.println("2do Lugar: " + nombres[1] + " con " + tiempos[1] + " minutos.");
        System.out.println("3er Lugar: " + nombres[2] + " con " + tiempos[2] + " minutos.");

        // Si hay más de 3 participantes, mostrar el resto
        if (numParticipantes > 3) {
            System.out.println("\nRestante participantes:");
            for (int i = 3; i < numParticipantes; i++) {
                System.out.println((i + 1) + ". " + nombres[i] + " con " + tiempos[i] + " minutos.");
            }
        }

        scanner.close();
    }
}