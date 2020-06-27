/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPianos;
import sun.audio.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author Chathura
 */
public class VirtualPiano extends javax.swing.JFrame {

    /**
     * Creates new form VirtualPiano
     */
    public VirtualPiano() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbCs = new javax.swing.JButton();
        jchkMusic = new javax.swing.JCheckBox();
        jchkSteel = new javax.swing.JCheckBox();
        jbF1 = new javax.swing.JButton();
        jbDs = new javax.swing.JButton();
        jbE = new javax.swing.JButton();
        jbD = new javax.swing.JButton();
        jbGs = new javax.swing.JButton();
        jbFs = new javax.swing.JButton();
        jbG = new javax.swing.JButton();
        jbF = new javax.swing.JButton();
        jbBb = new javax.swing.JButton();
        jbB = new javax.swing.JButton();
        jbA = new javax.swing.JButton();
        jbDs1 = new javax.swing.JButton();
        jbE1 = new javax.swing.JButton();
        jbCs1 = new javax.swing.JButton();
        jbD1 = new javax.swing.JButton();
        jbC1 = new javax.swing.JButton();
        jbC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(958, 601));
        setMinimumSize(new java.awt.Dimension(958, 601));
        setPreferredSize(new java.awt.Dimension(958, 601));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Virtual Piano");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 10, 630, 90);

        jbCs.setBackground(java.awt.Color.black);
        jbCs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbCs.setForeground(java.awt.Color.white);
        jbCs.setText("C#");
        jbCs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbCs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCsActionPerformed(evt);
            }
        });
        jPanel1.add(jbCs);
        jbCs.setBounds(70, 160, 80, 190);

        jchkMusic.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jchkMusic);
        jchkMusic.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jchkMusic.setForeground(java.awt.Color.white);
        jchkMusic.setText("Music Notes");
        jPanel1.add(jchkMusic);
        jchkMusic.setBounds(10, 110, 290, 40);

        jchkSteel.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jchkSteel);
        jchkSteel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jchkSteel.setForeground(java.awt.Color.white);
        jchkSteel.setText(" Steel Drum");
        jPanel1.add(jchkSteel);
        jchkSteel.setBounds(660, 110, 250, 40);

        jbF1.setBackground(java.awt.Color.white);
        jbF1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbF1.setText("C1");
        jbF1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbF1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbF1);
        jbF1.setBounds(840, 160, 70, 370);

        jbDs.setBackground(new java.awt.Color(0, 0, 0));
        jbDs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbDs.setForeground(new java.awt.Color(255, 255, 255));
        jbDs.setText("D#");
        jbDs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbDs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDsActionPerformed(evt);
            }
        });
        jPanel1.add(jbDs);
        jbDs.setBounds(160, 160, 80, 190);

        jbE.setBackground(java.awt.Color.white);
        jbE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbE.setText("E");
        jbE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEActionPerformed(evt);
            }
        });
        jPanel1.add(jbE);
        jbE.setBounds(200, 160, 70, 370);

        jbD.setBackground(java.awt.Color.white);
        jbD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbD.setText("D");
        jbD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDActionPerformed(evt);
            }
        });
        jPanel1.add(jbD);
        jbD.setBounds(120, 160, 70, 370);

        jbGs.setBackground(new java.awt.Color(0, 0, 0));
        jbGs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbGs.setForeground(new java.awt.Color(255, 255, 255));
        jbGs.setText("G#");
        jbGs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbGs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGsActionPerformed(evt);
            }
        });
        jPanel1.add(jbGs);
        jbGs.setBounds(400, 160, 80, 190);

        jbFs.setBackground(java.awt.Color.black);
        jbFs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbFs.setForeground(java.awt.Color.white);
        jbFs.setText("F#");
        jbFs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbFs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFsActionPerformed(evt);
            }
        });
        jPanel1.add(jbFs);
        jbFs.setBounds(310, 160, 80, 190);

        jbG.setBackground(java.awt.Color.white);
        jbG.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbG.setText("G");
        jbG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGActionPerformed(evt);
            }
        });
        jPanel1.add(jbG);
        jbG.setBounds(360, 160, 70, 370);

        jbF.setBackground(java.awt.Color.white);
        jbF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbF.setText("F");
        jbF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFActionPerformed(evt);
            }
        });
        jPanel1.add(jbF);
        jbF.setBounds(280, 160, 70, 370);

        jbBb.setBackground(new java.awt.Color(0, 0, 0));
        jbBb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbBb.setForeground(new java.awt.Color(255, 255, 255));
        jbBb.setText("Bb");
        jbBb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbBb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBbActionPerformed(evt);
            }
        });
        jPanel1.add(jbBb);
        jbBb.setBounds(480, 160, 63, 190);

        jbB.setBackground(java.awt.Color.white);
        jbB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbB.setText("B");
        jbB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBActionPerformed(evt);
            }
        });
        jPanel1.add(jbB);
        jbB.setBounds(520, 160, 70, 370);

        jbA.setBackground(java.awt.Color.white);
        jbA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbA.setText("A");
        jbA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAActionPerformed(evt);
            }
        });
        jPanel1.add(jbA);
        jbA.setBounds(440, 160, 70, 370);

        jbDs1.setBackground(new java.awt.Color(0, 0, 0));
        jbDs1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbDs1.setForeground(new java.awt.Color(255, 255, 255));
        jbDs1.setText("D#1");
        jbDs1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbDs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDs1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbDs1);
        jbDs1.setBounds(720, 160, 90, 190);

        jbE1.setBackground(java.awt.Color.white);
        jbE1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbE1.setText("E1");
        jbE1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbE1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbE1);
        jbE1.setBounds(760, 160, 70, 370);

        jbCs1.setBackground(java.awt.Color.black);
        jbCs1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbCs1.setForeground(java.awt.Color.white);
        jbCs1.setText("C#1");
        jbCs1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbCs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCs1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbCs1);
        jbCs1.setBounds(620, 160, 90, 190);

        jbD1.setBackground(java.awt.Color.white);
        jbD1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbD1.setText("D1");
        jbD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbD1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbD1);
        jbD1.setBounds(680, 160, 70, 370);

        jbC1.setBackground(java.awt.Color.white);
        jbC1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbC1.setText("C1");
        jbC1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbC1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbC1);
        jbC1.setBounds(600, 160, 70, 370);

        jbC.setBackground(java.awt.Color.white);
        jbC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbC.setText("C");
        jbC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCActionPerformed(evt);
            }
        });
        jPanel1.add(jbC);
        jbC.setBounds(40, 160, 70, 370);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 940, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\E.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\E_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbEActionPerformed

    private void jbF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbF1ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\C1.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\C1_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbF1ActionPerformed

    private void jbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDActionPerformed
        // TODO add your handling code here:
          InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\D.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\D_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbDActionPerformed

    private void jbGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\G.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\G_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbGActionPerformed

    private void jbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\F.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\F_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbFActionPerformed

    private void jbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\B.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\B_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbBActionPerformed

    private void jbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\A.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\A_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbAActionPerformed

    private void jbE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbE1ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\E1.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\E1_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbE1ActionPerformed

    private void jbD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbD1ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\D1.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\D1_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbD1ActionPerformed

    private void jbC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbC1ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\C1.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\C1_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }//GEN-LAST:event_jbC1ActionPerformed

    private void jbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCActionPerformed
        // TODO add your handling code here:
         InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\C.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\C_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbCActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.black);
    }//GEN-LAST:event_formWindowActivated

    private void jbDs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDs1ActionPerformed
        // TODO add your handling code here:
          InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\D_s1.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\Dq1_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbDs1ActionPerformed

    private void jbCsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCsActionPerformed
        // TODO add your handling code here:
         InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\C_s.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\Cq_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbCsActionPerformed

    private void jbCs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCs1ActionPerformed
        // TODO add your handling code here:
         InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\C_s1.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\Cq1_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbCs1ActionPerformed

    private void jbBbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBbActionPerformed
        // TODO add your handling code here:
         InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\Bb.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\Bb_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbBbActionPerformed

    private void jbGsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGsActionPerformed
        // TODO add your handling code here:
         InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\G_s.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\Gq_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbGsActionPerformed

    private void jbFsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFsActionPerformed
        // TODO add your handling code here:
         InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\F_s.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\Fq_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbFsActionPerformed

    private void jbDsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDsActionPerformed
        // TODO add your handling code here:
         InputStream iAudio;
        
        if (jchkMusic.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\D_s.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        if (jchkSteel.isSelected())
        {
        try{
        iAudio = new FileInputStream(new File ("C:\\Users\\Chathura\\Documents\\NetBeansProjects\\ Virtual_Piano_Keys\\Music_Note\\Dq_Drum.wav"));
        AudioStream iMusic = new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbDsActionPerformed

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
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VirtualPiano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbA;
    private javax.swing.JButton jbB;
    private javax.swing.JButton jbBb;
    private javax.swing.JButton jbC;
    private javax.swing.JButton jbC1;
    private javax.swing.JButton jbCs;
    private javax.swing.JButton jbCs1;
    private javax.swing.JButton jbD;
    private javax.swing.JButton jbD1;
    private javax.swing.JButton jbDs;
    private javax.swing.JButton jbDs1;
    private javax.swing.JButton jbE;
    private javax.swing.JButton jbE1;
    private javax.swing.JButton jbF;
    private javax.swing.JButton jbF1;
    private javax.swing.JButton jbFs;
    private javax.swing.JButton jbG;
    private javax.swing.JButton jbGs;
    private javax.swing.JCheckBox jchkMusic;
    private javax.swing.JCheckBox jchkSteel;
    // End of variables declaration//GEN-END:variables
}
