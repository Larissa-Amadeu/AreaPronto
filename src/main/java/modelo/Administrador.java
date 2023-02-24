
package modelo;


public class Administrador extends Usuario {
    private int verificacaoadm;
    
    public Administrador(int verificacaoadm,int cargo, String login, String telefone,String nome, String senha,){
    super(cargo,login,telefone,nome,senha,true);
      
    this.verificacao = verificacao;
    
    }
     public int getVerificacao() {
       return verificacao;
    }

  
    public void setVerificacao(int verificacao) {
        this.verificacao = verificacao;
    }
    
}
