/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author jairo
 */
public class Calculadora extends javax.swing.JFrame {

    public float num1, num2;
    String signo;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public String sincero(float resultado) {
        String retorno = "";

        retorno = Float.toString(resultado);

        if (resultado % 1 == 0) {
            retorno = retorno.substring(0, retorno.length() - 2);

        }

        return retorno;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPorcentaje = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnFlecha = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnMenosM = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        btnSumaResta = new javax.swing.JButton();
        btnMmas = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        lbltablero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPorcentaje.setText("%");
        jPanel1.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 60, 30));

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 50, 30));

        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 50, 30));

        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, 30));

        btnFlecha.setText("<-");
        btnFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 30));

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 30));

        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 30));

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 30));

        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel1.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 50, 30));

        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 30));

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 50, 30));

        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 50, 30));

        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 60, 70));

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel1.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 50, 30));

        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 50, 30));

        btnMod.setText("mod");
        jPanel1.add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 60, 30));

        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel1.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 50, 30));

        btnMenosM.setText("M-");
        btnMenosM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosMActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenosM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 60, 30));

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 50, 30));

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        jPanel1.add(btnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 50, 30));

        btnMultiplicacion.setText("*");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, 30));

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 50, 30));

        btnMC.setText("MC");
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });
        jPanel1.add(btnMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 30));

        jButton24.setText("M-");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 60, 30));

        btnSumaResta.setText("+ -");
        btnSumaResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSumaResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 50, 30));

        btnMmas.setText("M+");
        btnMmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMmasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 60, 30));

        btnMS.setText("MS");
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });
        jPanel1.add(btnMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 60, 30));

        btnMR.setText("MR");
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });
        jPanel1.add(btnMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 30));

        lbltablero.setBackground(new java.awt.Color(255, 255, 255));
        lbltablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(lbltablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFlechaActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnMenosMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenosMActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMCActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void btnSumaRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaRestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSumaRestaActionPerformed

    private void btnMmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMmasActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        this.num2 = Float.parseFloat(this.lbltablero.getText());
        switch (this.signo) {
            case "+":
                this.lbltablero.setText(sincero(num1 + num2));
                break;
            case "-":
                this.lbltablero.setText(sincero(num1 - num2));
                break;
            case "/":
                this.lbltablero.setText(sincero(num1 / num2));
                break;
            case "*":
                this.lbltablero.setText(sincero(num1 * num2));
                break;
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        this.lbltablero.setText(" ");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (!(this.lbltablero.getText().contains("."))) {
            this.lbltablero.setText(this.lbltablero.getText() + ".");
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        this.num1 = Float.parseFloat(this.lbltablero.getText());
        this.signo = "+";
        this.lbltablero.setText(" ");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        this.num1 = Float.parseFloat(this.lbltablero.getText());
        this.signo = "-";
        this.lbltablero.setText(" ");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        this.num1 = Float.parseFloat(this.lbltablero.getText());
        this.signo = "*";
        this.lbltablero.setText(" ");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        this.num1 = Float.parseFloat(this.lbltablero.getText());
        this.signo = "/";
        this.lbltablero.setText(" ");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        this.lbltablero.setText(this.lbltablero.getText() + "0");
    }//GEN-LAST:event_btnCeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnFlecha;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMenosM;
    private javax.swing.JButton btnMmas;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnSumaResta;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton jButton24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lbltablero;
    // End of variables declaration//GEN-END:variables

}
