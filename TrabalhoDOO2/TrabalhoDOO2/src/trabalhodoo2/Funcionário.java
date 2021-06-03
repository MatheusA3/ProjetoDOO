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
public class Funcionário extends Usuário{
    String usuário, senha;
    private static ArrayList<Funcionário> funcionários = new ArrayList();

    public ArrayList<Funcionário> getFuncionários() {
        return funcionários;
    }
    
    public Funcionário(){}
    
    public Funcionário(String usuário, String senha, String nome, String telefone, String sexo, int idade) {
        super(nome, telefone, sexo, idade);
        this.usuário = usuário;
        this.senha = senha;
    }

    public String getUsuário() {
        return usuário;
    }

    public void setUsuário(String usuário) {
        this.usuário = usuário;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    //Método que cadastra funcionário na lista
    public void cadastrarFuncionário(Funcionário f){
        this.funcionários.add(f);
    }

    /*@Override
    public void realizarEmpréstimo(int codigo, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /*@Override
    public void registrarDevolução(int codigo, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
