/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

/**
 *
 * @author Cesar Maldonado
 */
public class Mesero extends javax.swing.JFrame {
    /**
     * Creates new form Mesero
     */
    public Mesero() {
        initComponents();
     this.jButton1.setVisible(false);
     this.jButton2.setVisible(false);
     this.jButton3.setVisible(false);
     this.jButton4.setVisible(false);
     this.jButton5.setVisible(false);
     this.btnensalada1.setVisible(false);
     this.btnensalada2.setVisible(false);
     this.btnensalada3.setVisible(false);
     this.btnensalada4.setVisible(false);
     this.btnensalada5.setVisible(false);
     this.btnentrada1.setVisible(false);
     this.btnentrada2.setVisible(false);
     this.btnentrada3.setVisible(false);
     this.btnentrada4.setVisible(false);
     this.btnentrada5.setVisible(false);
     this.btnplatos1.setVisible(false);
     this.btnplatos2.setVisible(false);
     this.btnplatos3.setVisible(false);
     this.btnplatos4.setVisible(false);
     this.btnplatos5.setVisible(false);
     this.btnpostre1.setVisible(false);
     this.btnpostre2.setVisible(false);
     this.btnpostre3.setVisible(false);
     this.btnpostre4.setVisible(false);
     this.btnpostre5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnbebida = new javax.swing.JButton();
        btnentrada = new javax.swing.JButton();
        btnplato = new javax.swing.JButton();
        btnensalada = new javax.swing.JButton();
        btnpostres = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnentrada5 = new javax.swing.JButton();
        btnentrada3 = new javax.swing.JButton();
        btnentrada4 = new javax.swing.JButton();
        btnentrada1 = new javax.swing.JButton();
        btnentrada2 = new javax.swing.JButton();
        btnensalada2 = new javax.swing.JButton();
        btnensalada3 = new javax.swing.JButton();
        btnensalada4 = new javax.swing.JButton();
        btnensalada5 = new javax.swing.JButton();
        btnensalada1 = new javax.swing.JButton();
        btnplatos1 = new javax.swing.JButton();
        btnplatos2 = new javax.swing.JButton();
        btnplatos3 = new javax.swing.JButton();
        btnplatos4 = new javax.swing.JButton();
        btnplatos5 = new javax.swing.JButton();
        btnpostre1 = new javax.swing.JButton();
        btnpostre2 = new javax.swing.JButton();
        btnpostre3 = new javax.swing.JButton();
        btnpostre4 = new javax.swing.JButton();
        btnpostre5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        btnenviar1 = new javax.swing.JButton();
        btnenviar2 = new javax.swing.JButton();
        btnenviar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbebida.setBackground(new java.awt.Color(255, 204, 102));
        btnbebida.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Downloads\\3558091-beverage-drink-juice-refreshment-soft_107822.png")); // NOI18N
        btnbebida.setText("BEBIDAS");
        btnbebida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbebidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnbebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        btnentrada.setBackground(new java.awt.Color(255, 204, 102));
        btnentrada.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Downloads\\nachos_mexican_food_food_appetizer_snack_icon_208010.png")); // NOI18N
        btnentrada.setText("ENTRADAS");
        btnentrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 170, -1));

        btnplato.setBackground(new java.awt.Color(255, 204, 102));
        btnplato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Downloads\\32395greensalad_98843 (1).png")); // NOI18N
        btnplato.setText("ENSALADA");
        btnplato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnplato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplatoActionPerformed(evt);
            }
        });
        getContentPane().add(btnplato, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, -1));

        btnensalada.setBackground(new java.awt.Color(255, 204, 102));
        btnensalada.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Downloads\\Cake_ChocolateCake_26374 (1).png")); // NOI18N
        btnensalada.setText("POSTRES");
        btnensalada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnensalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnensaladaActionPerformed(evt);
            }
        });
        getContentPane().add(btnensalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 170, -1));

        btnpostres.setBackground(new java.awt.Color(255, 204, 102));
        btnpostres.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Downloads\\Dish_Pasta_Spaghetti_26373 (1).png")); // NOI18N
        btnpostres.setText("PLATOS");
        btnpostres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostresActionPerformed(evt);
            }
        });
        getContentPane().add(btnpostres, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 170, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\mirinda.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\sprite.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 100, -1));

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\seven.png")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, -1));

        jButton4.setBackground(new java.awt.Color(153, 255, 204));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\pepsi.png")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, -1));

        jButton5.setBackground(new java.awt.Color(153, 255, 204));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\cola.png")); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 80));

        btnentrada5.setBackground(new java.awt.Color(153, 255, 204));
        btnentrada5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\ENTRADA\\CANAPES DE POLLO.jpg")); // NOI18N
        btnentrada5.setText("CANAPES DE POLLO");
        btnentrada5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnentrada5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 270, -1));

        btnentrada3.setBackground(new java.awt.Color(153, 255, 204));
        btnentrada3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\ENTRADA\\CEVICHE CREMOSO.jpg")); // NOI18N
        btnentrada3.setText("CEVICHE CREMOSO");
        btnentrada3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnentrada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 270, -1));

        btnentrada4.setBackground(new java.awt.Color(153, 255, 204));
        btnentrada4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\ENTRADA\\EMPANADAS SALTEÑAS.jpg")); // NOI18N
        btnentrada4.setText("EMPANADAS SALTEÑAS");
        btnentrada4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnentrada4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrada4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 270, -1));

        btnentrada1.setBackground(new java.awt.Color(153, 255, 204));
        btnentrada1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\ENTRADA\\CAUSA LIMEÑA.jpg")); // NOI18N
        btnentrada1.setText("CAUSA LIMEÑA");
        btnentrada1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnentrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrada1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 280, -1));

        btnentrada2.setBackground(new java.awt.Color(153, 255, 204));
        btnentrada2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\Imagen1.jpg")); // NOI18N
        btnentrada2.setText("NACHOS QUESO");
        btnentrada2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnentrada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrada2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 280, 80));

        btnensalada2.setBackground(new java.awt.Color(153, 255, 204));
        btnensalada2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\ENSALADAS\\ENSALADA CESAR.jpg")); // NOI18N
        btnensalada2.setText("ENSALADA CESAR");
        btnensalada2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnensalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 270, -1));

        btnensalada3.setBackground(new java.awt.Color(153, 255, 204));
        btnensalada3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\ENSALADAS\\ENSALADA DE COL.jpg")); // NOI18N
        btnensalada3.setText("ENSALADA COL");
        btnensalada3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnensalada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnensalada3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnensalada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, 80));

        btnensalada4.setBackground(new java.awt.Color(153, 255, 204));
        btnensalada4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\ENSALADAS\\ENSALADA GRIEGA.jpg")); // NOI18N
        btnensalada4.setText("ENSALADA GRIEGA");
        btnensalada4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnensalada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 270, -1));

        btnensalada5.setBackground(new java.awt.Color(153, 255, 204));
        btnensalada5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\ENSALADAS\\ENSALADA WALDORF.jpg")); // NOI18N
        btnensalada5.setText("ENSALADA WALDORF");
        btnensalada5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnensalada5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 270, -1));

        btnensalada1.setBackground(new java.awt.Color(153, 255, 204));
        btnensalada1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\Imagen5.jpg")); // NOI18N
        btnensalada1.setText("ENSALADA CAPRESE");
        btnensalada1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnensalada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 270, 80));

        btnplatos1.setBackground(new java.awt.Color(153, 255, 204));
        btnplatos1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\PLATO FUERTE\\RES AL VINO TINTO.jpg")); // NOI18N
        btnplatos1.setText("           RES AL VINO TINTO");
        btnplatos1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnplatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplatos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnplatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 290, -1));

        btnplatos2.setBackground(new java.awt.Color(153, 255, 204));
        btnplatos2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\PLATO FUERTE\\POLLO A LA PARMESANA.jpeg.jpg")); // NOI18N
        btnplatos2.setText("POLLO A LA PARMESANA");
        btnplatos2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnplatos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplatos2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnplatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 290, -1));

        btnplatos3.setBackground(new java.awt.Color(153, 255, 204));
        btnplatos3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\PLATO FUERTE\\PENNE AL VODKA.jpg")); // NOI18N
        btnplatos3.setText("         PASTA AL VODKA            ");
        btnplatos3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnplatos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplatos3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnplatos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 290, -1));

        btnplatos4.setBackground(new java.awt.Color(153, 255, 204));
        btnplatos4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\PLATO FUERTE\\filete.png")); // NOI18N
        btnplatos4.setText("         FILETE DE PESACADO");
        btnplatos4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnplatos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 290, 80));

        btnplatos5.setBackground(new java.awt.Color(153, 255, 204));
        btnplatos5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\PLATO FUERTE\\ARROZ CON CAMARONES.jpg")); // NOI18N
        btnplatos5.setText("ARROZ CON CAMARONES");
        btnplatos5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnplatos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplatos5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnplatos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        btnpostre1.setBackground(new java.awt.Color(153, 255, 204));
        btnpostre1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\POSTRES\\SOUFFLE DE MANGO Y COCO.jpg")); // NOI18N
        btnpostre1.setText("SOUFFLE DE MANGO");
        btnpostre1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpostre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostre1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnpostre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 290, -1));

        btnpostre2.setBackground(new java.awt.Color(153, 255, 204));
        btnpostre2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\POSTRES\\PIE DE LIMÓN CON MERENGUE.png")); // NOI18N
        btnpostre2.setText("           PIE DE LIMÓN");
        btnpostre2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpostre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostre2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnpostre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 290, 80));

        btnpostre3.setBackground(new java.awt.Color(153, 255, 204));
        btnpostre3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\POSTRES\\PASTEL VEGANO DE CHOCOLATE.jpg.png")); // NOI18N
        btnpostre3.setText("       PASTEL VEGANO");
        btnpostre3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnpostre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 290, -1));

        btnpostre4.setBackground(new java.awt.Color(153, 255, 204));
        btnpostre4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\POSTRES\\PASTEL DE ZANAHORIA.jpg")); // NOI18N
        btnpostre4.setText("PASTEL DE ZANAHORIA");
        btnpostre4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnpostre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 290, -1));

        btnpostre5.setBackground(new java.awt.Color(153, 255, 204));
        btnpostre5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Desktop\\PROYECTO-RESTAURANTE\\POSTRES\\helado choco.png")); // NOI18N
        btnpostre5.setText("HELADO DE CHOCOLATE");
        btnpostre5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnpostre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 290, 80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Producto", "Producto", "Precio", "Inventario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 390, 160));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CANTIDAD DE PRODUCTO");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, -1, 20));

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 250, 20));

        btnnuevo.setText("NUEVO PEDIDO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 440, 130, -1));

        btnenviar1.setText("ELIMINAR PEDIDO");
        btnenviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnenviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 490, 130, -1));

        btnenviar2.setText("EDITAR PEDIDO");
        btnenviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnenviar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 440, 130, -1));

        btnenviar3.setText("ENVIAR PEDIDO");
        btnenviar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnenviar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnplatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplatoActionPerformed
