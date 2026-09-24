void main() {

    String nome = "Thiago";
    int idade = 30;
    float peso = 95.35f;

    // %d - para variáveis tipo int
    // %f - para variáveis tipo float
    // %.2f - defini a quantidade casas decimais que serão exibidas
    // %10.f - defini a quantidade de caracteres que serão exibidos a esquerda
    // s% - para variáveis tipo string
    // \n - pular linha

    //Jeito antigo antes do Java 25
    System.out.printf("Nome: %s Idade: %d Peso: %.2f%n", nome, idade, peso);

    // Jeito novo após Java 25
    IO.println("Nome: %s Idade: %d Peso: %.2f".formatted(nome, idade, peso));





}