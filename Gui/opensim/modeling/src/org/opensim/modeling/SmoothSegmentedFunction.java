/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *     This class contains the quintic Bezier curves, x(u) and y(u), that have been<br>
 *     created by SmoothSegmentedFunctionFactory to follow a physiologically meaningful <br>
 *     muscle characteristic. A SmoothSegmentedFunction cannot be created directly,<br>
 *     you must use SmoothSegmentedFunctionFactory to create the muscle curve of <br>
 *     interest.<br>
 * <br>
 *     <b>Future Upgrades</b><br>
 *     1. Add a hint object to keep the last u that corresponded to the location of<br>
 *        interest to prevent unnecessary redundant evaluations of u. This hint <br>
 *        could be similar in form to the used by the SimTK::BicubicSurface class<br>
 * <br>
 *        <b>Computational Cost Details</b><br>
 *         All computational costs assume the following operation costs:<br>
 * <br>
 *         {@literal 
        Operation Type   : #flops
        +,-,=,Boolean Op : 1 
: 10
                     sqrt: 20
                     trig: 40
        }<br>
 * <br>
 *         These relative weightings will vary processor to processor, and so any of <br>
 *         the quoted computational costs are approximate.<br>
 * <br>
 *         @author Matt Millard<br>
 *         @version 0.0
 */
