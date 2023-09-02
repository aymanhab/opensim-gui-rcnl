/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * An abstract class for specifying the interface for an investigation.<br>
 * <br>
 * @author Frank C. Anderson<br>
 * @version 1.0
 */
public class RRATool extends AbstractTool {
  private transient long swigCPtr;

  public RRATool(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.RRATool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RRATool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(RRATool obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_RRATool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static RRATool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.RRATool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new RRATool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.RRATool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.RRATool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new RRATool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getConcreteClassName(swigCPtr, this);
  }

  public RRATool() {
    this(opensimActuatorsAnalysesToolsJNI.new_RRATool__SWIG_0(), true);
  }

  public RRATool(String aFileName, boolean aLoadModel) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_RRATool__SWIG_1(aFileName, aLoadModel), true);
  }

  public RRATool(String aFileName) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_RRATool__SWIG_2(aFileName), true);
  }

  public RRATool(RRATool aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_RRATool__SWIG_3(RRATool.getCPtr(aObject), aObject), true);
  }

  public String getDesiredPointsFileName() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getDesiredPointsFileName(swigCPtr, this);
  }

  public void setDesiredPointsFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setDesiredPointsFileName(swigCPtr, this, aFileName);
  }

  public String getDesiredKinematicsFileName() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getDesiredKinematicsFileName(swigCPtr, this);
  }

  public void setDesiredKinematicsFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setDesiredKinematicsFileName(swigCPtr, this, aFileName);
  }

  public String getConstraintsFileName() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getConstraintsFileName(swigCPtr, this);
  }

  public void setConstraintsFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setConstraintsFileName(swigCPtr, this, aFileName);
  }

  public String getTaskSetFileName() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getTaskSetFileName(swigCPtr, this);
  }

  public void setTaskSetFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setTaskSetFileName(swigCPtr, this, aFileName);
  }

  public String getOutputModelFileName() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getOutputModelFileName(swigCPtr, this);
  }

  public void setOutputModelFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setOutputModelFileName(swigCPtr, this, aFileName);
  }

  public boolean getAdjustCOMToReduceResiduals() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getAdjustCOMToReduceResiduals(swigCPtr, this);
  }

  public void setAdjustCOMToReduceResiduals(boolean aAdjust) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setAdjustCOMToReduceResiduals(swigCPtr, this, aAdjust);
  }

  public String getAdjustedCOMBody() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getAdjustedCOMBody(swigCPtr, this);
  }

  public void setAdjustedCOMBody(String aBody) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setAdjustedCOMBody(swigCPtr, this, aBody);
  }

  public double getLowpassCutoffFrequency() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getLowpassCutoffFrequency(swigCPtr, this);
  }

  public void setLowpassCutoffFrequency(double aLowpassCutoffFrequency) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setLowpassCutoffFrequency(swigCPtr, this, aLowpassCutoffFrequency);
  }

  public String getExternalLoadsFileName() {
    return opensimActuatorsAnalysesToolsJNI.RRATool_getExternalLoadsFileName(swigCPtr, this);
  }

  public void setExternalLoadsFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setExternalLoadsFileName(swigCPtr, this, aFileName);
  }

  public boolean run() throws java.io.IOException {
    return opensimActuatorsAnalysesToolsJNI.RRATool_run(swigCPtr, this);
  }

  public Storage getForceStorage() {
    return new Storage(opensimActuatorsAnalysesToolsJNI.RRATool_getForceStorage(swigCPtr, this), false);
  }

  public void setOriginalForceSet(ForceSet aForceSet) {
    opensimActuatorsAnalysesToolsJNI.RRATool_setOriginalForceSet(swigCPtr, this, ForceSet.getCPtr(aForceSet), aForceSet);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimActuatorsAnalysesToolsJNI.RRATool_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimActuatorsAnalysesToolsJNI.RRATool_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

}
