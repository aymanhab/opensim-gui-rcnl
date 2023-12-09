/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A Station is a Point fixed to and located on a PhysicalFrame, which can be<br>
 * a Body, Ground or any PhysicalOffsetFrame. Stations are analogous to<br>
 * PhyscialOffsetFrames where joints, constraints and forces can be attached<br>
 * and/or applied.<br>
 * <br>
 * @author Ayman Habib, Ajay Seth
 */
public class Station extends Point {
  private transient long swigCPtr;

  public Station(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Station_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Station obj) {
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
        opensimSimulationJNI.delete_Station(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Station safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Station_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Station(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Station_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Station_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Station_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Station(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Station_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_location(Station source) {
    opensimSimulationJNI.Station_copyProperty_location(swigCPtr, this, Station.getCPtr(source), source);
  }

  public Vec3 get_location(int i) {
    return new Vec3(opensimSimulationJNI.Station_get_location__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location(int i) {
    return new Vec3(opensimSimulationJNI.Station_upd_location__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location(int i, Vec3 value) {
    opensimSimulationJNI.Station_set_location__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location(Vec3 value) {
    return opensimSimulationJNI.Station_append_location(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location(Vec3 initValue) {
    opensimSimulationJNI.Station_constructProperty_location(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location() {
    return new Vec3(opensimSimulationJNI.Station_get_location__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location() {
    return new Vec3(opensimSimulationJNI.Station_upd_location__SWIG_1(swigCPtr, this), false);
  }

  public void set_location(Vec3 value) {
    opensimSimulationJNI.Station_set_location__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void setPropertyIndex_socket_parent_frame(SWIGTYPE_p_OpenSim__PropertyIndex value) {
    opensimSimulationJNI.Station_PropertyIndex_socket_parent_frame_set(swigCPtr, this, SWIGTYPE_p_OpenSim__PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex getPropertyIndex_socket_parent_frame() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.Station_PropertyIndex_socket_parent_frame_get(swigCPtr, this), true);
  }

  public void connectSocket_parent_frame(OpenSimObject object) {
    opensimSimulationJNI.Station_connectSocket_parent_frame(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  /**
   *  Default constructor 
   */
  public Station() {
    this(opensimSimulationJNI.new_Station__SWIG_0(), true);
  }

  /**
   *  Convenience constructor<br>
   *     @param frame     PhysicalFrame in which the Station is located.<br>
   *     @param location  Vec3 location of the station in its PhysicalFrame 
   */
  public Station(PhysicalFrame frame, Vec3 location) {
    this(opensimSimulationJNI.new_Station__SWIG_1(PhysicalFrame.getCPtr(frame), frame, Vec3.getCPtr(location), location), true);
  }

  /**
   *  get the parent PhysicalFrame in which the Station is defined 
   */
  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimSimulationJNI.Station_getParentFrame(swigCPtr, this), false);
  }

  /**
   *  set the parent PhysicalFrame in which the Station is defined 
   */
  public void setParentFrame(PhysicalFrame aFrame) {
    opensimSimulationJNI.Station_setParentFrame(swigCPtr, this, PhysicalFrame.getCPtr(aFrame), aFrame);
  }

  /**
   *  Find this Station's location in any Frame 
   */
  public Vec3 findLocationInFrame(State s, Frame frame) {
    return new Vec3(opensimSimulationJNI.Station_findLocationInFrame(swigCPtr, this, State.getCPtr(s), s, Frame.getCPtr(frame), frame), true);
  }

  public void extendScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.Station_extendScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}
