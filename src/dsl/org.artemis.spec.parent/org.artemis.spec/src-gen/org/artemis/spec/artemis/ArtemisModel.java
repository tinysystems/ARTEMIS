/**
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.artemis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.spec.artemis.ArtemisModel#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.artemis.spec.artemis.ArtemisModel#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.artemis.spec.artemis.ArtemisModel#getTaskProperties <em>Task Properties</em>}</li>
 * </ul>
 *
 * @see org.artemis.spec.artemis.ArtemisPackage#getArtemisModel()
 * @model
 * @generated
 */
public interface ArtemisModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.artemis.spec.artemis.Task}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see org.artemis.spec.artemis.ArtemisPackage#getArtemisModel_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getTasks();

  /**
   * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
   * The list contents are of type {@link org.artemis.spec.artemis.Path}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paths</em>' containment reference list.
   * @see org.artemis.spec.artemis.ArtemisPackage#getArtemisModel_Paths()
   * @model containment="true"
   * @generated
   */
  EList<Path> getPaths();

  /**
   * Returns the value of the '<em><b>Task Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.artemis.spec.artemis.TaskProperties}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Properties</em>' containment reference list.
   * @see org.artemis.spec.artemis.ArtemisPackage#getArtemisModel_TaskProperties()
   * @model containment="true"
   * @generated
   */
  EList<TaskProperties> getTaskProperties();

} // ArtemisModel