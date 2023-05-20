/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.rcnl;

import java.awt.Dialog;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Vector;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PropertyDoubleList;
import org.opensim.modeling.PropertyHelper;
import org.opensim.modeling.PropertyObjectList;

/**
 *
 * @author Ayman-NMBL
 */
public class EditJMPTaskJPanel extends javax.swing.JPanel {

    private OpenSimObject taskToEdit;
    private NumberFormat numFormat = NumberFormat.getInstance();
    private Vector<OpenSimObject> savedJointTasks = new Vector<OpenSimObject>();
    private Vector<OpenSimObject> savedBodyTasks = new Vector<OpenSimObject>();
    private JMPJointListModel jmpJointListModel = null;
    private JMPBodyListModel jmpBodyListModel = null;
    private PropertyObjectList poJointList;
    private PropertyObjectList poBodyList;
    private ListSelectionModel listSelectionModel, list2SelectionModel;
    /**
     * Creates new form EditJointTaskJPanel
     */
    public EditJMPTaskJPanel() {
        initComponents();
    }

    EditJMPTaskJPanel(OpenSimObject jointPersonalizationTask) {
        taskToEdit = jointPersonalizationTask;
        AbstractProperty ap = jointPersonalizationTask.getPropertyByName("JMPJointList");
        poJointList = PropertyObjectList.updAs(ap);
        jmpJointListModel= new JMPJointListModel(poJointList);
        poBodyList = PropertyObjectList.updAs(jointPersonalizationTask.getPropertyByName("JMPBodyList"));
        jmpBodyListModel = new JMPBodyListModel(poBodyList);
        initComponents();
        jList1.setModel(jmpJointListModel);
        jList2.setModel(jmpBodyListModel);
        listSelectionModel = jList1.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionHandler());
        jList2.getSelectionModel().addListSelectionListener(new List2SelectionHandler() );
        triallFilePath.setExtensionsAndDescription(".trc", "Measurement trial marker data");
        // Populate name, enabled, time-range and markers-file
        jTaskNameTextField.setText(jointPersonalizationTask.getName());
        AbstractProperty enabledProp = taskToEdit.getPropertyByName("is_enabled");
        jEnabledCheckBox.setSelected(PropertyHelper.getValueBool(enabledProp));
        AbstractProperty trcfileProp = taskToEdit.getPropertyByName("marker_file_name");
        String filepath = PropertyHelper.getValueString(trcfileProp);
        triallFilePath.setFileName(filepath);
        AbstractProperty timeRangeProp = taskToEdit.getPropertyByName("time_range");
        PropertyDoubleList pDoubleList = PropertyDoubleList.updAs(timeRangeProp);
        jTextField3.setText(String.valueOf(pDoubleList.getValue(0)));
        jTextField4.setText(String.valueOf(pDoubleList.getValue(1)));
        
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
        jTaskNameTextField = new javax.swing.JTextField();
        jEnabledCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jJointsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        addJointButton = new javax.swing.JButton();
        editJointButton = new javax.swing.JButton();
        deleteJointButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        triallFilePath = new org.opensim.swingui.FileTextFieldAndChooser();
        jBodiesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        addBodyButton = new javax.swing.JButton();
        editBodyButton = new javax.swing.JButton();
        deleteBodyButton = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jLabel1.text")); // NOI18N

