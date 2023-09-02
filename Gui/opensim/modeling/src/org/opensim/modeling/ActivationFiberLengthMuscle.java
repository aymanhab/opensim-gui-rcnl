/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A base class representing a two-state muscle-tendon actuator. <br>
 * It adds activation and fiber-length states and dynamics to the <br>
 * Muscle class, but does not implement all of the necessary methods,<br>
 * so it is abstract as well. The path information for a muscle is contained<br>
 * in the Muscle class, and the force-generating behavior should be defined in<br>
 * the derived classes.<br>
 * <br>
 * @author Ajay Seth<br>
 * <br>
 * (Based on earlier work by Peter Loan and Frank C. Anderson.)
 */
public class ActivationFiberLengthMuscle extends Muscle {
  private transient long swigCPtr;

  public ActivationFiberLengthMuscle(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ActivationFiberLengthMuscle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ActivationFiberLengthMuscle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ActivationFiberLengthMuscle obj) {
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
        opensimSimulationJNI.delete_ActivationFiberLengthMuscle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ActivationFiberLengthMuscle safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ActivationFiberLengthMuscle_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ActivationFiberLengthMuscle(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ActivationFiberLengthMuscle_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ActivationFiberLengthMuscle(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_default_activation(ActivationFiberLengthMuscle source) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_copyProperty_default_activation(swigCPtr, this, ActivationFiberLengthMuscle.getCPtr(source), source);
  }

  public double get_default_activation(int i) {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_get_default_activation__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_activation(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ActivationFiberLengthMuscle_upd_default_activation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_activation(int i, double value) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_set_default_activation__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_activation(double value) {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_append_default_activation(swigCPtr, this, value);
  }

  public void constructProperty_default_activation(double initValue) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_constructProperty_default_activation(swigCPtr, this, initValue);
  }

  public double get_default_activation() {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_get_default_activation__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_activation() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ActivationFiberLengthMuscle_upd_default_activation__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_activation(double value) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_set_default_activation__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_default_fiber_length(ActivationFiberLengthMuscle source) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_copyProperty_default_fiber_length(swigCPtr, this, ActivationFiberLengthMuscle.getCPtr(source), source);
  }

  public double get_default_fiber_length(int i) {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_get_default_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ActivationFiberLengthMuscle_upd_default_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_fiber_length(int i, double value) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_set_default_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_fiber_length(double value) {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_append_default_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_default_fiber_length(double initValue) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_constructProperty_default_fiber_length(swigCPtr, this, initValue);
  }

  public double get_default_fiber_length() {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_get_default_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_fiber_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ActivationFiberLengthMuscle_upd_default_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_fiber_length(double value) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_set_default_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public double getDefaultActivation() {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_getDefaultActivation(swigCPtr, this);
  }

  public void setDefaultActivation(double activation) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_setDefaultActivation(swigCPtr, this, activation);
  }

  public double getDefaultFiberLength() {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_getDefaultFiberLength(swigCPtr, this);
  }

  public void setDefaultFiberLength(double length) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_setDefaultFiberLength(swigCPtr, this, length);
  }

  public void setActivation(State s, double activation) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_setActivation(swigCPtr, this, State.getCPtr(s), s, activation);
  }

  public void setFiberLength(State s, double fiberLength) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_setFiberLength(swigCPtr, this, State.getCPtr(s), s, fiberLength);
  }

  public double getActivationRate(State s) {
    return opensimSimulationJNI.ActivationFiberLengthMuscle_getActivationRate(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  Adjust the properties of the muscle after the model has been scaled. The<br>
   *         optimal fiber length and tendon slack length are each multiplied by the<br>
   *         ratio of the current path length and the path length before scaling. 
   */
  public void extendPostScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.ActivationFiberLengthMuscle_extendPostScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}
