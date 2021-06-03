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
public class Livro {
    int código;
    String título, autor, genero;
    boolean isEmprestado;
    private static ArrayList<Livro> livros = new ArrayList();
    private static ArrayList<Livro> emprestados = new ArrayList();
    
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public static ArrayList<Livro> getEmprestados() {
        return emprestados;
    }
    
    public Livro(){
        
    }
    
    public Livro(int código, String título, String autor, String genero, boolean isEmprestado) {
        this.código = código;
        this.título = título;
        this.autor = autor;
        this.genero = genero;
        this.isEmprestado = isEmprestado;
    }
    
    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isIsEmprestado() {
        return isEmprestado;
    }

    public void setIsEmprestado(boolean isEmprestado) {
        this.isEmprestado = isEmprestado;
    }
    //Cadastra livro na lista
    public void cadastrarLivro(Livro livro){
        this.livros.add(livro);
    }
    //Método que realiza o empréstimo
    public void realizarEmpréstimo(int codigo, String user, String livro, LocalDate dataE, LocalDate dataD){
        for(int i=0; i<this.livros.size(); i++){
            if(livro.equals(livros.get(i).getTítulo())){
                livros.get(i).isEmprestado = true;
                this.emprestados.add(livros.get(i));
                this.livros.remove(livros.get(i));
            }
        }
    }
    //Método que realiza a devolução
    public void realizarDevolução(int código, String user, String livro, LocalDate dataD, LocalDate dataA){
        for(int i=0; i<this.emprestados.size(); i++){
            if(livro.equals(emprestados.get(i).getTítulo())){
                emprestados.get(i).isEmprestado = false;
                this.livros.add(emprestados.get(i));
                this.emprestados.remove(emprestados.get(i));
            }
        }
    }
}
