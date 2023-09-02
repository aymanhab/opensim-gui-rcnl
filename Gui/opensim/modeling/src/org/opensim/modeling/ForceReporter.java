/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for recording the Forces applied to a model<br>
 * during a simulation.<br>
 * <br>
 * @author Ayman Habib<br>
 * @version 1.0
 */
public class ForceReporter extends Analysis {
  private transient long swigCPtr;

  public ForceReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ForceReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ForceReporter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ForceReporter obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_ForceReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ForceReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ForceReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ForceReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ForceReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ForceReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ForceReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_getConcreteClassName(swigCPtr, this);
  }

  public ForceReporter(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_ForceReporter__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public ForceReporter() {
    this(opensimActuatorsAnalysesToolsJNI.new_ForceReporter__SWIG_1(), true);
  }

  public ForceReporter(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_ForceReporter__SWIG_2(aFileName), true);
  }

  public ForceReporter(ForceReporter aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_ForceReporter__SWIG_3(ForceReporter.getCPtr(aObject), aObject), true);
  }

  public Storage getForceStorage() {
    return new Storage(opensimActuatorsAnalysesToolsJNI.ForceReporter_getForceStorage(swigCPtr, this), false);
  }

  public Storage updForceStorage() {
    return new Storage(opensimActuatorsAnalysesToolsJNI.ForceReporter_updForceStorage(swigCPtr, this), false);
  }

  /**
   *  Get forces table.                                                     
   */
  public TimeSeriesTable getForcesTable() {
    return new TimeSeriesTable(opensimActuatorsAnalysesToolsJNI.ForceReporter_getForcesTable(swigCPtr, this), true);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.ForceReporter_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void includeConstraintForces(boolean flag) {
    opensimActuatorsAnalysesToolsJNI.ForceReporter_includeConstraintForces(swigCPtr, this, flag);
  }

  public int begin(State s) {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.ForceReporter_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
