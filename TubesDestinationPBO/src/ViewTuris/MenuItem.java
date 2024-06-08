package ViewTuris;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel {

    private boolean selected;
    
    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType().equals(Model_Menu.MenuType.MENU)) {
            jLabelIcon.setIcon(data.toIcon());
            jLabelName.setText(data.getName());
        } else if (data.getType() == Model_Menu.MenuType.TITLE) {
            jLabelIcon.setText(data.getName());
            jLabelIcon.setFont(new Font("century ghotic", 1, 12));
            jLabelName.setVisible(false);
        } else {
            jLabelName.setText(" ");
        }
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcon.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIcon.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelIcon.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 29, 36));

        jLabelName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Menu Name");
        add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 30));
    }// </editor-fold>//GEN-END:initComponents


    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelName;
    // End of variables declaration//GEN-END:variables
}
