/**
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.artemis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restart Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.spec.artemis.RestartPath#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.artemis.spec.artemis.ArtemisPackage#getRestartPath()
 * @model
 * @generated
 */
public interface RestartPath extends OnFailAction
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(int)
   * @see org.artemis.spec.artemis.ArtemisPackage#getRestartPath_Path()
   * @model
   * @generated
   */
  int getPath();

  /**
   * Sets the value of the '{@link org.artemis.spec.artemis.RestartPath#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(int value);

} // RestartPath
