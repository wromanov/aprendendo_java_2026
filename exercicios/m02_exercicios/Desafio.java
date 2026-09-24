void main() {

    String idtEstacionamento = IO.readln("Informe a identificação do estacionamento: ");

    int capacidadeMaxEstacionamento = Integer.parseInt(IO.readln("Capacidade máxima do estacionamento: "));

    int qtdveiculosIniTurno = Integer.parseInt(IO.readln("Quantidade de veículos no inicio do turno: "));

    int entradasVeiculosDuranteTurno = Integer.parseInt(IO.readln("Informe a quantidade de entradas de veículos durante o turno: "));

    int saidasVeiculosDuranteTurno = Integer.parseInt(IO.readln("Informe a quantidade de saídas de veículos durante o turno: "));

    double valorMedioPagoPorVeiculo = Double.parseDouble(IO.readln("Informe o valor médio pago por veículo que saiu: "));


    int veiculosFinaldoTurno = (qtdveiculosIniTurno + entradasVeiculosDuranteTurno) - saidasVeiculosDuranteTurno;

    int vagasDisponiveis = capacidadeMaxEstacionamento - veiculosFinaldoTurno;

    double receitaEstimada = saidasVeiculosDuranteTurno * valorMedioPagoPorVeiculo;

    double percentualOcupacao = ((double) veiculosFinaldoTurno / capacidadeMaxEstacionamento) * 100;


    IO.println("Estacionamento: %s".formatted(idtEstacionamento));

    IO.println("Capacidade máxima: %d".formatted(capacidadeMaxEstacionamento));

    IO.println("Veículos ao final do turno: %d".formatted(veiculosFinaldoTurno));

    IO.println("Vagas disponíveis: %d".formatted(vagasDisponiveis));

    IO.println("Veículos que saíram: %d".formatted(saidasVeiculosDuranteTurno));

    IO.println("Receita estimada: %.2f".formatted(receitaEstimada));

    IO.println("Ocupação: %.2f%%".formatted(percentualOcupacao));

}