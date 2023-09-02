/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DataTypeMismatch extends OpenSimException {
  private transient long swigCPtr;

  public DataTypeMismatch(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.DataTypeMismatch_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DataTypeMismatch obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(DataTypeMismatch obj) {
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
        opensimCommonJNI.delete_DataTypeMismatch(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DataTypeMismatch(String file, long line, String func, String expected, String received) {
    this(opensimCommonJNI.new_DataTypeMismatch(file, line, func, expected, received), true);
  }

}
