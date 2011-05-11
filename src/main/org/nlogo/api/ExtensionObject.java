package org.nlogo.api;

/**
 * Interface which all NetLogo objects defined in Extensions must
 * support
 */

public interface ExtensionObject {

  /**
   * @param readable  If true the result should be readable as NetLogo code
   * @param exporting If false the result is for display only
   * @param reference If true the result may be a reference to a complete object exported in the extension section of the file if false the object should be recreatable from the result
   * @return a string representation of the object.
   */
  String dump(boolean readable, boolean exporting, boolean reference);

  /**
   * @return the name of the extension this object was created by
   */
  String getExtensionName();

  /**
   * @return the type of this Object, which is extension defined.
   *         If this is the only ExtensionObject type defined by this extension
   *         it is appropriate to return an empty string.
   */
  String getNLTypeName();

  /**
   * @return true if this object equal to obj
   *         not simply the same object but all of the
   *         elements are the same
   */
  boolean recursivelyEqual(Object obj);
}
