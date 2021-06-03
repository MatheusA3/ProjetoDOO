/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhodoo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author User
 */
public class Empréstimo extends javax.swing.JFrame {
    LocalDate localDate = LocalDate.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataAtual = localDate.format(format);
    Aluno a = new Aluno();
    Professor p = new Professor();
    Livro l = new Livro();
    /**
     * Creates new form Empréstimo
     */
    public Empréstimo() {
        initComponents();
        this.tfDataE.setText(dataAtual);
        this.tfDataD.setText(dataAtual);
        cbAluno.setEditable(false);
        cbProfessor.setEditable(false);
        preencheListaA();
        preencheListaP();
        preencheLivros();
    }
    
    public void limparCampos(){
        this.tfCodigo.setText("");
        this.tfDataD.setText("");
        this.tfDataE.setText("");
        this.buttonGroup1.clearSelection();
        this.cbAluno.setSelectedIndex(0);
        this.cbProfessor.setSelectedIndex(0);
        this.cbLivro.setSelectedIndex(0);
    }
    
    public void preencheListaA(){
        for(int i=0; i<this.a.getAlunos().size(); i++){
            this.cbAluno.addItem(this.a.getAlunos().get(i).getNome());
        }
    }
    
    public void preencheListaP(){
        for(int i=0; i<this.p.getProfessores().size(); i++){
            this.cbProfessor.addItem(this.p.getProfessores().get(i).getNome());
        }
    }

    public void preencheLivros(){
        for(int i=0; i<this.l.getLivros().size(); i++){
            this.cbLivro.addItem(this.l.getLivros().get(i).getTítulo());
        }
    }    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbProfessor = new javax.swing.JRadioButton();
        rbAluno = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbLivro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tfDataE = new javax.swing.JFormattedTextField();
        tfDataD = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        cbAluno = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbProfessor = new javax.swing.JComboBox<>();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Código");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Empréstimo");

        buttonGroup1.add(rbProfessor);
        rbProfessor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbProfessor.setText("Professor");
        rbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProfessorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAluno);
        rbAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbAluno.setText("Aluno");
        rbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlunoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Código");

        tfCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Livro");

        cbLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Data de Empréstimo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Data de Devolução");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfDataE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        tfDataE.setToolTipText("");
        tfDataE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfDataE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataEActionPerformed(evt);
            }
        });

        tfDataD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        tfDataD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Aluno");

        cbAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Professor");

        cbProfessor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(rbAluno))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDataD, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(tfDataE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbProfessor)
                    .addComponent(rbAluno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDataE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDataD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDataEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo;
        LocalDate dataD, dataE;
        String livro;
        String aluno;
        String professor;
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //Verifica se os dois radio buttons estão selecionados, para permitir alterações
        if(this.rbAluno.isSelected() == false && this.rbProfessor.isSelected() == false){
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            //Leitura dos campos
            codigo = this.tfCodigo.getText();
            dataD = LocalDate.parse(this.tfDataD.getText(), dtf);
            dataE = LocalDate.parse(this.tfDataE.getText(), dtf);
            //Verifica se é professor e cadastra como o tipo
            if(this.rbProfessor.isSelected()){
                professor = this.cbProfessor.getSelectedItem().toString();
                livro = this.cbLivro.getSelectedItem().toString();
                //Verifica se campos estão vazios
                if(codigo.equals("") || dataD.equals("") || dataE.equals("")){
                    JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }else{
                    //Cadastra Empréstimo
                    Livro l = new Livro();    
            
                    l.realizarEmpréstimo(Integer.parseInt(codigo), professor, livro, dataE, dataD);
             
                    JOptionPane.showMessageDialog(this, "Empréstimo cadastrado com sucesso!");
                    this.limparCampos();
                }
            }
            //Verifica se é aluno e então cadastra como o tipo
            if(this.rbAluno.isSelected()){
                aluno = this.cbAluno.getSelectedItem().toString();
                livro = this.cbLivro.getSelectedItem().toString();
                //Verifica se campos estão vazios
                if(codigo.equals("") || dataD.equals("") || dataE.equals("")){
                    JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }else{
                    //Cadastra empréstimo
                    Livro l = new Livro();    
            
                    l.realizarEmpréstimo(Integer.parseInt(codigo), aluno, livro, dataE, dataD);
             
                    JOptionPane.showMessageDialog(this, "Empréstimo cadastrado com sucesso!");
                    //Limpa campos
                    this.limparCampos();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProfessorActionPerformed
        //Se professor foi selecionado, lbiera informações de professor e bloqueia as de aluno
        cbAluno.setEditable(false);
        cbProfessor.setEditable(true);
    }//GEN-LAST:event_rbProfessorActionPerformed

    private void rbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlunoActionPerformed
        //Se aluno foi selecionado, libera informações de aluno e bloqueia as de professor
        cbAluno.setEditable(true);
        cbProfessor.setEditable(false);
    }//GEN-LAST:event_rbAlunoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAluno;
    private javax.swing.JComboBox<String> cbLivro;
    private javax.swing.JComboBox<String> cbProfessor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbAluno;
    private javax.swing.JRadioButton rbProfessor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfDataD;
    private javax.swing.JFormattedTextField tfDataE;
    // End of variables declaration//GEN-END:variables
}
