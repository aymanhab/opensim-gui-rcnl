/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a dataless rehash of the MatrixBase class to specialize it for Vectors.<br>
 *  This mostly entails overriding a few of the methods. Note that all the MatrixBase<br>
 *  operations remain available if you static_cast&lt;&gt; this up to a MatrixBase.
 */
public class VectorBaseVec6 extends MatrixBaseVec6 {
  private transient long swigCPtr;

  public VectorBaseVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorBaseVec6_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorBaseVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(VectorBaseVec6 obj) {
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
        opensimSimbodyJNI.delete_VectorBaseVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  These constructors create new VectorBase objects which own their<br>
   *  own data and are (at least by default) resizable. The resulting matrices<br>
   *  are m X 1 with the number of columns locked at 1. If there is any data<br>
   *  allocated but not explicitly initialized, that data will be uninitialized<br>
   *  garbage in Release builds but will be initialized to NaN (at a performance<br>
   *  cost) in Debug builds.<br>
   *  <br>
   *  Default constructor makes a 0x1 matrix locked at 1 column; you can<br>
   *  provide an initial allocation if you want.
   */
  public VectorBaseVec6(int m) {
    this(opensimSimbodyJNI.new_VectorBaseVec6__SWIG_0(m), true);
  }

  /**
   *  These constructors create new VectorBase objects which own their<br>
   *  own data and are (at least by default) resizable. The resulting matrices<br>
   *  are m X 1 with the number of columns locked at 1. If there is any data<br>
   *  allocated but not explicitly initialized, that data will be uninitialized<br>
   *  garbage in Release builds but will be initialized to NaN (at a performance<br>
   *  cost) in Debug builds.<br>
   *  <br>
   *  Default constructor makes a 0x1 matrix locked at 1 column; you can<br>
   *  provide an initial allocation if you want.
   */
  public VectorBaseVec6() {
    this(opensimSimbodyJNI.new_VectorBaseVec6__SWIG_1(), true);
  }

  /**
   *  Copy constructor is a deep copy (not appropriate for views!). That<br>
   *  means it creates a new, densely packed vector whose elements are<br>
   *  initialized from the source object.
   */
  public VectorBaseVec6(VectorBaseVec6 source) {
    this(opensimSimbodyJNI.new_VectorBaseVec6__SWIG_2(VectorBaseVec6.getCPtr(source), source), true);
  }

  public int size() {
    return opensimSimbodyJNI.VectorBaseVec6_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.VectorBaseVec6_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.VectorBaseVec6_ncol(swigCPtr, this);
  }

  public VectorBaseVec6 resize(int m) {
    return new VectorBaseVec6(opensimSimbodyJNI.VectorBaseVec6_resize(swigCPtr, this, m), false);
  }

  public VectorBaseVec6 resizeKeep(int m) {
    return new VectorBaseVec6(opensimSimbodyJNI.VectorBaseVec6_resizeKeep(swigCPtr, this, m), false);
  }

  public void clear() {
    opensimSimbodyJNI.VectorBaseVec6_clear(swigCPtr, this);
  }

  public Vec6 sum() {
    return new Vec6(opensimSimbodyJNI.VectorBaseVec6_sum(swigCPtr, this), true);
  }

}