this.btnensalada1.setVisible(true);
     this.btnensalada2.setVisible(true);
     this.btnensalada3.setVisible(true);
     this.btnensalada4.setVisible(true);
     this.btnensalada5.setVisible(true); 
          this.jButton1.setVisible(false);
     this.jButton2.setVisible(false);
     this.jButton3.setVisible(false);
     this.jButton4.setVisible(false);
     this.jButton5.setVisible(false);
     this.btnentrada1.setVisible(false);
     this.btnentrada2.setVisible(false);
     this.btnentrada3.setVisible(false);
     this.btnentrada4.setVisible(false);
     this.btnentrada5.setVisible(false);
     this.btnplatos1.setVisible(false);
     this.btnplatos2.setVisible(false);
     this.btnplatos3.setVisible(false);
     this.btnplatos4.setVisible(false);
     this.btnplatos5.setVisible(false);
     this.btnpostre1.setVisible(false);
     this.btnpostre2.setVisible(false);
     this.btnpostre3.setVisible(false);
     this.btnpostre4.setVisible(false);
     this.btnpostre5.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnplatoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnentrada4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrada4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnentrada4ActionPerformed

    private void btnentrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnentrada1ActionPerformed

    private void btnentrada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrada2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnentrada2ActionPerformed

    private void btnensalada3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnensalada3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnensalada3ActionPerformed

    private void btnplatos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplatos5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplatos5ActionPerformed

    private void btnplatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplatos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplatos1ActionPerformed

    private void btnplatos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplatos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplatos3ActionPerformed

    private void btnpostre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpostre1ActionPerformed

    private void btnpostre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpostre2ActionPerformed

    private void btnbebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbebidaActionPerformed
 this.jButton1.setVisible(true);
     this.jButton2.setVisible(true);
     this.jButton3.setVisible(true);
     this.jButton4.setVisible(true);
     this.jButton5.setVisible(true); 
     this.btnensalada1.setVisible(false);
     this.btnensalada2.setVisible(false);
     this.btnensalada3.setVisible(false);
     this.btnensalada4.setVisible(false);
     this.btnensalada5.setVisible(false);
     this.btnentrada1.setVisible(false);
     this.btnentrada2.setVisible(false);
     this.btnentrada3.setVisible(false);
     this.btnentrada4.setVisible(false);
     this.btnentrada5.setVisible(false);
     this.btnplatos1.setVisible(false);
     this.btnplatos2.setVisible(false);
     this.btnplatos3.setVisible(false);
     this.btnplatos4.setVisible(false);
     this.btnplatos5.setVisible(false);
     this.btnpostre1.setVisible(false);
     this.btnpostre2.setVisible(false);
     this.btnpostre3.setVisible(false);
     this.btnpostre4.setVisible(false);
     this.btnpostre5.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnbebidaActionPerformed

    private void btnentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentradaActionPerformed
