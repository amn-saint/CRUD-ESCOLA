/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dm20241m.model.bean;

/**
 *
 * @author lab04aluno
 */
public class Materia {
    
    private int id;
    private String nome;
    private String periodo;
    private String status;
    private String professor;

    public Materia(int id) {
        this.id = id;
    }

    public Materia(String nome) {
        this.nome = nome;
    }

    public Materia(String nome, String periodo) {
        this.nome = nome;
        this.periodo = periodo;
    }

    
    public Materia(String nome, String periodo, String status, String professor) {
        this.nome = nome;
        this.periodo = periodo;
        this.status = status;
        this.professor = professor;
    }

    public Materia(int id, String nome, String periodo, String status, String professor) {
        this.id = id;
        this.nome = nome;
        this.periodo = periodo;
        this.status = status;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nome=" + nome + ", periodo=" + periodo + ", status=" + status + ", professor=" + professor + '}';
    }
    
    
    
}
