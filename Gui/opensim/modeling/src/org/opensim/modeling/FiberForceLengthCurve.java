/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This class serves as a serializable FiberForceLengthCurve, commonly used to<br>
 *     model the parallel elastic element in muscle models. The fiber-force-length<br>
 *     curve is dimensionless: force is normalized to maximum isometric force and<br>
 *     length is normalized to resting fiber length. The user can adjust the<br>
 *     maximum strain at no load and the strain developed under 1 normalized unit<br>
 *     of force using the fitted curve. Additionally, if desired, it is possible to<br>
 *     directly set the low-force stiffness of the fiber, the stiffness of the<br>
 *     fiber at 1 normalized unit of force, and the shape of the curve (its<br>
 *     'curviness'):<br>
 * <br>
 *     <h3>Properties</h3><br>
 *     - <code>strainAtZeroForce</code><br><br>
 *         The fiber strain at which the fiber starts to develop force.<br>
 *         strainAtZeroForce = 0.0 means that the fiber will begin developing<br>
 *         tension when it is at its resting length.<br>
 * <br>
 *     - <code>strainAtOneNormForce</code><br><br>
 *         The fiber strain at which the fiber develops 1 unit of normalized force.<br>
 *         strainAtOneNormForce = 0.6 means that the fiber will develop a tension<br>
 *         of 1 normalized force when it is strained by 60% of its resting length<br>
 *         or, equivalently, when it is stretched to 1.6 times its resting length.<br>
 * <br>
 *     - <code>stiffnessAtLowForce</code><br><br>
 *         The normalized stiffness (slope of the curve) when the fiber is just<br>
 *         beginning to develop tensile force.<br>
 * <br>
 *     - <code>stiffnessAtOneNormForce</code><br><br>
 *         The normalized stiffness (slope of the curve) when the fiber develops a<br>
 *         tension of 1 normalized unit of force.<br>
 * <br>
 *     - <code>curviness</code><br><br>
 *         A dimensionless parameter between 0 and 1 that describes the shape of<br>
 *         the curve: a value of 0 indicates a curve that is very close to a<br>
 *         straight line segment and a value of 1 indicates a curve that smoothly<br>
 *         fills the corner formed by the linear extrapolation of<br>
 *         'stiffnessAtOneNormForce' and the x-axis, as shown in the figure.<br>
 * <br>
 *     Note that we use the Cauchy or engineering definition of strain throughout:<br>
 *     strain = (l-l0)/l0, where l is the current fiber length and l0 is its<br>
 *     resting length.<br>
 * <br>
 *     <h3>Required Properties</h3><br>
 *     - <code>strainAtZeroForce</code><br>
 *     - <code>strainAtOneNormForce</code><br>
 * <br>
 *     <h3>Optional Properties</h3><br>
 *     - <code>stiffnessAtLowForce</code><br>
 *     - <code>stiffnessAtOneNormForce</code><br>
 *     - <code>curviness</code><br>
 * <br>
 *     <img src=fig_FiberForceLengthCurve.png/><br>
 * <br>
 *     <h3>Conditions</h3><br>
 *     {@literal 
    strainAtZeroForce < strainAtOneNormForce
    stiffnessAtOneNormForce > 1/(strainAtOneNormForce-strainAtZeroForce)
    0 < stiffnessAtLowForce < stiffnessAtOneNormForce
    0 <= curviness <= 1
    }<br>
 * <br>
 *     The required parameters can be set using either the constructor or the<br>
 *     setCurveStrains function; the optional parameters can be set using the<br>
 *     setOptionalProperties function. Note that filling in one optional parameter<br>
 *     but not the others will throw an exception when the curve is built. The<br>
 *     optional parameters can be used to vary the shape of the curve from a close<br>
 *     approximation of a line to a sharply-bent curve.<br>
 * <br>
 *     The advantage of this curve over the typical exponential curve used in the<br>
 *     literature is that it is continuous to the second derivative; the usual<br>
 *     linearly-extrapolated exponential curve is only C0-continuous. The improved<br>
 *     smoothness of this curve makes the equations somewhat easier to simulate<br>
 *     and, more importantly, permits the use of derivative-based numerical methods<br>
 *     on the curve. In addition, the extra parameters in this curve formulation<br>
 *     can be adjusted to match a wide variety of shapes, should it be desired to<br>
 *     fit the curve to a different set of experimental data.<br>
 * <br>
 *     <h3>Default Parameter Values</h3><br>
 *     If the optional parameters are not specified, the curve is fit to the<br>
 *     experimentally measured fiber-force-length curves of Winters et al. (2010,<br>
 *     Fig. 3a).<br>
 * <br>
 *     {@literal 
    strainAtZeroForce .......... 0.0
    strainAtOneNormForce ....... 0.7
    stiffnessAtLowForce ........ 0.2
    stiffnessAtOneNormForce .... 2.0 / (strainAtOneNormForce-strainAtZeroForce) = 2.86
    curviness .................. 0.75
    }<br>
 * <br>
 *     <h3>Example</h3><br>
 *     {@code 
Make a fitted fiber-force-length curve.
    FiberForceLengthCurve fpeCurve1;
    fpeCurve1.setCurveStrains(0.0, 0.7);
    double fpeVal1 = fpeCurve1.calcValue(0.1);

Make a custom fiber-force-length curve by supplying all parameters.
    FiberForceLengthCurve fpeCurve2(0.0, 0.7, 0.2, 2.86, 0.75);
    double fpeVal2  = fpeCurve2.calcValue(0.02);
    double dfpeVal2 = fpeCurve2.calcDerivative(0.02, 1);
    }<br>
 * <br>
 *     Note that this object should be updated through the set methods provided.<br>
 *     These set methods will take care of rebuilding the curve correctly. If you<br>
 *     modify the properties directly, the curve will not be rebuilt, and upon<br>
 *     calling a function like calcValue, calcDerivative, or printCurveToCSVFile,<br>
 *     an exception will be thrown because the curve is out-of-date with its<br>
 *     properties.<br>
 * <br>
 *     <h3>References</h3><br>
 *     - Thelen, D.G. (2003) Adjustment of muscle mechanics model parameters to<br>
 *       simulate dynamic contractions in older adults. ASME Journal of<br>
 *       Biomechanical Engineering 125:70--77.<br>
 *     - Winters, T.M., Takahashi, M., Lieber, R.L., and Ward, S. (2010) Whole<br>
 *       muscle length-tension relationships are accurately modeled as scaled<br>
 *       sarcomeres in rabbit hindlimb muscles. Journal of Biomechanics<br>
 *       44:109--115.<br>
 * <br>
 *     @author Matt Millard
 */