this.btnentrada1.setVisible(true);
     this.btnentrada2.setVisible(true);
     this.btnentrada3.setVisible(true);
     this.btnentrada4.setVisible(true);
     this.btnentrada5.setVisible(true);
          this.jButton1.setVisible(false);
     this.jButton2.setVisible(false);
     this.jButton3.setVisible(false);
     this.jButton4.setVisible(false);
     this.jButton5.setVisible(false);
     this.btnensalada1.setVisible(false);
     this.btnensalada2.setVisible(false);
     this.btnensalada3.setVisible(false);
     this.btnensalada4.setVisible(false);
     this.btnensalada5.setVisible(false);
     this.btnplatos1.setVisible(false);
     this.btnplatos2.setVisible(false);
     this.btnplatos3.setVisible(false);
     this.btnplatos4.setVisible(false);
     this.btnplatos5.setVisible(false);
     this.btnpostre1.setVisible(false);
     this.btnpostre2.setVisible(false);
     this.btnpostre3.setVisible(false);
     this.btnpostre4.setVisible(false);
     this.btnpostre5.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnentradaActionPerformed

    private void btnpostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostresActionPerformed
this.btnplatos1.setVisible(true);
     this.btnplatos2.setVisible(true);
     this.btnplatos3.setVisible(true);
     this.btnplatos4.setVisible(true);
     this.btnplatos5.setVisible(true); 
          this.jButton1.setVisible(false);
     this.jButton2.setVisible(false);
     this.jButton3.setVisible(false);
     this.jButton4.setVisible(false);
     this.jButton5.setVisible(false);
     this.btnensalada1.setVisible(false);
     this.btnensalada2.setVisible(false);
     this.btnensalada3.setVisible(false);
     this.btnensalada4.setVisible(false);
     this.btnensalada5.setVisible(false);
     this.btnentrada1.setVisible(false);
     this.btnentrada2.setVisible(false);
     this.btnentrada3.setVisible(false);
     this.btnentrada4.setVisible(false);
     this.btnentrada5.setVisible(false);
     this.btnpostre1.setVisible(false);
     this.btnpostre2.setVisible(false);
     this.btnpostre3.setVisible(false);
     this.btnpostre4.setVisible(false);
     this.btnpostre5.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnpostresActionPerformed

    private void btnensaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnensaladaActionPerformed
