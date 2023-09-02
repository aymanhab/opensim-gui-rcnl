/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A wrapper class to use the SimTK Simbody dynamics engine as the underlying<br>
 * engine for OpenSim.<br>
 * <br>
 * @author Frank C. Anderson, Ajay Seth<br>
 * @version 1.0
 */
public class SimbodyEngine extends OpenSimObject {
  private transient long swigCPtr;

  public SimbodyEngine(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SimbodyEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SimbodyEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(SimbodyEngine obj) {
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
        opensimSimulationJNI.delete_SimbodyEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SimbodyEngine safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SimbodyEngine_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SimbodyEngine(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SimbodyEngine_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SimbodyEngine_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SimbodyEngine_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SimbodyEngine(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SimbodyEngine_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Pointer to the model that owns this dynamics engine. 
   */
  public void set_model(Model value) {
    opensimSimulationJNI.SimbodyEngine__model_set(swigCPtr, this, Model.getCPtr(value), value);
  }

  /**
   *  Pointer to the model that owns this dynamics engine. 
   */
  public Model get_model() {
    long cPtr = opensimSimulationJNI.SimbodyEngine__model_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public SimbodyEngine() {
    this(opensimSimulationJNI.new_SimbodyEngine__SWIG_0(), true);
  }

  public SimbodyEngine(String aFileName) {
    this(opensimSimulationJNI.new_SimbodyEngine__SWIG_1(aFileName), true);
  }

  public SimbodyEngine(SimbodyEngine aEngine) {
    this(opensimSimulationJNI.new_SimbodyEngine__SWIG_2(SimbodyEngine.getCPtr(aEngine), aEngine), true);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.SimbodyEngine_getModel(swigCPtr, this), false);
  }

  public void setModel(Model aModel) {
    opensimSimulationJNI.SimbodyEngine_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void connectSimbodyEngineToModel(Model aModel) {
    opensimSimulationJNI.SimbodyEngine_connectSimbodyEngineToModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void computeReactions(State s, VectorVec3 rForces, VectorVec3 rTorques) {
    opensimSimulationJNI.SimbodyEngine_computeReactions(swigCPtr, this, State.getCPtr(s), s, VectorVec3.getCPtr(rForces), rForces, VectorVec3.getCPtr(rTorques), rTorques);
  }

  /**
   * From a potentially partial specification of the generalized coordinates,<br>
   * form a complete storage of the generalized coordinates (q's) and<br>
   * generalized speeds (u's) in radians and radians/s respectively.<br>
   * <br>
   * @param s Used as working memory.<br>
   * @param aQIn Storage containing the q's or a subset of the q's.<br>
   * @param rQComplete Storage containing all the q's.  If q's were not<br>
   * in aQIn, the values are set to 0.0.  When a q is constrained, its value<br>
   * is altered to be consistent with the constraint.  The caller is responsible<br>
   * for deleting the memory associated with this storage. Units are radians.<br>
   * @param rUComplete Storage containing all the u's.  The generalized speeds<br>
   * are obtained by spline fitting the q's and differentiating the splines.<br>
   * When a u is constrained, its value is altered to be consistent with the<br>
   * constraint.  The caller is responsible for deleting the memory<br>
   * associated with this storage. Units are radians/s.
   */
  public void formCompleteStorages(State s, Storage aQIn, SWIGTYPE_p_p_OpenSim__Storage rQComplete, SWIGTYPE_p_p_OpenSim__Storage rUComplete) {
    opensimSimulationJNI.SimbodyEngine_formCompleteStorages(swigCPtr, this, State.getCPtr(s), s, Storage.getCPtr(aQIn), aQIn, SWIGTYPE_p_p_OpenSim__Storage.getCPtr(rQComplete), SWIGTYPE_p_p_OpenSim__Storage.getCPtr(rUComplete));
  }

  public void convertRadiansToDegrees(Storage rStorage) {
    opensimSimulationJNI.SimbodyEngine_convertRadiansToDegrees__SWIG_0(swigCPtr, this, Storage.getCPtr(rStorage), rStorage);
  }

  public void convertRadiansToDegrees(TimeSeriesTable table) {
    opensimSimulationJNI.SimbodyEngine_convertRadiansToDegrees__SWIG_1(swigCPtr, this, TimeSeriesTable.getCPtr(table), table);
  }

  public void convertDegreesToRadians(Storage rStorage) {
    opensimSimulationJNI.SimbodyEngine_convertDegreesToRadians__SWIG_0(swigCPtr, this, Storage.getCPtr(rStorage), rStorage);
  }

  public void convertDegreesToRadians(TimeSeriesTable table) {
    opensimSimulationJNI.SimbodyEngine_convertDegreesToRadians__SWIG_1(swigCPtr, this, TimeSeriesTable.getCPtr(table), table);
  }

  public void convertDegreesToRadians(SWIGTYPE_p_double aQDeg, SWIGTYPE_p_double rQRad) {
    opensimSimulationJNI.SimbodyEngine_convertDegreesToRadians__SWIG_2(swigCPtr, this, SWIGTYPE_p_double.getCPtr(aQDeg), SWIGTYPE_p_double.getCPtr(rQRad));
  }

  public void convertRadiansToDegrees(SWIGTYPE_p_double aQRad, SWIGTYPE_p_double rQDeg) {
    opensimSimulationJNI.SimbodyEngine_convertRadiansToDegrees__SWIG_2(swigCPtr, this, SWIGTYPE_p_double.getCPtr(aQRad), SWIGTYPE_p_double.getCPtr(rQDeg));
  }

  public void convertAnglesToDirectionCosines(double aE1, double aE2, double aE3, SWIGTYPE_p_a_3__double rDirCos) {
    opensimSimulationJNI.SimbodyEngine_convertAnglesToDirectionCosines__SWIG_0(swigCPtr, this, aE1, aE2, aE3, SWIGTYPE_p_a_3__double.getCPtr(rDirCos));
  }

  public void convertAnglesToDirectionCosines(double aE1, double aE2, double aE3, SWIGTYPE_p_double rDirCos) {
    opensimSimulationJNI.SimbodyEngine_convertAnglesToDirectionCosines__SWIG_1(swigCPtr, this, aE1, aE2, aE3, SWIGTYPE_p_double.getCPtr(rDirCos));
  }

  public void convertDirectionCosinesToAngles(SWIGTYPE_p_a_3__double aDirCos, SWIGTYPE_p_double rE1, SWIGTYPE_p_double rE2, SWIGTYPE_p_double rE3) {
    opensimSimulationJNI.SimbodyEngine_convertDirectionCosinesToAngles__SWIG_0(swigCPtr, this, SWIGTYPE_p_a_3__double.getCPtr(aDirCos), SWIGTYPE_p_double.getCPtr(rE1), SWIGTYPE_p_double.getCPtr(rE2), SWIGTYPE_p_double.getCPtr(rE3));
  }

  public void convertDirectionCosinesToAngles(SWIGTYPE_p_double aDirCos, SWIGTYPE_p_double rE1, SWIGTYPE_p_double rE2, SWIGTYPE_p_double rE3) {
    opensimSimulationJNI.SimbodyEngine_convertDirectionCosinesToAngles__SWIG_1(swigCPtr, this, SWIGTYPE_p_double.getCPtr(aDirCos), SWIGTYPE_p_double.getCPtr(rE1), SWIGTYPE_p_double.getCPtr(rE2), SWIGTYPE_p_double.getCPtr(rE3));
  }

  public void convertDirectionCosinesToQuaternions(SWIGTYPE_p_a_3__double aDirCos, SWIGTYPE_p_double rQ1, SWIGTYPE_p_double rQ2, SWIGTYPE_p_double rQ3, SWIGTYPE_p_double rQ4) {
    opensimSimulationJNI.SimbodyEngine_convertDirectionCosinesToQuaternions__SWIG_0(swigCPtr, this, SWIGTYPE_p_a_3__double.getCPtr(aDirCos), SWIGTYPE_p_double.getCPtr(rQ1), SWIGTYPE_p_double.getCPtr(rQ2), SWIGTYPE_p_double.getCPtr(rQ3), SWIGTYPE_p_double.getCPtr(rQ4));
  }

  public void convertDirectionCosinesToQuaternions(SWIGTYPE_p_double aDirCos, SWIGTYPE_p_double rQ1, SWIGTYPE_p_double rQ2, SWIGTYPE_p_double rQ3, SWIGTYPE_p_double rQ4) {
    opensimSimulationJNI.SimbodyEngine_convertDirectionCosinesToQuaternions__SWIG_1(swigCPtr, this, SWIGTYPE_p_double.getCPtr(aDirCos), SWIGTYPE_p_double.getCPtr(rQ1), SWIGTYPE_p_double.getCPtr(rQ2), SWIGTYPE_p_double.getCPtr(rQ3), SWIGTYPE_p_double.getCPtr(rQ4));
  }

  public void convertQuaternionsToDirectionCosines(double aQ1, double aQ2, double aQ3, double aQ4, SWIGTYPE_p_a_3__double rDirCos) {
    opensimSimulationJNI.SimbodyEngine_convertQuaternionsToDirectionCosines__SWIG_0(swigCPtr, this, aQ1, aQ2, aQ3, aQ4, SWIGTYPE_p_a_3__double.getCPtr(rDirCos));
  }

  public void convertQuaternionsToDirectionCosines(double aQ1, double aQ2, double aQ3, double aQ4, SWIGTYPE_p_double rDirCos) {
    opensimSimulationJNI.SimbodyEngine_convertQuaternionsToDirectionCosines__SWIG_1(swigCPtr, this, aQ1, aQ2, aQ3, aQ4, SWIGTYPE_p_double.getCPtr(rDirCos));
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::getPositionInGround() instead. 
   */
  public void getPosition(State s, PhysicalFrame aBody, Vec3 aPoint, Vec3 rPos) {
    opensimSimulationJNI.SimbodyEngine_getPosition(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, Vec3.getCPtr(aPoint), aPoint, Vec3.getCPtr(rPos), rPos);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::getVelocityInGround() instead. 
   */
  public void getVelocity(State s, PhysicalFrame aBody, Vec3 aPoint, Vec3 rVel) {
    opensimSimulationJNI.SimbodyEngine_getVelocity(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, Vec3.getCPtr(aPoint), aPoint, Vec3.getCPtr(rVel), rVel);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::getAccelerationInGround() instead. 
   */
  public void getAcceleration(State s, PhysicalFrame aBody, Vec3 aPoint, Vec3 rAcc) {
    opensimSimulationJNI.SimbodyEngine_getAcceleration(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, Vec3.getCPtr(aPoint), aPoint, Vec3.getCPtr(rAcc), rAcc);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::getTransformInGround().R() instead. 
   */
  public void getDirectionCosines(State s, PhysicalFrame aBody, SWIGTYPE_p_a_3__double rDirCos) {
    opensimSimulationJNI.SimbodyEngine_getDirectionCosines__SWIG_0(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, SWIGTYPE_p_a_3__double.getCPtr(rDirCos));
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::getTransformInGround().R() instead. 
   */
  public void getDirectionCosines(State s, PhysicalFrame aBody, SWIGTYPE_p_double rDirCos) {
    opensimSimulationJNI.SimbodyEngine_getDirectionCosines__SWIG_1(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, SWIGTYPE_p_double.getCPtr(rDirCos));
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::getVelocityInGround()[0] instead. 
   */
  public void getAngularVelocity(State s, PhysicalFrame aBody, Vec3 rAngVel) {
    opensimSimulationJNI.SimbodyEngine_getAngularVelocity(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, Vec3.getCPtr(rAngVel), rAngVel);
  }

  /**
   *  <b>(Deprecated)</b> See Frame::getVelocityInGround()[0]. 
   */
  public void getAngularVelocityBodyLocal(State s, PhysicalFrame aBody, Vec3 rAngVel) {
    opensimSimulationJNI.SimbodyEngine_getAngularVelocityBodyLocal(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, Vec3.getCPtr(rAngVel), rAngVel);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::getAccelerationInGround()[0] instead. 
   */
  public void getAngularAcceleration(State s, PhysicalFrame aBody, Vec3 rAngAcc) {
    opensimSimulationJNI.SimbodyEngine_getAngularAcceleration(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, Vec3.getCPtr(rAngAcc), rAngAcc);
  }

  /**
   *  <b>(Deprecated)</b> See Frame::getAccelerationInGround()[0]. 
   */
  public void getAngularAccelerationBodyLocal(State s, PhysicalFrame aBody, Vec3 rAngAcc) {
    opensimSimulationJNI.SimbodyEngine_getAngularAccelerationBodyLocal(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody, Vec3.getCPtr(rAngAcc), rAngAcc);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::getTransformInGround() instead. 
   */
  public Transform getTransform(State s, PhysicalFrame aBody) {
    return new Transform(opensimSimulationJNI.SimbodyEngine_getTransform(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody), aBody), true);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::expressVectorInAnotherFrame() instead. 
   */
  public void transform(State s, PhysicalFrame aBodyFrom, double[] aVec, PhysicalFrame aBodyTo, double[] rVec) {
    opensimSimulationJNI.SimbodyEngine_transform__SWIG_0(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBodyFrom), aBodyFrom, aVec, PhysicalFrame.getCPtr(aBodyTo), aBodyTo, rVec);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::expressVectorInAnotherFrame() instead. 
   */
  public void transform(State s, PhysicalFrame aBodyFrom, Vec3 aVec, PhysicalFrame aBodyTo, Vec3 rVec) {
    opensimSimulationJNI.SimbodyEngine_transform__SWIG_1(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBodyFrom), aBodyFrom, Vec3.getCPtr(aVec), aVec, PhysicalFrame.getCPtr(aBodyTo), aBodyTo, Vec3.getCPtr(rVec), rVec);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::findStationLocationInAnotherFrame() instead. 
   */
  public void transformPosition(State s, PhysicalFrame aBodyFrom, double[] aPos, PhysicalFrame aBodyTo, double[] rPos) {
    opensimSimulationJNI.SimbodyEngine_transformPosition__SWIG_0(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBodyFrom), aBodyFrom, aPos, PhysicalFrame.getCPtr(aBodyTo), aBodyTo, rPos);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::findStationLocationInAnotherFrame() instead. 
   */
  public void transformPosition(State s, PhysicalFrame aBodyFrom, Vec3 aPos, PhysicalFrame aBodyTo, Vec3 rPos) {
    opensimSimulationJNI.SimbodyEngine_transformPosition__SWIG_1(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBodyFrom), aBodyFrom, Vec3.getCPtr(aPos), aPos, PhysicalFrame.getCPtr(aBodyTo), aBodyTo, Vec3.getCPtr(rPos), rPos);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::findStationLocationInGround() instead. 
   */
  public void transformPosition(State s, PhysicalFrame aBodyFrom, double[] aPos, double[] rPos) {
    opensimSimulationJNI.SimbodyEngine_transformPosition__SWIG_2(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBodyFrom), aBodyFrom, aPos, rPos);
  }

  /**
   *  <b>(Deprecated)</b> Use Frame::findStationLocationInGround() instead. 
   */
  public void transformPosition(State s, PhysicalFrame aBodyFrom, Vec3 aPos, Vec3 rPos) {
    opensimSimulationJNI.SimbodyEngine_transformPosition__SWIG_3(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBodyFrom), aBodyFrom, Vec3.getCPtr(aPos), aPos, Vec3.getCPtr(rPos), rPos);
  }

  /**
   *  <b>(Deprecated)</b> Use Point::calcDistanceBetween() or Frame::findStationLocationInGround() instead 
   */
  public double calcDistance(State s, PhysicalFrame aBody1, Vec3 aPoint1, PhysicalFrame aBody2, Vec3 aPoint2) {
    return opensimSimulationJNI.SimbodyEngine_calcDistance__SWIG_0(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody1), aBody1, Vec3.getCPtr(aPoint1), aPoint1, PhysicalFrame.getCPtr(aBody2), aBody2, Vec3.getCPtr(aPoint2), aPoint2);
  }

  /**
   *  <b>(Deprecated)</b> Use Point::calcDistanceBetween() or Frame::findStationLocationInGround() instead 
   */
  public double calcDistance(State s, PhysicalFrame aBody1, double[] aPoint1, PhysicalFrame aBody2, double[] aPoint2) {
    return opensimSimulationJNI.SimbodyEngine_calcDistance__SWIG_1(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aBody1), aBody1, aPoint1, PhysicalFrame.getCPtr(aBody2), aBody2, aPoint2);
  }

}
