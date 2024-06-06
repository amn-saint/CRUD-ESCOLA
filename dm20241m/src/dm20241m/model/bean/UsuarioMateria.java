package dm20241m.model.bean;

/**
 *
 * @author lab04aluno
 */
public class UsuarioMateria {
    
    private int id;
    private int idU;
    private int idMat;
    private String obs;
    private Usuario usu;
    private Materia mat;

    public UsuarioMateria(int id, int idU, int idMat, String obs) {
        this.id = id;
        this.idU = idU;
        this.idMat = idMat;
        this.obs = obs;
    }

    public UsuarioMateria(int id) {
        this.id = id;
    }

    public UsuarioMateria(String obs) {
        this.obs = obs;
    }

    public UsuarioMateria(int idU, int idMat, String obs) {
        this.idU = idU;
        this.idMat = idMat;
        this.obs = obs;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public int getIdMat() {
        return idMat;
    }

    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Materia getMat() {
        return mat;
    }

    public void setMat(Materia mat) {
        this.mat = mat;
    }

    @Override
    public String toString() {
        return "UsuarioMateria{" + "id=" + id + ", obs=" + obs + ", usu=" + usu + ", mat=" + mat + '}';
    }

    
}
  