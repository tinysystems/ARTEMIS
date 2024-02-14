/**
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.stateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.sm.stateMachine.ExpressionNot#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see org.artemis.sm.stateMachine.StateMachinePackage#getExpressionNot()
 * @model
 * @generated
 */
public interface ExpressionNot extends Expression
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(ExpressionLevel8)
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getExpressionNot_Sub()
   * @model containment="true"
   * @generated
   */
  ExpressionLevel8 getSub();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.ExpressionNot#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(ExpressionLevel8 value);

} // ExpressionNot