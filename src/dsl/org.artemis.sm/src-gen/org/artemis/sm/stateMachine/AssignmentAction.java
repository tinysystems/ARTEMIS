/**
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.stateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.sm.stateMachine.AssignmentAction#getVar <em>Var</em>}</li>
 *   <li>{@link org.artemis.sm.stateMachine.AssignmentAction#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.artemis.sm.stateMachine.StateMachinePackage#getAssignmentAction()
 * @model
 * @generated
 */
public interface AssignmentAction extends Action
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Variable)
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getAssignmentAction_Var()
   * @model
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.AssignmentAction#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getAssignmentAction_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.AssignmentAction#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // AssignmentAction