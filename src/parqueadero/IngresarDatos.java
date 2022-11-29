/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parqueadero;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Edison Salazar
 */
public class IngresarDatos extends javax.swing.JFrame {

    
    public IngresarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoAcuerdo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelPlaca = new javax.swing.JLabel();
        TxtMarca = new javax.swing.JTextField();
        jLabelColor = new javax.swing.JLabel();
        TxtColor = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        TxtPlaca = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        RadioButtonDia = new javax.swing.JRadioButton();
        RadioButtonMes = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jlabelNombre1 = new javax.swing.JLabel();
        Txtnombres = new javax.swing.JTextField();
        jLabelApellidos1 = new javax.swing.JLabel();
        TxtApellidos = new javax.swing.JTextField();
        jLabelCedula1 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        jLabelCelular1 = new javax.swing.JLabel();
        TxtCelular = new javax.swing.JTextField();
        jlabelDireccion1 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonIngresarRegistro = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        panelFactura = new javax.swing.JPanel();
        facFechaSalida = new javax.swing.JTextField();
        facFechaIngreso = new javax.swing.JTextField();
        facHoraExtra = new javax.swing.JTextField();
        facValor = new javax.swing.JTextField();
        btnFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Parqueadero SAS");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(425, 327));
        setMinimumSize(new java.awt.Dimension(425, 327));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");

        jLabelPlaca.setText("Placa:");

        jLabelColor.setText("Color:");

        jLabelMarca.setText("Marca:");

        jLabel2.setText("Datos Vehiculo");

        jLabelTipo.setText("Tipo: ");

