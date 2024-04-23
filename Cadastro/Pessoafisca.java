import src.Pessoa;
import java.util.arrylist;

public class Pessoafisca  extends Pessoa{

        private String cpf;
        private int idade;

        public Pessoafisca(String cpf,int idade){
                this.cpf=cpf;
                this.idade=idade;
        }

        public void getidade(int idade1) {
                this.idade = idade1;
        }

        public int setidade() {
                return idade;
        }

        public void setcpf(String cpf2) {
                this.cpf = cpf2;
        }

        public String getcpf() {
                return cpf;
        }
        
}
public void Main Pessoafisca()  {
        System.out.println("ID");
        System.out.println("Nome");
        System.out.printl("ccpf2")
}
public class Main {

        public static void main(String[] args)
            PessoaFisicaRepository repo1 = new PessoaFisicaRepository();
            
            repo1.add(new PessoaFisica("Fulano de Tal", "123.456.789-00", "cpf, 123"));
            repo1.add(new PessoaFisica("Ciclano da Silva", "987.654.321-00", "cpf, 456"));
            
            repo1.saveToFile("pessoasFisicas.txt");
            
            PessoaFisicaRepository repo2 = new PessoaFisicaRepository();
            
            repo2.loadFromFile("pessoasFisicas.txt");

            System.out.println("Pessoas Físicas:");
            for (PessoaFisica pessoa : repo2.getAll()) {
                System.out.println(pessoa);
            }
            
            PessoaJuridicaRepository repo3 = new PessoaJuridicaRepository();
            
            repo3.add(new PessoaJuridica("Empresa A", "123456789/0001-00", "cpf, 789"));
            repo3.add(new PessoaJuridica("Empresa B", "987654321/0001-00", "cpf, 987"));
            
           
            repo3.saveToFile("pessoasJuridicas.txt");
            
        
            PessoaJuridicaRepository repo4 = new PessoaJuridicaRepository();
            
     
            repo4.loadFromFile("pessoasJuridicas.txt");
            
    
            System.out.println("\nPessoas Jurídicas:");
            for (PessoaJuridica pessoa : repo4.getAll()) {
                System.out.println(pessoa);
            }
        }
    