        jTaskNameTextField.setText(org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jTaskNameTextField.text")); // NOI18N
        jTaskNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTaskNameTextFieldFocusLost(evt);
            }
        });
        jTaskNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaskNameTextFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jEnabledCheckBox, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jEnabledCheckBox.text")); // NOI18N
        jEnabledCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jEnabledCheckBoxItemStateChanged(evt);
            }
        });
        jEnabledCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnabledCheckBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jLabel4.text")); // NOI18N

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField3.setText(org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jTextField3.text")); // NOI18N
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField4.setText(org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jTextField4.text")); // NOI18N
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jJointsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jJointsPanel.border.title"))); // NOI18N

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        org.openide.awt.Mnemonics.setLocalizedText(addJointButton, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.addJointButton.text")); // NOI18N
        addJointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJointButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(editJointButton, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.editJointButton.text")); // NOI18N
        editJointButton.setEnabled(false);
        editJointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJointButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(deleteJointButton, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.deleteJointButton.text")); // NOI18N
        deleteJointButton.setEnabled(false);
        deleteJointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJointButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jJointsPanelLayout = new javax.swing.GroupLayout(jJointsPanel);
        jJointsPanel.setLayout(jJointsPanelLayout);
        jJointsPanelLayout.setHorizontalGroup(
            jJointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jJointsPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jJointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteJointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addJointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editJointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jJointsPanelLayout.setVerticalGroup(
            jJointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jJointsPanelLayout.createSequentialGroup()
                .addComponent(addJointButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editJointButton)
                .addGap(14, 14, 14)
                .addComponent(deleteJointButton))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jLabel11.text")); // NOI18N

        triallFilePath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                triallFilePathStateChanged(evt);
            }
        });

        jBodiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.jBodiesPanel.border.title"))); // NOI18N

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList2);

        org.openide.awt.Mnemonics.setLocalizedText(addBodyButton, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.addBodyButton.text")); // NOI18N
        addBodyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBodyButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(editBodyButton, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.editBodyButton.text")); // NOI18N
        editBodyButton.setEnabled(false);
        editBodyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBodyButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(deleteBodyButton, org.openide.util.NbBundle.getMessage(EditJMPTaskJPanel.class, "EditJMPTaskJPanel.deleteBodyButton.text")); // NOI18N
        deleteBodyButton.setEnabled(false);
        deleteBodyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBodyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBodiesPanelLayout = new javax.swing.GroupLayout(jBodiesPanel);
        jBodiesPanel.setLayout(jBodiesPanelLayout);
        jBodiesPanelLayout.setHorizontalGroup(
            jBodiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBodiesPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBodiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteBodyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBodyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBodyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jBodiesPanelLayout.setVerticalGroup(
            jBodiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBodiesPanelLayout.createSequentialGroup()
                .addComponent(addBodyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBodyButton)
                .addGap(14, 14, 14)
                .addComponent(deleteBodyButton))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEnabledCheckBox)
                    .addComponent(jJointsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(triallFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jBodiesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEnabledCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(triallFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jJointsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBodiesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTaskNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaskNameTextFieldActionPerformed
        // TODO add your handling code here:
        taskToEdit.setName(jTaskNameTextField.getText());
    }//GEN-LAST:event_jTaskNameTextFieldActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            AbstractProperty timeRangeProp = taskToEdit.getPropertyByName("time_range");
            PropertyDoubleList pDoubleList = PropertyDoubleList.updAs(timeRangeProp);
            double startTime =pDoubleList.getValue(0);
            if (jTextField3.getText().trim().length()>0)
                startTime = numFormat.parse(jTextField3.getText().trim()).doubleValue();
            pDoubleList.setValue(0, startTime);
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void triallFilePathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_triallFilePathStateChanged
        //ikToolModel.getIKTool().setOutputMotionFileName(outputModelFilePath.getFileName());
        AbstractProperty trcfileProp = taskToEdit.getPropertyByName("marker_file_name");
        PropertyHelper.setValueString(triallFilePath.getFileName(), trcfileProp);
    }//GEN-LAST:event_triallFilePathStateChanged

    private void jEnabledCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jEnabledCheckBoxItemStateChanged
        // TODO add your handling code here:
        AbstractProperty enabledProp = taskToEdit.getPropertyByName("is_enabled");
        PropertyHelper.setValueBool(evt.getStateChange()==1, enabledProp);
    }//GEN-LAST:event_jEnabledCheckBoxItemStateChanged

    private void jTaskNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTaskNameTextFieldFocusLost
        // TODO add your handling code here:
         taskToEdit.setName(jTaskNameTextField.getText());
    }//GEN-LAST:event_jTaskNameTextFieldFocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        jTextField3ActionPerformed(null);
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:();
            AbstractProperty timeRangeProp = taskToEdit.getPropertyByName("time_range");
            PropertyDoubleList pDoubleList = PropertyDoubleList.updAs(timeRangeProp);
            double endTime=pDoubleList.getValue(1);
            if (jTextField4.getText().trim().length()>0)
                endTime = numFormat.parse(jTextField4.getText().trim()).doubleValue();
            pDoubleList.setValue(1, endTime);
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        jTextField4ActionPerformed(null);
    }//GEN-LAST:event_jTextField4FocusLost

    private void jEnabledCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnabledCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEnabledCheckBoxActionPerformed

    private void deleteJointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJointButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jList1.getSelectedIndices();
        Vector<Integer> tasksToDelete = new Vector<Integer>();
        for (int i=0; i<sels.length; i++){
            tasksToDelete.add(sels[i]);
        }
        // Delete items from jmpJointListModel in reverse order
        for (int r=tasksToDelete.size(); r >0; r-- ){
            jmpJointListModel.remove(tasksToDelete.get(r-1));
            poJointList.removeValueAtIndex(tasksToDelete.get(r-1));
        }
        // Recreate list model to cleanup
        jmpJointListModel= new JMPJointListModel(poJointList);
        jList1.setModel(jmpJointListModel);
    }//GEN-LAST:event_deleteJointButtonActionPerformed

    private void editJointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJointButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jList1.getSelectedIndices();
        int idx = sels[0];
        OpenSimObject selectedJointTask = (OpenSimObject)jmpJointListModel.get(idx);
        OpenSimObject taskCopyToEdit = selectedJointTask.clone();
        AddEditJointPanel ejtPanel = new AddEditJointPanel(taskCopyToEdit);
        DialogDescriptor dlg = new DialogDescriptor(ejtPanel, "Create/Edit One Joint Task ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            // Fire model changed event to update list in case name change
            poJointList.setValue(idx, taskCopyToEdit);
            jmpJointListModel.set(idx, taskCopyToEdit);
            
        }
    }//GEN-LAST:event_editJointButtonActionPerformed

    private void addJointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJointButtonActionPerformed
        // TODO add your handling code here:
        OpenSimObject newJMPJointTask  = OpenSimObject.newInstanceOfType("JMPJoint");
        // set name to first valid joint in model
        savedJointTasks.add(newJMPJointTask);
        AddEditJointPanel ejtPanel = new AddEditJointPanel(newJMPJointTask);
        DialogDescriptor dlg = new DialogDescriptor(ejtPanel, "Create/Edit One Joint Task ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            //System.out.println(newJMPJointTask.dump());
            jmpJointListModel.addElement(newJMPJointTask);
            newJMPJointTask.markAdopted(); //indicate ownership will be transferred so that object is not deleted by gc
            poJointList.adoptAndAppendValue(newJMPJointTask);
        }

    }//GEN-LAST:event_addJointButtonActionPerformed

    private void addBodyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBodyButtonActionPerformed
        // TODO add your handling code here:
        OpenSimObject newJMPBodyTask  = OpenSimObject.newInstanceOfType("JMPBody");
        AddEditJMPBodyPanel ebPanel = new AddEditJMPBodyPanel(newJMPBodyTask);
        DialogDescriptor dlg = new DialogDescriptor(ebPanel, "Edit Body Task ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
        //System.out.println(newJMPJointTask.dump());
            jmpBodyListModel.addElement(newJMPBodyTask);
            newJMPBodyTask.markAdopted(); //indicate ownership will be transferred so that object is not deleted by gc
            poBodyList.adoptAndAppendValue(newJMPBodyTask);
        }
    }//GEN-LAST:event_addBodyButtonActionPerformed

    private void editBodyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBodyButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jList2.getSelectedIndices();
        int idx = sels[0];
        OpenSimObject selectedBodyTask = (OpenSimObject)jmpBodyListModel.get(sels[0]);
        OpenSimObject taskCopyToEdit = selectedBodyTask.clone();
        //System.out.println(selectedBodyTask.dump());
        AddEditJMPBodyPanel ebPanel = new AddEditJMPBodyPanel(taskCopyToEdit);
        DialogDescriptor dlg = new DialogDescriptor(ebPanel, "Edit Body Task ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            // Fire model changed event to update list in case name change
            poBodyList.setValue(idx, taskCopyToEdit);
            jmpBodyListModel.set(idx, taskCopyToEdit);
        }
    }//GEN-LAST:event_editBodyButtonActionPerformed

    private void deleteBodyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBodyButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jList2.getSelectedIndices();
        Vector<Integer> tasksToDelete = new Vector<Integer>();
        for (int i=0; i<sels.length; i++){
            tasksToDelete.add(sels[i]);
        }
        // Delete items from jmpJointListModel in reverse order
        for (int r=tasksToDelete.size(); r >0; r-- ){
            jmpBodyListModel.remove(tasksToDelete.get(r-1));
            poBodyList.removeValueAtIndex(tasksToDelete.get(r-1));
        }
        // Recreate list model to cleanup
        jmpBodyListModel= new JMPBodyListModel(poBodyList);
        jList2.setModel(jmpBodyListModel);
    }//GEN-LAST:event_deleteBodyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBodyButton;
    private javax.swing.JButton addJointButton;
    private javax.swing.JButton deleteBodyButton;
    private javax.swing.JButton deleteJointButton;
    private javax.swing.JButton editBodyButton;
    private javax.swing.JButton editJointButton;
    private javax.swing.JPanel jBodiesPanel;
    private javax.swing.JCheckBox jEnabledCheckBox;
    private javax.swing.JPanel jJointsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTaskNameTextField;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private org.opensim.swingui.FileTextFieldAndChooser triallFilePath;
    // End of variables declaration//GEN-END:variables
    private class ListSelectionHandler implements ListSelectionListener {

        public ListSelectionHandler() {
        }

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            // Disable delete if nothing is selected
            // Enable edit if single selection
            int[] sels = jList1.getSelectedIndices();
            editJointButton.setEnabled(sels.length==1);
            deleteJointButton.setEnabled(sels.length>=1);
            
        }
    }
    
       private class List2SelectionHandler implements ListSelectionListener {

        public List2SelectionHandler() {
        }

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            // Disable delete if nothing is selected
            // Enable edit if single selection
            int[] sels = jList2.getSelectedIndices();
            editBodyButton.setEnabled(sels.length==1);
            deleteBodyButton.setEnabled(sels.length>=1);
            
        }
    }

}
