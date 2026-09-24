void main() {

    String nomeProduto = IO.readln("Informe o nome do produto: ");

    double faturamentoDia01 = Double.parseDouble(IO.readln("Informe o valor do faturamento dia 01: "));

    double faturamentoDia02 = Double.parseDouble(IO.readln("Informe o valor do faturamento dia 02: "));

    double faturamentoDia03 = Double.parseDouble(IO.readln("Informe o valor do faturamento dia 03: "));

    double faturamentoTotal = faturamentoDia01 + faturamentoDia02 + faturamentoDia03;

    double mediaDiariaFaturamento = faturamentoTotal / 3;

    IO.println(("Nome do produto: %s%n" +
            "Faturamento total: R$ %.2f%n" +
            "Média diária: R$ %.2f.").formatted(nomeProduto, faturamentoTotal, mediaDiariaFaturamento));

}