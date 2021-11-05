
package marketing;

public class InfoProduto {
    
    private String nomeProduto;
    private String descriçãoProduto;
    private String precoProduto;
    
    
    
     public void retornaProduto(){
       
       System.out.println(this.nomeProduto);
       System.out.println(this.descriçãoProduto);
       System.out.println(this.precoProduto + "\n");
   }
   


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescriçãoProduto() {
        return descriçãoProduto;
    }

    public void setDescriçãoProduto(String descriçãoProduto) {
        this.descriçãoProduto = descriçãoProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }
     
   
    
}
