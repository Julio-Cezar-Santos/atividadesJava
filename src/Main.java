public class Main {
    public static void main(String[] args) {
//        ContaBancaria novaConta = new ContaBancaria();
//
//        novaConta.setNumeroConta(1234);
//        novaConta.setSaldo(100.00);
//        novaConta.setTitular("Julio");
//
//        System.out.println("Numero da conta: " + novaConta.getNumeroConta());
//        System.out.println("Saldo: " + novaConta.getSaldo());
//        System.out.println("Titular: " + novaConta.getTitular());
//
//        IdadePessoa pessoa1 = new IdadePessoa();
//        pessoa1.setNome("Julio");
//        pessoa1.setIdade(18);
//
//        IdadePessoa pessoa2 = new IdadePessoa();
//
//        pessoa2.setNome("Ellen");
//        pessoa2.setIdade(15);
//
//        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
//        pessoa1.verificarIdade();
//
//        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
//        pessoa2.verificarIdade();
//
//        Produto novoProduto = new Produto();
//
//        novoProduto.setNome("mesa");
//        novoProduto.setPreco(100);
//
//        System.out.println("Nome do Produto: " + novoProduto.getNome());
//        System.out.println("Preço: " + novoProduto.getPreco());
//
//        novoProduto.aplicarDesconto(10);
//
//        System.out.println("Nome do Produto: " + novoProduto.getNome());
//        System.out.println("Preço com desconto: " + novoProduto.getPreco());

//        Aluno aluno1 = new Aluno();
//        Aluno aluno2 = new Aluno();
//
//        aluno1.setNome("Julio");
//        aluno1.setNota1(7.5);
//        aluno1.setNota2(8.0);
//        aluno1.setNota3(9.2);
//
//        aluno2.setNome("Karina");
//        aluno2.setNota1(6.8);
//        aluno2.setNota2(7.3);
//        aluno2.setNota3(8.5);
//
//        System.out.println("Aluno 1:");
//        System.out.println("Nome: " + aluno1.getNome());
//        System.out.println("Nota 1: " + aluno1.getNota1());
//        System.out.println("Nota 2: " + aluno1.getNota2());
//        System.out.println("Nota 3: " + aluno1.getNota3());
//        System.out.println("Média: " + aluno1.calcularMedia());
//        System.out.println();
//
//        System.out.println("Aluno 2:");
//        System.out.println("Nome: " + aluno2.getNome());
//        System.out.println("Nota 1: " + aluno2.getNota1());
//        System.out.println("Nota 2: " + aluno2.getNota2());
//        System.out.println("Nota 3: " + aluno2.getNota3());
//        System.out.println("Média: " + aluno2.calcularMedia());

        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}