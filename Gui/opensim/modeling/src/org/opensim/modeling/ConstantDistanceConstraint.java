/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a constraint that maintains a constant distance between<br>
 * between two points on separate PhysicalFrames. <br>
 * The underlying SimTK::Constraint in Simbody is a SimTK::Constraint::Rod.<br>
 * <br>
 * @author Matt DeMers
 */
public class ConstantDistanceConstraint extends Constraint {
  private transient long swigCPtr;

  public ConstantDistanceConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ConstantDistanceConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ConstantDistanceConstraint obj) {
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
        opensimSimulationJNI.delete_ConstantDistanceConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ConstantDistanceConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ConstantDistanceConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ConstantDistanceConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ConstantDistanceConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ConstantDistanceConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ConstantDistanceConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ConstantDistanceConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ConstantDistanceConstraint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_location_body_1(ConstantDistanceConstraint source) {
    opensimSimulationJNI.ConstantDistanceConstraint_copyProperty_location_body_1(swigCPtr, this, ConstantDistanceConstraint.getCPtr(source), source);
  }

  public Vec3 get_location_body_1(int i) {
    return new Vec3(opensimSimulationJNI.ConstantDistanceConstraint_get_location_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location_body_1(int i) {
    return new Vec3(opensimSimulationJNI.ConstantDistanceConstraint_upd_location_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_body_1(int i, Vec3 value) {
    opensimSimulationJNI.ConstantDistanceConstraint_set_location_body_1__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location_body_1(Vec3 value) {
    return opensimSimulationJNI.ConstantDistanceConstraint_append_location_body_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location_body_1(Vec3 initValue) {
    opensimSimulationJNI.ConstantDistanceConstraint_constructProperty_location_body_1(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location_body_1() {
    return new Vec3(opensimSimulationJNI.ConstantDistanceConstraint_get_location_body_1__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location_body_1() {
    return new Vec3(opensimSimulationJNI.ConstantDistanceConstraint_upd_location_body_1__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_body_1(Vec3 value) {
    opensimSimulationJNI.ConstantDistanceConstraint_set_location_body_1__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_location_body_2(ConstantDistanceConstraint source) {
    opensimSimulationJNI.ConstantDistanceConstraint_copyProperty_location_body_2(swigCPtr, this, ConstantDistanceConstraint.getCPtr(source), source);
  }

  public Vec3 get_location_body_2(int i) {
    return new Vec3(opensimSimulationJNI.ConstantDistanceConstraint_get_location_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location_body_2(int i) {
    return new Vec3(opensimSimulationJNI.ConstantDistanceConstraint_upd_location_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_body_2(int i, Vec3 value) {
    opensimSimulationJNI.ConstantDistanceConstraint_set_location_body_2__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location_body_2(Vec3 value) {
    return opensimSimulationJNI.ConstantDistanceConstraint_append_location_body_2(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location_body_2(Vec3 initValue) {
    opensimSimulationJNI.ConstantDistanceConstraint_constructProperty_location_body_2(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location_body_2() {
    return new Vec3(opensimSimulationJNI.ConstantDistanceConstraint_get_location_body_2__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location_body_2() {
    return new Vec3(opensimSimulationJNI.ConstantDistanceConstraint_upd_location_body_2__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_body_2(Vec3 value) {
    opensimSimulationJNI.ConstantDistanceConstraint_set_location_body_2__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_constant_distance(ConstantDistanceConstraint source) {
    opensimSimulationJNI.ConstantDistanceConstraint_copyProperty_constant_distance(swigCPtr, this, ConstantDistanceConstraint.getCPtr(source), source);
  }

  public double get_constant_distance(int i) {
    return opensimSimulationJNI.ConstantDistanceConstraint_get_constant_distance__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_constant_distance(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ConstantDistanceConstraint_upd_constant_distance__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_constant_distance(int i, double value) {
    opensimSimulationJNI.ConstantDistanceConstraint_set_constant_distance__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_constant_distance(double value) {
    return opensimSimulationJNI.ConstantDistanceConstraint_append_constant_distance(swigCPtr, this, value);
  }

  public void constructProperty_constant_distance(double initValue) {
    opensimSimulationJNI.ConstantDistanceConstraint_constructProperty_constant_distance(swigCPtr, this, initValue);
  }

  public double get_constant_distance() {
    return opensimSimulationJNI.ConstantDistanceConstraint_get_constant_distance__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_constant_distance() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ConstantDistanceConstraint_upd_constant_distance__SWIG_1(swigCPtr, this), false);
  }

  public void set_constant_distance(double value) {
    opensimSimulationJNI.ConstantDistanceConstraint_set_constant_distance__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_socket_body_1(SWIGTYPE_p_OpenSim__PropertyIndex value) {
    opensimSimulationJNI.ConstantDistanceConstraint_PropertyIndex_socket_body_1_set(swigCPtr, this, SWIGTYPE_p_OpenSim__PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex getPropertyIndex_socket_body_1() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.ConstantDistanceConstraint_PropertyIndex_socket_body_1_get(swigCPtr, this), true);
  }

  public void connectSocket_body_1(OpenSimObject object) {
    opensimSimulationJNI.ConstantDistanceConstraint_connectSocket_body_1(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_body_2(SWIGTYPE_p_OpenSim__PropertyIndex value) {
    opensimSimulationJNI.ConstantDistanceConstraint_PropertyIndex_socket_body_2_set(swigCPtr, this, SWIGTYPE_p_OpenSim__PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex getPropertyIndex_socket_body_2() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.ConstantDistanceConstraint_PropertyIndex_socket_body_2_get(swigCPtr, this), true);
  }

  public void connectSocket_body_2(OpenSimObject object) {
    opensimSimulationJNI.ConstantDistanceConstraint_connectSocket_body_2(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public ConstantDistanceConstraint() {
    this(opensimSimulationJNI.new_ConstantDistanceConstraint__SWIG_0(), true);
  }

  /**
   * Convenience Constructor.<br>
   * <br>
   * @param body1          first PhysicalFrame connected by the constraint<br>
   * @param locationBody1  point fixed on body1 where the constraint is applied<br>
   * @param body2          second PhysicalFrame connected by the constraint<br>
   * @param locationBody2: point fixed on body2 where the constraint is applied<br>
   * @param distance       nonzero fixed distance between the points
   */
  public ConstantDistanceConstraint(PhysicalFrame body1, Vec3 locationBody1, PhysicalFrame body2, Vec3 locationBody2, double distance) {
    this(opensimSimulationJNI.new_ConstantDistanceConstraint__SWIG_1(PhysicalFrame.getCPtr(body1), body1, Vec3.getCPtr(locationBody1), locationBody1, PhysicalFrame.getCPtr(body2), body2, Vec3.getCPtr(locationBody2), locationBody2, distance), true);
  }

  /**
   *  The Physical frames that the constraint is connected to are<br>
   *         accessible after connectToModel() has been called on the Model. 
   */
  public PhysicalFrame getBody1() {
    return new PhysicalFrame(opensimSimulationJNI.ConstantDistanceConstraint_getBody1(swigCPtr, this), false);
  }

  public PhysicalFrame getBody2() {
    return new PhysicalFrame(opensimSimulationJNI.ConstantDistanceConstraint_getBody2(swigCPtr, this), false);
  }

  public void setBody1ByName(String aBodyName) {
    opensimSimulationJNI.ConstantDistanceConstraint_setBody1ByName(swigCPtr, this, aBodyName);
  }

  public void setBody1PointLocation(Vec3 location) {
    opensimSimulationJNI.ConstantDistanceConstraint_setBody1PointLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public void setBody2ByName(String aBodyName) {
    opensimSimulationJNI.ConstantDistanceConstraint_setBody2ByName(swigCPtr, this, aBodyName);
  }

  public void setBody2PointLocation(Vec3 location) {
    opensimSimulationJNI.ConstantDistanceConstraint_setBody2PointLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public void setConstantDistance(double distance) {
    opensimSimulationJNI.ConstantDistanceConstraint_setConstantDistance(swigCPtr, this, distance);
  }

}
