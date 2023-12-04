/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Invoke SimulationUtilities::appendCoupledCoordinateValues() on the table.
 */
public class TabOpAppendCoupledCoordinateValues extends TableOperator {
  private transient long swigCPtr;

  public TabOpAppendCoupledCoordinateValues(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TabOpAppendCoupledCoordinateValues obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(TabOpAppendCoupledCoordinateValues obj) {
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
        opensimSimulationJNI.delete_TabOpAppendCoupledCoordinateValues(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TabOpAppendCoupledCoordinateValues safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TabOpAppendCoupledCoordinateValues(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TabOpAppendCoupledCoordinateValues(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_overwrite_existing_columns(TabOpAppendCoupledCoordinateValues source) {
    opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_copyProperty_overwrite_existing_columns(swigCPtr, this, TabOpAppendCoupledCoordinateValues.getCPtr(source), source);
  }

  public boolean get_overwrite_existing_columns(int i) {
    return opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_get_overwrite_existing_columns__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_overwrite_existing_columns(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_upd_overwrite_existing_columns__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_overwrite_existing_columns(int i, boolean value) {
    opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_set_overwrite_existing_columns__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_overwrite_existing_columns(boolean value) {
    return opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_append_overwrite_existing_columns(swigCPtr, this, value);
  }

  public void constructProperty_overwrite_existing_columns(boolean initValue) {
    opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_constructProperty_overwrite_existing_columns(swigCPtr, this, initValue);
  }

  public boolean get_overwrite_existing_columns() {
    return opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_get_overwrite_existing_columns__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_overwrite_existing_columns() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_upd_overwrite_existing_columns__SWIG_1(swigCPtr, this), false);
  }

  public void set_overwrite_existing_columns(boolean value) {
    opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_set_overwrite_existing_columns__SWIG_1(swigCPtr, this, value);
  }

  public TabOpAppendCoupledCoordinateValues() {
    this(opensimSimulationJNI.new_TabOpAppendCoupledCoordinateValues__SWIG_0(), true);
  }

  public TabOpAppendCoupledCoordinateValues(boolean overwriteExistingColumns) {
    this(opensimSimulationJNI.new_TabOpAppendCoupledCoordinateValues__SWIG_1(overwriteExistingColumns), true);
  }

  public void operate(TimeSeriesTable table, Model model) {
    opensimSimulationJNI.TabOpAppendCoupledCoordinateValues_operate(swigCPtr, this, TimeSeriesTable.getCPtr(table), table, Model.getCPtr(model), model);
  }

}
