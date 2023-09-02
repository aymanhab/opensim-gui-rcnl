/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a set of parameters describing how to scale a model<br>
 * to fit a subject, place markers on it, and do IK on one or more motion<br>
 * trials.<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class ScaleTool extends OpenSimObject {
  private transient long swigCPtr;

  public ScaleTool(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ScaleTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ScaleTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ScaleTool obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_ScaleTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ScaleTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ScaleTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ScaleTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ScaleTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ScaleTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getConcreteClassName(swigCPtr, this);
  }

  public ScaleTool() {
    this(opensimActuatorsAnalysesToolsJNI.new_ScaleTool__SWIG_0(), true);
  }

  public ScaleTool(String aFileName) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_ScaleTool__SWIG_1(aFileName), true);
  }

  public ScaleTool(ScaleTool aSubject) {
    this(opensimActuatorsAnalysesToolsJNI.new_ScaleTool__SWIG_2(ScaleTool.getCPtr(aSubject), aSubject), true);
  }

  public void copyData(ScaleTool aSubject) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_copyData(swigCPtr, this, ScaleTool.getCPtr(aSubject), aSubject);
  }

  public Model createModel() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ScaleTool_createModel(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public GenericModelMaker getGenericModelMaker() {
    return new GenericModelMaker(opensimActuatorsAnalysesToolsJNI.ScaleTool_getGenericModelMaker(swigCPtr, this), false);
  }

  public ModelScaler getModelScaler() {
    return new ModelScaler(opensimActuatorsAnalysesToolsJNI.ScaleTool_getModelScaler(swigCPtr, this), false);
  }

  public MarkerPlacer getMarkerPlacer() {
    return new MarkerPlacer(opensimActuatorsAnalysesToolsJNI.ScaleTool_getMarkerPlacer(swigCPtr, this), false);
  }

  /**
   *  Run the scale tool. This first runs the ModelScaler, then runs the<br>
   * MarkerPlacer. This is the method called by the command line `scale`<br>
   * executable. <br>
   * @return whether or not the scale procedure was successful. 
   */
  public boolean run() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_run(swigCPtr, this);
  }

  public boolean isDefaultGenericModelMaker() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_isDefaultGenericModelMaker(swigCPtr, this);
  }

  public boolean isDefaultModelScaler() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_isDefaultModelScaler(swigCPtr, this);
  }

  public boolean isDefaultMarkerPlacer() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_isDefaultMarkerPlacer(swigCPtr, this);
  }

  public static void registerTypes() {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_registerTypes();
  }

  /**
   *  Accessor methods to obtain model attributes 
   */
  public double getSubjectMass() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getSubjectMass(swigCPtr, this);
  }

  public double getSubjectAge() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getSubjectAge(swigCPtr, this);
  }

  public double getSubjectHeight() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getSubjectHeight(swigCPtr, this);
  }

  public void setSubjectMass(double mass) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setSubjectMass(swigCPtr, this, mass);
  }

  public void setSubjectAge(double age) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setSubjectAge(swigCPtr, this, age);
  }

  public void setSubjectHeight(double height) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setSubjectHeight(swigCPtr, this, height);
  }

  /**
   * Accessor methods to set and get path to Subject. This is needed<br>
   * since all file names referred to in the subject file are relative<br>
   * to the subject file.
   */
  public String getPathToSubject() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getPathToSubject(swigCPtr, this);
  }

  public void setPathToSubject(String aPath) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setPathToSubject(swigCPtr, this, aPath);
  }

  public void setPrintResultFiles(boolean aToWrite) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setPrintResultFiles(swigCPtr, this, aToWrite);
  }

}
