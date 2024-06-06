package dm20241m.model.dao;

import dm20241m.model.bean.UsuarioMateria;
import dm20241m.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DaoUsuarioMateria{

private final Connection c;
    
    public DaoUsuarioMateria() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDb.getConexaoMySQL();
    }


    public UsuarioMateria excluir(UsuarioMateria usuEnt) throws SQLException{
        String sql = "delete from usuariosmateria WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,usuEnt.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return usuEnt;
    }
    
    public UsuarioMateria buscar(UsuarioMateria usuEnt) throws SQLException{
        String sql = "select * from usuariosmateria WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,usuEnt.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            UsuarioMateria usuSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                usuSaida = new UsuarioMateria(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getString(4));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return usuSaida;
   }

    public UsuarioMateria inserir(UsuarioMateria usuEnt) throws SQLException{
        String sql = "insert into usuariosmateria" + " (idU, idMat, obs)" + " values (?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setInt(1,usuEnt.getIdU());
        stmt.setInt(2,usuEnt.getIdMat());
        stmt.setString(3,usuEnt.getObs());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            usuEnt.setId(id);
        }
        stmt.close();
        return usuEnt;
    }

    public UsuarioMateria alterar(UsuarioMateria usuEnt) throws SQLException{
        String sql = "UPDATE usuariosmateria SET idU = ?, idMat = ?, obs = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,usuEnt.getIdU());
        stmt.setInt(2,usuEnt.getIdMat());
        stmt.setString(3,usuEnt.getObs());
        stmt.setInt(4,usuEnt.getId());

        // executa
        stmt.execute();
        stmt.close();
        return usuEnt;
    }

   public List<UsuarioMateria> listar(UsuarioMateria usuEnt) throws SQLException{
        // usus: array armazena a lista de registros
        List<UsuarioMateria> usus = new ArrayList<>();
        
        String sql = "select * from usuariosmateria where obs like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + usuEnt.getObs()+ "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            UsuarioMateria usu = new UsuarioMateria(
                rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4)
            );
            // adiciona o usu à lista de usus
            usus.add(usu);
        }
        
        rs.close();
        stmt.close();
        return usus;
   }

    
}