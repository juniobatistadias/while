import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        System.out.println("Digite a nota: ");
        double nota = entrada.nextDouble();
        if(nota > 10 || nota < 0){
            System.out.println("Nota invalida!");
        }else if (nota >=8.1){
            System.out.println("conceito A");
        }else if (nota >= 6.1){
            System.out.println("conceito B");
        } else if (nota >= 4.1) {
            System.out.println("conceito C");
        } else if (nota >= 2.1) {
            System.out.println("conceito D");
        }else{
            System.out.println("conceito E");
            entrada.close();
        }
               System.out.println("FIM!");
    }
}