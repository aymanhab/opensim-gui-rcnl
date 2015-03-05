/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FrameGeometry extends Geometry {
  private long swigCPtr;

  public FrameGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.FrameGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(FrameGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_FrameGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static FrameGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.FrameGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new FrameGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.FrameGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.FrameGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.FrameGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new FrameGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.FrameGeometry_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_display_radius(FrameGeometry source) {
    opensimModelJNI.FrameGeometry_copyProperty_display_radius(swigCPtr, this, FrameGeometry.getCPtr(source), source);
  }

  public double get_display_radius(int i) {
    return opensimModelJNI.FrameGeometry_get_display_radius__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_display_radius(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.FrameGeometry_upd_display_radius__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_display_radius(int i, double value) {
    opensimModelJNI.FrameGeometry_set_display_radius__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_display_radius(double value) {
    return opensimModelJNI.FrameGeometry_append_display_radius(swigCPtr, this, value);
  }

  public void constructProperty_display_radius(double initValue) {
    opensimModelJNI.FrameGeometry_constructProperty_display_radius(swigCPtr, this, initValue);
  }

  public double get_display_radius() {
    return opensimModelJNI.FrameGeometry_get_display_radius__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_display_radius() {
    return new SWIGTYPE_p_double(opensimModelJNI.FrameGeometry_upd_display_radius__SWIG_1(swigCPtr, this), false);
  }

  public void set_display_radius(double value) {
    opensimModelJNI.FrameGeometry_set_display_radius__SWIG_1(swigCPtr, this, value);
  }

  public FrameGeometry(double scale) {
    this(opensimModelJNI.new_FrameGeometry__SWIG_0(scale), true);
  }

  public FrameGeometry() {
    this(opensimModelJNI.new_FrameGeometry__SWIG_1(), true);
  }

  public void createDecorativeGeometry(ArrayDecorativeGeometry decoGeoms) {
    opensimModelJNI.FrameGeometry_createDecorativeGeometry(swigCPtr, this, ArrayDecorativeGeometry.getCPtr(decoGeoms), decoGeoms);
  }

}
