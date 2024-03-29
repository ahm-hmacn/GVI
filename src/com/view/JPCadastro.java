package com.view;

import java.util.Calendar;
import org.bson.Document;
import com.model.Documento;
import com.model.Visitante;
import com.utils.UppercaseDocumentFilter;
import com.sun.glass.events.KeyEvent;
import com.utils.B64;
import com.utils.BancoDeDados;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class JPCadastro extends javax.swing.JPanel {
    private Visitante visitante;    
    private BufferedImage image;
    private BancoDeDados bd = new BancoDeDados();         
    private final Calendar dataInicial = Calendar.getInstance();
    private final DocumentFilter filter = new UppercaseDocumentFilter();
    private Document data;
           
    public JPCadastro() {
        initComponents();           
        bd.iniciar();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        lblNome = new javax.swing.JLabel();
        cmpNome = new javax.swing.JTextField();
        ((AbstractDocument) cmpNome.getDocument()).setDocumentFilter(filter);
        lblDocumento = new javax.swing.JLabel();
        cmpDocumento = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cmpListaDoc = new javax.swing.JComboBox<>();
        lnlNomeMae = new javax.swing.JLabel();
        cmpNomeMae = new javax.swing.JTextField();
        ((AbstractDocument) cmpNomeMae.getDocument()).setDocumentFilter(filter);
        lblPaciente = new javax.swing.JLabel();
        cmpPaciente = new javax.swing.JTextField();
        ((AbstractDocument) cmpPaciente.getDocument()).setDocumentFilter(filter);
        lblLocal = new javax.swing.JLabel();
        cmpLocal = new javax.swing.JComboBox<>();
        lblDtNasc = new javax.swing.JLabel();
        cmpDtNasc = new javax.swing.JFormattedTextField();
        lblVinculo = new javax.swing.JLabel();
        cmpVinculo = new javax.swing.JTextField();
        ((AbstractDocument) cmpVinculo.getDocument()).setDocumentFilter(filter);
        lblDtEntrada = new javax.swing.JLabel();
        cmpDtEntrada = new javax.swing.JFormattedTextField();
        btCadastrar = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        btnCapturar = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        lblNome.setText("Nome:");

        cmpNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpNomeKeyPressed(evt);
            }
        });

        lblDocumento.setText("Documento:");

        cmpDocumento.setToolTipText("");
        cmpDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpDocumentoKeyPressed(evt);
            }
        });

        lblTipo.setText("Tipo:");

        cmpListaDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RG", "RE", "CPF", "CPTS" }));

        lnlNomeMae.setText("Nome da mãe:");

        lblPaciente.setText("Paciente:");

        lblLocal.setText("Local:");

        cmpLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Observação Feminina", "Observação Masculina", "Observação Infântil", "Choque", "Sutura", "Centro Obstétrico", "Centro Cirurgico", "UTI Adulto", "Berçario", "Clínica Obstétrica", "Clínica NeuroCirurgica", "Clínica Ortopédica", "Clínica Pediátrica", "UTI Pediátrica", "Clínica Cirúrgica", "Clínica de Saúde Mental", "Clínica Geral" }));

        lblDtNasc.setText("Data de Nascimento:");

        try {
            cmpDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("    ## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblVinculo.setText("Vínculo:");

        lblDtEntrada.setText("Data de Entrada:");

        cmpDtEntrada.setEditable(false);
        cmpDtEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("EEEE, d' de 'MMMM' de 'yyyy'. 'HH'h 'mm'min 'ss's 'z"))));

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lblImagem.setBackground(new java.awt.Color(153, 153, 153));
        lblImagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCapturar.setText("Capturar foto");
        btnCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome)
                    .addComponent(lnlNomeMae)
                    .addComponent(lblPaciente)
                    .addComponent(lblVinculo)
                    .addComponent(lblDtEntrada)
                    .addComponent(cmpNome)
                    .addComponent(cmpDtEntrada)
                    .addComponent(cmpVinculo)
                    .addComponent(cmpPaciente)
                    .addComponent(cmpNomeMae)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDtNasc)
                                    .addComponent(cmpDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLocal))
                                .addGap(177, 177, 177))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmpLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDocumento)
                                            .addComponent(cmpDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTipo)
                                            .addComponent(cmpListaDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(90, 90, 90)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCapturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNome)
                .addGap(6, 6, 6)
                .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDtNasc)
                        .addGap(6, 6, 6)
                        .addComponent(cmpDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDocumento)
                                .addGap(6, 6, 6)
                                .addComponent(cmpDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addGap(6, 6, 6)
                                .addComponent(cmpListaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(lblLocal))
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapturar)
                    .addComponent(cmpLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lnlNomeMae)
                .addGap(6, 6, 6)
                .addComponent(cmpNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblPaciente)
                .addGap(6, 6, 6)
                .addComponent(cmpPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblVinculo)
                .addGap(6, 6, 6)
                .addComponent(cmpVinculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblDtEntrada)
                .addGap(6, 6, 6)
                .addComponent(cmpDtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        instanciaValores();       
        cmpDtEntrada.setValue(dataInicial.getTime());     
        bd.Add(new Document(bd.inserir(visitante)));
        limparCampos();
        
    }//GEN-LAST:event_btCadastrarActionPerformed
    
    private void cmpNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNomeKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            String nome = cmpNome.getText();
            
            
            
            data = bd.buscaNome(nome).first();
            System.out.println(data.size());
            String jsonString = data.toJson();
            data = Document.parse(jsonString);
            
            cmpDtNasc.setText((String)data.get("Data de Nascimento"));
            cmpDocumento.setText((String)data.get("Documento"));
            cmpListaDoc.setSelectedItem((String)data.get("Tipo"));
            cmpNomeMae.setText((String)data.get("Nome da Mãe"));
            cmpPaciente.setText((String)data.get("Paciente"));
            cmpLocal.setSelectedItem((String)data.get("Local"));
            cmpVinculo.setText((String)data.get("Vínculo"));           
            setImage(B64.decodeToImage((String)data.get("Imagem")));
        }
    }//GEN-LAST:event_cmpNomeKeyPressed

    private void cmpDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDocumentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            

            String doc = cmpDocumento.getText();

            data = bd.buscaDoc(doc);
            String jsonString = data.toJson();
            data = Document.parse(jsonString);
            cmpNome.setText((String) data.get("Nome"));
            cmpDtNasc.setText((String) data.get("Data de Nascimento"));
            cmpListaDoc.setSelectedItem((String) data.get("Tipo"));
            cmpNomeMae.setText((String) data.get("Nome da Mãe"));
            cmpPaciente.setText((String) data.get("Paciente"));
            cmpLocal.setSelectedItem((String) data.get("Local"));
            cmpVinculo.setText((String) data.get("Vínculo"));
            setImage(B64.decodeToImage((String)data.get("Imagem")));
        }
    }//GEN-LAST:event_cmpDocumentoKeyPressed

    public void instanciaValores(){
        if(preenchido()){            
            visitante.setNome(cmpNome.getText().trim());
            visitante.setNomeMae(cmpNomeMae.getText().trim());
            visitante.setPaciente(cmpPaciente.getText().trim());
            visitante.setDoc(new Documento(cmpDocumento.getText().trim(), 
                            (String) cmpListaDoc.getSelectedItem()));
            visitante.setDataEntrada(cmpDtEntrada.getText().trim());
            visitante.setDataNascimento(cmpDtNasc.getText().trim());
            visitante.setVinculo(cmpVinculo.getText().trim());
            visitante.setLocal((String) cmpLocal.getSelectedItem());
            visitante.setImagem(B64.encodeToString(image, "JPG"));
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        }
    }
    
    private boolean preenchido(){
        if(cmpNome.getText().trim().isEmpty() || cmpDtNasc.getText().trim().isEmpty())
            return false;        
        if(cmpDocumento.getText().trim().isEmpty() || cmpNomeMae.getText().trim().isEmpty())
            return false;        
        if(cmpPaciente.getText().trim().isEmpty() || cmpVinculo.getText().trim().isEmpty())
            return false;
        if(cmpDtEntrada.getText().trim().isEmpty() || cmpLocal.getSelectedIndex()== 0)
            return false;        
        return true;
    }    
    
    private void limparCampos(){
        cmpNome.setText("");
        cmpDtNasc.setText("");
        cmpDocumento.setText("");
        cmpListaDoc.getItemAt(0);
        cmpNomeMae.setText("");
        cmpPaciente.setText("");
        cmpLocal.getItemAt(0);
        cmpVinculo.setText("");
        cmpDtEntrada.setText("");
        lblImagem.setIcon(new ImageIcon());
    }
    
    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        JFWebCam frameWebCam = new JFWebCam(this);
        frameWebCam.setVisible(true);
    }//GEN-LAST:event_btnCapturarActionPerformed
    
    public void setImage(BufferedImage image) {
        this.image = image;
        lblImagem.setIcon(new ImageIcon(
                image.getScaledInstance(160, 120, Image.SCALE_FAST)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JTextField cmpDocumento;
    javax.swing.JFormattedTextField cmpDtEntrada;
    private javax.swing.JFormattedTextField cmpDtNasc;
    private javax.swing.JComboBox<String> cmpListaDoc;
    private javax.swing.JComboBox<String> cmpLocal;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JTextField cmpNomeMae;
    private javax.swing.JTextField cmpPaciente;
    private javax.swing.JTextField cmpVinculo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblDtEntrada;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVinculo;
    private javax.swing.JLabel lnlNomeMae;
    // End of variables declaration//GEN-END:variables
}
