/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for representing a smooth function with a generalized<br>
 * cross-validation spline.  Linear, cubic, quintic, and heptic splines<br>
 * are supported:<br>
 * <br>
 * {@code 
   m (half-order)     order         degree         description
   1                    2             1              linear
   2                    4             3              cubic
   3                    6             5              quintic
   4                    8             7              heptic
}<br>
 * <br>
 * This class wraps the gcvspl.c source code written by D. Twisk in 1994,<br>
 * which is based on the GCVSPL code written in Fortran by Woltring<br>
 * in 1985_07_04.<br>
 * <br>
 * See the following source for details on how the GCV spline is fit:<br>
 * Woltring, H.J. (1986).  A Fortran package for generalized,<br>
 * cross-validatory spline smoothing and differentiation.  Advances in<br>
 * Engineering Software, Vol. 8, No. 2, 104-113.<br>
 * <br>
 * @author Frank C. Anderson
 */
public class GCVSpline extends Function {
  private transient long swigCPtr;

  public GCVSpline(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.GCVSpline_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(GCVSpline obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(GCVSpline obj) {
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
        opensimCommonJNI.delete_GCVSpline(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static GCVSpline safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.GCVSpline_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new GCVSpline(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.GCVSpline_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.GCVSpline_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.GCVSpline_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new GCVSpline(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.GCVSpline_getConcreteClassName(swigCPtr, this);
  }

  public GCVSpline() {
    this(opensimCommonJNI.new_GCVSpline__SWIG_0(), true);
  }

  /**
   * Construct a spline of a specified degree given arrays of paired data<br>
   * points (x,f(x)). A name for the spline may be specified.<br>
   * <br>
   * @param aDegree Degree of the spline.  Only the following degrees<br>
   * are supported: 1 = linear, 3 = cubic, 5 = quintic, and 7 = heptic.<br>
   * @param aN Number of data points.<br>
   * @param aX %Array of independent values- should be aN long.<br>
   * @param aF %Array of function values- should be aN long.<br>
   * @param aName Optional name of the spline.<br>
   * @param aErrorVariance Estimate of the variance of the error in the data<br>
   * to be fit.  If negative, the variance will be estimated.  If 0.0, the<br>
   * fit will try to fit the data points exactly- no smoothing.  If positive,<br>
   * the fit will be smoothed according to the specified variance. The larger<br>
   * the error variance, the more the smoothing.  The smoothing parameter, p,<br>
   * in Woltring (1986) is computed based on the error variance.
   */
  public GCVSpline(int aDegree, int aN, SWIGTYPE_p_double aX, SWIGTYPE_p_double aF, String aName, double aErrorVariance) {
    this(opensimCommonJNI.new_GCVSpline__SWIG_1(aDegree, aN, SWIGTYPE_p_double.getCPtr(aX), SWIGTYPE_p_double.getCPtr(aF), aName, aErrorVariance), true);
  }

  /**
   * Construct a spline of a specified degree given arrays of paired data<br>
   * points (x,f(x)). A name for the spline may be specified.<br>
   * <br>
   * @param aDegree Degree of the spline.  Only the following degrees<br>
   * are supported: 1 = linear, 3 = cubic, 5 = quintic, and 7 = heptic.<br>
   * @param aN Number of data points.<br>
   * @param aX %Array of independent values- should be aN long.<br>
   * @param aF %Array of function values- should be aN long.<br>
   * @param aName Optional name of the spline.<br>
   * 
   */
  public GCVSpline(int aDegree, int aN, SWIGTYPE_p_double aX, SWIGTYPE_p_double aF, String aName) {
    this(opensimCommonJNI.new_GCVSpline__SWIG_2(aDegree, aN, SWIGTYPE_p_double.getCPtr(aX), SWIGTYPE_p_double.getCPtr(aF), aName), true);
  }

  /**
   * Construct a spline of a specified degree given arrays of paired data<br>
   * points (x,f(x)). A name for the spline may be specified.<br>
   * <br>
   * @param aDegree Degree of the spline.  Only the following degrees<br>
   * are supported: 1 = linear, 3 = cubic, 5 = quintic, and 7 = heptic.<br>
   * @param aN Number of data points.<br>
   * @param aX %Array of independent values- should be aN long.<br>
   * @param aF %Array of function values- should be aN long.<br>
   * <br>
   * 
   */
  public GCVSpline(int aDegree, int aN, SWIGTYPE_p_double aX, SWIGTYPE_p_double aF) {
    this(opensimCommonJNI.new_GCVSpline__SWIG_3(aDegree, aN, SWIGTYPE_p_double.getCPtr(aX), SWIGTYPE_p_double.getCPtr(aF)), true);
  }

  public GCVSpline(GCVSpline aSpline) {
    this(opensimCommonJNI.new_GCVSpline__SWIG_4(GCVSpline.getCPtr(aSpline), aSpline), true);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimCommonJNI.GCVSpline_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimCommonJNI.GCVSpline_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  /**
   * %Set the degree of this spline.<br>
   * <br>
   * @param aDegree Degree of spline.  Legal values: 1 = linear, 3 = cubic,<br>
   * 5 = quintic, 7 = heptic.
   */
  public void setDegree(int aDegree) {
    opensimCommonJNI.GCVSpline_setDegree(swigCPtr, this, aDegree);
  }

  public int getDegree() {
    return opensimCommonJNI.GCVSpline_getDegree(swigCPtr, this);
  }

  /**
   * Get the order of this spline.<br>
   * <br>
   * @return Order of spline: 2 = linear, 4 = cubic, 6 = quintic, 8 = heptic.
   */
  public int getOrder() {
    return opensimCommonJNI.GCVSpline_getOrder(swigCPtr, this);
  }

  /**
   * Get the half order of this spline.<br>
   * <br>
   * @return Half order of spline: 1 = linear, 2 = cubic, 3 = quintic, 4 = heptic.
   */
  public int getHalfOrder() {
    return opensimCommonJNI.GCVSpline_getHalfOrder(swigCPtr, this);
  }

  /**
   * Get size or number of independent data points (or number of coefficients)<br>
   * used to construct the spline.<br>
   * <br>
   * @return Number of data points (or number of coefficients).
   */
  public int getSize() {
    return opensimCommonJNI.GCVSpline_getSize(swigCPtr, this);
  }

  public ArrayDouble getX() {
    return new ArrayDouble(opensimCommonJNI.GCVSpline_getX__SWIG_0(swigCPtr, this), false);
  }

  /**
   * Get the array of independent variables used to construct the spline.<br>
   * <br>
   * @return Pointer to the independent variable data points.
   */
  public SWIGTYPE_p_double getXValues() {
    long cPtr = opensimCommonJNI.GCVSpline_getXValues(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  /**
   * Get the array of dependent variables used to construct the spline.<br>
   * <br>
   * @return Pointer to the dependent variable data points.
   */
  public SWIGTYPE_p_double getYValues() {
    long cPtr = opensimCommonJNI.GCVSpline_getYValues(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  /**
   * Get the array of coefficients for the spline.<br>
   * <br>
   * @return Pointer to the coefficients.
   */
  public ArrayDouble getCoefficients() {
    return new ArrayDouble(opensimCommonJNI.GCVSpline_getCoefficients(swigCPtr, this), false);
  }

  public int getNumberOfPoints() {
    return opensimCommonJNI.GCVSpline_getNumberOfPoints(swigCPtr, this);
  }

  /**
   * Get the array of independent variables used to construct the spline.<br>
   * <br>
   * @return Reference to the independent variable data points.
   */
  public double getX(int aIndex) {
    return opensimCommonJNI.GCVSpline_getX__SWIG_1(swigCPtr, this, aIndex);
  }

  public double getY(int aIndex) {
    return opensimCommonJNI.GCVSpline_getY(swigCPtr, this, aIndex);
  }

  public double getZ(int aIndex) {
    return opensimCommonJNI.GCVSpline_getZ(swigCPtr, this, aIndex);
  }

  public void setX(int aIndex, double aValue) {
    opensimCommonJNI.GCVSpline_setX(swigCPtr, this, aIndex, aValue);
  }

  public void setY(int aIndex, double aValue) {
    opensimCommonJNI.GCVSpline_setY(swigCPtr, this, aIndex, aValue);
  }

  /**
   * Get the minimum value of the independent variable.<br>
   * <br>
   * @return Minimum value of the independent variable.
   */
  public double getMinX() {
    return opensimCommonJNI.GCVSpline_getMinX(swigCPtr, this);
  }

  /**
   * Get the maximum value of the independent variable.<br>
   * <br>
   * @return Maximum value of the independent variable.
   */
  public double getMaxX() {
    return opensimCommonJNI.GCVSpline_getMaxX(swigCPtr, this);
  }

  public boolean deletePoint(int aIndex) {
    return opensimCommonJNI.GCVSpline_deletePoint(swigCPtr, this, aIndex);
  }

  public boolean deletePoints(ArrayInt indices) {
    return opensimCommonJNI.GCVSpline_deletePoints(swigCPtr, this, ArrayInt.getCPtr(indices), indices);
  }

  public int addPoint(double aX, double aY) {
    return opensimCommonJNI.GCVSpline_addPoint(swigCPtr, this, aX, aY);
  }

  public SWIGTYPE_p_SimTK__Function createSimTKFunction() {
    long cPtr = opensimCommonJNI.GCVSpline_createSimTKFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__Function(cPtr, false);
  }

}
