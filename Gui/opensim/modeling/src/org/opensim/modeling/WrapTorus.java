/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a torus for muscle wrapping.<br>
 * <br>
 * @author Peter Loan  <br>
 * updated for OpenSim 4.0 by Benjamin Michaud, 2019.
 */
public class WrapTorus extends WrapObject {
  private transient long swigCPtr;

  public WrapTorus(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.WrapTorus_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapTorus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(WrapTorus obj) {
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
        opensimSimulationJNI.delete_WrapTorus(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapTorus safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.WrapTorus_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapTorus(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.WrapTorus_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.WrapTorus_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.WrapTorus_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapTorus(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.WrapTorus_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_inner_radius(WrapTorus source) {
    opensimSimulationJNI.WrapTorus_copyProperty_inner_radius(swigCPtr, this, WrapTorus.getCPtr(source), source);
  }

  public double get_inner_radius(int i) {
    return opensimSimulationJNI.WrapTorus_get_inner_radius__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_inner_radius(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.WrapTorus_upd_inner_radius__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_inner_radius(int i, double value) {
    opensimSimulationJNI.WrapTorus_set_inner_radius__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_inner_radius(double value) {
    return opensimSimulationJNI.WrapTorus_append_inner_radius(swigCPtr, this, value);
  }

  public void constructProperty_inner_radius(double initValue) {
    opensimSimulationJNI.WrapTorus_constructProperty_inner_radius(swigCPtr, this, initValue);
  }

  public double get_inner_radius() {
    return opensimSimulationJNI.WrapTorus_get_inner_radius__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_inner_radius() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.WrapTorus_upd_inner_radius__SWIG_1(swigCPtr, this), false);
  }

  public void set_inner_radius(double value) {
    opensimSimulationJNI.WrapTorus_set_inner_radius__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_outer_radius(WrapTorus source) {
    opensimSimulationJNI.WrapTorus_copyProperty_outer_radius(swigCPtr, this, WrapTorus.getCPtr(source), source);
  }

  public double get_outer_radius(int i) {
    return opensimSimulationJNI.WrapTorus_get_outer_radius__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_outer_radius(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.WrapTorus_upd_outer_radius__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_outer_radius(int i, double value) {
    opensimSimulationJNI.WrapTorus_set_outer_radius__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_outer_radius(double value) {
    return opensimSimulationJNI.WrapTorus_append_outer_radius(swigCPtr, this, value);
  }

  public void constructProperty_outer_radius(double initValue) {
    opensimSimulationJNI.WrapTorus_constructProperty_outer_radius(swigCPtr, this, initValue);
  }

  public double get_outer_radius() {
    return opensimSimulationJNI.WrapTorus_get_outer_radius__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_outer_radius() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.WrapTorus_upd_outer_radius__SWIG_1(swigCPtr, this), false);
  }

  public void set_outer_radius(double value) {
    opensimSimulationJNI.WrapTorus_set_outer_radius__SWIG_1(swigCPtr, this, value);
  }

  public WrapTorus() {
    this(opensimSimulationJNI.new_WrapTorus(), true);
  }

  public String getWrapTypeName() {
    return opensimSimulationJNI.WrapTorus_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimSimulationJNI.WrapTorus_getDimensionsString(swigCPtr, this);
  }

  public double getInnerRadius() {
    return opensimSimulationJNI.WrapTorus_getInnerRadius(swigCPtr, this);
  }

  public double getOuterRadius() {
    return opensimSimulationJNI.WrapTorus_getOuterRadius(swigCPtr, this);
  }

  /**
   *  Scale the torus's dimensions. The base class (WrapObject) scales the<br>
   *         origin of the torus in the body's reference frame. 
   */
  public void extendScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.WrapTorus_extendScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}
