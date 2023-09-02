/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of ContactGeometry components.<br>
 * <br>
 * @author Peter Eastman
 */
public class ContactGeometrySet extends ModelComponentSetContactGeometry {
  private transient long swigCPtr;

  public ContactGeometrySet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ContactGeometrySet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ContactGeometrySet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ContactGeometrySet obj) {
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
        opensimSimulationJNI.delete_ContactGeometrySet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ContactGeometrySet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ContactGeometrySet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ContactGeometrySet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ContactGeometrySet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ContactGeometrySet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ContactGeometrySet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ContactGeometrySet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ContactGeometrySet_getConcreteClassName(swigCPtr, this);
  }

  public ContactGeometrySet() {
    this(opensimSimulationJNI.new_ContactGeometrySet__SWIG_0(), true);
  }

  public ContactGeometrySet(String file, boolean updateFromXML) throws java.io.IOException {
    this(opensimSimulationJNI.new_ContactGeometrySet__SWIG_1(file, updateFromXML), true);
  }

  public ContactGeometrySet(String file) throws java.io.IOException {
    this(opensimSimulationJNI.new_ContactGeometrySet__SWIG_2(file), true);
  }

}
