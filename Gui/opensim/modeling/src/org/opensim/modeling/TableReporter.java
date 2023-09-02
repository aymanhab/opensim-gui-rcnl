/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * This concrete Reporter class collects and reports Output&lt;InputT&gt;s within a<br>
 * TimeSeriesTable_. The column labels in the resulting table come from the<br>
 * names of the outputs connected to this reporter. The contents of the table are<br>
 * the Output values with each row being the value of all outputs at subsequent<br>
 * times determined by the reporting interval.<br>
 * <br>
 * <br>
 * <br>
 * <br>
 * <br>
 * <br>
 * @author Ajay Seth
 */
public class TableReporter extends ReporterDouble {
  private transient long swigCPtr;

  public TableReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TableReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableReporter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(TableReporter obj) {
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
        opensimCommonJNI.delete_TableReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TableReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.TableReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TableReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.TableReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.TableReporter_getClassName();
  }

  public TableReporter clone() {
    long cPtr = opensimCommonJNI.TableReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TableReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.TableReporter_getConcreteClassName(swigCPtr, this);
  }

  public TableReporter() {
    this(opensimCommonJNI.new_TableReporter(), true);
  }

  /**
   *  Retrieve the report as a TimeSeriesTable.                             
   */
  public TimeSeriesTable getTable() {
    return new TimeSeriesTable(opensimCommonJNI.TableReporter_getTable(swigCPtr, this), true);
  }

  /**
   *  Clear the report. This can be used for example in loops performing <br>
   *     simulation. Each new iteration should start with an empty report and so this<br>
   *     function can be used to clear the report at the end of each iteration.    
   */
  public void clearTable() {
    opensimCommonJNI.TableReporter_clearTable(swigCPtr, this);
  }

}
