package Model.Bean;

public class Produto {
    
    private int id;
    private String descricao;
    private String unidade;
    private int quantidade;
    private double precoPorUnd;
    private double precoTotal;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoPorUnd() {
        return precoPorUnd;
    }

    public void setPrecoPorUnd(double precoPorUnd) {
        this.precoPorUnd = precoPorUnd;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public void ValorTotal(int quantidade, double valorUnd){
        setPrecoTotal(quantidade * valorUnd);
        
    }
    
}
