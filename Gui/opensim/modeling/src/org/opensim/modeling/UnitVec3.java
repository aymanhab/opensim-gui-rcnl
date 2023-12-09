/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * This class is a Vec3 plus an ironclad guarantee either that:<br>
 *      - the length is one (to within a very small tolerance), or<br>
 *      - all components are NaN.
 */
public class UnitVec3 extends Vec3 {
  private transient long swigCPtr;

  public UnitVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.UnitVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(UnitVec3 obj) {
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
        opensimSimbodyJNI.delete_UnitVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Default constructor initializes to all-NaN even in Release mode so that<br>
   *  we maintain the above-promised contract.
   */
  public UnitVec3() {
    this(opensimSimbodyJNI.new_UnitVec3__SWIG_0(), true);
  }

  /**
   *  Copy constructor does not require normalization since we know the<br>
   *  source is a unit vector.
   */
  public UnitVec3(UnitVec3 u) {
    this(opensimSimbodyJNI.new_UnitVec3__SWIG_1(UnitVec3.getCPtr(u), u), true);
  }

  /**
   *  Explicit conversion from Vec to UnitVec, requiring expensive normalization.
   */
  public UnitVec3(Vec3 v) {
    this(opensimSimbodyJNI.new_UnitVec3__SWIG_2(Vec3.getCPtr(v), v), true);
  }

  /**
   *  Explicit conversion from Vec of any stride to this UnitVec, requiring <br>
   *  expensive normalization.<br>
   *  Create a unit vector in the direction of the vector (x,y,z) whose measure<br>
   *  numbers are supplied -- this requires an expensive normalization since<br>
   *  we don't know that the supplied vector is normalized.
   */
  public UnitVec3(double x, double y, double z) {
    this(opensimSimbodyJNI.new_UnitVec3__SWIG_3(x, y, z), true);
  }

  /**
   *  Implicit conversion from a coordinate axis XAxis, YAxis, or ZAxis to<br>
   *  a UnitVec3.\ Does not require any computation.
   */
  public UnitVec3(CoordinateAxis axis) {
    this(opensimSimbodyJNI.new_UnitVec3__SWIG_4(CoordinateAxis.getCPtr(axis), axis), true);
  }

  /**
   *  Implicit conversion from a coordinate axis direction to a <br>
   *  UnitVec3.\ The axis direction is given by one of XAxis, YAxis, ZAxis <br>
   *  or NegXAxis, NegYAxis, NegZAxis.\ Does not require any computation.
   */
  public UnitVec3(CoordinateDirection dir) {
    this(opensimSimbodyJNI.new_UnitVec3__SWIG_5(CoordinateDirection.getCPtr(dir), dir), true);
  }

  /**
   *  Construct a unit axis vector 100 010 001 given 0,1, or 2; this is not<br>
   *  an implicit conversion.
   */
  public UnitVec3(int axis) {
    this(opensimSimbodyJNI.new_UnitVec3__SWIG_6(axis), true);
  }

  /**
   *  Return a reference to the underlying Vec3 (no copying here).
   */
  public Vec3 asVec3() {
    return new Vec3(opensimSimbodyJNI.UnitVec3_asVec3(swigCPtr, this), false);
  }

  /**
   *  Returns a new unit vector pointing in the opposite direction from this one;<br>
   *  does <i>not</i> modify this UnitVec object. Cost is 3 flops.
   */
  public UnitVec3 negate() {
    return new UnitVec3(opensimSimbodyJNI.UnitVec3_negate(swigCPtr, this), true);
  }

  /**
   *  Return a new unit vector whose measure numbers are the absolute values<br>
   *  of the ones here. This will still have unit length but will be<br>
   *  a reflection of this unit vector into the first octant (+x,+y,+z).<br>
   *  Note that we are returning the packed form of UnitVec regardless<br>
   *  of our stride here.
   */
  public UnitVec3 abs() {
    return new UnitVec3(opensimSimbodyJNI.UnitVec3_abs(swigCPtr, this), true);
  }

  /**
   *  Return a new unit vector perpendicular to this one but otherwise<br>
   *  arbitrary. Some care is taken to ensure good numerical conditioning<br>
   *  for the result regardless of what goes in. Cost is about 50 flops.
   */
  public UnitVec3 perp() {
    return new UnitVec3(opensimSimbodyJNI.UnitVec3_perp(swigCPtr, this), true);
  }

  /**
   *  (Advanced) This constructor is only for our friends whom we trust to<br>
   *  give us an already-normalized vector which we simply accept as<br>
   *  normalized without checking.
   */
  public UnitVec3(Vec3 v, boolean arg1) {
    this(opensimSimbodyJNI.new_UnitVec3__SWIG_7(Vec3.getCPtr(v), v, arg1), true);
  }

  /**
   *  (Advanced) Reinterpret a given memory location as a %UnitVec like<br>
   *  this one, without checking -- don't use this if you aren't absolutely <br>
   *  certain that the memory location actually <i>does</i> contain a unit vector, <br>
   *  with the correct stride! This overrides the base Vec class method of the<br>
   *  same name.
   */
  public static UnitVec3 getAs(SWIGTYPE_p_double p) {
    return new UnitVec3(opensimSimbodyJNI.UnitVec3_getAs(SWIGTYPE_p_double.getCPtr(p)), false);
  }

}
