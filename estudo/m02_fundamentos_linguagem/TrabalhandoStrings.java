void main() {
    // Trabalhando com Strings


    int x = 10;
    int y = 10;
    String nome = "Maria";
    int idade = 30;


    // Primeiro ele faz o calculo e depois concatena
    IO.println(x + y + " Resultado");

    //Primeiro e recebe o resultado e entende que tudo é uma string e concatena os numeros.
    IO.println("Resultado " + x + y);

    //Aqui dizemos o interpretador para ele fazer calculo primeiro
    IO.println("Resultado " + (x + y));

    IO.println(nome + " Tem " + idade + " Anos");


}