package ViewTuris;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }
    
    private void init() {
        listMenu1.addItem(new Model_Menu("", "Dashboard", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "History Booking", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "Search", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "Profile", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "Log Out", Model_Menu.MenuType.MENU));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listMenu1 = new ViewTuris.ListMenu<>();
        JPanelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu2 = new ViewTuris.ListMenu<>();
        jScrollPane2 = new javax.swing.JScrollPane();

        jScrollPane1.setViewportView(listMenu1);

        setBackground(new java.awt.Color(255, 255, 255));

        JPanelMoving.setForeground(new java.awt.Color(255, 255, 255));
        JPanelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("TravelTrax");

        javax.swing.GroupLayout JPanelMovingLayout = new javax.swing.GroupLayout(JPanelMoving);
        JPanelMoving.setLayout(JPanelMovingLayout);
        JPanelMovingLayout.setHorizontalGroup(
            JPanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMovingLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        JPanelMovingLayout.setVerticalGroup(
            JPanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelMovingLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        listMenu2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(7, Short.MAX_VALUE)
                    .addComponent(listMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(listMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    @Override
    protected void paintChildren(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() -20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    
    private int x;
    private int y;
    public void initMoving(JFrame fram){
        JPanelMoving.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                x = me.getX();
                y = me.getY();
            }
        });
        
        JPanelMoving.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent me){
                fram.setLocation(me.getXOnScreen()-x, me.getYOnScreen()-y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelMoving;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private ViewTuris.ListMenu<String> listMenu1;
    private ViewTuris.ListMenu<String> listMenu2;
    // End of variables declaration//GEN-END:variables
}
