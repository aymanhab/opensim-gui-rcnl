/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorVec3 extends VectorBaseVec3 {
  private transient long swigCPtr;

  public VectorVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

    public static VectorVec3 createFromMat(double[][] data) throws Exception {
        int numRows = data.length;
        int numCols = 0;
        if (numRows > 0) {
            numCols = data[0].length;
        }
        if (numCols != 3) {
            throw new Exception("Number of columns must be 3.");
        }
        VectorVec3 v = new VectorVec3(numRows, new Vec3(0));
        for (int i = 0; i < numRows; ++i) {
            v.set(i, new Vec3(data[i][0], data[i][1], data[i][2]));
        }
        return v;
    }

  public VectorVec3() {
    this(opensimSimbodyJNI.new_VectorVec3__SWIG_0(), true);
  }

  public VectorVec3(VectorVec3 src) {
    this(opensimSimbodyJNI.new_VectorVec3__SWIG_1(VectorVec3.getCPtr(src), src), true);
  }

  public VectorVec3(int m, Vec3 initialValue) {
    this(opensimSimbodyJNI.new_VectorVec3__SWIG_2(m, Vec3.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimSimbodyJNI.VectorVec3_toString(swigCPtr, this);
  }

  public Vec3 get(int i) {
    return new Vec3(opensimSimbodyJNI.VectorVec3_get(swigCPtr, this, i), false);
  }

  public void set(int i, Vec3 value) {
    opensimSimbodyJNI.VectorVec3_set(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public VectorVec3(StdVectorVec3 row) {
    this(opensimSimbodyJNI.new_VectorVec3__SWIG_3(StdVectorVec3.getCPtr(row), row), true);
  }

  public RowVectorVec3 transpose() {
    return new RowVectorVec3(opensimSimbodyJNI.VectorVec3_transpose(swigCPtr, this), true);
  }

}
