
package marketing;

public class Marketing {

   
    public static void main(String[] args) {
        
        ClienteComp c = new ClienteComp();
        clienteAdministração adm = new clienteAdministração();
        clienteEngenharia eng = new clienteEngenharia();
        
        
        c.setNome("Gabriel");
        c.setEndereco("Bahia");
        c.setTelefone("(71)98883 - 0161");
        c.setNomeProduto("Monitor Gamer LG Ultrawide 25UM58G");
        c.setDescriçãoProduto("Tenha imagens sem rastros e ações mais rápidas"
         + " com o tempo de resposta de 1ms com Motion Blur Reduction.");
        c.setPrecoProduto("R$1.185,00");
        c.setTecnoligia("Hardware company");
        c.setDescricaoDaEmpresa("Uma loja de venda e de manutenção de Hardware");
        c.setDatadepostagem("01/11/2021");
        
       
        c.retornaDadosCliente();
        c.retornaTipoCliente();
        c.retornaClienteTec();        
        c.retornaProduto();
        
        
        
        adm.setNome("Gabriel");
        adm.setEndereco("Bahia");
        adm.setTelefone("(71)98883 - 0161");
        adm.setNomeProduto("Monitor Gamer LG Ultrawide 25UM58G");
        adm.setDescriçãoProduto("Tenha imagens sem rastros e ações mais rápidas"
         + " com o tempo de resposta de 1ms com Motion Blur Reduction.");
        adm.setPrecoProduto("R$1.185,00");
        adm.setDescricaoConsultoria("Consultoria sobre administração");
        adm.setTipoDeConsultoria("Consultoria privada para empresas");
        adm.setDatadepostagem("01/11/2021");
        
       
        adm.retornaDadosCliente(); 
        adm.retornaTipoCliente();
        adm.retornaClienteAdm();        
        adm.retornaProduto();
        
        
        eng.setNome("Gabriel");
        eng.setEndereco("Bahia");
        eng.setTelefone("(71)98883 - 0161");
        eng.setNomeProduto("Monitor Gamer LG Ultrawide 25UM58G");
        eng.setDescriçãoProduto("Tenha imagens sem rastros e ações mais rápidas"
         + " com o tempo de resposta de 1ms com Motion Blur Reduction.");
        eng.setPrecoProduto("R$1.185,00");
        eng.setTipoDeEngenharia("Engenharia eletrica");
        eng.setDescricaoDasAtividades("Troca e manutenção da rede de fiação eletrica");
        eng.setDatadepostagem("01/11/2021");
        
        eng.retornaDadosCliente();
        eng.retornaTipoCliente();   
        eng.retornaClienteEng();             
        eng.retornaProduto();     
        
    }
    
}
