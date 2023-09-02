/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a dataless rehash of the MatrixBase class to specialize it for RowVectors.<br>
 *  This mostly entails overriding a few of the methods. Note that all the MatrixBase<br>
 *  operations remain available if you static_cast&lt;&gt; this up to a MatrixBase.
 */
public class RowVectorBaseVec3 extends MatrixBaseVec3 {
  private transient long swigCPtr;

  public RowVectorBaseVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.RowVectorBaseVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RowVectorBaseVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(RowVectorBaseVec3 obj) {
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
        opensimSimbodyJNI.delete_RowVectorBaseVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

    public double[][] getAsMat() {
        double[][] ret = new double[3][size()];
        for (int i = 0; i < size(); ++i) {
            ret[0][i] = get(i).get(0);
            ret[1][i] = get(i).get(1);
            ret[2][i] = get(i).get(2);
        }
        return ret;
    }

  /**
   *  These constructors create new RowVectorBase objects which own their<br>
   *  own data and are (at least by default) resizable. The resulting matrices<br>
   *  are 1 x n with the number of rows locked at 1. If there is any data<br>
   *  allocated but not explicitly initialized, that data will be uninitialized<br>
   *  garbage in Release builds but will be initialized to NaN (at a performance<br>
   *  cost) in Debug builds.<br>
   *  <br>
   *  Default constructor makes a 1x0 matrix locked at 1 row; you can<br>
   *  provide an initial allocation if you want.
   */
  public RowVectorBaseVec3(int n) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec3__SWIG_0(n), true);
  }

  /**
   *  These constructors create new RowVectorBase objects which own their<br>
   *  own data and are (at least by default) resizable. The resulting matrices<br>
   *  are 1 x n with the number of rows locked at 1. If there is any data<br>
   *  allocated but not explicitly initialized, that data will be uninitialized<br>
   *  garbage in Release builds but will be initialized to NaN (at a performance<br>
   *  cost) in Debug builds.<br>
   *  <br>
   *  Default constructor makes a 1x0 matrix locked at 1 row; you can<br>
   *  provide an initial allocation if you want.
   */
  public RowVectorBaseVec3() {
    this(opensimSimbodyJNI.new_RowVectorBaseVec3__SWIG_1(), true);
  }

  /**
   *  Copy constructor is a deep copy (not appropriate for views!). That<br>
   *  means it creates a new, densely packed vector whose elements are<br>
   *  initialized from the source object.    
   */
  public RowVectorBaseVec3(RowVectorBaseVec3 source) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec3__SWIG_2(RowVectorBaseVec3.getCPtr(source), source), true);
  }

  /**
   *  Construct an owner row vector of length n, with each element initialized to<br>
   *  the given value.
   */
  public RowVectorBaseVec3(int n, Vec3 initialValue) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec3__SWIG_3(n, Vec3.getCPtr(initialValue), initialValue), true);
  }

  public int size() {
    return opensimSimbodyJNI.RowVectorBaseVec3_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.RowVectorBaseVec3_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.RowVectorBaseVec3_ncol(swigCPtr, this);
  }

  public SWIGTYPE_p_ptrdiff_t nelt() {
    return new SWIGTYPE_p_ptrdiff_t(opensimSimbodyJNI.RowVectorBaseVec3_nelt(swigCPtr, this), true);
  }

  public RowVectorViewVec3 index(SWIGTYPE_p_Array_T_int_t indices) {
    return new RowVectorViewVec3(opensimSimbodyJNI.RowVectorBaseVec3_index(swigCPtr, this, SWIGTYPE_p_Array_T_int_t.getCPtr(indices)), true);
  }

  public RowVectorViewVec3 updIndex(SWIGTYPE_p_Array_T_int_t indices) {
    return new RowVectorViewVec3(opensimSimbodyJNI.RowVectorBaseVec3_updIndex(swigCPtr, this, SWIGTYPE_p_Array_T_int_t.getCPtr(indices)), true);
  }

  public RowVectorBaseVec3 resize(int n) {
    return new RowVectorBaseVec3(opensimSimbodyJNI.RowVectorBaseVec3_resize(swigCPtr, this, n), false);
  }

  public RowVectorBaseVec3 resizeKeep(int n) {
    return new RowVectorBaseVec3(opensimSimbodyJNI.RowVectorBaseVec3_resizeKeep(swigCPtr, this, n), false);
  }

  public void clear() {
    opensimSimbodyJNI.RowVectorBaseVec3_clear(swigCPtr, this);
  }

  public Vec3 sum() {
    return new Vec3(opensimSimbodyJNI.RowVectorBaseVec3_sum(swigCPtr, this), true);
  }

  public SWIGTYPE_p_VectorIteratorT_SimTK__VecT_3_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_3_double_1_t_t_t begin() {
    return new SWIGTYPE_p_VectorIteratorT_SimTK__VecT_3_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_3_double_1_t_t_t(opensimSimbodyJNI.RowVectorBaseVec3_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_VectorIteratorT_SimTK__VecT_3_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_3_double_1_t_t_t end() {
    return new SWIGTYPE_p_VectorIteratorT_SimTK__VecT_3_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_3_double_1_t_t_t(opensimSimbodyJNI.RowVectorBaseVec3_end(swigCPtr, this), true);
  }

  public Vec3 get(int i) {
    return new Vec3(opensimSimbodyJNI.RowVectorBaseVec3_get(swigCPtr, this, i), true);
  }

  public void set(int i, Vec3 value) {
    opensimSimbodyJNI.RowVectorBaseVec3_set(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public Vec3 __getitem__(int i) {
    return new Vec3(opensimSimbodyJNI.RowVectorBaseVec3___getitem__(swigCPtr, this, i), true);
  }

  public void __setitem__(int i, Vec3 value) {
    opensimSimbodyJNI.RowVectorBaseVec3___setitem__(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

}