this.btnpostre1.setVisible(true);
     this.btnpostre2.setVisible(true);
     this.btnpostre3.setVisible(true);
     this.btnpostre4.setVisible(true);
     this.btnpostre5.setVisible(true); 
          this.jButton1.setVisible(false);
     this.jButton2.setVisible(false);
     this.jButton3.setVisible(false);
     this.jButton4.setVisible(false);
     this.jButton5.setVisible(false);
     this.btnensalada1.setVisible(false);
     this.btnensalada2.setVisible(false);
     this.btnensalada3.setVisible(false);
     this.btnensalada4.setVisible(false);
     this.btnensalada5.setVisible(false);
     this.btnentrada1.setVisible(false);
     this.btnentrada2.setVisible(false);
     this.btnentrada3.setVisible(false);
     this.btnentrada4.setVisible(false);
     this.btnentrada5.setVisible(false);
     this.btnplatos1.setVisible(false);
     this.btnplatos2.setVisible(false);
     this.btnplatos3.setVisible(false);
     this.btnplatos4.setVisible(false);
     this.btnplatos5.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnensaladaActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnenviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnenviar1ActionPerformed

    private void btnenviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnenviar2ActionPerformed

    private void btnenviar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnenviar3ActionPerformed

    private void btnplatos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplatos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplatos2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbebida;
    private javax.swing.JButton btnensalada;
    private javax.swing.JButton btnensalada1;
    private javax.swing.JButton btnensalada2;
    private javax.swing.JButton btnensalada3;
    private javax.swing.JButton btnensalada4;
    private javax.swing.JButton btnensalada5;
    private javax.swing.JButton btnentrada;
    private javax.swing.JButton btnentrada1;
    private javax.swing.JButton btnentrada2;
    private javax.swing.JButton btnentrada3;
    private javax.swing.JButton btnentrada4;
    private javax.swing.JButton btnentrada5;
    private javax.swing.JButton btnenviar1;
    private javax.swing.JButton btnenviar2;
    private javax.swing.JButton btnenviar3;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnplato;
    private javax.swing.JButton btnplatos1;
    private javax.swing.JButton btnplatos2;
    private javax.swing.JButton btnplatos3;
    private javax.swing.JButton btnplatos4;
    private javax.swing.JButton btnplatos5;
    private javax.swing.JButton btnpostre1;
    private javax.swing.JButton btnpostre2;
    private javax.swing.JButton btnpostre3;
    private javax.swing.JButton btnpostre4;
    private javax.swing.JButton btnpostre5;
    private javax.swing.JButton btnpostres;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
