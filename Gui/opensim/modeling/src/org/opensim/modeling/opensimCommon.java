/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class opensimCommon {
  public static void opensim_version_common(SWIGTYPE_p_int major, SWIGTYPE_p_int minor, SWIGTYPE_p_int build) {
    opensimCommonJNI.opensim_version_common(SWIGTYPE_p_int.getCPtr(major), SWIGTYPE_p_int.getCPtr(minor), SWIGTYPE_p_int.getCPtr(build));
  }

  public static void opensim_about_common(String key, int maxlen, String value) {
    opensimCommonJNI.opensim_about_common(key, maxlen, value);
  }

  public static String GetVersionAndDate() {
    return opensimCommonJNI.GetVersionAndDate();
  }

  public static String GetVersion() {
    return opensimCommonJNI.GetVersion();
  }

  public static String GetOSInfoVerbose() {
    return opensimCommonJNI.GetOSInfoVerbose();
  }

  public static String GetOSInfo() {
    return opensimCommonJNI.GetOSInfo();
  }

  public static String GetCompilerVersion() {
    return opensimCommonJNI.GetCompilerVersion();
  }

  public static String getFormattedDateTime(boolean appendMicroseconds, String format) {
    return opensimCommonJNI.getFormattedDateTime__SWIG_0(appendMicroseconds, format);
  }

  public static String getFormattedDateTime(boolean appendMicroseconds) {
    return opensimCommonJNI.getFormattedDateTime__SWIG_1(appendMicroseconds);
  }

  public static String getFormattedDateTime() {
    return opensimCommonJNI.getFormattedDateTime__SWIG_2();
  }

  public static Vector createVectorLinspace(int length, double start, double end) {
    return new Vector(opensimCommonJNI.createVectorLinspace(length, start, end), true);
  }

  public static Vector interpolate(Vector x, Vector y, Vector newX, boolean ignoreNaNs) {
    return new Vector(opensimCommonJNI.interpolate__SWIG_0(Vector.getCPtr(x), x, Vector.getCPtr(y), y, Vector.getCPtr(newX), newX, ignoreNaNs), true);
  }

  public static Vector interpolate(Vector x, Vector y, Vector newX) {
    return new Vector(opensimCommonJNI.interpolate__SWIG_1(Vector.getCPtr(x), x, Vector.getCPtr(y), y, Vector.getCPtr(newX), newX), true);
  }

  public static String convertRelativeFilePathToAbsoluteFromXMLDocument(String documentFileName, String filePathRelativeToDirectoryContainingDocument) {
    return opensimCommonJNI.convertRelativeFilePathToAbsoluteFromXMLDocument(documentFileName, filePathRelativeToDirectoryContainingDocument);
  }

  public static double solveBisection(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t calcResidual, double left, double right, double tolerance, int maxIterations) {
    return opensimCommonJNI.solveBisection__SWIG_0(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t.getCPtr(calcResidual), left, right, tolerance, maxIterations);
  }

  public static double solveBisection(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t calcResidual, double left, double right, double tolerance) {
    return opensimCommonJNI.solveBisection__SWIG_1(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t.getCPtr(calcResidual), left, right, tolerance);
  }

  public static double solveBisection(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t calcResidual, double left, double right) {
    return opensimCommonJNI.solveBisection__SWIG_2(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t.getCPtr(calcResidual), left, right);
  }

  public static int getArray_CAPMIN() {
    return opensimCommonJNI.Array_CAPMIN_get();
  }

  public static String getObjectDEFAULT_NAME() {
    return opensimCommonJNI.ObjectDEFAULT_NAME_get();
  }

  public static int getStorage_DEFAULT_CAPACITY() {
    return opensimCommonJNI.Storage_DEFAULT_CAPACITY_get();
  }

  public static int getIO_STRLEN() {
    return opensimCommonJNI.IO_STRLEN_get();
  }

  public static SWIGTYPE_p_void LoadOpenSimLibrary(String lpLibFileName, boolean verbose) {
    long cPtr = opensimCommonJNI.LoadOpenSimLibrary__SWIG_0(lpLibFileName, verbose);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void LoadOpenSimLibrary(String aLibraryName) {
    opensimCommonJNI.LoadOpenSimLibrary__SWIG_1(aLibraryName);
  }

  public static boolean LoadOpenSimLibraryExact(String exactPath, boolean verbose) {
    return opensimCommonJNI.LoadOpenSimLibraryExact__SWIG_0(exactPath, verbose);
  }

  public static boolean LoadOpenSimLibraryExact(String exactPath) {
    return opensimCommonJNI.LoadOpenSimLibraryExact__SWIG_1(exactPath);
  }

}
