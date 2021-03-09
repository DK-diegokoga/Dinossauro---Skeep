import java.util.Scanner;

public class Teste {

    public void entrada() {

        try (Scanner scan = new Scanner(System.in)) {
            Dinossauro Skeep = new Dinossauro();
            do {

                System.out.println("*****************************************************************");

                System.out.println("Status do Skeep: \n" + "Energia: " + Skeep.energia + "             "
                        + "Velocidade: " + Skeep.velocidade + "\n" + "Temperatura: " + Skeep.temperatura
                        + "              " + "Humor: " + Skeep.humor + "\n");

                System.out.println("*****************************************************************");

                System.out.println("Ações do Skeep: \n" + "P - Pular " + "             " + "R - Correr "
                        + "             " + "C - Comer \n" + "B - Brincar " + "           " + "S - Tomar Sol "
                        + "          " + "O - Ficar na Sombra \n");

                String textoMaiusculo = scan.nextLine().toUpperCase();
                char escolha = textoMaiusculo.charAt(0);

                switch (escolha) {
                case 'P':
                    Skeep.pular();
                    break;

                case 'R':
                    Skeep.correr();
                    break;

                case 'C':
                    Skeep.comer();
                    break;

                case 'B':
                    Skeep.brincar();
                    break;

                case 'S':
                    Skeep.tomarSol();
                    break;

                case 'O':
                    Skeep.ficarNaSombra();
                    break;

                default:
                    System.out.println("O Skeep não conhece essa ação");
                    break;
                }
            } while (true);
        }
    }

    public static void main(String[] args) throws Exception {
        Teste testa = new Teste();
        testa.entrada();
    }
}