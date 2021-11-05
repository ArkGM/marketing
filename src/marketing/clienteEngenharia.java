
package marketing;

public class clienteEngenharia extends DadosCliente {
    
    private String tipoDeEngenharia;
    private String descricaoDasAtividades;
    
    
    @Override
    public void retornaTipoCliente(){    
            System.out.println("Cliente de Engenharia" );    
    }
    
    public void retornaClienteEng(){
        System.out.println(this.descricaoDasAtividades);
        System.out.println(this.tipoDeEngenharia);
    }
    
    
        
    
    //gats e sets

    public String getTipoDeEngenharia() {
        return tipoDeEngenharia;
    }

    public void setTipoDeEngenharia(String tipoDeEngenharia) {
        this.tipoDeEngenharia = tipoDeEngenharia;
    }

    public String getDescricaoDasAtividades() {
        return descricaoDasAtividades;
    }

    public void setDescricaoDasAtividades(String descricaoDasAtividades) {
        this.descricaoDasAtividades = descricaoDasAtividades;
    }
    
    
}
