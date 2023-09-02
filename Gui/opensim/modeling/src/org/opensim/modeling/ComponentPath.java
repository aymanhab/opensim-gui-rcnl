/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A representation of a path within a Component tree.<br>
 * <br>
 * This class is effectively a wrapper around a normalized path string. A path<br>
 * string is a sequence of path elements interspersed with '/' as a separator.<br>
 * path elements cannot contain:<br>
 * <br>
 * - back-slash ('\')<br>
 * - forward-slash ('/')<br>
 * - asterisk ('*')<br>
 * - plus-sign ('+')<br>
 * <br>
 * An empty path, "", is allowed. Adjacent separators in a path (e.g. "//") are<br>
 * combined into one separator.<br>
 * <br>
 * @author Carmichael Ong
 */
public class ComponentPath {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ComponentPath(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentPath obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ComponentPath obj) {
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
        opensimCommonJNI.delete_ComponentPath(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Default constructor that constructs an empty path ("").
   */
  public ComponentPath() {
    this(opensimCommonJNI.new_ComponentPath__SWIG_0(), true);
  }

  /**
   * Construct a ComponentPath from a path string (e.g. "/a/b/component").
   */
  public ComponentPath(String path) {
    this(opensimCommonJNI.new_ComponentPath__SWIG_1(path), true);
  }

  /**
   * Construct a ComponentPath from a vector of its elements.<br>
   * <br>
   * Throws if any element in `pathVec` contains an invalid character.
   */
  public ComponentPath(StdVectorString pathVec, boolean isAbsolute) {
    this(opensimCommonJNI.new_ComponentPath__SWIG_2(StdVectorString.getCPtr(pathVec), pathVec, isAbsolute), true);
  }

  public char getSeparator() {
    return opensimCommonJNI.ComponentPath_getSeparator(swigCPtr, this);
  }

  /**
   * Returns a string containing a sequence of all invalid characters.
   */
  public String getInvalidChars() {
    return opensimCommonJNI.ComponentPath_getInvalidChars(swigCPtr, this);
  }

  /**
   * Returns a path that is the result of resolving `this` from `otherPath`.<br>
   * <br>
   * - `otherPath` must be an absolute path; otherwise, an exception will be<br>
   *   thrown<br>
   * - if `this` is absolute, then this function just returns a copy of `this`<br>
   * <br>
   * Examples:<br>
   * <br>
   *     ComponentPath{"b/c"}.formAbsolutePath("/a") == "/a/b/c"<br>
   *     ComponentPath{"/b/c"}.formAbsolutePath("/a") == "/b/c"<br>
   *     ComponentPath{"b/c"}.formAbsolutePath("a")  // throws
   */
  public ComponentPath formAbsolutePath(ComponentPath otherPath) {
    return new ComponentPath(opensimCommonJNI.ComponentPath_formAbsolutePath(swigCPtr, this, ComponentPath.getCPtr(otherPath), otherPath), true);
  }

  /**
   * Find the relative Path between this Path and another Path (otherPath)<br>
   * (i.e. the Path to go FROM otherPath TO this Path). Both Paths must be<br>
   * absolute.
   */
  public ComponentPath formRelativePath(ComponentPath otherPath) {
    return new ComponentPath(opensimCommonJNI.ComponentPath_formRelativePath(swigCPtr, this, ComponentPath.getCPtr(otherPath), otherPath), true);
  }

  /**
   * Returns the sub-path that contains all subdirectory levels except for<br>
   * the last one.
   */
  public ComponentPath getParentPath() {
    return new ComponentPath(opensimCommonJNI.ComponentPath_getParentPath(swigCPtr, this), true);
  }

  /**
   * Returns the parent path as a string.
   */
  public String getParentPathString() {
    return opensimCommonJNI.ComponentPath_getParentPathString(swigCPtr, this);
  }

  /**
   * Returns the name of a subdirectory in the path at the specified level<br>
   * (0-indexed).
   */
  public String getSubcomponentNameAtLevel(long index) {
    return opensimCommonJNI.ComponentPath_getSubcomponentNameAtLevel(swigCPtr, this, index);
  }

  /**
   * Returns the name of the Component in the path (effectively, the last<br>
   * element in the path).
   */
  public String getComponentName() {
    return opensimCommonJNI.ComponentPath_getComponentName(swigCPtr, this);
  }

  /**
   * Returns a string representation of the ComponentPath<br>
   * (e.g. "/a/b/component").
   */
  public String toString() {
    return opensimCommonJNI.ComponentPath_toString(swigCPtr, this);
  }

  /**
   * Returns true if the path is absolute (effectively, if it begins<br>
   * with '/').
   */
  public boolean isAbsolute() {
    return opensimCommonJNI.ComponentPath_isAbsolute(swigCPtr, this);
  }

  /**
   * Returns the number of levels in the path (e.g. "/a/b/c" == 3).
   */
  public long getNumPathLevels() {
    return opensimCommonJNI.ComponentPath_getNumPathLevels(swigCPtr, this);
  }

  /**
   * Push a string onto the end of the path.<br>
   * <br>
   * Throws if the argument contains invalid characters.
   */
  public void pushBack(String pathElement) {
    opensimCommonJNI.ComponentPath_pushBack(swigCPtr, this, pathElement);
  }

  /**
   * Returns true if the argument does not contain any invalid characters.
   */
  public boolean isLegalPathElement(String pathElement) {
    return opensimCommonJNI.ComponentPath_isLegalPathElement(swigCPtr, this, pathElement);
  }

  /**
   * Resolves '.' and ".." elements in the path if possible. Leading ".."<br>
   * elements are allowed only in relative paths (throws if found at the<br>
   * start of an absolute path). Also checks for invalid characters.<br>
   * <br>
   * Effectively, this is the same as internally `normalize`ing the path.
   */
  public void trimDotAndDotDotElements() {
    opensimCommonJNI.ComponentPath_trimDotAndDotDotElements(swigCPtr, this);
  }

}
