/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocerto.Application.AlteraFretado;

import java.awt.Color;
import java.time.LocalTime;
import pontocerto.Application.ConsultaFretado.ConsultaFretadoUI;
import pontocerto.Application.DefaultCode.DefaultCode;
import pontocerto.Business.Admin.AlteraFretadoValidation;
import pontocerto.Business.Admin.CadastraFretadoValidation;
import pontocerto.Common.DTO.FretadosDTO;
import pontocerto.Global.Enumeradores.NivelAcesso;
import pontocerto.Global.GerenciadorNivelAcesso;

/**
 *
 * @author thiag
 */
public class AlteraFretadoUI extends DefaultCode
{

    /**
     * Creates new form AlteraFretadoUI
     */
    public AlteraFretadoUI()
    {
        initComponents();
        validaAcessoUsuario();
    }

    public AlteraFretadoUI(FretadosDTO fretado)
    {
        idFretado = fretado.getId();
        
        initComponents();
        validaAcessoUsuario();        
        PreencherCampos(fretado);
    }

    private int idFretado;

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        painelPrincipal = new javax.swing.JPanel();
        painelMenuLateral = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        lblFretado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        painelAlteraFretado = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtHorarioEntrada = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtHorarioSaida = new javax.swing.JFormattedTextField();
        btnAlterarFretado = new javax.swing.JButton();
        lblMensagemErroAlteraFretado = new javax.swing.JLabel();
        btnVoltarTelaConsultaFretado = new javax.swing.JButton();
        txtNumeroFretado = new javax.swing.JFormattedTextField();
        txtMotorista = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PONTO CERTO");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/pontocerto/Images/busIcon.png")).getImage());

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        painelMenuLateral.setBackground(new java.awt.Color(51, 102, 255));

        lblHome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocerto/Images/home.png"))); // NOI18N
        lblHome.setText("  Home");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblHomeMouseClicked(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocerto/Images/user.png"))); // NOI18N
        lblUsuario.setText("  Usuário");
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblUsuarioMouseClicked(evt);
            }
        });

        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocerto/Images/sair.png"))); // NOI18N
        lblSair.setToolTipText("Sair");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblSairMouseClicked(evt);
            }
        });

        lblFretado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFretado.setForeground(new java.awt.Color(255, 255, 255));
        lblFretado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocerto/Images/bus.png"))); // NOI18N
        lblFretado.setText("  Fretado");
        lblFretado.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblFretadoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PONTO");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CERTO");

        javax.swing.GroupLayout painelMenuLateralLayout = new javax.swing.GroupLayout(painelMenuLateral);
        painelMenuLateral.setLayout(painelMenuLateralLayout);
        painelMenuLateralLayout.setHorizontalGroup(
            painelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuLateralLayout.createSequentialGroup()
                        .addComponent(lblSair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFretado, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelMenuLateralLayout.setVerticalGroup(
            painelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLateralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblFretado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        painelAlteraFretado.setBackground(new java.awt.Color(255, 255, 255));
        painelAlteraFretado.setPreferredSize(new java.awt.Dimension(728, 585));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Alteração de Fretado");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fretado");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Descrição");

        txtDescricao.setBackground(new java.awt.Color(255, 255, 255));
        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(0, 0, 0));
        txtDescricao.setToolTipText("Digite a descrição do fretado");
        txtDescricao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Motorista");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Entrada");

        txtHorarioEntrada.setBackground(new java.awt.Color(255, 255, 255));
        txtHorarioEntrada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHorarioEntrada.setForeground(new java.awt.Color(0, 0, 0));
        txtHorarioEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtHorarioEntrada.setToolTipText("Digite o horário de entrada no formato hh:mm");
        txtHorarioEntrada.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Saída");

        txtHorarioSaida.setBackground(new java.awt.Color(255, 255, 255));
        txtHorarioSaida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHorarioSaida.setForeground(new java.awt.Color(0, 0, 0));
        txtHorarioSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtHorarioSaida.setToolTipText("Digite o horário de saída no formato hh:mm");
        txtHorarioSaida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnAlterarFretado.setBackground(new java.awt.Color(51, 102, 255));
        btnAlterarFretado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAlterarFretado.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarFretado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocerto/Images/save.png"))); // NOI18N
        btnAlterarFretado.setText("Salvar");
        btnAlterarFretado.setBorder(null);
        btnAlterarFretado.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnAlterarFretadoMouseClicked(evt);
            }
        });

        lblMensagemErroAlteraFretado.setBackground(new java.awt.Color(255, 255, 255));
        lblMensagemErroAlteraFretado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnVoltarTelaConsultaFretado.setBackground(new java.awt.Color(51, 102, 255));
        btnVoltarTelaConsultaFretado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVoltarTelaConsultaFretado.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarTelaConsultaFretado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocerto/Images/sair.png"))); // NOI18N
        btnVoltarTelaConsultaFretado.setText("Voltar");
        btnVoltarTelaConsultaFretado.setToolTipText("Voltar para a tela de consulta de fretados");
        btnVoltarTelaConsultaFretado.setBorder(null);
        btnVoltarTelaConsultaFretado.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnVoltarTelaConsultaFretadoMouseClicked(evt);
            }
        });

        txtNumeroFretado.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroFretado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroFretado.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroFretado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumeroFretado.setToolTipText("Digite apenas números");
        txtNumeroFretado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMotorista.setBackground(new java.awt.Color(255, 255, 255));
        txtMotorista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMotorista.setForeground(new java.awt.Color(0, 0, 0));
        try
        {
            txtMotorista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        txtMotorista.setToolTipText("Digite o CPF do motorista");
        txtMotorista.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout painelAlteraFretadoLayout = new javax.swing.GroupLayout(painelAlteraFretado);
        painelAlteraFretado.setLayout(painelAlteraFretadoLayout);
        painelAlteraFretadoLayout.setHorizontalGroup(
            painelAlteraFretadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlteraFretadoLayout.createSequentialGroup()
                .addGroup(painelAlteraFretadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAlteraFretadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelAlteraFretadoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(painelAlteraFretadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelAlteraFretadoLayout.createSequentialGroup()
                                .addComponent(btnVoltarTelaConsultaFretado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterarFretado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAlteraFretadoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHorarioSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMensagemErroAlteraFretado, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroFretado)
                            .addComponent(txtMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelAlteraFretadoLayout.setVerticalGroup(
            painelAlteraFretadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlteraFretadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(lblMensagemErroAlteraFretado)
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroFretado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(painelAlteraFretadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorarioSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(painelAlteraFretadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarTelaConsultaFretado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarFretado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 731, Short.MAX_VALUE))
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 243, Short.MAX_VALUE)
                    .addComponent(painelAlteraFretado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelAlteraFretado, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblHomeMouseClicked
    {//GEN-HEADEREND:event_lblHomeMouseClicked
        // TODO add your handling code here:
        this.dispose();
        abrirPaginaHome();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblFretadoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblFretadoMouseClicked
    {//GEN-HEADEREND:event_lblFretadoMouseClicked
        // TODO add your handling code here:
        this.dispose();
        abrirPaginaFretado();
    }//GEN-LAST:event_lblFretadoMouseClicked

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblUsuarioMouseClicked
    {//GEN-HEADEREND:event_lblUsuarioMouseClicked
        // TODO add your handling code here:
        this.dispose();
        abrirPaginaUsuario();
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblSairMouseClicked
    {//GEN-HEADEREND:event_lblSairMouseClicked
        // TODO add your handling code here:
        this.dispose();
        abrirPaginaLogin();
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnVoltarTelaConsultaFretadoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnVoltarTelaConsultaFretadoMouseClicked
    {//GEN-HEADEREND:event_btnVoltarTelaConsultaFretadoMouseClicked
        // TODO add your handling code here:
        this.dispose();
        abrirPaginaFretado();
    }//GEN-LAST:event_btnVoltarTelaConsultaFretadoMouseClicked

    private void btnAlterarFretadoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAlterarFretadoMouseClicked
    {//GEN-HEADEREND:event_btnAlterarFretadoMouseClicked
        // TODO add your handling code here:
        lblMensagemErroAlteraFretado.setVisible(false);

        try
        {
            FretadosDTO fretado = getFretadoDTO();

            boolean validaCampos = CadastraFretadoValidation.validaCampos(fretado);

            if (validaCampos == false)
            {
                MensagemAlertaErro("Campos obrigatórios não preenchidos", true);
            }
            else
            {
                CadastraFretadoValidation.alteraFretado(fretado);
                MensagemAlertaErro("Fretado alterado com sucesso", false);
            }
        }
        catch (Exception ex)
        {
            MensagemAlertaErro("Ocorreu um erro ao cadastrar um item", true);
        }
    }//GEN-LAST:event_btnAlterarFretadoMouseClicked

    private FretadosDTO getFretadoDTO() throws NumberFormatException
    {
        // TODO add your handling code here:
        int numeroFretado = Integer.parseInt(txtNumeroFretado.getText().trim().equals("") ? "-1" : txtNumeroFretado.getText().trim());
        String descricao = txtDescricao.getText().trim();
        long motorista = Long.parseLong(txtMotorista.getText().trim().equals("") ? "-1" : txtMotorista.getText().trim());
        LocalTime horaEntrada = LocalTime.parse(txtHorarioEntrada.getText().trim().equals("") ? "00:00" : txtHorarioEntrada.getText().trim());
        LocalTime horaSaida = LocalTime.parse(txtHorarioSaida.getText().trim().equals("") ? "00:00" : txtHorarioSaida.getText().trim());

        FretadosDTO fretado = new FretadosDTO();
        fretado.setNumero(numeroFretado);
        fretado.setDescricao(descricao);
        fretado.setMotorista(motorista);
        fretado.setEntrada(horaEntrada);
        fretado.setSaida(horaSaida);
        fretado.setId(idFretado);

        return fretado;
    }

    private void MensagemAlertaErro(String mensagem, boolean erro)
    {
        Color cor = erro ? Color.red : Color.blue;

        lblMensagemErroAlteraFretado.setVisible(true);
        lblMensagemErroAlteraFretado.setForeground(cor);
        lblMensagemErroAlteraFretado.setText(mensagem);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AlteraFretadoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AlteraFretadoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AlteraFretadoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AlteraFretadoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AlteraFretadoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFretado;
    private javax.swing.JButton btnVoltarTelaConsultaFretado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFretado;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMensagemErroAlteraFretado;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel painelAlteraFretado;
    private javax.swing.JPanel painelMenuLateral;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JFormattedTextField txtHorarioEntrada;
    private javax.swing.JFormattedTextField txtHorarioSaida;
    private javax.swing.JFormattedTextField txtMotorista;
    private javax.swing.JFormattedTextField txtNumeroFretado;
    // End of variables declaration//GEN-END:variables

    @Override
    protected void validaAcessoUsuario()
    {
        String nivelAcesso = GerenciadorNivelAcesso.obterInstancia().getNivelAcesso();

        if (nivelAcesso.equals(NivelAcesso.Comum.name()))
        {
            this.dispose();
            abrirPaginaLogin();
        }
    }

    private void PreencherCampos(FretadosDTO fretado)
    {
        try
        {            
            txtNumeroFretado.setText(Integer.toString(fretado.getNumero()));
            txtDescricao.setText(fretado.getDescricao());
            txtMotorista.setText(Long.toString(fretado.getMotorista()));
            txtHorarioEntrada.setText(fretado.getEntrada().toString());
            txtHorarioSaida.setText(fretado.getSaida().toString());
        }
        catch (Exception ex)
        {
            MensagemAlertaErro("Ocorreu um erro ao preencher os campos com as informações do fretado selecionado", true);
        }
    }
}
