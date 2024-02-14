/**
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.stateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.sm.stateMachine.EndTask#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see org.artemis.sm.stateMachine.StateMachinePackage#getEndTask()
 * @model
 * @generated
 */
public interface EndTask extends Event
{
  /**
   * Returns the value of the '<em><b>Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' attribute.
   * @see #setTask(String)
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getEndTask_Task()
   * @model
   * @generated
   */
  String getTask();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.EndTask#getTask <em>Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' attribute.
   * @see #getTask()
   * @generated
   */
  void setTask(String value);

} // EndTask