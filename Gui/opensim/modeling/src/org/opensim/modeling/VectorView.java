/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This class is identical to a Vector_; it is used only to manage the C++ rules<br>
 *  for when copy constructors are called by introducing a separate type to<br>
 *  prevent certain allowed optimizations from occuring when we don't want them.<br>
 *  Despite the name, this may be an owner if a Vector_ is recast to a VectorView_.<br>
 *  However, there are no owner constructors for VectorView_. 
 */
public class VectorView extends VectorBaseDouble {
  private transient long swigCPtr;

  public VectorView(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorView_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorView obj) {
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
        opensimSimbodyJNI.delete_VectorView(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorView(VectorView v) {
    this(opensimSimbodyJNI.new_VectorView(VectorView.getCPtr(v), v), true);
  }

  public VectorView multiplyAssign(double t) {
    return new VectorView(opensimSimbodyJNI.VectorView_multiplyAssign(swigCPtr, this, t), true);
  }

}
