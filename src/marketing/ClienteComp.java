
package marketing;

public class ClienteComp extends DadosCliente {
       
    private String tecnoligia;   
    private String descricaoDaEmpresa;
    
    
    @Override
    public void retornaTipoCliente(){
    
            System.out.println("Cliente de Computação" );    
    }
    public void retornaClienteTec(){
        System.out.println(this.tecnoligia);
        System.out.println(this.descricaoDaEmpresa);
    }
   

    //gats e sets
    
    public String getTecnoligia() {
        return tecnoligia;
    }

    public void setTecnoligia(String tecnoligia) {
        this.tecnoligia = tecnoligia;
    }

   
    public String getDescricaoDaEmpresa() {
        return descricaoDaEmpresa;
    }

    public void setDescricaoDaEmpresa(String descricaoDaEm) {
        this.descricaoDaEmpresa = descricaoDaEm;
    }
    
    
}
