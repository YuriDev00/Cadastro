package src;
import java.io.Serializable;


public class Pessoa implements Serializable {
        private int id;
        private String nome;
 
        
        public void pessoa (int id, String nome) {
                this.id = id;
                this.nome = nome;
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void Main() {
            System.out.println("ID:" + id);
            System.out.println("Nome:" + nome);
        }

        class pessoa {
            void criamain(){
                Main menupessoa= new Main(nome:"Yuri" id:"2")
            }
        }
        public void main
    
    }


    
    

