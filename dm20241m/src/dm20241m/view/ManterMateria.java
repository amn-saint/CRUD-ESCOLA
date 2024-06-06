package dm20241m.view;

import dm20241m.controller.ControllerMateria;
import dm20241m.model.bean.Materia;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ManterMateria {
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

        String nome = JOptionPane.showInputDialog("NOME");
        String periodo = JOptionPane.showInputDialog("PERÍODO");
        String status = JOptionPane.showInputDialog("STATUS");
        String professor = JOptionPane.showInputDialog("PROFESSOR");
        Materia matEnt = new Materia(nome, periodo, professor, status);
        ControllerMateria contMate = new ControllerMateria();
        Materia matSaida = contMate.inserir(matEnt);
        JOptionPane.showMessageDialog(null,matSaida.toString());
    }

    private static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("NOME");
        String periodo = JOptionPane.showInputDialog("PERÍODO");
        String status = JOptionPane.showInputDialog("STATUS");
        String professor = JOptionPane.showInputDialog("PROFESSOR");
        Materia matEnt = new Materia(id, nome, periodo, status, professor );
        ControllerMateria contMate = new ControllerMateria();
        Materia matSaida = contMate.alterar(matEnt);
        JOptionPane.showMessageDialog(null,matSaida.toString());
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Materia matEnt = new Materia(id);
        ControllerMateria contMate = new ControllerMateria();
        Materia matSaida = contMate.buscar(matEnt);
        JOptionPane.showMessageDialog(null,matSaida.toString());
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Materia matEnt = new Materia(id);
        ControllerMateria contMate = new ControllerMateria();
        Materia matSaida = contMate.excluir(matEnt);
        JOptionPane.showMessageDialog(null,matSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog("NOME");
        Materia matEnt = new Materia(nome);
        ControllerMateria contMate = new ControllerMateria();
        List<Materia> listaMateria = contMate.listar(matEnt);
        for (Materia matSaida : listaMateria) {
            JOptionPane.showMessageDialog(null,matSaida.toString());
        }
    }



    
}
