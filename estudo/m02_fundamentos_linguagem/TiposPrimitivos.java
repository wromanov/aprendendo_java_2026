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
    byte maiorValorByte = 127;
    byte menorValorByte = -128;

    //Tipo short
    short maiorValorShort = 32767;
    short menorValorShort = -32768;

    //Tipo int
    int maiorValorInt = 2_147_483_647;
    int menorValorInt = -2_147_483_648;

    //Tipo long
    long maiorValorLong = 9_223_372_036_854_775_807L;
    long menorValorLong = -9_223_372_036_854_775_808L;

    //Tipo float
    float maiorValorFloat = 3.4028235E38F;
    float menorValorFloat = -3.4028235E38F;

    //Tipo double
    double maiorValorDouble = 1.7976931348623157E308;
    double menorValorDouble = -1.7976931348623157E308;

    // Inteiros são int por padrão, mesmo declarando a variável como long.
    // Use L para indicar que o literal é do tipo long,
    // principalmente quando o valor ultrapassa o limite de int.
    // Ex. long numero = 3_000_000_000L;

    // Números decimais são double por padrão.
    // Use F para indicar que o literal é do tipo float, mesmo a declarado como float.
    // Ex. float preço = 10.5F;



}