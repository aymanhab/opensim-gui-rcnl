/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is the Matrix class intended to appear in user code. It can be a <br>
 *  fixed-size view of someone else's data, or can be a resizable data owner itself.
 */
public class MatrixOfSpatialVec {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public MatrixOfSpatialVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MatrixOfSpatialVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MatrixOfSpatialVec obj) {
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
        opensimSimbodyJNI.delete_MatrixOfSpatialVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MatrixOfSpatialVec() {
    this(opensimSimbodyJNI.new_MatrixOfSpatialVec__SWIG_0(), true);
  }

  public MatrixOfSpatialVec(MatrixOfSpatialVec src) {
    this(opensimSimbodyJNI.new_MatrixOfSpatialVec__SWIG_1(MatrixOfSpatialVec.getCPtr(src), src), true);
  }

  public MatrixOfSpatialVec(int m, int n) {
    this(opensimSimbodyJNI.new_MatrixOfSpatialVec__SWIG_2(m, n), true);
  }

  public MatrixOfSpatialVec(int m, int n, SpatialVec initialValue) {
    this(opensimSimbodyJNI.new_MatrixOfSpatialVec__SWIG_3(m, n, SpatialVec.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimSimbodyJNI.MatrixOfSpatialVec_toString(swigCPtr, this);
  }

  /**
   *  Variant of indexing operator that's scripting friendly to get entry (i, j) *
   */
  public SpatialVec get(int i, int j) {
    return new SpatialVec(opensimSimbodyJNI.MatrixOfSpatialVec_get(swigCPtr, this, i, j), false);
  }

  /**
   *  Variant of indexing operator that's scripting friendly to set entry (i, j) *
   */
  public void set(int i, int j, SpatialVec value) {
    opensimSimbodyJNI.MatrixOfSpatialVec_set(swigCPtr, this, i, j, SpatialVec.getCPtr(value), value);
  }

}
