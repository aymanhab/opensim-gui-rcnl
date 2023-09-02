/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Set passive fiber stiffness for all DeGrooteFregly2016Muscle%s in the<br>
 * model. 
 */
public class ModOpPassiveFiberStrainAtOneNormForceDGF extends ModelOperator {
  private transient long swigCPtr;

  public ModOpPassiveFiberStrainAtOneNormForceDGF(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.ModOpPassiveFiberStrainAtOneNormForceDGF_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModOpPassiveFiberStrainAtOneNormForceDGF obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ModOpPassiveFiberStrainAtOneNormForceDGF obj) {
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
        opensimMocoJNI.delete_ModOpPassiveFiberStrainAtOneNormForceDGF(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModOpPassiveFiberStrainAtOneNormForceDGF safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.ModOpPassiveFiberStrainAtOneNormForceDGF_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModOpPassiveFiberStrainAtOneNormForceDGF(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.ModOpPassiveFiberStrainAtOneNormForceDGF_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.ModOpPassiveFiberStrainAtOneNormForceDGF_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.ModOpPassiveFiberStrainAtOneNormForceDGF_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModOpPassiveFiberStrainAtOneNormForceDGF(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.ModOpPassiveFiberStrainAtOneNormForceDGF_getConcreteClassName(swigCPtr, this);
  }

  public ModOpPassiveFiberStrainAtOneNormForceDGF() {
    this(opensimMocoJNI.new_ModOpPassiveFiberStrainAtOneNormForceDGF__SWIG_0(), true);
  }

  public ModOpPassiveFiberStrainAtOneNormForceDGF(double value) {
    this(opensimMocoJNI.new_ModOpPassiveFiberStrainAtOneNormForceDGF__SWIG_1(value), true);
  }

  public void operate(Model model, String arg1) {
    opensimMocoJNI.ModOpPassiveFiberStrainAtOneNormForceDGF_operate(swigCPtr, this, Model.getCPtr(model), model, arg1);
  }

}
