/**
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.artemis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Tries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.spec.artemis.MaxTries#getNrTries <em>Nr Tries</em>}</li>
 * </ul>
 *
 * @see org.artemis.spec.artemis.ArtemisPackage#getMaxTries()
 * @model
 * @generated
 */
public interface MaxTries extends Property
{
  /**
   * Returns the value of the '<em><b>Nr Tries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nr Tries</em>' attribute.
   * @see #setNrTries(int)
   * @see org.artemis.spec.artemis.ArtemisPackage#getMaxTries_NrTries()
   * @model
   * @generated
   */
  int getNrTries();

  /**
   * Sets the value of the '{@link org.artemis.spec.artemis.MaxTries#getNrTries <em>Nr Tries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nr Tries</em>' attribute.
   * @see #getNrTries()
   * @generated
   */
  void setNrTries(int value);

} // MaxTries