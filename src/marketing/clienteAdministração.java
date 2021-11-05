

package marketing;

public class clienteAdministração extends DadosCliente{
    
    private String tipoDeConsultoria;
    private String descricaoConsultoria;
    
    
    @Override
    public void retornaTipoCliente(){    
            System.out.println("Cliente de Administração" );    
    }
    
    public void retornaClienteAdm(){
        System.out.println(this.descricaoConsultoria);
        System.out.println(this.tipoDeConsultoria);
    }

    public String getTipoDeConsultoria() {
        return tipoDeConsultoria;
    }

    
    //gats e sets
    
    public void setTipoDeConsultoria(String topoDeConsultoria) {
        this.tipoDeConsultoria = topoDeConsultoria;
    }  

    public String getDescricaoConsultoria() {
        return descricaoConsultoria;
    }

    public void setDescricaoConsultoria(String descricaoConsultoria) {
        this.descricaoConsultoria = descricaoConsultoria;
    }
    
    
}
