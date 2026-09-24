void main() {

    String identificacaoLink = IO.readln("Informe o nome do link: ");

    double quantidadeFranquiaMensal = Double.parseDouble(IO.readln("Informe a franquia mensal: "));

    double consumoPeriodo01 = Double.parseDouble(IO.readln("Consumo do 1º período: "));
    double consumoPeriodo02 = Double.parseDouble(IO.readln("Consumo do 2º período: "));
    double consumoPeriodo03 = Double.parseDouble(IO.readln("Consumo do 3º período: "));

    double consumoAcumulado = consumoPeriodo01 + consumoPeriodo02 + consumoPeriodo03;
    double saldoDisponivelFranquia = quantidadeFranquiaMensal - consumoAcumulado;
    double percentualUtilizado = (consumoAcumulado / quantidadeFranquiaMensal) * 100;

    IO.println("Link: " + identificacaoLink);
    IO.println("Franquia: %.2f GB".formatted(quantidadeFranquiaMensal));
    IO.println("Consumo acumulado: %.2f GB".formatted(consumoAcumulado));
    IO.println("Saldo disponível: %.2f GB".formatted(saldoDisponivelFranquia));
    IO.println("Percentual utilizado: %.2f%%".formatted(percentualUtilizado));


}