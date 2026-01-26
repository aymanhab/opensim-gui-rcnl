/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.rcnl;

import java.awt.Dialog;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PropertyObjectList;
import org.opensim.utils.FileUtils;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.utils.BrowserLauncher;

/**
 *
 * @author Ayman-NMBL
 */
public class TreatmentOptimizationJPanel extends BaseToolPanel  implements Observer {
    private TreatmentOptimizationToolModel treatmentOptimizationToolModel = null;
    private CostTermListModel costTermListModel = null;
    private ListSelectionModel costListSelectionModel;
    private ConstraintTermListModel constraintTermListModel = null;
    private ListSelectionModel constraintListSelectionModel;

    private Model model;
    private TreatmentOptimizationToolModel.Mode mode;
    String modeName;

    /**
     * Creates new form JointPersonalizationJPanel
     */
    public TreatmentOptimizationJPanel(Model model, TreatmentOptimizationToolModel.Mode mode)  throws IOException  {
       treatmentOptimizationToolModel = new TreatmentOptimizationToolModel(model, mode);
       this.model = model;
       this.mode = mode;
       switch(mode) {
           case TrackingOptimization:
               modeName = "Tracking Optimization Tool";
               break;
           case VerificationOptimization:
               modeName = "Verification Optimization Tool";
               break;
           case DesignOptimization:
               modeName = "Design Optimization Tool";
               break;
       }
       if(model==null) throw new IOException(modeName +" got null model");
       initComponents();
       // Settings Panel
       currentModelFileTextField.setText(treatmentOptimizationToolModel.getInputModelFile());
       osimxFilePath.setCheckIfFileExists(true);
       osimxFilePath.setFileName(treatmentOptimizationToolModel.getInputOsimxFile());
       osimxFilePath.setDialogTitle("Select osimx file");
       osimxFilePath.setDirectoriesOnly(false);
       osimxFilePath.setExtensionsAndDescription(".osimx", "File to contain pipeline specific entities");
       InitialGuessDirPath.setDialogTitle("Select initial guess directory");
       InitialGuessDirPath.setCheckIfFileExists(true);
       InitialGuessDirPath.setDirectoriesOnly(true);
       InitialGuessDirPath.setFileName(treatmentOptimizationToolModel.getInitialGuessDir());
       trackedQuantitiesDirPath.setDialogTitle("Select tracked quantities directory");
       trackedQuantitiesDirPath.setCheckIfFileExists(true);
       trackedQuantitiesDirPath.setDirectoriesOnly(true);
       trackedQuantitiesDirPath.setFileName(treatmentOptimizationToolModel.getTrackedQuantitiesDir());
       jTrialPrefixTextField.setText(treatmentOptimizationToolModel.getTrialPrefix());
       outputDirPath.setDialogTitle("Select output directory");
       outputDirPath.setCheckIfFileExists(false);
       outputDirPath.setDirectoriesOnly(true);
       outputDirPath.setFileName(treatmentOptimizationToolModel.getOutputResultDir());
       solverSettingsFilePath.setCheckIfFileExists(true);
       solverSettingsFilePath.setFileName(treatmentOptimizationToolModel.getOCSettingsFile());
       solverSettingsFilePath.setDialogTitle("Select solver settings file");
       solverSettingsFilePath.setDirectoriesOnly(false);
       solverSettingsFilePath.setExtensionsAndDescription(".xml", "File that contains desired solver settings");
       // RCNL Controllers panel
       surrogateModelDirPath.setDialogTitle("Select surrogate model directory");
       surrogateModelDirPath.setCheckIfFileExists(true);
       surrogateModelDirPath.setDirectoriesOnly(true);
       surrogateModelDirPath.setFileName(treatmentOptimizationToolModel.getSurrogateModelDir());
       
       costTermListModel = new CostTermListModel(treatmentOptimizationToolModel.getCostTermListAsObjectList());
       costListSelectionModel = jCostTermList.getSelectionModel();
       costListSelectionModel.addListSelectionListener(
                            new CostListSelectionHandler());

       constraintTermListModel = new ConstraintTermListModel(treatmentOptimizationToolModel.getConstraintTermListAsObjectList());
       constraintListSelectionModel = jConstraintTermList.getSelectionModel();
       constraintListSelectionModel.addListSelectionListener(
                            new ConstraintListSelectionHandler());
       setSettingsFileDescription("Save settings for "+modeName+" as .xml file");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCoordinatesListPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCoordinateListTextArea = new javax.swing.JTextArea();
        jButtonEditCoordinateList = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        inputOutputPanel = new javax.swing.JPanel();
        outputPanel = new javax.swing.JPanel();
        outputDirPath = new org.opensim.swingui.FileTextFieldAndChooser();
        jLabel5 = new javax.swing.JLabel();
        jSolverSettingsPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        solverSettingsFilePath = new org.opensim.swingui.FileTextFieldAndChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        inputModelPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        currentModelFileTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        osimxFilePath = new org.opensim.swingui.FileTextFieldAndChooser();
        InitialGuessDirPath = new org.opensim.swingui.FileTextFieldAndChooser();
        jLabel4 = new javax.swing.JLabel();
        trackedQuantitiesDirPath = new org.opensim.swingui.FileTextFieldAndChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTrialPrefixTextField = new javax.swing.JTextField();
        jCoordinatesListPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCoordinateListTextArea1 = new javax.swing.JTextArea();
        jButtonEditSettingsCoordinateList = new javax.swing.JButton();
        jControllersPanel = new javax.swing.JPanel();
        jSynergyControllerDetailsPanel1 = new javax.swing.JPanel();
        jOptimizeSynVecCheckBox = new javax.swing.JCheckBox();
        jCoordinatesListPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jSynergyCoordinateListTextArea = new javax.swing.JTextArea();
        jButtonEditSynergyCoordinateList = new javax.swing.JButton();
        surrogateModelDirPath = new org.opensim.swingui.FileTextFieldAndChooser();
        jLabel2 = new javax.swing.JLabel();
        jRCNLTorqueControllerPanel = new javax.swing.JPanel();
        JTorqueControllerDetailsPanel1 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jCoordinateListTorqueControllerTextArea = new javax.swing.JTextArea();
        jButtonEditTorqueCoordinateList = new javax.swing.JButton();
        jPanelCostConstraints = new javax.swing.JPanel();
        jCostTermsPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jCostTermList = new javax.swing.JList<>();
        addCostTermButton = new javax.swing.JButton();
        editCostTermButton = new javax.swing.JButton();
        deleteCostTermButton = new javax.swing.JButton();
        jConstTermsPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jConstraintTermList = new javax.swing.JList<>();
        addConstraintTermButton = new javax.swing.JButton();
        editConstraintTermButton = new javax.swing.JButton();
        deleteConstraintTermButton = new javax.swing.JButton();

        jCoordinatesListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jCoordinatesListPanel.border.title"))); // NOI18N

        jCoordinateListTextArea.setEditable(false);
        jCoordinateListTextArea.setBackground(new java.awt.Color(240, 240, 240));
        jCoordinateListTextArea.setColumns(20);
        jCoordinateListTextArea.setRows(5);
        jCoordinateListTextArea.setEnabled(false);
        jCoordinateListTextArea.setFocusable(false);
        jScrollPane1.setViewportView(jCoordinateListTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditCoordinateList, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jButtonEditCoordinateList.text")); // NOI18N
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
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditCoordinateList, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jCoordinatesListPanelLayout.setVerticalGroup(
            jCoordinatesListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCoordinatesListPanelLayout.createSequentialGroup()
                .addGroup(jCoordinatesListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jCoordinatesListPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButtonEditCoordinateList)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.outputPanel.border.title"))); // NOI18N

        outputDirPath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                outputDirPathStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jLabel5.text")); // NOI18N

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(outputPanelLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(outputDirPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
            .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(outputPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(outputDirPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jSolverSettingsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jLabel8.text")); // NOI18N

        solverSettingsFilePath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                solverSettingsFilePathStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton1, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jRadioButton1.text")); // NOI18N

        buttonGroup1.add(jRadioButton2);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton2, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jRadioButton2.text")); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSolverSettingsPanelLayout = new javax.swing.GroupLayout(jSolverSettingsPanel);
        jSolverSettingsPanel.setLayout(jSolverSettingsPanelLayout);
        jSolverSettingsPanelLayout.setHorizontalGroup(
            jSolverSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSolverSettingsPanelLayout.createSequentialGroup()
                .addGroup(jSolverSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSolverSettingsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jSolverSettingsPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jSolverSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jSolverSettingsPanelLayout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jSolverSettingsPanelLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(solverSettingsFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 0, 0))
        );
        jSolverSettingsPanelLayout.setVerticalGroup(
            jSolverSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSolverSettingsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jSolverSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(solverSettingsFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputModelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.inputModelPanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel13, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jLabel13.text")); // NOI18N

        currentModelFileTextField.setEditable(false);
        currentModelFileTextField.setToolTipText(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.currentModelFileTextField.toolTipText")); // NOI18N
        currentModelFileTextField.setMinimumSize(new java.awt.Dimension(3, 20));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jLabel3.text")); // NOI18N

        osimxFilePath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                osimxFilePathStateChanged(evt);
            }
        });

        InitialGuessDirPath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                InitialGuessDirPathStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jLabel4.text")); // NOI18N

        trackedQuantitiesDirPath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                trackedQuantitiesDirPathStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jLabel1.text")); // NOI18N

        jTrialPrefixTextField.setText(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jTrialPrefixTextField.text")); // NOI18N
        jTrialPrefixTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTrialPrefixTextFieldFocusLost(evt);
            }
        });
        jTrialPrefixTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrialPrefixTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputModelPanelLayout = new javax.swing.GroupLayout(inputModelPanel);
        inputModelPanel.setLayout(inputModelPanelLayout);
        inputModelPanelLayout.setHorizontalGroup(
            inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputModelPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentModelFileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                    .addGroup(inputModelPanelLayout.createSequentialGroup()
                        .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(osimxFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InitialGuessDirPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(inputModelPanelLayout.createSequentialGroup()
                                .addComponent(jTrialPrefixTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(trackedQuantitiesDirPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        inputModelPanelLayout.setVerticalGroup(
            inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputModelPanelLayout.createSequentialGroup()
                .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(currentModelFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(osimxFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(InitialGuessDirPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(trackedQuantitiesDirPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTrialPrefixTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCoordinatesListPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jCoordinatesListPanel2.border.title"))); // NOI18N

        jCoordinateListTextArea1.setEditable(false);
        jCoordinateListTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jCoordinateListTextArea1.setColumns(20);
        jCoordinateListTextArea1.setRows(5);
        jCoordinateListTextArea1.setEnabled(false);
        jCoordinateListTextArea1.setFocusable(false);
        jScrollPane2.setViewportView(jCoordinateListTextArea1);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditSettingsCoordinateList, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jButtonEditSettingsCoordinateList.text")); // NOI18N
        jButtonEditSettingsCoordinateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditSettingsCoordinateListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCoordinatesListPanel2Layout = new javax.swing.GroupLayout(jCoordinatesListPanel2);
        jCoordinatesListPanel2.setLayout(jCoordinatesListPanel2Layout);
        jCoordinatesListPanel2Layout.setHorizontalGroup(
            jCoordinatesListPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCoordinatesListPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditSettingsCoordinateList, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jCoordinatesListPanel2Layout.setVerticalGroup(
            jCoordinatesListPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
            .addGroup(jCoordinatesListPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jButtonEditSettingsCoordinateList)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inputOutputPanelLayout = new javax.swing.GroupLayout(inputOutputPanel);
        inputOutputPanel.setLayout(inputOutputPanelLayout);
        inputOutputPanelLayout.setHorizontalGroup(
            inputOutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputOutputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputOutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSolverSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCoordinatesListPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        inputOutputPanelLayout.setVerticalGroup(
            inputOutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputOutputPanelLayout.createSequentialGroup()
                .addComponent(inputModelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSolverSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCoordinatesListPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.inputOutputPanel.TabConstraints.tabTitle"), inputOutputPanel); // NOI18N

        jSynergyControllerDetailsPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jSynergyControllerDetailsPanel1.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jOptimizeSynVecCheckBox, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jOptimizeSynVecCheckBox.text")); // NOI18N
        jOptimizeSynVecCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptimizeSynVecCheckBoxActionPerformed(evt);
            }
        });

        jCoordinatesListPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jCoordinatesListPanel3.border.title"))); // NOI18N

        jSynergyCoordinateListTextArea.setEditable(false);
        jSynergyCoordinateListTextArea.setBackground(new java.awt.Color(240, 240, 240));
        jSynergyCoordinateListTextArea.setColumns(20);
        jSynergyCoordinateListTextArea.setRows(5);
        jSynergyCoordinateListTextArea.setEnabled(false);
        jSynergyCoordinateListTextArea.setFocusable(false);
        jScrollPane7.setViewportView(jSynergyCoordinateListTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditSynergyCoordinateList, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jButtonEditSynergyCoordinateList.text")); // NOI18N
        jButtonEditSynergyCoordinateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditSynergyCoordinateListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCoordinatesListPanel3Layout = new javax.swing.GroupLayout(jCoordinatesListPanel3);
        jCoordinatesListPanel3.setLayout(jCoordinatesListPanel3Layout);
        jCoordinatesListPanel3Layout.setHorizontalGroup(
            jCoordinatesListPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCoordinatesListPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditSynergyCoordinateList, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jCoordinatesListPanel3Layout.setVerticalGroup(
            jCoordinatesListPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCoordinatesListPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCoordinatesListPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonEditSynergyCoordinateList)
                .addGap(109, 109, 109))
        );

        surrogateModelDirPath.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                surrogateModelDirPathStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout jSynergyControllerDetailsPanel1Layout = new javax.swing.GroupLayout(jSynergyControllerDetailsPanel1);
        jSynergyControllerDetailsPanel1.setLayout(jSynergyControllerDetailsPanel1Layout);
        jSynergyControllerDetailsPanel1Layout.setHorizontalGroup(
            jSynergyControllerDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCoordinatesListPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jSynergyControllerDetailsPanel1Layout.createSequentialGroup()
                .addGroup(jSynergyControllerDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSynergyControllerDetailsPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jOptimizeSynVecCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jSynergyControllerDetailsPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(surrogateModelDirPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jSynergyControllerDetailsPanel1Layout.setVerticalGroup(
            jSynergyControllerDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSynergyControllerDetailsPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jOptimizeSynVecCheckBox)
                .addGap(18, 18, 18)
                .addComponent(jCoordinatesListPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSynergyControllerDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(surrogateModelDirPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jRCNLTorqueControllerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jRCNLTorqueControllerPanel.border.title"))); // NOI18N

        JTorqueControllerDetailsPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.JTorqueControllerDetailsPanel1.border.title"))); // NOI18N

        jCoordinateListTorqueControllerTextArea.setEditable(false);
        jCoordinateListTorqueControllerTextArea.setBackground(new java.awt.Color(240, 240, 240));
        jCoordinateListTorqueControllerTextArea.setColumns(20);
        jCoordinateListTorqueControllerTextArea.setRows(5);
        jCoordinateListTorqueControllerTextArea.setEnabled(false);
        jCoordinateListTorqueControllerTextArea.setFocusable(false);
        jScrollPane9.setViewportView(jCoordinateListTorqueControllerTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(jButtonEditTorqueCoordinateList, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jButtonEditTorqueCoordinateList.text")); // NOI18N
        jButtonEditTorqueCoordinateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditTorqueCoordinateListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JTorqueControllerDetailsPanel1Layout = new javax.swing.GroupLayout(JTorqueControllerDetailsPanel1);
        JTorqueControllerDetailsPanel1.setLayout(JTorqueControllerDetailsPanel1Layout);
        JTorqueControllerDetailsPanel1Layout.setHorizontalGroup(
            JTorqueControllerDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTorqueControllerDetailsPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditTorqueCoordinateList, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JTorqueControllerDetailsPanel1Layout.setVerticalGroup(
            JTorqueControllerDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
            .addGroup(JTorqueControllerDetailsPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButtonEditTorqueCoordinateList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jRCNLTorqueControllerPanelLayout = new javax.swing.GroupLayout(jRCNLTorqueControllerPanel);
        jRCNLTorqueControllerPanel.setLayout(jRCNLTorqueControllerPanelLayout);
        jRCNLTorqueControllerPanelLayout.setHorizontalGroup(
            jRCNLTorqueControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1029, Short.MAX_VALUE)
            .addGroup(jRCNLTorqueControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JTorqueControllerDetailsPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jRCNLTorqueControllerPanelLayout.setVerticalGroup(
            jRCNLTorqueControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
            .addGroup(jRCNLTorqueControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRCNLTorqueControllerPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTorqueControllerDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jControllersPanelLayout = new javax.swing.GroupLayout(jControllersPanel);
        jControllersPanel.setLayout(jControllersPanelLayout);
        jControllersPanelLayout.setHorizontalGroup(
            jControllersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jControllersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jControllersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSynergyControllerDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRCNLTorqueControllerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jControllersPanelLayout.setVerticalGroup(
            jControllersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jControllersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSynergyControllerDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRCNLTorqueControllerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jControllersPanel.TabConstraints.tabTitle"), jControllersPanel); // NOI18N

        jCostTermsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jCostTermsPanel.border.title"))); // NOI18N

        jCostTermList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(jCostTermList);

        org.openide.awt.Mnemonics.setLocalizedText(addCostTermButton, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.addCostTermButton.text")); // NOI18N
        addCostTermButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCostTermButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(editCostTermButton, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.editCostTermButton.text")); // NOI18N
        editCostTermButton.setEnabled(false);
        editCostTermButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCostTermButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(deleteCostTermButton, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.deleteCostTermButton.text")); // NOI18N
        deleteCostTermButton.setEnabled(false);
        deleteCostTermButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCostTermButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCostTermsPanelLayout = new javax.swing.GroupLayout(jCostTermsPanel);
        jCostTermsPanel.setLayout(jCostTermsPanelLayout);
        jCostTermsPanelLayout.setHorizontalGroup(
            jCostTermsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCostTermsPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCostTermsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteCostTermButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCostTermButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editCostTermButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jCostTermsPanelLayout.setVerticalGroup(
            jCostTermsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jCostTermsPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(addCostTermButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editCostTermButton)
                .addGap(14, 14, 14)
                .addComponent(deleteCostTermButton)
                .addContainerGap(460, Short.MAX_VALUE))
        );

        jConstTermsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jConstTermsPanel.border.title"))); // NOI18N

        jConstraintTermList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(jConstraintTermList);

        org.openide.awt.Mnemonics.setLocalizedText(addConstraintTermButton, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.addConstraintTermButton.text")); // NOI18N
        addConstraintTermButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConstraintTermButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(editConstraintTermButton, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.editConstraintTermButton.text")); // NOI18N
        editConstraintTermButton.setEnabled(false);
        editConstraintTermButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editConstraintTermButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(deleteConstraintTermButton, org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.deleteConstraintTermButton.text")); // NOI18N
        deleteConstraintTermButton.setEnabled(false);
        deleteConstraintTermButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteConstraintTermButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jConstTermsPanelLayout = new javax.swing.GroupLayout(jConstTermsPanel);
        jConstTermsPanel.setLayout(jConstTermsPanelLayout);
        jConstTermsPanelLayout.setHorizontalGroup(
            jConstTermsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jConstTermsPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jConstTermsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteConstraintTermButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addConstraintTermButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editConstraintTermButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jConstTermsPanelLayout.setVerticalGroup(
            jConstTermsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jConstTermsPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(addConstraintTermButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editConstraintTermButton)
                .addGap(14, 14, 14)
                .addComponent(deleteConstraintTermButton)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCostConstraintsLayout = new javax.swing.GroupLayout(jPanelCostConstraints);
        jPanelCostConstraints.setLayout(jPanelCostConstraintsLayout);
        jPanelCostConstraintsLayout.setHorizontalGroup(
            jPanelCostConstraintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCostTermsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jConstTermsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCostConstraintsLayout.setVerticalGroup(
            jPanelCostConstraintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCostConstraintsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCostTermsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jConstTermsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(TreatmentOptimizationJPanel.class, "TreatmentOptimizationJPanel.jPanelCostConstraints.TabConstraints.tabTitle"), jPanelCostConstraints); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void outputDirPathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_outputDirPathStateChanged
        // TODO add your handling code here:
        treatmentOptimizationToolModel.setOutputResultDir(outputDirPath.getFileName());
    }//GEN-LAST:event_outputDirPathStateChanged

    private void deleteConstraintTermButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteConstraintTermButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jConstraintTermList.getSelectedIndices();
        PropertyObjectList poList = treatmentOptimizationToolModel.getConstraintTermListAsObjectList();
        Vector<Integer> tasksToDelete = new Vector<Integer>();
        for (int i=0; i<sels.length; i++){
            //OpenSimObject selectedJointTask = (OpenSimObject)jJointPersonalizationList.get(sels[i]);
            tasksToDelete.add(sels[i]);
        }
        //jJointPersonalizationList
        // Delete items from jmpJointListModel in reverse order
        for (int r=tasksToDelete.size(); r >0; r-- ){
            constraintTermListModel.remove(tasksToDelete.get(r-1));
            poList.removeValueAtIndex(tasksToDelete.get(r-1));
        }
        // Recreate list model to cleanup
        constraintTermListModel = new ConstraintTermListModel(poList);
        jConstraintTermList.setModel(constraintTermListModel);
    }//GEN-LAST:event_deleteConstraintTermButtonActionPerformed

    private void editConstraintTermButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editConstraintTermButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jConstraintTermList.getSelectedIndices();
        int idx = sels[0];
        OpenSimObject currentTerm = (OpenSimObject)constraintTermListModel.get(idx);
        OpenSimObject termToEdit = currentTerm.clone();
        EditCosnstraintTermJPanel ejtPanel = new EditCosnstraintTermJPanel(termToEdit, mode, 
                treatmentOptimizationToolModel.getTrackedQuantitiesDir(), 
                treatmentOptimizationToolModel.getInitialGuessDir(), 
                treatmentOptimizationToolModel.getInputOsimxFile());
        DialogDescriptor dlg = new DialogDescriptor(ejtPanel, "Create/Edit One Constraint Term ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            constraintTermListModel.set(idx, termToEdit); 
            treatmentOptimizationToolModel.getConstraintTermListAsObjectList().setValue(idx, termToEdit);
        }
    }//GEN-LAST:event_editConstraintTermButtonActionPerformed

    private void addConstraintTermButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConstraintTermButtonActionPerformed
        // TODO add your handling code here:
        OpenSimObject constraintTerm = OpenSimObject.newInstanceOfType("RCNLConstraintTerm");
        EditCosnstraintTermJPanel ejtPanel = new EditCosnstraintTermJPanel(constraintTerm, mode, 
                treatmentOptimizationToolModel.getTrackedQuantitiesDir(), 
                treatmentOptimizationToolModel.getInitialGuessDir(), 
                treatmentOptimizationToolModel.getInputOsimxFile());
        DialogDescriptor dlg = new DialogDescriptor(ejtPanel, "Create/Edit One Constraint Term ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            constraintTermListModel.addElement(constraintTerm);
            AbstractProperty ap = treatmentOptimizationToolModel.getToolAsObject().getPropertyByName("RCNLConstraintTermSet");
            //System.out.println(ap.getTypeName()+" "+ap.isListProperty()+" ");
            PropertyObjectList.updAs(ap).adoptAndAppendValue(constraintTerm);
            PropertyObjectList poList = treatmentOptimizationToolModel.getConstraintTermListAsObjectList();
            constraintTermListModel = new ConstraintTermListModel(poList);
            jConstraintTermList.setModel(constraintTermListModel);
        }        
    }//GEN-LAST:event_addConstraintTermButtonActionPerformed

    private void deleteCostTermButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCostTermButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jCostTermList.getSelectedIndices();
        PropertyObjectList poList = treatmentOptimizationToolModel.getCostTermListAsObjectList();
        Vector<Integer> tasksToDelete = new Vector<Integer>();
        for (int i=0; i<sels.length; i++){
            //OpenSimObject selectedJointTask = (OpenSimObject)jJointPersonalizationList.get(sels[i]);
            tasksToDelete.add(sels[i]);
        }
        //jJointPersonalizationList
        // Delete items from jmpJointListModel in reverse order
        for (int r=tasksToDelete.size(); r >0; r-- ){
            costTermListModel.remove(tasksToDelete.get(r-1));
            poList.removeValueAtIndex(tasksToDelete.get(r-1));
        }
        // Recreate list model to cleanup
        costTermListModel = new CostTermListModel(poList);
        jCostTermList.setModel(costTermListModel);

    }//GEN-LAST:event_deleteCostTermButtonActionPerformed

    private void editCostTermButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCostTermButtonActionPerformed
        // TODO add your handling code here:
        int[] sels = jCostTermList.getSelectedIndices();
        int idx = sels[0];
        OpenSimObject currentTerm = (OpenSimObject)costTermListModel.get(idx);
        OpenSimObject termToEdit = currentTerm.clone();
        EditCostTermJPanel ejtPanel = new EditCostTermJPanel(termToEdit, mode, 
                treatmentOptimizationToolModel.getTrackedQuantitiesDir(), 
                treatmentOptimizationToolModel.getInitialGuessDir(), 
                treatmentOptimizationToolModel.getInputOsimxFile());
        DialogDescriptor dlg = new DialogDescriptor(ejtPanel, "Create/Edit One Cost Term ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            costTermListModel.set(idx, termToEdit); 
            treatmentOptimizationToolModel.getCostTermListAsObjectList().setValue(idx, termToEdit);
        }
    }//GEN-LAST:event_editCostTermButtonActionPerformed

    private void addCostTermButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCostTermButtonActionPerformed
        // TODO add your handling code here:
        OpenSimObject costTerm = OpenSimObject.newInstanceOfType("RCNLCostTerm");
        EditCostTermJPanel ejtPanel = new EditCostTermJPanel(costTerm, mode, 
                treatmentOptimizationToolModel.getTrackedQuantitiesDir(), 
                treatmentOptimizationToolModel.getInitialGuessDir(), 
                treatmentOptimizationToolModel.getInputOsimxFile());
        DialogDescriptor dlg = new DialogDescriptor(ejtPanel, "Create/Edit One Cost Term ");
        Dialog d = DialogDisplayer.getDefault().createDialog(dlg);
        d.setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            costTermListModel.addElement(costTerm);
            AbstractProperty ap = treatmentOptimizationToolModel.getToolAsObject().getPropertyByName("RCNLCostTermSet");
            //System.out.println(ap.getTypeName()+" "+ap.isListProperty()+" ");
            PropertyObjectList.updAs(ap).adoptAndAppendValue(costTerm);
            PropertyObjectList poList = treatmentOptimizationToolModel.getCostTermListAsObjectList();
            costTermListModel = new CostTermListModel(poList);
            jCostTermList.setModel(costTermListModel);
        }

    }//GEN-LAST:event_addCostTermButtonActionPerformed

    private void jButtonEditCoordinateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditCoordinateListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditCoordinateListActionPerformed

    private void solverSettingsFilePathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_solverSettingsFilePathStateChanged
        // TODO add your handling code here:
        treatmentOptimizationToolModel.setOCSettingsFile(solverSettingsFilePath.getFileName());
    }//GEN-LAST:event_solverSettingsFilePathStateChanged

    private void jButtonEditSettingsCoordinateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditSettingsCoordinateListActionPerformed
        // TODO add your handling code here:
        CoordinateTableModel ctm = new CoordinateTableModel(treatmentOptimizationToolModel.getPropCoordinateListString(), model);
        SelectQuantitiesFromListJPanel selectionPanel = new SelectQuantitiesFromListJPanel(ctm);
        DialogDescriptor dlg = new DialogDescriptor(selectionPanel,"Select Coordinates");
        dlg.setModal(true);
        DialogDisplayer.getDefault().createDialog(dlg).setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            ctm.populateCoordinateListProperty();
            jCoordinateListTextArea1.setText(treatmentOptimizationToolModel.getPropCoordinateListString().toString());
        }

    }//GEN-LAST:event_jButtonEditSettingsCoordinateListActionPerformed

    private void jButtonEditSynergyCoordinateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditSynergyCoordinateListActionPerformed
        // TODO add your handling code here:
        CoordinateTableModel ctm = new CoordinateTableModel(treatmentOptimizationToolModel.getRCNLSynergyCoordinateListString(), model);
        SelectQuantitiesFromListJPanel selectionPanel = new SelectQuantitiesFromListJPanel(ctm);
        DialogDescriptor dlg = new DialogDescriptor(selectionPanel,"Select Coordinates");
        dlg.setModal(true);
        DialogDisplayer.getDefault().createDialog(dlg).setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            ctm.populateCoordinateListProperty();
            jSynergyCoordinateListTextArea.setText(treatmentOptimizationToolModel.getRCNLSynergyCoordinateListString().toString());
            treatmentOptimizationToolModel.markSynergyControllerModified();
        }

    }//GEN-LAST:event_jButtonEditSynergyCoordinateListActionPerformed

    private void surrogateModelDirPathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_surrogateModelDirPathStateChanged
        // TODO add your handling code here:
        treatmentOptimizationToolModel.setSurrogateModelDir(surrogateModelDirPath.getFileName());
    }//GEN-LAST:event_surrogateModelDirPathStateChanged

    private void jButtonEditTorqueCoordinateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditTorqueCoordinateListActionPerformed
        // TODO add your handling code here:
        CoordinateTableModel ctm = new CoordinateTableModel(treatmentOptimizationToolModel.getRCNLTorqueCoordinateListString(), model);
        SelectQuantitiesFromListJPanel selectionPanel = new SelectQuantitiesFromListJPanel(ctm);
        DialogDescriptor dlg = new DialogDescriptor(selectionPanel,"Select Coordinates");
        dlg.setModal(true);
        DialogDisplayer.getDefault().createDialog(dlg).setVisible(true);
        Object userInput = dlg.getValue();
        if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)==0){
            ctm.populateCoordinateListProperty();
            jCoordinateListTorqueControllerTextArea.setText(treatmentOptimizationToolModel.getRCNLTorqueCoordinateListString().toString());
            treatmentOptimizationToolModel.markTorqueControllerModified();
        }
        
    }//GEN-LAST:event_jButtonEditTorqueCoordinateListActionPerformed

    private void jOptimizeSynVecCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptimizeSynVecCheckBoxActionPerformed
        // TODO add your handling code here:
        treatmentOptimizationToolModel.setOptimizeSynergyVector(jOptimizeSynVecCheckBox.isSelected());
    }//GEN-LAST:event_jOptimizeSynVecCheckBoxActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        OpenSimObject settingsAsObject = OpenSimObject.newInstanceOfType("OptimalControlSolverSettings");
        OpenSimObject.setSerializeAllDefaults(true);
        FileFilter settingsFilter = FileUtils.getFileFilter(".xml", "Optimal Control Solver Settings");
        String fileName = FileUtils.getInstance().browseForFilenameToSave(settingsFilter, true, "", null);
        if(fileName!=null) {
            String fullFilename = FileUtils.addExtensionIfNeeded(fileName, ".xml");
            settingsAsObject.print(fullFilename);
            // Now replace enclosing OpenSimDocument xml tag with NMSMPipeline xml tag
            replaceOpenSimDocumentTags(fullFilename);
            treatmentOptimizationToolModel.setOCSettingsFile(fullFilename);
        }
        OpenSimObject.setSerializeAllDefaults(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void trackedQuantitiesDirPathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_trackedQuantitiesDirPathStateChanged
        // TODO add your handling code here:
        treatmentOptimizationToolModel.setTrackedQuantitiesDir(trackedQuantitiesDirPath.getFileName());
    }//GEN-LAST:event_trackedQuantitiesDirPathStateChanged

    private void InitialGuessDirPathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_InitialGuessDirPathStateChanged
        // TODO add your handling code here:
        treatmentOptimizationToolModel.setInitialGuessDir(InitialGuessDirPath.getFileName());
    }//GEN-LAST:event_InitialGuessDirPathStateChanged

    private void osimxFilePathStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_osimxFilePathStateChanged
        // TODO add your handling code here:
        treatmentOptimizationToolModel.setInputOsimxFile(osimxFilePath.getFileName());
    }//GEN-LAST:event_osimxFilePathStateChanged

    private void jTrialPrefixTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrialPrefixTextFieldActionPerformed
        // TODO add your handling code here:
        treatmentOptimizationToolModel.setTrialPrefix(jTrialPrefixTextField.getText());
    }//GEN-LAST:event_jTrialPrefixTextFieldActionPerformed

    private void jTrialPrefixTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTrialPrefixTextFieldFocusLost
        // TODO add your handling code here:
         treatmentOptimizationToolModel.setTrialPrefix(jTrialPrefixTextField.getText());
    }//GEN-LAST:event_jTrialPrefixTextFieldFocusLost

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pressedCancel() {
        super.pressedCancel(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadSettings(String nmsmFilename) {
        String fileName = BaseToolPanel.stripOuterTags(nmsmFilename);
        String settingsFilePath = Paths.get(fileName).getParent().toString();
        Model model = OpenSimDB.getInstance().getCurrentModel();
        
        //if(model==null) throw new IOException("JointPersonalizationJPanel got null model");
        treatmentOptimizationToolModel = new TreatmentOptimizationToolModel(model, fileName);

        String resultsDirectory = treatmentOptimizationToolModel.getOutputResultDir();
        String absoluteResultsDirectory = FileUtils.makePathAbsolute(resultsDirectory, settingsFilePath);
        outputDirPath.setFileName(absoluteResultsDirectory);
        
        String initialGuessDirectory = treatmentOptimizationToolModel.getInitialGuessDir();
        String absoluteInitialGuessDirectory = FileUtils.makePathAbsolute(initialGuessDirectory, settingsFilePath);
        InitialGuessDirPath.setFileName(absoluteInitialGuessDirectory);

        String trackedQuantitiesDirectory = treatmentOptimizationToolModel.getTrackedQuantitiesDir();
        String absoluteTrackedQuantitiesDirectory = FileUtils.makePathAbsolute(trackedQuantitiesDirectory, settingsFilePath);
        trackedQuantitiesDirPath.setFileName(absoluteTrackedQuantitiesDirectory);

        String osimxFile = treatmentOptimizationToolModel.getInputOsimxFile();
        String absoluteOsimxFile = FileUtils.makePathAbsolute(osimxFile, settingsFilePath);
        osimxFilePath.setFileName(absoluteOsimxFile);

        String solverSettingsFile = treatmentOptimizationToolModel.getOCSettingsFile();
        String absoluteSolverSettingsFile = FileUtils.makePathAbsolute(solverSettingsFile, settingsFilePath);
        solverSettingsFilePath.setFileName(absoluteSolverSettingsFile);

        String surrogateModelDirectory = treatmentOptimizationToolModel.getSurrogateModelDir();
        String absoluteSurrogateModelDirectory = FileUtils.makePathAbsolute(surrogateModelDirectory, settingsFilePath);
        surrogateModelDirPath.setFileName(absoluteSurrogateModelDirectory);


        currentModelFileTextField.setText(treatmentOptimizationToolModel.getInputModelFile());
        jTrialPrefixTextField.setText(treatmentOptimizationToolModel.getTrialPrefix());
        jCoordinateListTextArea1.setText(treatmentOptimizationToolModel.getPropCoordinateListString().toString());
        
        // Controllers tab
        jOptimizeSynVecCheckBox.setSelected(treatmentOptimizationToolModel.getOptimizeSynergyVector());
        jSynergyCoordinateListTextArea.setText(treatmentOptimizationToolModel.getRCNLSynergyCoordinateListString().toString());
        surrogateModelDirPath.setFileName(treatmentOptimizationToolModel.getSurrogateModelDir());
        jCoordinateListTorqueControllerTextArea.setText(treatmentOptimizationToolModel.getRCNLTorqueCoordinateListString().toString());
        
        // Cost+Constraints
        costTermListModel = new CostTermListModel(treatmentOptimizationToolModel.getCostTermListAsObjectList());
        jCostTermList.setModel(costTermListModel);
        constraintTermListModel = new ConstraintTermListModel(treatmentOptimizationToolModel.getConstraintTermListAsObjectList());
        jConstraintTermList.setModel(constraintTermListModel);
    }  

    @Override
    public void setSettingsFileDescription(String description) {
        super.setSettingsFileDescription(description); //To change body of generated methods, choose Tools | Templates.
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.opensim.swingui.FileTextFieldAndChooser InitialGuessDirPath;
    private javax.swing.JPanel JTorqueControllerDetailsPanel1;
    private javax.swing.JButton addConstraintTermButton;
    private javax.swing.JButton addCostTermButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField currentModelFileTextField;
    private javax.swing.JButton deleteConstraintTermButton;
    private javax.swing.JButton deleteCostTermButton;
    private javax.swing.JButton editConstraintTermButton;
    private javax.swing.JButton editCostTermButton;
    private javax.swing.JPanel inputModelPanel;
    private javax.swing.JPanel inputOutputPanel;
    private javax.swing.JButton jButtonEditCoordinateList;
    private javax.swing.JButton jButtonEditSettingsCoordinateList;
    private javax.swing.JButton jButtonEditSynergyCoordinateList;
    private javax.swing.JButton jButtonEditTorqueCoordinateList;
    private javax.swing.JPanel jConstTermsPanel;
    private javax.swing.JList<String> jConstraintTermList;
    private javax.swing.JPanel jControllersPanel;
    private javax.swing.JTextArea jCoordinateListTextArea;
    private javax.swing.JTextArea jCoordinateListTextArea1;
    private javax.swing.JTextArea jCoordinateListTorqueControllerTextArea;
    private javax.swing.JPanel jCoordinatesListPanel;
    private javax.swing.JPanel jCoordinatesListPanel2;
    private javax.swing.JPanel jCoordinatesListPanel3;
    private javax.swing.JList<String> jCostTermList;
    private javax.swing.JPanel jCostTermsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox jOptimizeSynVecCheckBox;
    private javax.swing.JPanel jPanelCostConstraints;
    private javax.swing.JPanel jRCNLTorqueControllerPanel;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel jSolverSettingsPanel;
    private javax.swing.JPanel jSynergyControllerDetailsPanel1;
    private javax.swing.JTextArea jSynergyCoordinateListTextArea;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTrialPrefixTextField;
    private org.opensim.swingui.FileTextFieldAndChooser osimxFilePath;
    private org.opensim.swingui.FileTextFieldAndChooser outputDirPath;
    private javax.swing.JPanel outputPanel;
    private org.opensim.swingui.FileTextFieldAndChooser solverSettingsFilePath;
    private org.opensim.swingui.FileTextFieldAndChooser surrogateModelDirPath;
    private org.opensim.swingui.FileTextFieldAndChooser trackedQuantitiesDirPath;
    // End of variables declaration//GEN-END:variables

    private class CostListSelectionHandler implements ListSelectionListener {

        public CostListSelectionHandler() {
        }

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            // Disable delete if nothing is selected
            // Enable edit if single selection
            int[] sels = jCostTermList.getSelectedIndices();
            editCostTermButton.setEnabled(sels.length==1);
            deleteCostTermButton.setEnabled(sels.length>=1);
        }
    }
    
    private class ConstraintListSelectionHandler implements ListSelectionListener {

        public ConstraintListSelectionHandler() {
        }

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            // Disable delete if nothing is selected
            // Enable edit if single selection
            int[] sels = jConstraintTermList.getSelectedIndices();
            editConstraintTermButton.setEnabled(sels.length==1);
            deleteConstraintTermButton.setEnabled(sels.length>=1);
        }
    }
    @Override
    public void saveSettings(String fileName) {
        String settingsFilePath = Paths.get(fileName).getParent().toString();

        String resultsDirectory = treatmentOptimizationToolModel.getOutputResultDir();
        String initialGuessDirectory = treatmentOptimizationToolModel.getInitialGuessDir();
        String trackedQuantitiesDirectory = treatmentOptimizationToolModel.getTrackedQuantitiesDir();
        String inputOsimxFile = treatmentOptimizationToolModel.getInputOsimxFile();
        String optimalControlSolverSettingsFile = treatmentOptimizationToolModel.getOCSettingsFile();
        String surrogateModelDataDirectory = treatmentOptimizationToolModel.getSurrogateModelDir();

        Path resultsDirectoryPath = Paths.get(resultsDirectory);
        String relativeResultsDir = FileUtils.makePathRelative(resultsDirectory, settingsFilePath);
        if (relativeResultsDir != null && resultsDirectoryPath!=null && resultsDirectoryPath.isAbsolute()){
            treatmentOptimizationToolModel.setOutputResultDir(relativeResultsDir);
        }

        Path initialGuessDirectoryPath = Paths.get(initialGuessDirectory);
        String relativeInitialGuessDir = FileUtils.makePathRelative(initialGuessDirectory, settingsFilePath);
        if (relativeInitialGuessDir != null && initialGuessDirectoryPath!=null && initialGuessDirectoryPath.isAbsolute()){
            treatmentOptimizationToolModel.setInitialGuessDir(relativeInitialGuessDir);
        }

        Path trackedQuantitiesDirectoryPath = Paths.get(trackedQuantitiesDirectory);
        String relativeTrackedQuantitiesDir = FileUtils.makePathRelative(trackedQuantitiesDirectory, settingsFilePath);
        if (relativeTrackedQuantitiesDir != null && trackedQuantitiesDirectoryPath!=null && trackedQuantitiesDirectoryPath.isAbsolute()){
            treatmentOptimizationToolModel.setTrackedQuantitiesDir(relativeTrackedQuantitiesDir);
        }

        Path inputOsimxFilePath = Paths.get(inputOsimxFile);
        String relativeInputOsimxFile = FileUtils.makePathRelative(inputOsimxFile, settingsFilePath);
        if (relativeInputOsimxFile != null && inputOsimxFilePath!=null && inputOsimxFilePath.isAbsolute()){
            treatmentOptimizationToolModel.setInputOsimxFile(relativeInputOsimxFile);
        }

        Path optimalControlSolverSettingsFilePath = Paths.get(optimalControlSolverSettingsFile);
        String relativeOptimalControlSolverSettingsFile = FileUtils.makePathRelative(optimalControlSolverSettingsFile, settingsFilePath);
        if (relativeOptimalControlSolverSettingsFile != null && optimalControlSolverSettingsFilePath!=null && optimalControlSolverSettingsFilePath.isAbsolute()){
            treatmentOptimizationToolModel.setOCSettingsFile(relativeOptimalControlSolverSettingsFile);
        }

        Path surrogateModelDataDirectoryPath = Paths.get(surrogateModelDataDirectory);
        String relativeSurrogateModelDataDirectory = FileUtils.makePathRelative(surrogateModelDataDirectory, settingsFilePath);
        if (relativeSurrogateModelDataDirectory != null && surrogateModelDataDirectoryPath!=null && surrogateModelDataDirectoryPath.isAbsolute()){
            treatmentOptimizationToolModel.setSurrogateModelDir(relativeSurrogateModelDataDirectory);
        }

        String fullFilename = FileUtils.addExtensionIfNeeded(fileName, ".xml");
        OpenSimObject obj = treatmentOptimizationToolModel.getToolAsObject();
        forceWritableProperties(obj);
        obj.print(fullFilename);
        replaceOpenSimDocumentTags(fullFilename);

        treatmentOptimizationToolModel.setOutputResultDir(resultsDirectory);
        treatmentOptimizationToolModel.setInitialGuessDir(initialGuessDirectory);
        treatmentOptimizationToolModel.setTrackedQuantitiesDir(trackedQuantitiesDirectory);
        treatmentOptimizationToolModel.setInputOsimxFile(inputOsimxFile);
        treatmentOptimizationToolModel.setOCSettingsFile(optimalControlSolverSettingsFile);
        treatmentOptimizationToolModel.setSurrogateModelDir(surrogateModelDataDirectory);
   }

   @Override
    public void goToHelpURL() {
        BrowserLauncher.openURL("https://nmsm.rice.edu/treatment-optimization/");
    }

    @Override
    // void forceWritableProperties(OpenSimObject dObject) {
    //     super.forceWritableProperties(dObject); //To change body of generated methods, choose Tools | Templates.
        // AbstractProperty ap = dObject.getPropertyByName("RCNLCostTermSet");
        // PropertyObjectList olist = PropertyObjectList.getAs(ap);
        // for (int i=0; i< olist.size(); i++){
        //     OpenSimObject costterm = olist.getValue(i);
        //     costterm.updPropertyByName("max_allowable_error").setValueIsDefault(false);
        // }
    //     dObject.updPropertyByName("trial_name").setValueIsDefault(false);
    //     dObject.updPropertyByName("joint_position_range_scale_factor").setValueIsDefault(false);
    //     dObject.updPropertyByName("joint_velocity_range_scale_factor").setValueIsDefault(false);
    //     dObject.updPropertyByName("joint_acceleration_range_scale_factor").setValueIsDefault(false);
    // }

    void forceWritableProperties(OpenSimObject dObject) {
        super.forceWritableProperties(dObject); //To change body of generated methods, choose Tools | Templates.
        
        dObject.updPropertyByName("results_directory").setValueIsDefault(false);
        dObject.updPropertyByName("tracked_quantities_directory").setValueIsDefault(false);
        dObject.updPropertyByName("initial_guess_directory").setValueIsDefault(false);
        dObject.updPropertyByName("input_model_file").setValueIsDefault(false);
        dObject.updPropertyByName("input_osimx_file").setValueIsDefault(false);
        dObject.updPropertyByName("optimal_control_solver_settings_file").setValueIsDefault(false);
        dObject.updPropertyByName("trial_name").setValueIsDefault(false);
        dObject.updPropertyByName("states_coordinate_list").setValueIsDefault(false);
        dObject.updPropertyByName("optimal_control_solver_settings_file").setValueIsDefault(false);
        dObject.updPropertyByName("optimal_control_solver_settings_file").setValueIsDefault(false);

        AbstractProperty synergyController = dObject.getPropertyByName("RCNLSynergyController");
        OpenSimObject synergyControllerProperties = PropertyObjectList.getAs(synergyController).getValue(0);
        if (synergyControllerProperties.getPropertyByName("surrogate_model_data_directory").getValueIsDefault()){
            synergyController.setValueIsDefault(true);
        }

        AbstractProperty costTermSet = dObject.getPropertyByName("RCNLCostTermSet");
        costTermSet.setValueIsDefault(false);
        PropertyObjectList costTermList = PropertyObjectList.getAs(costTermSet);
        for (int i=0; i< costTermList.size(); i++){
            OpenSimObject costTerm = costTermList.getValue(i);
            costTerm.updPropertyByName("max_allowable_error").setValueIsDefault(false);

            if (!costTerm.getPropertyByName("marker_list").getValueIsDefault()){
                costTerm.updPropertyByName("axes").setValueIsDefault(false);
            }
            else if (!costTerm.getPropertyByName("body_list").getValueIsDefault()) {
                costTerm.updPropertyByName("axes").setValueIsDefault(false);
                costTerm.updPropertyByName("sequence").setValueIsDefault(false);
            }
            else if (!costTerm.getPropertyByName("hindfoot_body_list").getValueIsDefault()) {
                costTerm.updPropertyByName("axes").setValueIsDefault(false);
            }
        }
        AbstractProperty constraintTermSet = dObject.getPropertyByName("RCNLConstraintTermSet");
        constraintTermSet.setValueIsDefault(false);
        PropertyObjectList constraintTermList = PropertyObjectList.getAs(constraintTermSet);
        for (int i=0; i< constraintTermList.size(); i++){
            OpenSimObject constraintTerm = constraintTermList.getValue(i);
            constraintTerm.updPropertyByName("max_error").setValueIsDefault(false);
            constraintTerm.updPropertyByName("min_error").setValueIsDefault(false);
           
            if (!constraintTerm.getPropertyByName("marker_list").getValueIsDefault()){
                constraintTerm.updPropertyByName("axes").setValueIsDefault(false);
            }
            else if (!constraintTerm.getPropertyByName("body_list").getValueIsDefault()) {
                constraintTerm.updPropertyByName("axes").setValueIsDefault(false);
                constraintTerm.updPropertyByName("sequence").setValueIsDefault(false);
            }
            else if (!constraintTerm.getPropertyByName("hindfoot_body_list").getValueIsDefault()) {
                constraintTerm.updPropertyByName("axes").setValueIsDefault(false);
            }
        }
        dObject.updPropertyByName("trial_name").setValueIsDefault(false);
        dObject.updPropertyByName("joint_position_range_scale_factor").setValueIsDefault(false);
        dObject.updPropertyByName("joint_velocity_range_scale_factor").setValueIsDefault(false);
        dObject.updPropertyByName("joint_acceleration_range_scale_factor").setValueIsDefault(false);
    }

    
}
