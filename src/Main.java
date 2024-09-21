import java.util.Random;
import java.util.Scanner;

class juegoDeNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100);
        int intentos = 0;
        int numeroUsuario = 0;


        System.out.println("Bienvenido al juego de adivina el numero secreto");
        System.out.println("Digita un numero que se encuentre entre el 1 y 100 ; tienes 5 intentos");
        numeroUsuario = teclado.nextInt();


        while (intentos < 4) {

            if (numeroUsuario == numeroSecreto) {
                System.out.println("Felicidades adivinaste el numero");

                break;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("Tu número es menor al número secreto, intenta de nuevo");
                numeroUsuario = teclado.nextInt();

            } else {
                System.out.println("Tu número es mayor al número secreto, intenta de nuevo");
                numeroUsuario = teclado.nextInt();

            }
            intentos++;
            if (intentos == 4){
                System.out.println("Lo lamento no adivinaste el número secreto; El número secreto es:" + numeroSecreto);
            }
            
        }

    }
}

