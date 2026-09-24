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
    IO.println("Franquia: " + quantidadeFranquiaMensal);
    IO.println("Consumo acumulado: " + consumoAcumulado);
    IO.println("Saldo disponível: " + saldoDisponivelFranquia);
    IO.println("Percentual utilizado: " + percentualUtilizado + "%");


}