/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhodoo2;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Aluno extends Usuário{
    int matricula;
    String curso;
    private static ArrayList<Aluno> alunos = new ArrayList();
    
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno(){}
    
    public Aluno(int matricula, String curso, String nome, String telefone, String sexo, int idade) {
        super(nome, telefone, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

    //Cadastra aluno na lista
    public void cadastrarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

   /* @Override
    public void realizarEmpréstimo(int codigo, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /*@Override
    public void registrarDevolução(int codigo, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
