/**
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.artemis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.spec.artemis.TaskProperties#getTask <em>Task</em>}</li>
 *   <li>{@link org.artemis.spec.artemis.TaskProperties#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.artemis.spec.artemis.ArtemisPackage#getTaskProperties()
 * @model
 * @generated
 */
public interface TaskProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(Task)
   * @see org.artemis.spec.artemis.ArtemisPackage#getTaskProperties_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link org.artemis.spec.artemis.TaskProperties#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.artemis.spec.artemis.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.artemis.spec.artemis.ArtemisPackage#getTaskProperties_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // TaskProperties