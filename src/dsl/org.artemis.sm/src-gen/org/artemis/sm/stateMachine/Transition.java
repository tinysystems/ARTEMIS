/**
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.sm.stateMachine.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.artemis.sm.stateMachine.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.artemis.sm.stateMachine.Transition#getActions <em>Actions</em>}</li>
 *   <li>{@link org.artemis.sm.stateMachine.Transition#getOnFail <em>On Fail</em>}</li>
 *   <li>{@link org.artemis.sm.stateMachine.Transition#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.artemis.sm.stateMachine.StateMachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(Event)
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getTransition_Event()
   * @model containment="true"
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.Transition#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Expression)
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getTransition_Guard()
   * @model containment="true"
   * @generated
   */
  Expression getGuard();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.Transition#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Expression value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.artemis.sm.stateMachine.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getTransition_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>On Fail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Fail</em>' containment reference.
   * @see #setOnFail(OnFailAction)
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getTransition_OnFail()
   * @model containment="true"
   * @generated
   */
  OnFailAction getOnFail();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.Transition#getOnFail <em>On Fail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Fail</em>' containment reference.
   * @see #getOnFail()
   * @generated
   */
  void setOnFail(OnFailAction value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' reference.
   * @see #setNext(State)
   * @see org.artemis.sm.stateMachine.StateMachinePackage#getTransition_Next()
   * @model
   * @generated
   */
  State getNext();

  /**
   * Sets the value of the '{@link org.artemis.sm.stateMachine.Transition#getNext <em>Next</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' reference.
   * @see #getNext()
   * @generated
   */
  void setNext(State value);

} // Transition
