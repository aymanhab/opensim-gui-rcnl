/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.rcnl;

import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PropertyBoolList;
import org.opensim.modeling.PropertyObjectList;
import org.opensim.modeling.PropertyStringList;

/**
 *
 * @author Ayman-NMBL
 */
public class TreatmentOptimizationToolModel {

    private OpenSimObject toolAsObject;

    public enum Mode { TrackingOptimization, VerificationOptimization, DesignOptimization };
    public Mode mode;
    private Model model;
    // Cache properties for editing
    private PropertyStringList propInputOsimxFileString;
    private PropertyStringList propInitialGuessDirString;
    private PropertyStringList propTrackedQuantitiesDirString;
    private PropertyStringList propResultsDirString;
    private PropertyStringList propOCSettingsFileString;
    private PropertyStringList propStatesCoordinateListString;
    private OpenSimObject propRCNLSynergyControllerObject;
    private PropertyBoolList propOptimizeForSynvergyVectorBool;
    private PropertyStringList propSurrogateModelDirString;
    
    public TreatmentOptimizationToolModel(Model model, Mode mode) {
        // TODO in case plugin is not preloaded, guard against null return or exception thown
        this.mode = mode;
        switch(mode) {
            case TrackingOptimization:
                toolAsObject = OpenSimObject.newInstanceOfType("TrackingOptimizationTool");
                break;
            case VerificationOptimization:
                toolAsObject = OpenSimObject.newInstanceOfType("VerificationOptimizationTool");
                break;
            case DesignOptimization:
            default:
                toolAsObject = OpenSimObject.newInstanceOfType("DesignOptimizationTool");
                break;
        }
        this.model = model;

        connectPropertiesToClassMembers();
    }
    public TreatmentOptimizationToolModel(Model model, String fileXml) {
        // TODO in case plugin is not preloaded, guard against null return or exception thown
        toolAsObject = OpenSimObject.makeObjectFromFile(fileXml);
        this.model = model;

        connectPropertiesToClassMembers();
    }


    /**
     * @return the toolAsObject
     */
    public OpenSimObject getToolAsObject() {
        return toolAsObject;
    }

    /**
     * @param toolAsObject the toolAsObject to set
     */
    public void setToolAsObject(OpenSimObject toolAsObject) {
        this.toolAsObject = toolAsObject;
    }
    
    
    private void connectPropertiesToClassMembers() {
        AbstractProperty propInputOsimxFile = toolAsObject.updPropertyByName("input_osimx_file");
        propInputOsimxFileString = PropertyStringList.getAs(propInputOsimxFile);
        AbstractProperty propInitialGuessDir = toolAsObject.updPropertyByName("initial_guess_directory");
        propInitialGuessDirString = PropertyStringList.getAs(propInitialGuessDir);
        AbstractProperty propTrackedQuantitiesDir = toolAsObject.updPropertyByName("tracked_quantities_directory");
        propTrackedQuantitiesDirString = PropertyStringList.getAs(propTrackedQuantitiesDir);
        AbstractProperty propResultsDir = toolAsObject.updPropertyByName("results_directory");
        propResultsDirString = PropertyStringList.getAs(propResultsDir);
        AbstractProperty propOCSettingsFile = toolAsObject.updPropertyByName("optimal_control_solver_settings_file");
        propOCSettingsFileString = PropertyStringList.getAs(propOCSettingsFile);
        AbstractProperty propStatesCoordinateList = toolAsObject.updPropertyByName("states_coordinate_list");        
        propStatesCoordinateListString = PropertyStringList.getAs(propStatesCoordinateList);
        propRCNLSynergyControllerObject = toolAsObject.updPropertyByName("RCNLSynergyController").getValueAsObject(); 
        // Convert to ObjectProperty so we can dig deeper
        propOptimizeForSynvergyVectorBool = PropertyBoolList.getAs(propRCNLSynergyControllerObject.updPropertyByName("optimize_synergy_vectors"));
        propSurrogateModelDirString = PropertyStringList.getAs(propRCNLSynergyControllerObject.updPropertyByName("surrogate_model_data_directory"));
        propStatesCoordinateListString = PropertyStringList.getAs(propStatesCoordinateList);

    }
    
    String getOutputResultDir() {
        if (propResultsDirString.size()==1)
            return propResultsDirString.getValue();
        return "";
    }

    void setOutputResultDir(String fileName) {
        propResultsDirString.setValue(fileName);
    }
    
    String getInputOsimxFile() {
        if (propInputOsimxFileString.size()==1)
            return propInputOsimxFileString.getValue(0);
        return "";
    }
    
    void setInputOsimxFile(String newFileName) {
        propInputOsimxFileString.setValue(newFileName);
    }

    String getInitialGuessDir() {
        if (propInitialGuessDirString.size()==1)
            return propInitialGuessDirString.getValue();
        return "";
    }

    void setInitialGuessDir(String fileName) {
        propInitialGuessDirString.setValue(fileName);
    }
    
    String getTrackedQuantitiesDir() {
        if (propTrackedQuantitiesDirString.size()==1)
            return propTrackedQuantitiesDirString.getValue();
        return "";
    }

    void setTrackedQuantitiesDir(String fileName) {
        propTrackedQuantitiesDirString.setValue(fileName);
    }

    String getOCSettingsFile() {
        if (propOCSettingsFileString.size()==1)
            return propOCSettingsFileString.getValue(0);
        return "";
    }
    
    void setOCSettingsFile(String newFileName) {
        propOCSettingsFileString.setValue(newFileName);
    }
    
    PropertyStringList getPropCoordinateListString() {
        return propStatesCoordinateListString;
    }
    
    String getSurrogateModelDir() {
        if (propSurrogateModelDirString.size()==1)
            return propSurrogateModelDirString.getValue();
        return "";
    }

    void setSurrogateModelDir(String fileName) {
        propSurrogateModelDirString.setValue(fileName);
    }
    
    boolean getOptimizeSynergyVector() {
        if (propOptimizeForSynvergyVectorBool.size()==1)
            return propOptimizeForSynvergyVectorBool.getValue();
        return false;
    }

    void setOptimizeSynergyVector(boolean newValue) {
        propOptimizeForSynvergyVectorBool.setValue(newValue);
    }
    
}
