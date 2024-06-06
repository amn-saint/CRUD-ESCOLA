package dm20241m.controller;

import dm20241m.model.bean.Materia;
import dm20241m.model.bean.Usuario;
import dm20241m.model.bean.UsuarioMateria;
import dm20241m.model.dao.DaoUsuarioMateria;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ControllerUsuarioMateria {
    
    DaoUsuarioMateria daoUsu;
    ControllerUsuario contUsu;
    ControllerMateria contMat;
    

    public UsuarioMateria inserir(UsuarioMateria usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuarioMateria();
        UsuarioMateria usuSaida = daoUsu.inserir(usuEnt);
        return usuSaida;
    }

    public UsuarioMateria alterar(UsuarioMateria usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuarioMateria();
        UsuarioMateria usuSaida = daoUsu.alterar(usuEnt);
        return usuSaida;
    }

    public UsuarioMateria buscar(UsuarioMateria usuEnt) throws SQLException, ClassNotFoundException {
        
        daoUsu = new DaoUsuarioMateria();
        UsuarioMateria usuSaida = daoUsu.buscar(usuEnt);
        
        Usuario usu = new Usuario(usuSaida.getIdU());
        contUsu = new ControllerUsuario();
        usuSaida.setUsu(contUsu.buscar(usu));
        
        Materia mat = new Materia(usuSaida.getIdMat());
        contMat = new ControllerMateria();
        usuSaida.setMat(contMat.buscar(mat));
        
        return usuSaida;
    }

    public UsuarioMateria excluir(UsuarioMateria usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuarioMateria();
        UsuarioMateria usuSaida = daoUsu.excluir(usuEnt);
        return usuSaida;
    }

    public List<UsuarioMateria> listar(UsuarioMateria usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuarioMateria();
        List<UsuarioMateria> listaUsuarioAux = daoUsu.listar(usuEnt);
        List<UsuarioMateria> listaUsuario = new ArrayList<>();
        for(UsuarioMateria usuSis: listaUsuarioAux) {
            listaUsuario.add(buscar(usuSis));
        }
        return listaUsuario;
     }
    
}
