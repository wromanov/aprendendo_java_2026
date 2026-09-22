void main(){

    // Quando temos uma operação aritmética entre dois tipos primitivos,
    // o resultado será igual ao tipo maior.

    int num10 = 10;
    long num11 = 11;

    // A variável que guarda o resultado deverá ser do maior tipo no caso long.
    long soma = num10 + num11;

    IO.println(soma);

    int num1 = 3;
    int num2 = 2;

    // temos que fazer o cast de uma das variaveis, não basta apenas armazenar o resultado num tipo float.
    // caso contrario o resultado decimal será igual a 0.
    // No caso abaixo estamos fazendo o cast da variável num1.

    float result = (float) num1 / num2;
    float result1 = num1 / num2;

    IO.println(result);
    IO.println(result1);


}