/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of functions.<br>
 * <br>
 * @see Function<br>
 * @author Frank C. Anderson
 */
public class FunctionSet extends SetFunctions {
  private transient long swigCPtr;

  public FunctionSet(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.FunctionSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(FunctionSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(FunctionSet obj) {
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
        opensimCommonJNI.delete_FunctionSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean adoptAndAppend(Function aFunction) {
	aFunction.markAdopted();
    return super.adoptAndAppend(aFunction);
  }

  public static FunctionSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.FunctionSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new FunctionSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.FunctionSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.FunctionSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.FunctionSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new FunctionSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.FunctionSet_getConcreteClassName(swigCPtr, this);
  }

  public FunctionSet() {
    this(opensimCommonJNI.new_FunctionSet__SWIG_0(), true);
  }

  public FunctionSet(String aFileName) {
    this(opensimCommonJNI.new_FunctionSet__SWIG_1(aFileName), true);
  }

  public double evaluate(int aIndex, int aDerivOrder, double aX) {
    return opensimCommonJNI.FunctionSet_evaluate__SWIG_0(swigCPtr, this, aIndex, aDerivOrder, aX);
  }

  public double evaluate(int aIndex, int aDerivOrder) {
    return opensimCommonJNI.FunctionSet_evaluate__SWIG_1(swigCPtr, this, aIndex, aDerivOrder);
  }

  public void evaluate(ArrayDouble rValues, int aDerivOrder, double aX) {
    opensimCommonJNI.FunctionSet_evaluate__SWIG_2(swigCPtr, this, ArrayDouble.getCPtr(rValues), rValues, aDerivOrder, aX);
  }

  public void evaluate(ArrayDouble rValues, int aDerivOrder) {
    opensimCommonJNI.FunctionSet_evaluate__SWIG_3(swigCPtr, this, ArrayDouble.getCPtr(rValues), rValues, aDerivOrder);
  }

}
