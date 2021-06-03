/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhodoo2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Professor extends Usuário{
    int id;
    private static ArrayList<Professor> professores = new ArrayList();

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    
    public Professor(){}

    public Professor(int id, String nome, String telefone, String sexo, int idade) {
        super(nome, telefone, sexo, idade);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //Cadastra professor na lista
    public void cadastrarProfessor(Professor professor){
        this.professores.add(professor);
    }
}
