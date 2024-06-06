package dm20241m.controller;

import dm20241m.model.bean.Materia;
import dm20241m.model.dao.DaoMateria;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ControllerMateria {
    
    DaoMateria daoMat;


    public Materia inserir(Materia matEnt) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMateria();
        return daoMat.inserir(matEnt);
    }

    public Materia alterar(Materia matEnt) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMateria();
        return daoMat.alterar(matEnt);
    }

    public Materia buscar(Materia matEnt) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMateria();
        return daoMat.buscar(matEnt);
    }

    public Materia excluir(Materia matEnt) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMateria();
        return daoMat.excluir(matEnt);
    }

    public List<Materia> listar(Materia matEnt) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMateria();
        return daoMat.listar(matEnt);
    }
    
}
