void main() {

    // Tipo primitivo Boolean
    boolean compraAprovada = true;
    boolean clienteBloqueado = false;

    IO.println("Compra Aprovada: " + compraAprovada);
    IO.println("Cliente Bloqueado: " + clienteBloqueado);

    int quantidadeEstoque = 10;
    int quantidadePedidoCompra = 15;

    boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;

    IO.println("Estoque Suficiente: " + estoqueSuficiente);

    //Tipo Char - armazena apenas um único caractere

    char inicialNome = 'W';

    IO.println("Inicial do seu nome: " + inicialNome);

    //Tipo byte
    byte valorMaximo = 127;
    byte valorMinimo = -128;

}