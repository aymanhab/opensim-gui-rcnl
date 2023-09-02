/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This class is identical to a Matrix_; it is used only to manage the C++ rules<br>
 *  for when copy constructors are called by introducing a separate type to<br>
 *  prevent certain allowed optimizations from occuring when we don't want them.<br>
 *  Despite the name, this may be an owner if a Matrix_ is recast to a MatrixView_.<br>
 *  However, there are no owner constructors for MatrixView_. 
 */
public class MatrixView extends MatrixBaseDouble {
  private transient long swigCPtr;

  public MatrixView(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.MatrixView_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MatrixView obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MatrixView obj) {
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
        opensimSimbodyJNI.delete_MatrixView(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MatrixView(MatrixView m) {
    this(opensimSimbodyJNI.new_MatrixView(MatrixView.getCPtr(m), m), true);
  }

}
