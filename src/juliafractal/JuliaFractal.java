package juliafractal;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SpinnerNumberModel;

public class JuliaFractal extends javax.swing.JFrame {
    /**
     * Creates new form MandelbrotFractal
     */
    public JuliaFractal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfigPanel = new javax.swing.JPanel();
        jComboBoxColor = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonZoomM = new javax.swing.JButton();
        jButtonZoomP = new javax.swing.JButton();
        jSpinnerIterCount = new javax.swing.JSpinner();
        jSpinnerIterCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drawingPanel.setIterationsCount((Integer)jSpinnerIterCount.getValue());
                drawingPanel.drawJuliaFractal();
            }
        });
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerJuliaA = new javax.swing.JSpinner();
        jSpinnerJuliaA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drawingPanel.setJuliaA((Double)jSpinnerJuliaA.getValue());
                drawingPanel.drawJuliaFractal();
            }
        });
        jSpinnerJuliaB = new javax.swing.JSpinner();
        jSpinnerJuliaB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drawingPanel.setJuliaB((Double)jSpinnerJuliaB.getValue());
                drawingPanel.drawJuliaFractal();
            }
        });
        jLabel4 = new javax.swing.JLabel();
        drawingPanel = new juliafractal.DrawingPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Julia set");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);

        ConfigPanel.setBackground(new java.awt.Color(255, 255, 255));
        ConfigPanel.setPreferredSize(new java.awt.Dimension(446, 75));

        jComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jComboBoxColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxColorMouseClicked(evt);
            }
        });
        jComboBoxColor.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxColorPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxColorItemStateChanged(evt);
            }
        });
        jComboBoxColor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxColorPropertyChange(evt);
            }
        });

        jLabel1.setText("Color:");

        jButtonSave.setText("Save image");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonZoomM.setText("Zoom -");
        jButtonZoomM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonZoomMMouseClicked(evt);
            }
        });

        jButtonZoomP.setText("Zoom +");
        jButtonZoomP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonZoomPMouseClicked(evt);
            }
        });

        jSpinnerIterCount.setModel(new javax.swing.SpinnerNumberModel(200, 0, 2000, 1));
        jSpinnerIterCount.setName(""); // NOI18N
        jSpinnerIterCount.setRequestFocusEnabled(false);

        jLabel2.setText("Iteration count:");

        jLabel3.setText("a:");

        jSpinnerJuliaA.setModel(new SpinnerNumberModel(-0.4,-1,1,0.001));
        jSpinnerJuliaA.setName(""); // NOI18N
        jSpinnerJuliaA.setRequestFocusEnabled(false);

        jSpinnerJuliaB.setModel(new SpinnerNumberModel(0.6,-1 ,1,0.001));
        jSpinnerJuliaB.setName(""); // NOI18N
        jSpinnerJuliaB.setRequestFocusEnabled(false);

        jLabel4.setText("b:");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout ConfigPanelLayout = new javax.swing.GroupLayout(ConfigPanel);
        ConfigPanel.setLayout(ConfigPanelLayout);
        ConfigPanelLayout.setHorizontalGroup(
            ConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConfigPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerIterCount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConfigPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerJuliaA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(ConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConfigPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConfigPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerJuliaB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jButtonZoomM, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonZoomP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSave)
                .addContainerGap())
        );
        ConfigPanelLayout.setVerticalGroup(
            ConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonZoomP)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerIterCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonZoomM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinnerJuliaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerJuliaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(ConfigPanel, java.awt.BorderLayout.PAGE_END);

        drawingPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                drawingPanelMouseWheelMoved(evt);
            }
        });
        drawingPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                drawingPanelComponentResized(evt);
            }
        });

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        getContentPane().add(drawingPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawingPanelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_drawingPanelComponentResized
        drawingPanel.xmin=-2;
        drawingPanel.ymin=-1.2;
        drawingPanel.xmax=2;
        drawingPanel.ymax=1.8;
        drawingPanel.calcScale();
        drawingPanel.drawJuliaFractal();
    }//GEN-LAST:event_drawingPanelComponentResized

    private void drawingPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_drawingPanelMouseWheelMoved

    }//GEN-LAST:event_drawingPanelMouseWheelMoved

    private void jButtonZoomPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZoomPMouseClicked
        drawingPanel.ZoomIn(-1,-1);
        drawingPanel.drawJuliaFractal();
    }//GEN-LAST:event_jButtonZoomPMouseClicked

    private void jButtonZoomMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZoomMMouseClicked
        drawingPanel.ZoomOut(-1,-1);
        drawingPanel.drawJuliaFractal();
    }//GEN-LAST:event_jButtonZoomMMouseClicked

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        BufferedImage outImg = new BufferedImage(drawingPanel.getWidth(), drawingPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D gr = outImg.createGraphics();
        gr.drawImage(drawingPanel.buffer, 0,0,null);
        String wd = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(wd);
        File file = new File("image.bmp");
        int rc = fc.showDialog(null, "Save image");
        if (rc == JFileChooser.APPROVE_OPTION){
            file = fc.getSelectedFile();
            try{
                ImageIO.write(outImg, "BMP", file);
            }catch (IOException e) {

            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jComboBoxColorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxColorPropertyChange

    }//GEN-LAST:event_jComboBoxColorPropertyChange

    private void jComboBoxColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxColorItemStateChanged

    }//GEN-LAST:event_jComboBoxColorItemStateChanged

    private void jComboBoxColorPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxColorPopupMenuWillBecomeInvisible
        drawingPanel.setColor(jComboBoxColor.getSelectedIndex());
        drawingPanel.drawJuliaFractal();
    }//GEN-LAST:event_jComboBoxColorPopupMenuWillBecomeInvisible

    private void jComboBoxColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxColorMouseClicked

    }//GEN-LAST:event_jComboBoxColorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JuliaFractal frame = new JuliaFractal();
                URL url = this.getClass().getResource("icon.png");
                ImageIcon image = new ImageIcon(url);
                frame.setIconImage(image.getImage());
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                Dimension frameSize = frame.getSize();
                frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfigPanel;
    public juliafractal.DrawingPanel drawingPanel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonZoomM;
    private javax.swing.JButton jButtonZoomP;
    private javax.swing.JComboBox jComboBoxColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinnerIterCount;
    private javax.swing.JSpinner jSpinnerJuliaA;
    private javax.swing.JSpinner jSpinnerJuliaB;
    // End of variables declaration//GEN-END:variables
}