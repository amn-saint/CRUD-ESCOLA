package dm20241m.model.dao;

import dm20241m.model.bean.Materia;
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
public class DaoMateria {

private final Connection c;
    
    public DaoMateria() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDb.getConexaoMySQL();
    }

    public Materia excluir(Materia matEnt) throws SQLException{
        String sql = "delete from materia WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,matEnt.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return matEnt;
    }
    
    public Materia buscar(Materia matEnt) throws SQLException{
        String sql = "select * from materia WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,matEnt.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Materia usuSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                usuSaida = new Materia(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return usuSaida;
   }

    public Materia inserir(Materia matEnt) throws SQLException{
        String sql = "insert into materia" + " (nome, periodo, status, professor)" + " values (?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        
        stmt.setString(1,matEnt.getNome());
        stmt.setString(2,matEnt.getPeriodo());
        stmt.setString(3,matEnt.getStatus());
        stmt.setString(4,matEnt.getProfessor());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            matEnt.setId(id);
        }
        stmt.close();
        return matEnt;
    }

    public Materia alterar(Materia matEnt) throws SQLException{
        String sql = "UPDATE materia SET nome = ?, periodo = ?, status = ?, professor = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,matEnt.getNome());
        stmt.setString(2,matEnt.getPeriodo());
        stmt.setString(3,matEnt.getStatus());
        stmt.setString(4,matEnt.getProfessor());
        stmt.setInt(5,matEnt.getId());

        // executa
        stmt.execute();
        stmt.close();
        return matEnt;
    }

   public List<Materia> listar(Materia matEnt) throws SQLException{
        // usus: array armazena a lista de registros
        List<Materia> sists = new ArrayList<>();
        
        String sql = "select * from materia where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + matEnt.getNome() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Materia sis = new Materia(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)
            );
            // adiciona o usu à lista de usus
            sists.add(sis);
        }
        
        rs.close();
        stmt.close();
        return sists;
   }

    
}