        TxtPlaca.setEditable(false);
        TxtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPlacaKeyTyped(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));

        tipoAcuerdo.add(RadioButtonDia);
        RadioButtonDia.setSelected(true);
        RadioButtonDia.setLabel("Dia");

        tipoAcuerdo.add(RadioButtonMes);
        RadioButtonMes.setLabel("Mes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TxtColor)
                        .addComponent(jComboBoxTipo, 0, 125, Short.MAX_VALUE))
                    .addComponent(RadioButtonDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(TxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(RadioButtonMes))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlaca)
                    .addComponent(jLabelTipo)
                    .addComponent(TxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelColor)
                    .addComponent(TxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMarca)
                    .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonDia)
                    .addComponent(RadioButtonMes))
                .addGap(59, 59, 59))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("");

        jlabelNombre1.setText("Nombres:");

        jLabelApellidos1.setText("Apellidos:");

        jLabelCedula1.setText("Cedula:");

        TxtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCedulaKeyTyped(evt);
            }
        });

        jLabelCelular1.setText("Celular:");

        TxtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCelularActionPerformed(evt);
            }
        });
        TxtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCelularKeyTyped(evt);
            }
        });

        jlabelDireccion1.setText("Direccion:");

        jLabel1.setText("Datos Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabelDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCelular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlabelNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelApellidos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelNombre1)
                    .addComponent(Txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellidos1)
                    .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCedula1)
                    .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCelular1)
                    .addComponent(TxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelDireccion1)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonIngresarRegistro.setText("Ingreasar");
        jButtonIngresarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionIngresarVehiculos(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        panelFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion factura"));

        facFechaSalida.setEditable(false);
        facFechaSalida.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Salida"));

        facFechaIngreso.setEditable(false);
        facFechaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Ingreso"));

        facHoraExtra.setEditable(false);
        facHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero Horas extra"));

        facValor.setEditable(false);
        facValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor a Pagar"));

        btnFactura.setText("Dar salida");
        btnFactura.setEnabled(false);
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facFechaSalida)
                    .addComponent(facHoraExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(facFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(facValor, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(facFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(facFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(facHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(facValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFactura)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButtonIngresarRegistro)
                        .addGap(65, 65, 65)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(278, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresarRegistro)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void mensaje(String cad){
        JOptionPane.showMessageDialog(rootPane, cad);
        
    }
    
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new IngresarDatos().setVisible(true);
            }
        });
    }
    
    private void TxtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPlacaKeyTyped
        // TODO add your handling code here:
        if(TxtPlaca.getText().length()>=6){
        evt.consume();
    }
    }//GEN-LAST:event_TxtPlacaKeyTyped

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Vehiculo vei = null;
        this.limpiarCampos(vei);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void TxtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCelularKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
        if(TxtCelular.getText().length()>=10){
        evt.consume();
    }
    }//GEN-LAST:event_TxtCelularKeyTyped

    private void TxtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCelularActionPerformed

    private void TxtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedulaKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_TxtCedulaKeyTyped

    private void ActionIngresarVehiculos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionIngresarVehiculos
        if(this.Txtnombres.getText().isEmpty()||this.TxtApellidos.getText().isEmpty()||
           this.TxtCedula.getText().isEmpty()||this.TxtCelular.getText().isEmpty()||
           this.TxtDireccion.getText().isEmpty()||this.TxtColor.getText().isEmpty()||
           this.TxtMarca.getText().isEmpty()){mensaje("Ingrese todos los Campos");}//VAlidar que todos los campos esten diligenciados
        else{
            String Nombres = this.Txtnombres.getText();
            String Apellidos = this.TxtApellidos.getText();
            Long Cedula = Long.parseLong(this.TxtCedula.getText());
            String Direccion = this.TxtDireccion.getText();
            Long Telefono = Long.parseLong(this.TxtCelular.getText());
            String Color = this.TxtColor.getText();
            String Marca = this.TxtMarca.getText();
            String Placa = this.TxtPlaca.getText();
            String Tipo = this.jComboBoxTipo.getSelectedItem().toString();
            String contrato;
            if(this.RadioButtonDia.isSelected()==true){//valida si el cliente ingresa el vehiculo por un dia o la mensualidad
               contrato = "Dia";
            }else contrato = "Mes";
            String res = admin.IngresarCliente(Nombres, Apellidos, Cedula, Telefono, Direccion, Tipo, Color, Placa, Marca, contrato);
            //Se asigna los valores de los campos a las variables de los objetos Cliente y vehiculo
            if(this.jButtonIngresarRegistro.getText()=="Modificar"){
                this.mensaje("Cliente Modificado con exito");
            }else this.mensaje(res);
            
            this.setVisible(false);
            
            this.TxtApellidos.setText("");
            this.Txtnombres.setText("");
            this.TxtCedula.setText("");
            this.TxtCelular.setText("");
            this.TxtColor.setText("");
            this.TxtDireccion.setText("");
            this.TxtMarca.setText("");
            this.TxtPlaca.setText("");
        }
    }//GEN-LAST:event_ActionIngresarVehiculos

    private void btnFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseClicked
        String placa = this.TxtPlaca.getText();
        
        Vehiculo vei = admin.Buscar(placa);
        this.limpiarCampos(vei);
        this.mensaje("Salida del Vehiculo exitosa");
    }//GEN-LAST:event_btnFacturaMouseClicked


    public void ValidarPlaca(String placa, String ban){
        Vehiculo Nuevo = admin.Buscar(placa);
        if(Nuevo==null && ban=="registrar"){
            this.setVisible(true);
            this.TxtPlaca.setText(placa);
        }else if (Nuevo==null && ban=="modificar"){
            
            this.mensaje("Vheiculo con la placa: "+placa+" no exixte");
            
        }else{
            
            Vehiculo vei = admin.clienteExiste(placa);
            if(vei!=null && ban=="registrar"){
                
                this.Factura(vei, ban);
            }else{
                if(ban=="modificar"){
                    this.Factura(Nuevo, ban);
                }else this.mensaje("Registrado Hora y Fecha de ingreso");
            }
            
        }
    }
    
    public void Factura(Vehiculo vei, String ban){
        
        boolean aux = true;
        String nombreBtn ="Modificar";
        this.Txtnombres.setText(vei.Nombres);
        this.TxtApellidos.setText(vei.Apellidos);
        this.TxtCedula.setText(vei.Cedula.toString());
        this.TxtCelular.setText(vei.Telefono.toString());
        this.TxtColor.setText(vei.Color);
        this.TxtMarca.setText(vei.Marca);
        this.TxtDireccion.setText(vei.Direccion);
        this.TxtPlaca.setText(vei.Placa);
        if("Carro".equals(vei.Tipo))this.jComboBoxTipo.setSelectedIndex(0);
        if("Moto".equals(vei.Tipo))this.jComboBoxTipo.setSelectedIndex(1);
        if("Dia".equals(vei.facnueva.TipoIngreso)){
            this.RadioButtonDia.setSelected(true);
            Long numeroHoras = ChronoUnit.HOURS.between(vei.facnueva.FechaIngreso, LocalDateTime.now());
            if(numeroHoras>=24){
               numeroHoras = numeroHoras-24;
               this.facHoraExtra.setText((numeroHoras).toString()); 
            }
            
        }
        if("Mes".equals(vei.facnueva.TipoIngreso))this.RadioButtonDia.setSelected(false);
        
        if(ban=="registrar"){
        
        this.facFechaIngreso.setText(vei.facnueva.FechaIngreso.format(DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' HH:mm:ss")).toString());
        this.facFechaSalida.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' HH:mm:ss")).toString());
        this.facValor.setText("$"+vei.facnueva.Valor.toString());
        this.btnFactura.setEnabled(true);
        aux = false;
        nombreBtn="Ingresar";
        }
        
        this.jButtonIngresarRegistro.setText(nombreBtn);
        this.jButtonIngresarRegistro.setEnabled(aux);
        this.Txtnombres.setEditable(aux);
        this.TxtApellidos.setEditable(aux);
        this.TxtCedula.setEditable(aux);
        this.TxtCelular.setEditable(aux);
        this.TxtColor.setEditable(aux);
        this.TxtMarca.setEditable(aux);
        this.TxtDireccion.setEditable(aux);
        this.jComboBoxTipo.enable(aux);
        
        this.setVisible(true);
    }
    
    public void limpiarCampos(Vehiculo vei){
        
        if(vei!=null)vei.facnueva.FechaIngreso = null;
        
        this.setVisible(false);
        
        this.jButtonIngresarRegistro.setEnabled(true);
        this.Txtnombres.setEditable(true);
        this.TxtApellidos.setEditable(true);
        this.TxtCedula.setEditable(true);
        this.TxtCelular.setEditable(true);
        this.TxtColor.setEditable(true);
        this.TxtMarca.setEditable(true);
        this.TxtDireccion.setEditable(true);
        this.jComboBoxTipo.enable(true);
        this.btnFactura.setEnabled(false);
        this.btnFactura.setEnabled(false);
        
        
        this.TxtApellidos.setText("");
        this.Txtnombres.setText("");
        this.TxtCedula.setText("");
        this.TxtCelular.setText("");
        this.TxtColor.setText("");
        this.TxtDireccion.setText("");
        this.TxtMarca.setText("");
        this.TxtPlaca.setText("");
        
        this.facFechaIngreso.setText("");
        this.facFechaSalida.setText("");
        this.facHoraExtra.setText("");
        this.facValor.setText("");
        
    }  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonDia;
    private javax.swing.JRadioButton RadioButtonMes;
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtCelular;
    private javax.swing.JTextField TxtColor;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtMarca;
    public javax.swing.JTextField TxtPlaca;
    private javax.swing.JTextField Txtnombres;
    private javax.swing.JButton btnFactura;
    private javax.swing.JTextField facFechaIngreso;
    private javax.swing.JTextField facFechaSalida;
    private javax.swing.JTextField facHoraExtra;
    private javax.swing.JTextField facValor;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonIngresarRegistro;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellidos1;
    private javax.swing.JLabel jLabelCedula1;
    private javax.swing.JLabel jLabelCelular1;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelDireccion1;
    private javax.swing.JLabel jlabelNombre1;
    private javax.swing.JPanel panelFactura;
    private javax.swing.ButtonGroup tipoAcuerdo;
    // End of variables declaration//GEN-END:variables
Administrar admin = new Administrar();

}

