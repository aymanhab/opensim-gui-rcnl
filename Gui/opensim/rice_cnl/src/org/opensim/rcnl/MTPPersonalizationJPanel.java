/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.rcnl;

import java.awt.Dialog;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PropertyObjectList;
import org.opensim.utils.FileUtils;
import org.opensim.view.pub.OpenSimDB;

/**
 *
 * @author Ayman-NMBL
 */
public class MTPPersonalizationJPanel extends BaseToolPanel  implements Observer {
    private JointPersonalizationToolModel jointPersonalizationToolModel = null;
    private JMPTaskListModel jointPersonalizationTaskListModel = null;
    private ListSelectionModel listSelectionModel;
    /**
     * Creates new form JointPersonalizationJPanel
     */
    public MTPPersonalizationJPanel(Model model)  throws IOException  {
       if(model==null) throw new IOException("JointPersonalizationJPanel got null model");
       jointPersonalizationToolModel = new JointPersonalizationToolModel(model);
       jointPersonalizationTaskListModel = new JMPTaskListModel(jointPersonalizationToolModel.getJointTaskListAsObjectList());
       initComponents();
       jJointPersonalizationList.setModel(jointPersonalizationTaskListModel);
       listSelectionModel = jJointPersonalizationList.getSelectionModel();
       listSelectionModel.addListSelectionListener(
                            new ListSelectionHandler());
       currentModelFileTextField.setText(model.getInputFileName());
       outputModelFilePath.setFileName(jointPersonalizationToolModel.getOutputModelFile());
       setSettingsFileDescription("Save Joint Personalization Settings file (xml)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputModelPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        currentModelFileTextField = new javax.swing.JTextField();
        outputPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        outputModelFilePath = new org.opensim.swingui.FileTextFieldAndChooser();
        tasksPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jJointPersonalizationList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        addJointTaskButton = new javax.swing.JButton();
        editJointTaskButton = new javax.swing.JButton();
        deleteJointTaskButton = new javax.swing.JButton();

        inputModelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.inputModelPanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel13, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jLabel13.text")); // NOI18N

        currentModelFileTextField.setEditable(false);
        currentModelFileTextField.setToolTipText(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.currentModelFileTextField.toolTipText")); // NOI18N
        currentModelFileTextField.setMinimumSize(new java.awt.Dimension(3, 20));

        javax.swing.GroupLayout inputModelPanelLayout = new javax.swing.GroupLayout(inputModelPanel);
        inputModelPanel.setLayout(inputModelPanelLayout);
        inputModelPanelLayout.setHorizontalGroup(
            inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputModelPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentModelFileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        inputModelPanelLayout.setVerticalGroup(
            inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputModelPanelLayout.createSequentialGroup()
                .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(currentModelFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.outputPanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jLabel11.text")); // NOI18N

        outputModelFilePath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                outputModelFilePathStateChanged(evt);
            }
        });

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputModelFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(outputModelFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tasksPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.tasksPanel.border.title"))); // NOI18N

        jJointPersonalizationList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jJointPersonalizationList);

        org.openide.awt.Mnemonics.setLocalizedText(addJointTaskButton, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.addJointTaskButton.text")); // NOI18N
        addJointTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJMPTaskButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(editJointTaskButton, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.editJointTaskButton.text")); // NOI18N
        editJointTaskButton.setEnabled(false);
        editJointTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJMPTaskButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(deleteJointTaskButton, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.deleteJointTaskButton.text")); // NOI18N
        deleteJointTaskButton.setEnabled(false);
        deleteJointTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJointTaskButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteJointTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editJointTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addJointTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(addJointTaskButton)
                .addGap(18, 18, 18)
                .addComponent(editJointTaskButton)
                .addGap(18, 18, 18)
                .addComponent(deleteJointTaskButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tasksPanelLayout = new javax.swing.GroupLayout(tasksPanel);
        tasksPanel.setLayout(tasksPanelLayout);
        tasksPanelLayout.setHorizontalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        tasksPanelLayout.setVerticalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tasksPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputModelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tasksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputModelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tasksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void outputModelFilePathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_outputModelFilePathStateChanged
        jointPersonalizationToolModel.setOutputModelFile(outputModelFilePath.getFileName());
    }//GEN-LAST:event_outputModelFilePathStateChanged

    private void addJMPTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJMPTaskButtonActionPerformed
        // TODO add your handling code here:
        OpenSimObject jmpTask = OpenSimObject.newInstanceOfType("JMPTask");
        EditJMPTaskJPanel ejtPanel = new EditJMPTaskJPanel(jmpTask);
        DialogDescriptor dlg = new DialogDescriptor(ejtPanel, "Create/Edit One JMP Task ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            jointPersonalizationTaskListModel.addElement(jmpTask);
            AbstractProperty ap = jointPersonalizationToolModel.getToolAsObject().getPropertyByName("JMPTaskList");
            //System.out.println(ap.getTypeName()+" "+ap.isListProperty()+" ");
            PropertyObjectList.updAs(ap).adoptAndAppendValue(jmpTask);
            PropertyObjectList poList = jointPersonalizationToolModel.getJointTaskListAsObjectList();
            jointPersonalizationTaskListModel = new JMPTaskListModel(poList);
            jJointPersonalizationList.setModel(jointPersonalizationTaskListModel);
           
        }
    }//GEN-LAST:event_addJMPTaskButtonActionPerformed

    private void editJMPTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJMPTaskButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jJointPersonalizationList.getSelectedIndices();
        int idx = sels[0];
        OpenSimObject currentTask = (OpenSimObject)jointPersonalizationTaskListModel.get(idx);
        OpenSimObject taskCopyToEdit = currentTask.clone();
        //System.out.println(currentTask.dump());
        EditJMPTaskJPanel ejtPanel = new EditJMPTaskJPanel(taskCopyToEdit);
        DialogDescriptor dlg = new DialogDescriptor(ejtPanel, "Create/Edit One JMP Task ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            jointPersonalizationTaskListModel.set(idx, taskCopyToEdit); 
            jointPersonalizationToolModel.getJointTaskListAsObjectList().setValue(idx, taskCopyToEdit);
        }
    }//GEN-LAST:event_editJMPTaskButtonActionPerformed

    private void deleteJointTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJointTaskButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jJointPersonalizationList.getSelectedIndices();
        PropertyObjectList poList = jointPersonalizationToolModel.getJointTaskListAsObjectList();
        Vector<Integer> tasksToDelete = new Vector<Integer>();
        for (int i=0; i<sels.length; i++){
            //OpenSimObject selectedJointTask = (OpenSimObject)jJointPersonalizationList.get(sels[i]);
            tasksToDelete.add(sels[i]);
        }
        //jJointPersonalizationList
        // Delete items from jmpJointListModel in reverse order
        for (int r=tasksToDelete.size(); r >0; r-- ){
            jointPersonalizationTaskListModel.remove(tasksToDelete.get(r-1));
            poList.removeValueAtIndex(tasksToDelete.get(r-1));
        }
        // Recreate list model to cleanup
        jointPersonalizationTaskListModel = new JMPTaskListModel(poList);
        jJointPersonalizationList.setModel(jointPersonalizationTaskListModel);
    }//GEN-LAST:event_deleteJointTaskButtonActionPerformed

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pressedCancel() {
        super.pressedCancel(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSettings(String fileName) {
         String fullFilename = FileUtils.addExtensionIfNeeded(fileName, ".xml");
         OpenSimObject.setSerializeAllDefaults(true);
        jointPersonalizationToolModel.getToolAsObject().print(fullFilename);
    }

    @Override
    public void loadSettings(String fileName) {
        Model model = OpenSimDB.getInstance().getCurrentModel();
       //if(model==null) throw new IOException("JointPersonalizationJPanel got null model");
       jointPersonalizationToolModel = new JointPersonalizationToolModel(model, fileName);
       jointPersonalizationTaskListModel = new JMPTaskListModel(jointPersonalizationToolModel.getJointTaskListAsObjectList());
       listSelectionModel = jJointPersonalizationList.getSelectionModel();
       listSelectionModel.addListSelectionListener( new ListSelectionHandler());
       //initComponents(); Panel already constructed, no need to re-initComponents
       jJointPersonalizationList.setModel(jointPersonalizationTaskListModel);
       currentModelFileTextField.setText(jointPersonalizationToolModel.getInputModelFile());
       outputModelFilePath.setFileName(jointPersonalizationToolModel.getOutputModelFile());
       setSettingsFileDescription("Save Joint Personalization Settings file (xml)");
    }

    @Override
    public void setSettingsFileDescription(String description) {
        super.setSettingsFileDescription(description); //To change body of generated methods, choose Tools | Templates.
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJointTaskButton;
    private javax.swing.JTextField currentModelFileTextField;
    private javax.swing.JButton deleteJointTaskButton;
    private javax.swing.JButton editJointTaskButton;
    private javax.swing.JPanel inputModelPanel;
    private javax.swing.JList<String> jJointPersonalizationList;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.opensim.swingui.FileTextFieldAndChooser outputModelFilePath;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JPanel tasksPanel;
    // End of variables declaration//GEN-END:variables

    private class ListSelectionHandler implements ListSelectionListener {

        public ListSelectionHandler() {
        }

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            // Disable delete if nothing is selected
            // Enable edit if single selection
            int[] sels = jJointPersonalizationList.getSelectedIndices();
            editJointTaskButton.setEnabled(sels.length==1);
            deleteJointTaskButton.setEnabled(sels.length>=1);
            
        }
    }
}
