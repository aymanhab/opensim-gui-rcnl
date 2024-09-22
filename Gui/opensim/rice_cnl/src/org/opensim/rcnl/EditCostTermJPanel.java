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
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.Exceptions;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PropertyDoubleList;
import org.opensim.modeling.PropertyHelper;
import org.opensim.modeling.PropertyObjectList;
import org.opensim.modeling.PropertyStringList;
import org.opensim.view.pub.OpenSimDB;

/**
 *
 * @author Ayman-NMBL
 */
public class EditCostTermJPanel extends javax.swing.JPanel {

    private OpenSimObject costTerm2Edit;
    private boolean initializing=false;
    private TreatmentOptimizationToolModel.Mode mode;
    private String[] componentTypes;
    private String[] termWithErrorCenter = null;
    String componentType;
    private String[] availableComponentNames;
    private CostTermModel costTermModel;
    private NumberFormat numFormat = NumberFormat.getInstance();
    private String trackedDataDir, initialGuessDir, osimxFile;

    /**
     * Creates new form EditJointTaskJPanel
     */
    public EditCostTermJPanel() {
        initComponents();
    }

    EditCostTermJPanel(OpenSimObject rcnlCostTerm, TreatmentOptimizationToolModel.Mode mode, 
            String trackedDataDir, String initialGuessDir, String osimxFile) {
        costTerm2Edit = rcnlCostTerm;
        initializing = true;
        this.mode = mode;
        this.trackedDataDir = trackedDataDir;
        this.initialGuessDir = initialGuessDir;
        this.osimxFile = osimxFile;
        costTermModel = new CostTermModel(costTerm2Edit, mode);
        AbstractProperty typeProp = costTerm2Edit.getPropertyByName("type");
        String saveType = PropertyHelper.getValueString(typeProp);
        initComponents(); 
        jCostTermTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(RCNLCostTermsInfo.getCostTermTypes(mode)));
        componentTypes = RCNLCostTermsInfo.getCostTermQuantityTypes(mode);
        if (mode == TreatmentOptimizationToolModel.Mode.DesignOptimization){
            // some terms have error center, get array and cache it
            termWithErrorCenter = RCNLCostTermsInfo.getCostTermErrorCenter(mode);
        }
        jCostTermNameTextField.setText(costTerm2Edit.getName());
        jCostTermTypeComboBox.setSelectedItem(saveType);
        jCostTermTypeComboBoxActionPerformed(null);
        AbstractProperty enabledProp = costTerm2Edit.getPropertyByName("is_enabled");
        jEnabledCheckBox.setSelected(PropertyHelper.getValueBool(enabledProp));
        jErrorCenterTextField.setEnabled(mode == TreatmentOptimizationToolModel.Mode.DesignOptimization);
        initializing = false;
        jTermComponentListTextArea.setText(costTermModel.getPropertyComponentList().toString());
        jMaxErrorTextField.setText(String.valueOf(costTermModel.getMaxAllowableError()));
        jErrorCenterTextField.setText(String.valueOf(costTermModel.getErrorCenter()));
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
        jEnabledCheckBox = new javax.swing.JCheckBox();
        jComponentListPanel = new javax.swing.JPanel();
        editComonentListButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTermComponentListTextArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jCostTermTypeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jMaxErrorTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCostTermNameTextField = new javax.swing.JTextField();
        jComponentTypeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jErrorCenterTextField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jEnabledCheckBox, org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jEnabledCheckBox.text")); // NOI18N
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

        jComponentListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jComponentListPanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(editComonentListButton, org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.editComonentListButton.text")); // NOI18N
        editComonentListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editComonentListButtonActionPerformed(evt);
            }
        });

        jTermComponentListTextArea.setColumns(20);
        jTermComponentListTextArea.setRows(5);
        jScrollPane2.setViewportView(jTermComponentListTextArea);

        javax.swing.GroupLayout jComponentListPanelLayout = new javax.swing.GroupLayout(jComponentListPanel);
        jComponentListPanel.setLayout(jComponentListPanelLayout);
        jComponentListPanelLayout.setHorizontalGroup(
            jComponentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jComponentListPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editComonentListButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jComponentListPanelLayout.setVerticalGroup(
            jComponentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jComponentListPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(editComonentListButton)
                .addContainerGap(101, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jLabel11.text")); // NOI18N

        jCostTermTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "generalized_coordinate_tracking", "generalized_speed_tracking", "marker_position_tracking", "inverse_dynamics_load_tracking", "inverse_dynamics_load_minimization", "inverse_dynamics_slope_tracking", "joint_acceleration_minimization", "external_force_tracking", "external_moment_tracking", "muscle_activation_tracking" }));
        jCostTermTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCostTermTypeComboBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jLabel2.text")); // NOI18N

        jMaxErrorTextField.setText(org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jMaxErrorTextField.text")); // NOI18N
        jMaxErrorTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jMaxErrorTextFieldFocusLost(evt);
            }
        });
        jMaxErrorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaxErrorTextFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jLabel4.text")); // NOI18N

        jCostTermNameTextField.setText(org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jCostTermNameTextField.text")); // NOI18N
        jCostTermNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCostTermNameTextFieldFocusLost(evt);
            }
        });
        jCostTermNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCostTermNameTextFieldActionPerformed(evt);
            }
        });

        jComponentTypeTextField.setEditable(false);
        jComponentTypeTextField.setText(org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jComponentTypeTextField.text")); // NOI18N
        jComponentTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComponentTypeTextFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jLabel3.text")); // NOI18N

        jErrorCenterTextField.setText(org.openide.util.NbBundle.getMessage(EditCostTermJPanel.class, "EditCostTermJPanel.jErrorCenterTextField.text")); // NOI18N
        jErrorCenterTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jErrorCenterTextFieldFocusLost(evt);
            }
        });
        jErrorCenterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jErrorCenterTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComponentListPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jEnabledCheckBox)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComponentTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jMaxErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(131, 131, 131)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jErrorCenterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCostTermTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCostTermNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCostTermNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCostTermTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(jEnabledCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComponentTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jComponentListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jMaxErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jErrorCenterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jEnabledCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jEnabledCheckBoxItemStateChanged
        // TODO add your handling code here:
        AbstractProperty enabledProp = costTerm2Edit.getPropertyByName("is_enabled");
        PropertyHelper.setValueBool(evt.getStateChange()==1, enabledProp);
    }//GEN-LAST:event_jEnabledCheckBoxItemStateChanged

    private void jEnabledCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnabledCheckBoxActionPerformed
        // TODO add your handling code here:
        AbstractProperty enabledProp = costTerm2Edit.getPropertyByName("is_enabled");
        PropertyHelper.setValueBool(jEnabledCheckBox.isSelected(), enabledProp);
    }//GEN-LAST:event_jEnabledCheckBoxActionPerformed

    private void editComonentListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editComonentListButtonActionPerformed
        // TODO add your handling code here:
        // get Component list from costTermModel as well as the corresponding property
        String[] names = RCNLCostTermsInfo.getAvailableNamesForComponentType(costTermModel.getComponentType(), costTermModel.getModel(), 
                this.trackedDataDir, this.initialGuessDir, this.osimxFile);
        if (names.length == 0 && !costTermModel.getComponentType().equalsIgnoreCase("none")){
             NotifyDescriptor.Message dlg =
                          new NotifyDescriptor.Message("Error populating list of options, please check model, tracked data and initial guess directories.");
                  DialogDisplayer.getDefault().notify(dlg);
            return;
        }
        PropertyStringList componentListProperty = costTermModel.getPropertyComponentList();
        ComponentTableModel ctm = new ComponentTableModel(componentListProperty, names);
        SelectQuantitiesFromListJPanel selectionPanel = new SelectQuantitiesFromListJPanel(ctm);
        DialogDescriptor dlg = new DialogDescriptor(selectionPanel,"Select Components");
        dlg.setModal(true);
        DialogDisplayer.getDefault().createDialog(dlg).setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            ctm.populateListProperty();
            jTermComponentListTextArea.setText(costTermModel.getPropertyComponentList().toString());
            //System.out.println(costTerm2Edit.dump());
        }

    }//GEN-LAST:event_editComonentListButtonActionPerformed

    private void jCostTermTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCostTermTypeComboBoxActionPerformed
        // TODO add your handling code here:
        // Get component type from 
        int ndx = jCostTermTypeComboBox.getSelectedIndex();
        componentType = componentTypes[ndx];
        String oldType = jComponentTypeTextField.getText();
        jComponentTypeTextField.setText(componentType);
        if (!oldType.trim().equalsIgnoreCase("") && !oldType.equalsIgnoreCase(componentType)){ // type change so old values not applicable
            costTermModel.getPropertyComponentList().clear();
            jTermComponentListTextArea.setText(costTermModel.getPropertyComponentList().toString());
        }
        AbstractProperty typeProp = costTerm2Edit.getPropertyByName("type");
        PropertyHelper.setValueString(jCostTermTypeComboBox.getSelectedItem().toString(), typeProp);
        // If error center is required, will enable editing, else disable
        jErrorCenterTextField.setEnabled(
                mode == TreatmentOptimizationToolModel.Mode.DesignOptimization && 
                termWithErrorCenter[ndx]=="Y");
        // based on componentType, populate underlying available componentList, if none then disable
        editComonentListButton.setEnabled(!componentType.equalsIgnoreCase("none"));
        costTermModel.setTypeIndex(jCostTermTypeComboBox.getSelectedIndex());
        
    }//GEN-LAST:event_jCostTermTypeComboBoxActionPerformed

    private void jComponentTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComponentTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComponentTypeTextFieldActionPerformed

    private void jCostTermNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCostTermNameTextFieldActionPerformed
        // TODO add your handling code here:
        costTerm2Edit.setName(jCostTermNameTextField.getText());
    }//GEN-LAST:event_jCostTermNameTextFieldActionPerformed

    private void jCostTermNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCostTermNameTextFieldFocusLost
        // TODO add your handling code here:
        jCostTermNameTextFieldActionPerformed(null);
    }//GEN-LAST:event_jCostTermNameTextFieldFocusLost

    private void jErrorCenterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jErrorCenterTextFieldActionPerformed
        // TODO add your handling code here:
        if(jErrorCenterTextField.getText().trim().length()>0) 
            try {
                costTermModel.setErrorCenter(numFormat.parse(jErrorCenterTextField.getText().trim()).doubleValue());
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jErrorCenterTextFieldActionPerformed

    private void jMaxErrorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaxErrorTextFieldActionPerformed
        // TODO add your handling code here:
        if(jMaxErrorTextField.getText().trim().length()>0) 
            try {
                costTermModel.setMaxAllowableError(numFormat.parse(jMaxErrorTextField.getText().trim()).doubleValue());
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jMaxErrorTextFieldActionPerformed

    private void jMaxErrorTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMaxErrorTextFieldFocusLost
        // TODO add your handling code here:
        jMaxErrorTextFieldActionPerformed(null);
    }//GEN-LAST:event_jMaxErrorTextFieldFocusLost

    private void jErrorCenterTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jErrorCenterTextFieldFocusLost
        // TODO add your handling code here:
        jErrorCenterTextFieldActionPerformed(null);
    }//GEN-LAST:event_jErrorCenterTextFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editComonentListButton;
    private javax.swing.JPanel jComponentListPanel;
    private javax.swing.JTextField jComponentTypeTextField;
    private javax.swing.JTextField jCostTermNameTextField;
    private javax.swing.JComboBox<String> jCostTermTypeComboBox;
    private javax.swing.JCheckBox jEnabledCheckBox;
    private javax.swing.JTextField jErrorCenterTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jMaxErrorTextField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTermComponentListTextArea;
    // End of variables declaration//GEN-END:variables
    private class ListSelectionHandler implements ListSelectionListener {

        public ListSelectionHandler() {
        }

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            // Disable delete if nothing is selected
            // Enable edit if single selection
            
        }
    }
    
       private class List2SelectionHandler implements ListSelectionListener {

        public List2SelectionHandler() {
        }

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            // Disable delete if nothing is selected
            // Enable edit if single selection

        }
    }

}