public class SmoothSegmentedFunction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public SmoothSegmentedFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SmoothSegmentedFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_SmoothSegmentedFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * The default constructor, which populates the member data fields with<br>
   * NaN's
   */
  public SmoothSegmentedFunction() {
    this(opensimCommonJNI.new_SmoothSegmentedFunction__SWIG_0(), true);
  }

  public SmoothSegmentedFunction(SmoothSegmentedFunction arg0) {
    this(opensimCommonJNI.new_SmoothSegmentedFunction__SWIG_1(SmoothSegmentedFunction.getCPtr(arg0), arg0), true);
  }

  /**
   * Calculates the value of the curve this object represents.<br>
   * <br>
   *        @param x The domain point of interest<br>
   *        @throws OpenSim::Exception<br>
   *         -If ax does not have a size of 1<br>
   *        @return The value of the curve<br>
   * <br>
   * <br>
   *        The curve is parameterized as a set of Bezier curves. If x is within the<br>
   *        domain of these Bezier curves they will be evaluated. If x is outside<br>
   *        of the domain of these Bezier curves a linear extrapolation will be <br>
   *        evaluated<br>
   * <br>
   * <br>
   *        <b>Computational Costs</b><br>
   *        {@literal 
              x in curve domain  : ~282 flops
              x in linear section:   ~5 flops
         }
   */
  public double calcValue(double x) {
    return opensimCommonJNI.SmoothSegmentedFunction_calcValue(swigCPtr, this, x);
  }

  /**
   * Calculates the value of the derivative of the curve this object <br>
   *        represents. <br>
   * <br>
   *        @param x     The domain point of interest.<br>
   * <br>
   *        @param order The order of the derivative to compute. Note that order must<br>
   *                     be between 0 and 2. Calling 0 just calls calcValue. <br>
   * <br>
   *        @throws OpenSim::Exception<br>
   *         -If anything but 0's are stored in derivComponents<br>
   *         -If more than the 6th derivative is asked for<br>
   *         -If ax has a size other than 1<br>
   * <br>
   *        @return The value of the d^ny/dx^n th derivative evaluated at x         <br>
   * <br>
   * <br>
   * <br>
   *        <b>Computational Costs</b>       <br>
   *        {@literal 
              x in curve domain  : ~391 flops
              x in linear section:   ~2 flops       
         }
   */
  public double calcDerivative(double x, int order) {
    return opensimCommonJNI.SmoothSegmentedFunction_calcDerivative(swigCPtr, this, x, order);
  }

  static public class ValueAndDerivative {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public ValueAndDerivative(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(ValueAndDerivative obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    public static long swigRelease(ValueAndDerivative obj) {
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
          opensimCommonJNI.delete_SmoothSegmentedFunction_ValueAndDerivative(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setValue(double value) {
      opensimCommonJNI.SmoothSegmentedFunction_ValueAndDerivative_value_set(swigCPtr, this, value);
    }
  
    public double getValue() {
      return opensimCommonJNI.SmoothSegmentedFunction_ValueAndDerivative_value_get(swigCPtr, this);
    }
  
    public void setDerivative(double value) {
      opensimCommonJNI.SmoothSegmentedFunction_ValueAndDerivative_derivative_set(swigCPtr, this, value);
    }
  
    public double getDerivative() {
      return opensimCommonJNI.SmoothSegmentedFunction_ValueAndDerivative_derivative_get(swigCPtr, this);
    }
  
    public ValueAndDerivative() {
      this(opensimCommonJNI.new_SmoothSegmentedFunction_ValueAndDerivative(), true);
    }
  
  }

  /**
   *  Returns the same as calcValue(x) and calcDerivative(x, 1), but more
   */
  public SmoothSegmentedFunction.ValueAndDerivative calcValueAndFirstDerivative(double x) {
    return new SmoothSegmentedFunction.ValueAndDerivative(opensimCommonJNI.SmoothSegmentedFunction_calcValueAndFirstDerivative(swigCPtr, this, x), true);
  }

  /**
   * This will return the value of the integral of this objects curve <br>
   *        evaluated at x. <br>
   * <br>
   *        @param x the domain point of interest<br>
   *        @throws OpenSim::Exception<br>
   *         -If the function does not have a pre-computed integral<br>
   *        @return the value of the functions integral evaluated at x<br>
   * <br>
   *        The integral is approximate, though its errors are small.<br>
   *        The integral is computed by numerically integrating the function when<br>
   *        the constructor for this class is called (if computeIntegral is true) and <br>
   *        then splining the result, thus the regions between the knot points may<br>
   *        have some error in them. A very fine mesh of points is used to create the<br>
   *        spline so the errors will be small<br>
   * <br>
   *        <b>Computational Costs</b><br>
   *        {@literal 
              x in curve domain  : ~13 flops
              x in linear section: ~19 flops
         }
   */
  public double calcIntegral(double x) {
    return opensimCommonJNI.SmoothSegmentedFunction_calcIntegral(swigCPtr, this, x);
  }

  /**
   *         Returns a bool that indicates if the integral curve has been computed.<br>
   * <br>
   *         @return true if the integral of this function is available, false if<br>
   *                 it has not been computed.
   */
  public boolean isIntegralAvailable() {
    return opensimCommonJNI.SmoothSegmentedFunction_isIntegralAvailable(swigCPtr, this);
  }

  /**
   *        Returns a bool that indicates if the integral computed is computed left<br>
   *        to right, or right to left.<br>
   * <br>
   *        @return true if the integral was computed left to right, and false if the<br>
   *                integral was computed right to left. Note that the output of<br>
   *                this function is only valid if isIntegralAvailable() returns<br>
   *                true.
   */
  public boolean isIntegralComputedLeftToRight() {
    return opensimCommonJNI.SmoothSegmentedFunction_isIntegralComputedLeftToRight(swigCPtr, this);
  }

  /**
   *        Returns a string that is the name for this curve, which is set at the <br>
   *        time of construction and cannot be changed after construction.<br>
   * <br>
   *        @return The string name this object was given during construction
   */
  public String getName() {
    return opensimCommonJNI.SmoothSegmentedFunction_getName(swigCPtr, this);
  }

  public void setName(SWIGTYPE_p_std__string name) {
    opensimCommonJNI.SmoothSegmentedFunction_setName(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(name));
  }

  /**
   *        This function returns a SimTK::Vec2 that contains in its 0th element<br>
   *        the lowest value of the curve domain, and in its 1st element the highest<br>
   *        value in the curve domain of the curve. Outside of this domain the curve<br>
   *        is approximated using linear extrapolation.<br>
   * <br>
   *        @return The minimum and maximum value of the domain, x, of the curve <br>
   *                   y(x). Within this range y(x) is a curve, outside of this range<br>
   *                   the function y(x) is a C2 (continuous to the second <br>
   *                   derivative) linear extrapolation
   */
  public Vec2 getCurveDomain() {
    return new Vec2(opensimCommonJNI.SmoothSegmentedFunction_getCurveDomain(swigCPtr, this), true);
  }

  /**
   * This function will generate a csv file (of 'name_curveName.csv', where <br>
   *        name is the one used in the constructor) of the muscle curve, and <br>
   *        'curveName' corresponds to the function that was called from<br>
   *        SmoothSegmentedFunctionFactory to create the curve.<br>
   * <br>
   *        @param path The full path to the location. Note '/' slashes must be used,<br>
   *             and do not put a '/' after the last folder.<br>
   *        @param domainMin <br>
   *                  the left most domain point of the curve to print. The curve<br>
   *                  will extend to at least this point.<br>
   *        @param domainMax <br>
   *                  the right most domain point of the curve to print. The <br>
   *                  printed curve will extend at least to this point, perhaps<br>
   *                  beyond.<br>
   *         @throws OpenSim::Exception<br>
   *             -If the filename is empty<br>
   * <br>
   *        For example the tendon <br>
   *        curve for a muscle named 'glutmax' will be:<br>
   * <br>
   *        'glutmax_tendonForceLengthCurve.csv'<br>
   * <br>
   *        The file will contain the following columns:<br>
   * <br>
   *        {@literal 
         Col# 1, 2,     3,       4,  5
              x, y, dy/dx, d2y/dx2,  iy
         }<br>
   * <br>
   *        Where iy is the integral of y(x). If the curve has been set not to have<br>
   *        an integral, this column will not exist.<br>
   * <br>
   *        The curve will be sampled from its linear extrapolation region, through <br>
   *        the curve, out to the other linear extrapolation region. The width of <br>
   *        each linear extrapolation region is 10% of the entire range of x, or <br>
   *        0.1*(x1-x0).<br>
   * <br>
   *        The number of rows used will vary from curve to curve. Each quintic <br>
   *        Bezier curve section will have 100 samples. Each linearly extrapolated<br>
   *        region will have 10 samples each. Some muscle curves (the tendon, <br>
   *        parallel elements, compressive elements) consist of only 1 elbow, and so <br>
   *        these matrices will have only 100+20 rows. The force velocity curve is <br>
   *        made up of 2 elbows and will have 200+20 rows. The active force length <br>
   *        curve has 5 elbows, and so its sampled matrix will have 500+20 rows    <br>
   * <br>
   *        <b>Computational Costs</b><br>
   *        This varies depending on the curve (as mentioned above).<br>
   *        {@literal 
              ~97,400 to 487,000 flops
         }<br>
   * <br>
   *        <b>Example</b><br>
   *        To read the csv file with a header in from Matlab, you need to use <br>
   *        csvread set so that it will ignore the header row. This is accomplished<br>
   *        by using the extra two numerical arguments for csvread to tell the <br>
   *        function to begin reading from the 1st row, and the 0th index (csvread<br>
   *        is 0 indexed).<br>
   *        {@literal 
          data=csvread('test_tendonForceLengthCurve.csv',1,0);
         }
   */
  public void printMuscleCurveToCSVFile(String path, double domainMin, double domainMax) {
    opensimCommonJNI.SmoothSegmentedFunction_printMuscleCurveToCSVFile(swigCPtr, this, path, domainMin, domainMax);
  }

  /**
   * Conditional comment: <br>
   *        THIS FUNCTION IS PUBLIC FOR TESTING ONLY <br>
   *                    DO NOT USE THIS!<br>
   * <br>
   *        @param maxOrder The maximum derivative order to compute<br>
   *        @throws OpenSim::Exception<br>
   *         -If the requested derivative order is greater than getMaxDerivativeOrder()<br>
   *        @return a matrix populated with x,y,dy/dx ... d^ny/dx^n,iy<br>
   * <br>
   * <br>
   *        This function will generate a SimTK::Matrix populated with samples of<br>
   *        the muscle curves values, derivatives (up to 6) and its first integral. <br>
   *        The matrix has the following columns:<br>
   * <br>
   *        {@literal 
         Col# 1, 2,     3,       4,       5,       6,       7,       8, 9,
              x, y, dy/dx, d2y/dx2, d3y/dx3, d4y/dx4, d5y/dx5, d6y/dx6, iy
         }<br>
   * <br>
   *        Where iy is the integral of y(x). If the curve has been set not to have<br>
   *        an integral, this column will not exist.<br>
   * <br>
   *        The curve will be sampled from its <br>
   *        linear extrapolation region, through the curve, out to the other linear<br>
   *        extrapolation region. The width of each linear extrapolation region is<br>
   *        10% of the entire range of x, or 0.1*(x1-x0).<br>
   * <br>
   *        The rows used will vary from curve to curve. Each quintic Bezier curve<br>
   *        section will have 100 samples + 20 samples for the linear extrapolation<br>
   *        region. Some muscle curves (the tendon, parallel elements, compressive <br>
   *        elements) consist of only 1 elbow, and so these matrices will have only <br>
   *        100+20 rows. The force velocity curve is made up of 2 elbows and will <br>
   *        have 200+20 rows. The active force length curve has 5 elbows, and so its<br>
   *        sampled matrix will have 500+20 rows  
   */
  public Matrix calcSampledMuscleCurve(int maxOrder, double domainMin, double domainMax) {
    return new Matrix(opensimCommonJNI.SmoothSegmentedFunction_calcSampledMuscleCurve(swigCPtr, this, maxOrder, domainMin, domainMax), true);
  }

}
