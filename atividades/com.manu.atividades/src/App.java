import com.manu.atividades.models.Aluno;
import com.manu.atividades.models.ContaBancaria;
import com.manu.atividades.models.IdadePessoa;
import com.manu.atividades.models.Livro;
import com.manu.atividades.models.Produto;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(1430);
        conta.setSaldo(1200.04);
        conta.titular = "Ana";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());

        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setIdade(04);
        pessoa.setNome("João");
        pessoa.verificaIdade();

        Produto produtoNovo = new Produto();

        produtoNovo.setNomeProduto("Cadeira");
        produtoNovo.setPrecoProduto(100.50);
        produtoNovo.calculaDesconto(50);
        produtoNovo.informacoesProdutos();

        Aluno alunoNovo = new Aluno();

        alunoNovo.setNomeAluno("Paulo");
        alunoNovo.setNota1(10);    
        alunoNovo.setNota2(5);
        alunoNovo.setNota3(2);
        alunoNovo.calculaMedia();

        Livro livroNovo = new Livro();
        livroNovo.setTitulo("A Hora da Estrela");
        livroNovo.setAutor("Clarice Lispector");
        livroNovo.carregaInformacoes();
    }

}