public class FiberForceLengthCurve extends Function {
  private transient long swigCPtr;

  public FiberForceLengthCurve(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.FiberForceLengthCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(FiberForceLengthCurve obj) {
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
        opensimSimulationJNI.delete_FiberForceLengthCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static FiberForceLengthCurve safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.FiberForceLengthCurve_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new FiberForceLengthCurve(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.FiberForceLengthCurve_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.FiberForceLengthCurve_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.FiberForceLengthCurve_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new FiberForceLengthCurve(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.FiberForceLengthCurve_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_strain_at_zero_force(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_strain_at_zero_force(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_strain_at_zero_force(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_strain_at_zero_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_strain_at_zero_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_strain_at_zero_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_strain_at_zero_force(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_strain_at_zero_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_strain_at_zero_force(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_strain_at_zero_force(swigCPtr, this, value);
  }

  public void constructProperty_strain_at_zero_force(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_strain_at_zero_force(swigCPtr, this, initValue);
  }

  public double get_strain_at_zero_force() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_strain_at_zero_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_strain_at_zero_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_strain_at_zero_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_strain_at_zero_force(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_strain_at_zero_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_strain_at_one_norm_force(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_strain_at_one_norm_force(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_strain_at_one_norm_force(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_strain_at_one_norm_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_strain_at_one_norm_force(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_strain_at_one_norm_force(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_strain_at_one_norm_force(swigCPtr, this, value);
  }

  public void constructProperty_strain_at_one_norm_force(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_strain_at_one_norm_force(swigCPtr, this, initValue);
  }

  public double get_strain_at_one_norm_force() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_strain_at_one_norm_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_strain_at_one_norm_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_strain_at_one_norm_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_strain_at_one_norm_force(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_strain_at_one_norm_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_stiffness_at_low_force(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_stiffness_at_low_force(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_stiffness_at_low_force(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_stiffness_at_low_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_stiffness_at_low_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_stiffness_at_low_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_stiffness_at_low_force(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_stiffness_at_low_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_stiffness_at_low_force(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_stiffness_at_low_force(swigCPtr, this, value);
  }

  public void constructProperty_stiffness_at_low_force() {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_stiffness_at_low_force__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_stiffness_at_low_force(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_stiffness_at_low_force__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_stiffness_at_low_force() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_stiffness_at_low_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_stiffness_at_low_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_stiffness_at_low_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_stiffness_at_low_force(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_stiffness_at_low_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_stiffness_at_one_norm_force(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_stiffness_at_one_norm_force(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_stiffness_at_one_norm_force(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_stiffness_at_one_norm_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_stiffness_at_one_norm_force(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_stiffness_at_one_norm_force(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_stiffness_at_one_norm_force(swigCPtr, this, value);
  }

  public void constructProperty_stiffness_at_one_norm_force() {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_stiffness_at_one_norm_force(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_stiffness_at_one_norm_force() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_stiffness_at_one_norm_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_stiffness_at_one_norm_force(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_curviness(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_curviness(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_curviness(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_curviness(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_curviness(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_curviness(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_curviness(swigCPtr, this, value);
  }

  public void constructProperty_curviness() {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_curviness__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_curviness(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_curviness__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_curviness() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_curviness() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_curviness(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_curviness__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  The default constructor creates a fiber-force-length curve using the<br>
   *     default property values and assigns a default name. 
   */
  public FiberForceLengthCurve() {
    this(opensimSimulationJNI.new_FiberForceLengthCurve__SWIG_0(), true);
  }

  /**
   *  Constructs a fiber-force-length curve using the provided parameters and<br>
   *     assigns a default name. See class documentation for the meaning of these<br>
   *     parameters, each of which corresponds to a property. 
   */
  public FiberForceLengthCurve(double strainAtZeroForce, double strainAtOneNormForce, double stiffnessAtLowForce, double stiffnessAtOneNormForce, double curviness) {
    this(opensimSimulationJNI.new_FiberForceLengthCurve__SWIG_1(strainAtZeroForce, strainAtOneNormForce, stiffnessAtLowForce, stiffnessAtOneNormForce, curviness), true);
  }

  /**
   *  @return The fiber strain at which the fiber starts to develop force.<br>
   *     strainAtZeroForce = 0.0 means that the fiber will begin developing tension<br>
   *     when it is at its resting length. This property is set to 0 by default. 
   */
  public double getStrainAtZeroForce() {
    return opensimSimulationJNI.FiberForceLengthCurve_getStrainAtZeroForce(swigCPtr, this);
  }

  /**
   *  @return The fiber strain at which the fiber develops 1 unit of<br>
   *     normalized force. strainAtOneNormForce = 0.6 means that the fiber will<br>
   *     develop a tension of 1 normalized force when it is strained by 60% of its<br>
   *     resting length or, equivalently, when it is stretched to 1.6 times its<br>
   *     resting length. This property is set to 0.6 by default. 
   */
  public double getStrainAtOneNormForce() {
    return opensimSimulationJNI.FiberForceLengthCurve_getStrainAtOneNormForce(swigCPtr, this);
  }

  /**
   *  @return The normalized stiffness (slope of the curve) when the fiber is<br>
   *     just beginning to develop tensile force. This property is set to 0.125 by<br>
   *     default. 
   */
  public double getStiffnessAtLowForceInUse() {
    return opensimSimulationJNI.FiberForceLengthCurve_getStiffnessAtLowForceInUse(swigCPtr, this);
  }

  /**
   *  @return The normalized stiffness (slope of the curve) when the fiber<br>
   *     develops a tension of 1 normalized unit of force. This property is set to<br>
   *     5.0 by default. 
   */
  public double getStiffnessAtOneNormForceInUse() {
    return opensimSimulationJNI.FiberForceLengthCurve_getStiffnessAtOneNormForceInUse(swigCPtr, this);
  }

  /**
   *  @return A dimensionless parameter between 0 and 1 that describes the<br>
   *     shape of the curve: a value of 0 indicates a curve that is very close to a<br>
   *     straight line segment and a value of 1 indicates a curve that smoothly fills<br>
   *     the corner formed by the linear extrapolation of 'stiffnessAtOneNormForce'<br>
   *     and the x-axis, as shown in the figure in the class description. This<br>
   *     property is set to 0.75 by default. 
   */
  public double getCurvinessInUse() {
    return opensimSimulationJNI.FiberForceLengthCurve_getCurvinessInUse(swigCPtr, this);
  }

  /**
   *  @return True if the optional properties are empty and the fitted curve<br>
   *     is being used, false if the optional properties are filled and are being<br>
   *     used to construct the curve. 
   */
  public boolean isFittedCurveBeingUsed() {
    return opensimSimulationJNI.FiberForceLengthCurve_isFittedCurveBeingUsed(swigCPtr, this);
  }

  /**
   *     @param aStrainAtZeroForce<br>
   *         The fiber strain at which the fiber starts to develop force.<br>
   *         strainAtZeroForce = 0.0 means that the fiber will begin developing<br>
   *         tension when it is at its resting length.<br>
   *     @param aStrainAtOneNormForce<br>
   *         The fiber strain at which the fiber develops 1 unit of normalized force.<br>
   *         strainAtOneNormForce = 0.6 means that the fiber will develop a tension<br>
   *         of 1 normalized force when it is strained by 60% of its resting length<br>
   *         or, equivalently, when it is stretched to 1.6 times its resting length.<br>
   * <br>
   *     <b>Conditions</b><br>
   *     {@literal 
      strainAtZeroForce < strainAtOneNormForce
      }
   */
  public void setCurveStrains(double aStrainAtZeroForce, double aStrainAtOneNormForce) {
    opensimSimulationJNI.FiberForceLengthCurve_setCurveStrains(swigCPtr, this, aStrainAtZeroForce, aStrainAtOneNormForce);
  }

  /**
   *     @param stiffnessAtLowForce<br>
   *         The normalized stiffness (slope of the curve) when the fiber is just<br>
   *         beginning to develop tensile force.<br>
   *     @param stiffnessAtOneNormForce<br>
   *         The normalized stiffness (slope of the curve) when the fiber develops a<br>
   *         tension of 1 normalized unit of force.<br>
   *     @param curviness<br>
   *         A dimensionless parameter between 0 and 1 that controls the shape of the<br>
   *         curve: a value of 0 will create a curve that is very close to a straight<br>
   *         line segment and a value of 1 will create a curve that smoothly fills<br>
   *         the corner formed by the linear extrapolation of<br>
   *         'stiffnessAtOneNormForce' and the x-axis, as shown in the figure in the<br>
   *         class description.<br>
   * <br>
   *     <b>Conditions</b><br>
   *     {@literal 
      stiffnessAtOneNormForce > 1/(strainAtOneNormForce-strainAtZeroForce)
      0 < stiffnessAtLowForce < stiffnessAtOneNormForce
      0 <= curviness <= 1
      }
   */
  public void setOptionalProperties(double stiffnessAtLowForce, double stiffnessAtOneNormForce, double curviness) {
    opensimSimulationJNI.FiberForceLengthCurve_setOptionalProperties(swigCPtr, this, stiffnessAtLowForce, stiffnessAtOneNormForce, curviness);
  }

  /**
   *  Implement the generic OpenSim::Function interface *
   */
  public double calcValue(Vector x) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcValue__SWIG_0(swigCPtr, this, Vector.getCPtr(x), x);
  }

  /**
   *  Evaluates the fiber-force-length curve at a normalized fiber length of<br>
   *     'normFiberLength'. 
   */
  public double calcValue(double normFiberLength) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcValue__SWIG_1(swigCPtr, this, normFiberLength);
  }

  /**
   *  Calculates the derivative of the fiber-force-length multiplier with<br>
   *     respect to the normalized fiber length.<br>
   *     @param normFiberLength<br>
   *         The normalized length of the muscle fiber.<br>
   *     @param order<br>
   *         The order of the derivative. Only values of 0, 1, and 2 are acceptable.<br>
   *     @return <br>
   *         The derivative of the fiber-force-length curve with respect to the<br>
   *         normalized fiber length.
   */
  public double calcDerivative(double normFiberLength, int order) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcDerivative__SWIG_0(swigCPtr, this, normFiberLength, order);
  }

  /**
   *  If possible, use the simpler overload above.
   */
  public double calcDerivative(StdVectorInt derivComponents, Vector x) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcDerivative__SWIG_1(swigCPtr, this, StdVectorInt.getCPtr(derivComponents), derivComponents, Vector.getCPtr(x), x);
  }

  /**
   *  Calculates the normalized area under the curve. Since it is expensive to<br>
   *     construct, the curve is built only when necessary.<br>
   *     @param normFiberLength<br>
   *         The normalized length of the muscle fiber.<br>
   *     @return The normalized area under the curve, which corresponds to the<br>
   *         normalized potential energy stored in the fiber. To calculate the<br>
   *         potential energy stored in the fiber in units of Joules, multiply the<br>
   *         returned quantity by normForce*normLength (where normForce is the number<br>
   *         of Newtons represented by a normalized force of 1.0 and normLength is<br>
   *         the number of meters represented by a normalized length of 1.0).
   */
  public double calcIntegral(double normFiberLength) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcIntegral(swigCPtr, this, normFiberLength);
  }

  /**
   *  Returns a SimTK::Vec2 containing the lower (0th element) and upper (1st<br>
   *     element) bounds on the domain of the curve. Outside this domain, the curve<br>
   *     is approximated using linear extrapolation.<br>
   *     @return <br>
   *         The minimum and maximum value of the domain, x, of the curve y(x).<br>
   *         Within this range, y(x) is a curve; outside this range, the function<br>
   *         y(x) is a C2-continuous linear extrapolation.
   */
  public Vec2 getCurveDomain() {
    return new Vec2(opensimSimulationJNI.FiberForceLengthCurve_getCurveDomain(swigCPtr, this), true);
  }

  /**
   *  Generates a .csv file with a name that matches the curve name (e.g.,<br>
   *     "bicepsfemoris_FiberForceLengthCurve.csv"). This function is not const to<br>
   *     permit the curve to be rebuilt if it is out-of-date with its properties.<br>
   *     @param path<br>
   *         The full destination path. Note that forward slashes ('/') must be used<br>
   *         and there should not be a slash after the last folder.<br>
   * <br>
   *     The file will contain the following data:<br>
   *     {@literal 
      column: 1 | 2 |     3 |       4
        data: x | y | dy/dx | d2y/dx2
      }<br>
   * <br>
   *     Samples will be taken from the zero-force region, through the curve, out to<br>
   *     strains beyond which the fiber generates passive normalized forces greater<br>
   *     than 1. The curve is sampled quite densely: the fiber-force-length .csv file<br>
   *     will have 200+20 rows.<br>
   * <br>
   *     <b>Example</b><br>
   *     To read the .csv file into Matlab, you need to set csvread to ignore the<br>
   *     header row. Since csvread is 0-indexed, the following example will begin<br>
   *     reading the .csv file from the first column of the second row:<br>
   *     {@literal 
      data = csvread('bicepsfemoris_FiberForceLengthCurve.csv', 1, 0);
      }
   */
  public void printMuscleCurveToCSVFile(String path) {
    opensimSimulationJNI.FiberForceLengthCurve_printMuscleCurveToCSVFile(swigCPtr, this, path);
  }

  public void ensureCurveUpToDate() {
    opensimSimulationJNI.FiberForceLengthCurve_ensureCurveUpToDate(swigCPtr, this);
  }

}
