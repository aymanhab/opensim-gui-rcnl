/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a property group.<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class PropertyGroup {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public PropertyGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PropertyGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(PropertyGroup obj) {
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
        opensimCommonJNI.delete_PropertyGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PropertyGroup() {
    this(opensimCommonJNI.new_PropertyGroup__SWIG_0(), true);
  }

  public PropertyGroup(SWIGTYPE_p_std__string aName) {
    this(opensimCommonJNI.new_PropertyGroup__SWIG_1(SWIGTYPE_p_std__string.getCPtr(aName)), true);
  }

  public PropertyGroup(PropertyGroup aGroup) {
    this(opensimCommonJNI.new_PropertyGroup__SWIG_2(PropertyGroup.getCPtr(aGroup), aGroup), true);
  }

  public PropertyGroup clone() {
    long cPtr = opensimCommonJNI.PropertyGroup_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PropertyGroup(cPtr, true);
  }

  public void copyData(PropertyGroup aGroup) {
    opensimCommonJNI.PropertyGroup_copyData(swigCPtr, this, PropertyGroup.getCPtr(aGroup), aGroup);
  }

  public void clear() {
    opensimCommonJNI.PropertyGroup_clear(swigCPtr, this);
  }

  public boolean contains(String aName) {
    return opensimCommonJNI.PropertyGroup_contains(swigCPtr, this, aName);
  }

  public void add(SWIGTYPE_p_Property_Deprecated aProperty) {
    opensimCommonJNI.PropertyGroup_add(swigCPtr, this, SWIGTYPE_p_Property_Deprecated.getCPtr(aProperty));
  }

  public void remove(SWIGTYPE_p_Property_Deprecated aProperty) {
    opensimCommonJNI.PropertyGroup_remove(swigCPtr, this, SWIGTYPE_p_Property_Deprecated.getCPtr(aProperty));
  }

  public SWIGTYPE_p_Property_Deprecated get(int aIndex) {
    long cPtr = opensimCommonJNI.PropertyGroup_get(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Property_Deprecated(cPtr, false);
  }

  public int getPropertyIndex(SWIGTYPE_p_Property_Deprecated aProperty) {
    return opensimCommonJNI.PropertyGroup_getPropertyIndex(swigCPtr, this, SWIGTYPE_p_Property_Deprecated.getCPtr(aProperty));
  }

  public void setName(String aName) {
    opensimCommonJNI.PropertyGroup_setName(swigCPtr, this, aName);
  }

  public String getName() {
    return opensimCommonJNI.PropertyGroup_getName(swigCPtr, this);
  }

}
