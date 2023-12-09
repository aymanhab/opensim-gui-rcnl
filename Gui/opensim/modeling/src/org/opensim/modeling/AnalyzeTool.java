/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * An abstract class for specifying the interface for an investigation.<br>
 * <br>
 * @author Frank C. Anderson<br>
 * @version 1.0
 */
public class AnalyzeTool extends AbstractTool {
  private transient long swigCPtr;

  public AnalyzeTool(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.AnalyzeTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AnalyzeTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_AnalyzeTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AnalyzeTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.AnalyzeTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AnalyzeTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.AnalyzeTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AnalyzeTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_getConcreteClassName(swigCPtr, this);
  }

  public AnalyzeTool() {
    this(opensimActuatorsAnalysesToolsJNI.new_AnalyzeTool__SWIG_0(), true);
  }

  public AnalyzeTool(String aFileName, boolean aLoadModelAndInput) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_AnalyzeTool__SWIG_1(aFileName, aLoadModelAndInput), true);
  }

  public AnalyzeTool(String aFileName) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_AnalyzeTool__SWIG_2(aFileName), true);
  }

  public AnalyzeTool(AnalyzeTool aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_AnalyzeTool__SWIG_3(AnalyzeTool.getCPtr(aObject), aObject), true);
  }

  public AnalyzeTool(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_AnalyzeTool__SWIG_4(Model.getCPtr(aModel), aModel), true);
  }

  public void setStatesStorage(Storage aStore) {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_setStatesStorage(swigCPtr, this, Storage.getCPtr(aStore), aStore);
  }

  public static Storage createStatesStorageFromCoordinatesAndSpeeds(Model aModel, Storage aQStore, Storage aUStore) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.AnalyzeTool_createStatesStorageFromCoordinatesAndSpeeds(Model.getCPtr(aModel), aModel, Storage.getCPtr(aQStore), aQStore, Storage.getCPtr(aUStore), aUStore);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getStatesStorage() {
    return new Storage(opensimActuatorsAnalysesToolsJNI.AnalyzeTool_getStatesStorage(swigCPtr, this), false);
  }

  public String getStatesFileName() {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_getStatesFileName(swigCPtr, this);
  }

  public void setStatesFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_setStatesFileName(swigCPtr, this, aFileName);
  }

  public String getCoordinatesFileName() {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_getCoordinatesFileName(swigCPtr, this);
  }

  public void setCoordinatesFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_setCoordinatesFileName(swigCPtr, this, aFileName);
  }

  public String getSpeedsFileName() {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_getSpeedsFileName(swigCPtr, this);
  }

  public void setSpeedsFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_setSpeedsFileName(swigCPtr, this, aFileName);
  }

  public double getLowpassCutoffFrequency() {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_getLowpassCutoffFrequency(swigCPtr, this);
  }

  public void setLowpassCutoffFrequency(double aLowpassCutoffFrequency) {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_setLowpassCutoffFrequency(swigCPtr, this, aLowpassCutoffFrequency);
  }

  public boolean getLoadModelAndInput() {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_getLoadModelAndInput(swigCPtr, this);
  }

  public void setLoadModelAndInput(boolean b) {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_setLoadModelAndInput(swigCPtr, this, b);
  }

  public void setStatesFromMotion(State s, Storage aMotion, boolean aInDegrees) throws java.io.IOException {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_setStatesFromMotion(swigCPtr, this, State.getCPtr(s), s, Storage.getCPtr(aMotion), aMotion, aInDegrees);
  }

  public void loadStatesFromFile(State s) throws java.io.IOException {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_loadStatesFromFile(swigCPtr, this, State.getCPtr(s), s);
  }

  public void verifyControlsStates() {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_verifyControlsStates(swigCPtr, this);
  }

  public void setPrintResultFiles(boolean aToWrite) {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_setPrintResultFiles(swigCPtr, this, aToWrite);
  }

  public void disableIntegrationOnlyProbes() {
    opensimActuatorsAnalysesToolsJNI.AnalyzeTool_disableIntegrationOnlyProbes(swigCPtr, this);
  }

  public boolean run() throws java.io.IOException {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_run__SWIG_0(swigCPtr, this);
  }

  public boolean run(boolean plotting) throws java.io.IOException {
    return opensimActuatorsAnalysesToolsJNI.AnalyzeTool_run__SWIG_1(swigCPtr, this, plotting);
  }

}
