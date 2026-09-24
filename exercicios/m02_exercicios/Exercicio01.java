void main() {

    String numeroVoo = IO.readln("Informe o número do voo: ");

    int capacidadeTotalAssentos = Integer.parseInt(IO.readln("Informe a capacidade total do voo: "));

    int quantidadePassageiros = Integer.parseInt(IO.readln("Informe a quantidade total de passageiros: "));

    int calcAssentosDisponiveis = capacidadeTotalAssentos - quantidadePassageiros;

    IO.println(("Voo: %s%n" +
            "Capacidade Total: %d%n" +
            "Passageiros Embarcados: %d%n" +
            "Assentos disponíveis: %d.").formatted(numeroVoo, capacidadeTotalAssentos, quantidadePassageiros, calcAssentosDisponiveis));

}