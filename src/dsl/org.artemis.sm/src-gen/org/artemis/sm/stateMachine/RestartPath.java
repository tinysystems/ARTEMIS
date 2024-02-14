/**
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.stateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restart Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.sm.stateMachine.RestartPath#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.artemis.sm.stateMachine.StateMachinePackage#getRestartPath()
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
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getRestartPath_Path()
   * @model
   * @generated
   */
  int getPath();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.RestartPath#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(int value);

} // RestartPath
