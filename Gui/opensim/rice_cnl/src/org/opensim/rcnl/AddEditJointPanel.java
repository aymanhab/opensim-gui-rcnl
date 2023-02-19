/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.rcnl;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import org.openide.util.Exceptions;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.Joint;
import org.opensim.modeling.JointList;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PropertyBoolList;
import org.opensim.modeling.PropertyDoubleList;
import org.opensim.modeling.PropertyHelper;
import org.opensim.modeling.PropertyObjectList;
import org.opensim.view.pub.OpenSimDB;

/**
 *
 * @author Ayman-NMBL
 */
public class AddEditJointPanel extends javax.swing.JPanel {

    OpenSimObject jmpTask;
    ComboBoxModel<String> cbm;
    OpenSimObject frameTransformationParent;
    OpenSimObject frameTransformationChild;
    PropertyDoubleList pTrBounds, pOrientBounds, chTrBounds, chOrientBounds;
    PropertyBoolList pTrFlags, pOrFlags, chTrFlags, chOrFlags;
    private NumberFormat numFormat = NumberFormat.getInstance();
    private Vector<OpenSimObject> savedTasks = new Vector<OpenSimObject>();
    private boolean initializing = true;
    /**
     * Creates new form AddEditJointPanel
     */
    public AddEditJointPanel(OpenSimObject jmpTask) {
        this.jmpTask = jmpTask;
        cbm = new JointListModel(OpenSimDB.getInstance().getCurrentModel());
        initComponents();
        jComboBoxJoints.setModel(cbm);

        AbstractProperty parentXform = jmpTask.getPropertyByName("parent_frame_transformation");
        frameTransformationParent = PropertyObjectList.getAs(parentXform).getValue();
        AbstractProperty parentTransBoundsProp = frameTransformationParent.getPropertyByName("translation_bounds");
        pTrBounds = PropertyDoubleList.getAs(parentTransBoundsProp);
        AbstractProperty parentOrientBoundsProp = frameTransformationParent.getPropertyByName("orientation_bounds");
        pOrientBounds = PropertyDoubleList.getAs(parentOrientBoundsProp);
        
        AbstractProperty parentTransFlagsProp = frameTransformationParent.getPropertyByName("translation");
        pTrFlags = PropertyBoolList.getAs(parentTransFlagsProp);
        AbstractProperty parentOrientFlagsProp = frameTransformationParent.getPropertyByName("orientation");
        pOrFlags = PropertyBoolList.getAs(parentOrientFlagsProp);
        
        AbstractProperty childXform = jmpTask.getPropertyByName("child_frame_transformation");
        frameTransformationChild = PropertyObjectList.getAs(childXform).getValue();
        AbstractProperty chTransBoundsProp = frameTransformationChild.getPropertyByName("translation_bounds");
        chTrBounds = PropertyDoubleList.getAs(chTransBoundsProp);
        AbstractProperty childOrientBoundsProp = frameTransformationChild.getPropertyByName("orientation_bounds");
        chOrientBounds = PropertyDoubleList.getAs(childOrientBoundsProp);
        
        AbstractProperty childTransFlagsProp = frameTransformationChild.getPropertyByName("translation");
        chTrFlags = PropertyBoolList.getAs(childTransFlagsProp);
        AbstractProperty childOrientFlagsProp = frameTransformationChild.getPropertyByName("orientation");
        chOrFlags = PropertyBoolList.getAs(childOrientFlagsProp);
        populateUiFromObject();
        initializing = false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxJoints = new javax.swing.JComboBox<>();
        jParentFramePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxTx = new javax.swing.JCheckBox();
        jCheckBoxTy = new javax.swing.JCheckBox();
        jCheckBoxTz = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTBoundsParent = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBoxRx = new javax.swing.JCheckBox();
        jCheckBoxRy = new javax.swing.JCheckBox();
        jCheckBoxRz = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRBoundsParent = new javax.swing.JTextField();
        jChildFramePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxChTx = new javax.swing.JCheckBox();
        jCheckBoxChTy = new javax.swing.JCheckBox();
        jCheckBoxChTz = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTBoundsChild = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBoxChRx = new javax.swing.JCheckBox();
        jCheckBoxChRy = new javax.swing.JCheckBox();
        jCheckBoxChRz = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldRBoundsChild = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.border.title"), javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION)); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel1.text")); // NOI18N

        jComboBoxJoints.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hip_r", "knee_r", "hip_l", "knee_l" }));
        jComboBoxJoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJointsActionPerformed(evt);
            }
        });

        jParentFramePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jParentFramePanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxTx, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxTx.text")); // NOI18N
        jCheckBoxTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTxActionPerformed(evt);
            }
        });
        jCheckBoxTx.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCheckBoxTxPropertyChange(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxTy, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxTy.text")); // NOI18N
        jCheckBoxTy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTyActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxTz, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxTz.text")); // NOI18N
        jCheckBoxTz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTzActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel3.text")); // NOI18N

        jTextFieldTBoundsParent.setText(org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jTextFieldTBoundsParent.text")); // NOI18N
        jTextFieldTBoundsParent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTBoundsParentFocusLost(evt);
            }
        });
        jTextFieldTBoundsParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTBoundsParentActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxRx, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxRx.text")); // NOI18N
        jCheckBoxRx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxRy, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxRy.text")); // NOI18N
        jCheckBoxRy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRyActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxRz, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxRz.text")); // NOI18N
        jCheckBoxRz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRzActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel5.text")); // NOI18N

        jTextFieldRBoundsParent.setText(org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jTextFieldRBoundsParent.text")); // NOI18N
        jTextFieldRBoundsParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRBoundsParentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jParentFramePanelLayout = new javax.swing.GroupLayout(jParentFramePanel);
        jParentFramePanel.setLayout(jParentFramePanelLayout);
        jParentFramePanelLayout.setHorizontalGroup(
            jParentFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jParentFramePanelLayout.createSequentialGroup()
                .addGroup(jParentFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jParentFramePanelLayout.createSequentialGroup()
                .addGroup(jParentFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jParentFramePanelLayout.createSequentialGroup()
                        .addComponent(jCheckBoxRx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxRy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxRz))
                    .addGroup(jParentFramePanelLayout.createSequentialGroup()
                        .addComponent(jCheckBoxTx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxTy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxTz)))
                .addGap(38, 38, 38)
                .addGroup(jParentFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jParentFramePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRBoundsParent))
                    .addGroup(jParentFramePanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTBoundsParent)))
                .addGap(6, 6, 6))
        );
        jParentFramePanelLayout.setVerticalGroup(
            jParentFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jParentFramePanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jParentFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxTx)
                    .addComponent(jCheckBoxTy)
                    .addComponent(jCheckBoxTz)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTBoundsParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGroup(jParentFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jParentFramePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxRx))
                    .addGroup(jParentFramePanelLayout.createSequentialGroup()
                        .addGroup(jParentFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxRy)
                            .addComponent(jCheckBoxRz)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldRBoundsParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jChildFramePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jChildFramePanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxChTx, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxChTx.text")); // NOI18N
        jCheckBoxChTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxChTxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxChTy, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxChTy.text")); // NOI18N
        jCheckBoxChTy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxChTyActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxChTz, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxChTz.text")); // NOI18N
        jCheckBoxChTz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxChTzActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel7.text")); // NOI18N

        jTextFieldTBoundsChild.setText(org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jTextFieldTBoundsChild.text")); // NOI18N
        jTextFieldTBoundsChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTBoundsChildActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel8.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxChRx, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxChRx.text")); // NOI18N
        jCheckBoxChRx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxChRxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxChRy, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxChRy.text")); // NOI18N
        jCheckBoxChRy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxChRyActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxChRz, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jCheckBoxChRz.text")); // NOI18N
        jCheckBoxChRz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxChRzActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jLabel9.text")); // NOI18N

        jTextFieldRBoundsChild.setText(org.openide.util.NbBundle.getMessage(AddEditJointPanel.class, "AddEditJointPanel.jTextFieldRBoundsChild.text")); // NOI18N
        jTextFieldRBoundsChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRBoundsChildActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jChildFramePanelLayout = new javax.swing.GroupLayout(jChildFramePanel);
        jChildFramePanel.setLayout(jChildFramePanelLayout);
        jChildFramePanelLayout.setHorizontalGroup(
            jChildFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jChildFramePanelLayout.createSequentialGroup()
                .addGroup(jChildFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addGroup(jChildFramePanelLayout.createSequentialGroup()
                        .addGroup(jChildFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jChildFramePanelLayout.createSequentialGroup()
                                .addComponent(jCheckBoxChRx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxChRy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxChRz))
                            .addGroup(jChildFramePanelLayout.createSequentialGroup()
                                .addComponent(jCheckBoxChTx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxChTy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxChTz)))
                        .addGap(38, 38, 38)
                        .addGroup(jChildFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jChildFramePanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRBoundsChild))
                            .addGroup(jChildFramePanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTBoundsChild)))))
                .addGap(0, 0, 0))
        );
        jChildFramePanelLayout.setVerticalGroup(
            jChildFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jChildFramePanelLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jChildFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxChTx)
                    .addComponent(jCheckBoxChTy)
                    .addComponent(jCheckBoxChTz)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldTBoundsChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGroup(jChildFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jChildFramePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxChRx))
                    .addGroup(jChildFramePanelLayout.createSequentialGroup()
                        .addGroup(jChildFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxChRy)
                            .addComponent(jCheckBoxChRz)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldRBoundsChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxJoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jParentFramePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jChildFramePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxJoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jParentFramePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jChildFramePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxJointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJointsActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jComboBoxJointsActionPerformed

    private void jTextFieldRBoundsChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRBoundsChildActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jTextFieldRBoundsChildActionPerformed

    private void jCheckBoxChRzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxChRzActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxChRzActionPerformed

    private void jCheckBoxChRyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxChRyActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxChRyActionPerformed

    private void jCheckBoxChRxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxChRxActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxChRxActionPerformed

    private void jTextFieldTBoundsChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTBoundsChildActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jTextFieldTBoundsChildActionPerformed

    private void jCheckBoxChTzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxChTzActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxChTzActionPerformed

    private void jCheckBoxChTyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxChTyActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxChTyActionPerformed

    private void jCheckBoxChTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxChTxActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxChTxActionPerformed

    private void jTextFieldRBoundsParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRBoundsParentActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jTextFieldRBoundsParentActionPerformed

    private void jCheckBoxRzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRzActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxRzActionPerformed

    private void jCheckBoxRyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRyActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxRyActionPerformed

    private void jCheckBoxRxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRxActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxRxActionPerformed

    private void jTextFieldTBoundsParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTBoundsParentActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jTextFieldTBoundsParentActionPerformed

    private void jTextFieldTBoundsParentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTBoundsParentFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTBoundsParentFocusLost

    private void jCheckBoxTzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTzActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxTzActionPerformed

    private void jCheckBoxTyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTyActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxTyActionPerformed

    private void jCheckBoxTxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCheckBoxTxPropertyChange
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxTxPropertyChange

    private void jCheckBoxTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTxActionPerformed
        // TODO add your handling code here:
        updateTask();
    }//GEN-LAST:event_jCheckBoxTxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxChRx;
    private javax.swing.JCheckBox jCheckBoxChRy;
    private javax.swing.JCheckBox jCheckBoxChRz;
    private javax.swing.JCheckBox jCheckBoxChTx;
    private javax.swing.JCheckBox jCheckBoxChTy;
    private javax.swing.JCheckBox jCheckBoxChTz;
    private javax.swing.JCheckBox jCheckBoxRx;
    private javax.swing.JCheckBox jCheckBoxRy;
    private javax.swing.JCheckBox jCheckBoxRz;
    private javax.swing.JCheckBox jCheckBoxTx;
    private javax.swing.JCheckBox jCheckBoxTy;
    private javax.swing.JCheckBox jCheckBoxTz;
    private javax.swing.JPanel jChildFramePanel;
    private javax.swing.JComboBox<String> jComboBoxJoints;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jParentFramePanel;
    private javax.swing.JTextField jTextFieldRBoundsChild;
    private javax.swing.JTextField jTextFieldRBoundsParent;
    private javax.swing.JTextField jTextFieldTBoundsChild;
    private javax.swing.JTextField jTextFieldTBoundsParent;
    // End of variables declaration//GEN-END:variables

    private void updateTask() {
        if (initializing) // Avoid side effect of setting UI in the middle of populating Ui
            return;
        
        try {
            jmpTask.setName(((Joint) jComboBoxJoints.getSelectedItem()).getName());
            if(jTextFieldTBoundsParent.getText().trim().length()>0) pTrBounds.setValue(0, numFormat.parse(jTextFieldTBoundsParent.getText().trim()).doubleValue());
            if(jTextFieldRBoundsParent.getText().trim().length()>0) pOrientBounds.setValue(0, numFormat.parse(jTextFieldRBoundsParent.getText().trim()).doubleValue());
            if(jTextFieldTBoundsChild.getText().trim().length()>0) chTrBounds.setValue(0, numFormat.parse(jTextFieldTBoundsChild.getText().trim()).doubleValue());
            if(jTextFieldRBoundsChild.getText().trim().length()>0) chOrientBounds.setValue(0, numFormat.parse(jTextFieldRBoundsChild.getText().trim()).doubleValue());
            boolean txp = jCheckBoxTx.isSelected();
            boolean typ = jCheckBoxTy.isSelected();
            boolean tzp = jCheckBoxTz.isSelected();
            boolean rxp = jCheckBoxRx.isSelected();
            boolean ryp = jCheckBoxRy.isSelected();
            boolean rzp = jCheckBoxRz.isSelected();
            pTrFlags.setValue(0, txp);
            pTrFlags.setValue(1, typ);
            pTrFlags.setValue(2, tzp);
            pTrFlags.setValueIsDefault(false);
            pOrFlags.setValue(0, rxp);
            pOrFlags.setValue(1, ryp);
            pOrFlags.setValue(2, rzp);
            pOrFlags.setValueIsDefault(false);
            txp = jCheckBoxChTx.isSelected();
            typ = jCheckBoxChTy.isSelected();
            tzp = jCheckBoxChTz.isSelected();
            rxp = jCheckBoxChRx.isSelected();
            ryp = jCheckBoxChRy.isSelected();
            rzp = jCheckBoxChRz.isSelected();
            chTrFlags.setValue(0, txp);
            chTrFlags.setValue(1, typ);
            chTrFlags.setValue(2, tzp);
            chOrFlags.setValue(0, rxp);
            chOrFlags.setValue(1, ryp);
            chOrFlags.setValue(2, rzp);
            chTrFlags.setValueIsDefault(false);
            chOrFlags.setValueIsDefault(false);
            System.out.println(jmpTask.dump());
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
        
    }

    private void populateUiFromObject() {
        Model model = OpenSimDB.getInstance().getCurrentModel();
        int jlistIndex = model.getJointSet().getIndex(jmpTask.getName());
        if (jlistIndex==-1){ // default, pick first joint
            cbm.setSelectedItem(model.getJointSet().get(0));
        }
        else
            cbm.setSelectedItem(model.getJointSet().get(jmpTask.getName()));
        jTextFieldTBoundsParent.setText(String.valueOf(pTrBounds.getValue(0)));
        jTextFieldRBoundsParent.setText(String.valueOf(pOrientBounds.getValue(0)));
        jTextFieldTBoundsChild.setText(String.valueOf(chTrBounds.getValue(0)));
        jTextFieldRBoundsChild.setText(String.valueOf(chOrientBounds.getValue(0)));
        jCheckBoxTx.setSelected(pTrFlags.getValue(0));
        jCheckBoxTy.setSelected(pTrFlags.getValue(1));
        jCheckBoxTz.setSelected(pTrFlags.getValue(2));
        jCheckBoxRx.setSelected(pOrFlags.getValue(0));
        jCheckBoxRy.setSelected(pOrFlags.getValue(1));
        jCheckBoxRz.setSelected(pOrFlags.getValue(2));
        //
        jCheckBoxChTx.setSelected(chTrFlags.getValue(0));
        jCheckBoxChTy.setSelected(chTrFlags.getValue(1));
        jCheckBoxChTz.setSelected(chTrFlags.getValue(2));
        jCheckBoxChRx.setSelected(chOrFlags.getValue(0));
        jCheckBoxChRy.setSelected(chOrFlags.getValue(1));
        jCheckBoxChRz.setSelected(chOrFlags.getValue(2));
        
    }
}
