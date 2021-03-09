public class Dinossauro {

    public int energia;
    public int velocidade;
    public int temperatura;
    public int humor;

    public void pular() {
        if (energia == 0) {
            System.out.println("Não consigo pular agora estou sem energia");
        } else {
            energia--;
            humor++;
            System.out.println("Pulando");
        }
    }

    public void correr() {
        if (energia == 0) {
            System.out.println("Não consigo correr agora estou sem energia");
        } else {
            energia--;
            humor++;
            System.out.println("Correndo");
        }
    }

    public void comer() {
        energia++;
        humor++;
        System.out.println("Comendo");
    }

    public void brincar() {
        if (energia == 0) {
            System.out.println("Não consigo brincar agora estou sem energia");
        } else {
            energia--;
            humor++;
            System.out.println("Brincando");
        }
    }

    public void tomarSol() {
        if (energia == 0) {
            System.out.println("Não posso Tomar Sol agora estou sem energia");
        } else {
            velocidade++;
            humor++;
            energia--;
            System.out.println("Tomando um Sol");
        }
    }

    public void ficarNaSombra() {
        if (humor == 0) {
            System.out.println("Não to com humor pra ficar na sombra agora");
        } else {
            energia++;
            humor--;
            System.out.println("Ficando na Sombra");
        }
    }

}