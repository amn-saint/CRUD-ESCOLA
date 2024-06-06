package dm20241m.view;

import dm20241m.controller.ControllerUsuarioMateria;
import dm20241m.model.bean.UsuarioMateria;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManterUsuarioMateria {
    
    public static void menu() throws SQLException, ClassNotFoundException {
        String msg = " 1 - Inserir \n 2 - Alterar \n 3 - buscar \n 4 - excluir \n 5 - Listar " ;
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 1:
                inserir();
                break;
            case 2:
                alterar();
                break;
            case 3:
                buscar();
                break;
            case 4:
                excluir();
                break;
            case 5:
                listar();
                break;
            default:
                System.out.println("Opcao inválida");
        }
    }

    private static void inserir() throws SQLException, ClassNotFoundException {
        int idU = Integer.parseInt(JOptionPane.showInputDialog("IDU"));
        int idMat = Integer.parseInt(JOptionPane.showInputDialog("IDMat"));
        String obs = JOptionPane.showInputDialog("OBS");
        UsuarioMateria usuEnt = new UsuarioMateria(idU, idMat, obs);
        ControllerUsuarioMateria contUsu = new ControllerUsuarioMateria();
        UsuarioMateria usuSaida = contUsu.inserir(usuEnt);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }

    private static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        int idU = Integer.parseInt(JOptionPane.showInputDialog("IDU"));
        int idMat = Integer.parseInt(JOptionPane.showInputDialog("IDMat"));
        String obs = JOptionPane.showInputDialog("OBS");
        UsuarioMateria usuEnt = new UsuarioMateria(id,idU, idMat, obs);
        ControllerUsuarioMateria contUsu = new ControllerUsuarioMateria();
        UsuarioMateria usuSaida = contUsu.alterar(usuEnt);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        UsuarioMateria usuEnt = new UsuarioMateria(id);
        ControllerUsuarioMateria contUsu = new ControllerUsuarioMateria();
        UsuarioMateria usuSaida = contUsu.buscar(usuEnt);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
        JOptionPane.showMessageDialog(null,usuSaida.getUsu().toString());
        JOptionPane.showMessageDialog(null,usuSaida.getMat().toString());

    }

    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        UsuarioMateria usuEnt = new UsuarioMateria(id);
        ControllerUsuarioMateria contUsu = new ControllerUsuarioMateria();
        UsuarioMateria usuSaida = contUsu.excluir(usuEnt);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        String obs = JOptionPane.showInputDialog("OBS");
        UsuarioMateria usuEnt = new UsuarioMateria(obs);
        ControllerUsuarioMateria contUsu = new ControllerUsuarioMateria();
        List<UsuarioMateria> listaUsuario = contUsu.listar(usuEnt);
        for (UsuarioMateria usuSaida : listaUsuario) {
            JOptionPane.showMessageDialog(null,usuSaida.toString());
            JOptionPane.showMessageDialog(null,usuSaida.getUsu().toString());
            JOptionPane.showMessageDialog(null,usuSaida.getMat().toString());
        }
    }


}