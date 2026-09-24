import java.sql.SQLOutput;

void main() {

    //classe, Scanner que faz a leitura dos dados
    Scanner entrada = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = entrada.nextLine();

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    System.out.print("Peso: ");
    int peso = entrada.nextInt();

    double imc = peso / (altura * altura);

    System.out.printf("IMC: %.2f%n%n".formatted(imc));


    // Metodo Java 2025

    // O readline le o valor
    String nome1 = IO.readln("Nome: ");

    // O metodo passerInt converte uma string lida por readln em número inteiro
    int peso1 = Integer.parseInt(IO.readln("Peso: "));

    // O metodo passerDouble converte uma string lida por readln em número inteiro
    // O readline não lê virgula apenas ponto na entrada de dados.
    double altura1 = Double.parseDouble(IO.readln("Altura: "));

    double imc1 = peso1 / (altura1 * altura1);

    System.out.printf("IMC de %s: %.2f%n", nome1, imc1);

}