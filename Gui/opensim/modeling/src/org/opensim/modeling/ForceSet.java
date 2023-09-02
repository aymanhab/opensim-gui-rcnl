/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding and managing a set of forces for a model.<br>
 * This class is based on ModelComponentSet<br>
 * <br>
 * @author Ajay Seth, Jack Middleton <br>
 * @version 1.0
 */
public class ForceSet extends ModelComponentSetForces {
  private transient long swigCPtr;

  public ForceSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ForceSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ForceSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ForceSet obj) {
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
        opensimSimulationJNI.delete_ForceSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

   public boolean append(Force aForce) {
       aForce.markAdopted();
       return private_append(aForce);
   }

  public static ForceSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ForceSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ForceSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ForceSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ForceSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ForceSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ForceSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ForceSet_getConcreteClassName(swigCPtr, this);
  }

  public ForceSet() {
    this(opensimSimulationJNI.new_ForceSet__SWIG_0(), true);
  }

  public ForceSet(ForceSet arg0) {
    this(opensimSimulationJNI.new_ForceSet__SWIG_1(ForceSet.getCPtr(arg0), arg0), true);
  }

  public void extendConnectToModel(Model aModel) {
    opensimSimulationJNI.ForceSet_extendConnectToModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.ForceSet_remove(swigCPtr, this, aIndex);
  }

  private boolean private_append(Force aForce) {
    return opensimSimulationJNI.ForceSet_private_append__SWIG_0(swigCPtr, this, Force.getCPtr(aForce), aForce);
  }

  private boolean private_append(ForceSet aForceSet, boolean aAllowDuplicateNames) {
    return opensimSimulationJNI.ForceSet_private_append__SWIG_1(swigCPtr, this, ForceSet.getCPtr(aForceSet), aForceSet, aAllowDuplicateNames);
  }

  private boolean private_append(ForceSet aForceSet) {
    return opensimSimulationJNI.ForceSet_private_append__SWIG_2(swigCPtr, this, ForceSet.getCPtr(aForceSet), aForceSet);
  }

  public boolean set(int aIndex, Force aForce, boolean preserveGroups) {
    return opensimSimulationJNI.ForceSet_set__SWIG_0(swigCPtr, this, aIndex, Force.getCPtr(aForce), aForce, preserveGroups);
  }

  public boolean set(int aIndex, Force aForce) {
    return opensimSimulationJNI.ForceSet_set__SWIG_1(swigCPtr, this, aIndex, Force.getCPtr(aForce), aForce);
  }

  public boolean insert(int aIndex, Force aObject) {
    return opensimSimulationJNI.ForceSet_insert(swigCPtr, this, aIndex, Force.getCPtr(aObject), aObject);
  }

  public SetActuators getActuators() {
    return new SetActuators(opensimSimulationJNI.ForceSet_getActuators(swigCPtr, this), false);
  }

  public SetActuators updActuators() {
    return new SetActuators(opensimSimulationJNI.ForceSet_updActuators(swigCPtr, this), false);
  }

  public SetMuscles getMuscles() {
    return new SetMuscles(opensimSimulationJNI.ForceSet_getMuscles(swigCPtr, this), false);
  }

  public SetMuscles updMuscles() {
    return new SetMuscles(opensimSimulationJNI.ForceSet_updMuscles(swigCPtr, this), false);
  }

  public void getStateVariableNames(ArrayStr rNames) {
    opensimSimulationJNI.ForceSet_getStateVariableNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public boolean check() {
    return opensimSimulationJNI.ForceSet_check(swigCPtr, this);
  }

  public ForceSet(String file, boolean updateFromXML) throws java.io.IOException {
    this(opensimSimulationJNI.new_ForceSet__SWIG_3(file, updateFromXML), true);
  }

  public ForceSet(String file) throws java.io.IOException {
    this(opensimSimulationJNI.new_ForceSet__SWIG_4(file), true);
  }

}
