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
    private MTPPersonalizationToolModel mtpPersonalizationToolModel = null;
    private Model model;
    /**
     * Creates new form JointPersonalizationJPanel
     */
    public MTPPersonalizationJPanel(Model model)  throws IOException  {
       if(model==null) throw new IOException("JointPersonalizationJPanel got null model");
       this.model = model;
       mtpPersonalizationToolModel = new MTPPersonalizationToolModel(model);
       initComponents();
       setSettingsFileDescription("Save Muscle Tendon Personalization Settings file (xml)");
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
        outputResultPath = new org.opensim.swingui.FileTextFieldAndChooser();
        settingsPanel = new javax.swing.JPanel();
        jCoordinatesListPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonEditCoordinateList = new javax.swing.JButton();
        jActivationMGPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCoordinateListTextArea = new javax.swing.JTextArea();
        jButtonEditCoordinates = new javax.swing.JButton();
        jNormalizedFLMGPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jNormalizedFLMGTextArea = new javax.swing.JTextArea();
        jButtonEditNormalizedFLMG = new javax.swing.JButton();
        jMissingEMGPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jMissingEMGTextArea = new javax.swing.JTextArea();
        jButtonEditMissingEMG = new javax.swing.JButton();
        jCollectedEMGPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jCollectedEMGTextArea = new javax.swing.JTextArea();
        jButtonEditCollectedEMG = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        passiveDataInputDir = new org.opensim.swingui.FileTextFieldAndChooser();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxMTPInitialization = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jCheckBoxSynergyExrapolate = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerSunergyCount = new javax.swing.JSpinner();

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

        outputResultPath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                outputResultPathStateChanged(evt);
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
                .addComponent(outputResultPath, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(outputResultPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        settingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.settingsPanel.border.title"))); // NOI18N

        jCoordinatesListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jCoordinatesListPanel.border.title"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditCoordinateList, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jButtonEditCoordinateList.text")); // NOI18N
        jButtonEditCoordinateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditCoordinateListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCoordinatesListPanelLayout = new javax.swing.GroupLayout(jCoordinatesListPanel);
        jCoordinatesListPanel.setLayout(jCoordinatesListPanelLayout);
        jCoordinatesListPanelLayout.setHorizontalGroup(
            jCoordinatesListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCoordinatesListPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditCoordinateList)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jCoordinatesListPanelLayout.setVerticalGroup(
            jCoordinatesListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCoordinatesListPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCoordinatesListPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEditCoordinateList)
                .addContainerGap())
        );

        jActivationMGPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jActivationMGPanel.border.title"))); // NOI18N

        jCoordinateListTextArea.setColumns(20);
        jCoordinateListTextArea.setRows(5);
        jScrollPane2.setViewportView(jCoordinateListTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditCoordinates, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jButtonEditCoordinates.text")); // NOI18N

        javax.swing.GroupLayout jActivationMGPanelLayout = new javax.swing.GroupLayout(jActivationMGPanel);
        jActivationMGPanel.setLayout(jActivationMGPanelLayout);
        jActivationMGPanelLayout.setHorizontalGroup(
            jActivationMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jActivationMGPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditCoordinates)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jActivationMGPanelLayout.setVerticalGroup(
            jActivationMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jActivationMGPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jActivationMGPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonEditCoordinates)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jNormalizedFLMGPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jNormalizedFLMGPanel.border.title"))); // NOI18N

        jNormalizedFLMGTextArea.setColumns(20);
        jNormalizedFLMGTextArea.setRows(5);
        jScrollPane3.setViewportView(jNormalizedFLMGTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditNormalizedFLMG, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jButtonEditNormalizedFLMG.text")); // NOI18N

        javax.swing.GroupLayout jNormalizedFLMGPanelLayout = new javax.swing.GroupLayout(jNormalizedFLMGPanel);
        jNormalizedFLMGPanel.setLayout(jNormalizedFLMGPanelLayout);
        jNormalizedFLMGPanelLayout.setHorizontalGroup(
            jNormalizedFLMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNormalizedFLMGPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditNormalizedFLMG)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jNormalizedFLMGPanelLayout.setVerticalGroup(
            jNormalizedFLMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNormalizedFLMGPanelLayout.createSequentialGroup()
                .addGroup(jNormalizedFLMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jNormalizedFLMGPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonEditNormalizedFLMG)))
                .addGap(0, 0, 0))
        );

        jMissingEMGPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jMissingEMGPanel.border.title"))); // NOI18N

        jMissingEMGTextArea.setColumns(20);
        jMissingEMGTextArea.setRows(5);
        jScrollPane5.setViewportView(jMissingEMGTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditMissingEMG, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jButtonEditMissingEMG.text")); // NOI18N

        javax.swing.GroupLayout jMissingEMGPanelLayout = new javax.swing.GroupLayout(jMissingEMGPanel);
        jMissingEMGPanel.setLayout(jMissingEMGPanelLayout);
        jMissingEMGPanelLayout.setHorizontalGroup(
            jMissingEMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMissingEMGPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditMissingEMG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jMissingEMGPanelLayout.setVerticalGroup(
            jMissingEMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMissingEMGPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jMissingEMGPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButtonEditMissingEMG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCollectedEMGPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jCollectedEMGPanel.border.title"))); // NOI18N

        jCollectedEMGTextArea.setColumns(20);
        jCollectedEMGTextArea.setRows(5);
        jScrollPane4.setViewportView(jCollectedEMGTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditCollectedEMG, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jButtonEditCollectedEMG.text")); // NOI18N

        javax.swing.GroupLayout jCollectedEMGPanelLayout = new javax.swing.GroupLayout(jCollectedEMGPanel);
        jCollectedEMGPanel.setLayout(jCollectedEMGPanelLayout);
        jCollectedEMGPanelLayout.setHorizontalGroup(
            jCollectedEMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCollectedEMGPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditCollectedEMG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jCollectedEMGPanelLayout.setVerticalGroup(
            jCollectedEMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jCollectedEMGPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButtonEditCollectedEMG))
        );

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCoordinatesListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jActivationMGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jNormalizedFLMGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jMissingEMGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCollectedEMGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(jCoordinatesListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jActivationMGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNormalizedFLMGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMissingEMGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCollectedEMGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jPanel6.border.title"))); // NOI18N

        passiveDataInputDir.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                passiveDataInputDirStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxMTPInitialization, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jCheckBoxMTPInitialization.text")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passiveDataInputDir, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jCheckBoxMTPInitialization)
                    .addContainerGap(634, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passiveDataInputDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jCheckBoxMTPInitialization)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jPanel8.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxSynergyExrapolate, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jCheckBoxSynergyExrapolate.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(MTPPersonalizationJPanel.class, "MTPPersonalizationJPanel.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxSynergyExrapolate)
                .addGap(108, 108, 108)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerSunergyCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jSpinnerSunergyCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxSynergyExrapolate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(inputModelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputModelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void outputResultPathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_outputResultPathStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_outputResultPathStateChanged

    private void passiveDataInputDirStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_passiveDataInputDirStateChanged
    }//GEN-LAST:event_passiveDataInputDirStateChanged

    private void jButtonEditCoordinateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditCoordinateListActionPerformed
        // TODO add your handling code here:
        // Create Panel for selecting from existing model coordinates
        CoordinateTableModel ctm = new CoordinateTableModel(mtpPersonalizationToolModel.getPropCoordinateListString(), model);
        SelectQuantitiesFromListJPanel selectionPanel = new SelectQuantitiesFromListJPanel(ctm);
        DialogDescriptor dlg = new DialogDescriptor(selectionPanel,"Select Coordinates");
        dlg.setModal(true);
        DialogDisplayer.getDefault().createDialog(dlg).setVisible(true);
        Object userInput = dlg.getValue();
    }//GEN-LAST:event_jButtonEditCoordinateListActionPerformed

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
         mtpPersonalizationToolModel.getToolAsObject().print(fullFilename);
    }

    @Override
    public void loadSettings(String fileName) {
        Model model = OpenSimDB.getInstance().getCurrentModel();
       //if(model==null) throw new IOException("JointPersonalizationJPanel got null model");
       setSettingsFileDescription("Save Muscle Tendon Personalization Settings file (xml)");
    }

    @Override
    public void setSettingsFileDescription(String description) {
        super.setSettingsFileDescription(description); //To change body of generated methods, choose Tools | Templates.
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField currentModelFileTextField;
    private javax.swing.JPanel inputModelPanel;
    private javax.swing.JPanel jActivationMGPanel;
    private javax.swing.JButton jButtonEditCollectedEMG;
    private javax.swing.JButton jButtonEditCoordinateList;
    private javax.swing.JButton jButtonEditCoordinates;
    private javax.swing.JButton jButtonEditMissingEMG;
    private javax.swing.JButton jButtonEditNormalizedFLMG;
    private javax.swing.JCheckBox jCheckBoxMTPInitialization;
    private javax.swing.JCheckBox jCheckBoxSynergyExrapolate;
    private javax.swing.JPanel jCollectedEMGPanel;
    private javax.swing.JTextArea jCollectedEMGTextArea;
    private javax.swing.JTextArea jCoordinateListTextArea;
    private javax.swing.JPanel jCoordinatesListPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jMissingEMGPanel;
    private javax.swing.JTextArea jMissingEMGTextArea;
    private javax.swing.JPanel jNormalizedFLMGPanel;
    private javax.swing.JTextArea jNormalizedFLMGTextArea;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinnerSunergyCount;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel outputPanel;
    private org.opensim.swingui.FileTextFieldAndChooser outputResultPath;
    private org.opensim.swingui.FileTextFieldAndChooser passiveDataInputDir;
    private javax.swing.JPanel settingsPanel;
    // End of variables declaration//GEN-END:variables

}
