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
public class Emprestado{
    Aluno aluno;
    Professor professor;
    LocalDate DataDevolucao;
    private static ArrayList<Emprestado> emprestados = new ArrayList();

    public static ArrayList<Emprestado> getEmprestados() {
        return emprestados;
    }

    public static void setEmprestados(ArrayList<Emprestado> emprestados) {
        Emprestado.emprestados = emprestados;
    }
    
    public Emprestado(){}

    public Emprestado(Professor professor, LocalDate DataDevolucao) {
        this.professor = professor;
        this.DataDevolucao = DataDevolucao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LocalDate getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(LocalDate DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }

    public Emprestado(Aluno aluno, LocalDate DataDevolucao) {
        this.aluno = aluno;
        this.DataDevolucao = DataDevolucao;
    }
    //Cadastra o empréstimo
    public void cadastrarEmprestado(Emprestado e){
        this.emprestados.add(e);
    }
    //Método que devolve multa
    public long multar(String user, String tipo, LocalDate dataA){
        Professor p = new Professor();
        Aluno a = new Aluno();
        Emprestado e = new Emprestado();
        LocalDate dataD;
        long resultado = 0;
        if(tipo.equals("Aluno")){
            for(int i=0; i<a.getAlunos().size(); i++){
                if(a.getAlunos().get(i).getNome().equals(user)){
                    for(int y = 0; y<e.getEmprestados().size(); y++){
                        if(e.getEmprestados().get(y).getAluno().getNome().equals(user)){
                            dataD = e.getEmprestados().get(y).getDataDevolucao();
                            if(dataA.isAfter(dataD)){
                                long dias = DAYS.between(dataA, dataD);
                                resultado = 3*dias;
                            }
                        }
                    }
                }
            }
        }
        if(tipo.equals("Professor")){
            for(int i=0; i<p.getProfessores().size(); i++){
                if(p.getProfessores().get(i).getNome().equals(user)){
                    for(int y = 0; y<e.getEmprestados().size(); y++){
                        if(e.getEmprestados().get(y).getProfessor().getNome().equals(user)){
                            dataD = e.getEmprestados().get(y).getDataDevolucao();
                            if(dataA.isAfter(dataD)){
                                long dias = DAYS.between(dataA, dataD);
                                resultado = 3*dias;
                            }
                        }
                    }
                }
            }
        }
        return resultado;
    }
}
