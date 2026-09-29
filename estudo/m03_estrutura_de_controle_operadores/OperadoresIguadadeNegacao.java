void main() {

// boolean numerosIguais = 10 == 1;
// boolean númerosIguais = (4 + 6) == (5 * 10);

    int numero1 = 10;
    int numero2 = 11;

// boolean nuemrosIguais = numero1 == 10;

    boolean numerosIguais = numero1 == numero2;

// boolean numerosDiferentes = !numerosIguais;
// boolean numerosDiferentes = !(numero1 == numero2);
    boolean numerosDiferentes = numero1 != numero2;

    IO.println("Números diferentes: %b%n".formatted(numerosDiferentes));

    String nome1 = "Thiago";
    String nome2 = "Thiago";

    boolean nomesIguais = nome1 == nome2;

    IO.println("Nomes iguais: %b%n".formatted(nomesIguais));


}
