package Model.DAO;

import Conexão.Conexao;
import Model.Bean.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    Conexao conex = new Conexao();
    
    
    public void Salvar(Produto p){
        conex.Conectar();
        try {
            PreparedStatement stmt = conex.con.prepareStatement("insert into produto(descricao,unidade,quantidade,precoporund,precototal) values(?,?,?,?,?)");
            stmt.setString(1,p.getDescricao());
            stmt.setString(2,p.getUnidade() );
            stmt.setInt(3,p.getQuantidade());
            stmt.setDouble(4,p.getPrecoPorUnd());
            stmt.setDouble(5,p.getPrecoTotal());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao inserir Dados!");
        }finally{
        conex.Desconectar();
    }
        
    }
    
    public ArrayList<Produto> Listar(){
        conex.Conectar();
        conex.rs = null;
        
        ArrayList<Produto> produtos = new ArrayList<>();
        
        try {
            PreparedStatement stmt = conex.con.prepareStatement("select *from produto");
            conex.rs = stmt.executeQuery();
            while(conex.rs.next()){
                Produto p = new Produto();
                p.setId(conex.rs.getInt("id"));
                p.setDescricao(conex.rs.getString("descricao"));
                p.setUnidade(conex.rs.getString("Unidade"));
                p.setQuantidade(conex.rs.getInt("quantidade"));
                p.setPrecoPorUnd(conex.rs.getDouble("precoporund"));
                p.setPrecoTotal(conex.rs.getDouble("precototal"));
                produtos.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conex.Desconectar();
        }
        
        
        
        return produtos;
    }
    
    
    
    
    
    
}
