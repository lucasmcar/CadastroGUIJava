
package dao;


import com.mysql.cj.jdbc.ClientPreparedStatement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.jdbc.result.*;
import connection.MyConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import vo.VeiculoVo;


public class VeiculoDao {
    
    Connection conn = null;
    ClientPreparedStatement pstm = null;
    
    public boolean salvar(VeiculoVo veiculo) throws SQLException{
        
        String sql = "INSERT INTO veiculo (nome, marca, qtporta, cor, placa) values (?,?,?,?,?)";
        
        try{
            conn = MyConnection.getConnection();
            pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, veiculo.getNome());
            pstm.setString(2, veiculo.getMarca());
            pstm.setInt(3, veiculo.getQtdPortas());
            pstm.setString(4, veiculo.getCor());
            pstm.setString(5, veiculo.getPlaca());
            pstm.execute();
            
        }catch(SQLException e){
            e.getMessage();
            return false;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            if(pstm != null && conn != null){
                pstm.close();
                conn.close();
            }
        }
        return true;
    }
    
    public List<VeiculoVo> carregaDados() throws SQLException{
        
        List<VeiculoVo> veiculos = new ArrayList<>();
        
        ResultSetImpl rs = null;
        Connection conn = null;
        ClientPreparedStatement pstm = null;
        
        String sql = "Select nome, marca, qtporta, cor, placa FROM veiculo";
        
        try{
            conn = MyConnection.getConnection();
            pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
            rs = (ResultSetImpl) pstm.executeQuery();
            while(rs.next()){
                VeiculoVo veiculo = new VeiculoVo();
               
                veiculo.setNome(rs.getString("nome"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setQtdPortas(rs.getInt("qtporta"));
                veiculo.setCor(rs.getString("cor"));
                veiculo.setPlaca(rs.getString("placa"));
                
                veiculos.add(veiculo);
            }
            pstm.execute();
            
        }catch(SQLException e){
            e.getMessage();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            if(pstm != null && conn != null){
                pstm.close();
                conn.close();
            }
        }
        return veiculos;
    }
    
}
