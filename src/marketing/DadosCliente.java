
package marketing;


public class DadosCliente extends InfoProduto {
    
    private String nome;
    private String telefone;
    private String endereco;
    private String datadepostagem;
    
     
    
    public void retornaDadosCliente(){
        System.out.println(this.nome);
        System.out.println(this.telefone);
        System.out.println(this.endereco); 
        System.out.println(this.datadepostagem);
            
    }
       
   
        
    public void retornaTipoCliente(){
    
            System.out.println("Cliente Normal" );    
    }
    
    
     //gats e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDatadepostagem() {
        return datadepostagem;
    }

    public void setDatadepostagem(String datadepostagem) {
        this.datadepostagem = datadepostagem;
    }
    
    
    
}
