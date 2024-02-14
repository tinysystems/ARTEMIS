/**
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.artemis.impl;

import org.artemis.spec.artemis.ArtemisPackage;
import org.artemis.spec.artemis.OnFailAction;
import org.artemis.spec.artemis.Period;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.artemis.spec.artemis.impl.PeriodImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.artemis.spec.artemis.impl.PeriodImpl#getMaxAttempts <em>Max Attempts</em>}</li>
 *   <li>{@link org.artemis.spec.artemis.impl.PeriodImpl#getOnFailMaxAttemptAction <em>On Fail Max Attempt Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodImpl extends PropertyImpl implements Period
{
  /**
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final double PERIOD_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected double period = PERIOD_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxAttempts() <em>Max Attempts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxAttempts()
   * @generated
   * @ordered
   */
  protected static final int MAX_ATTEMPTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxAttempts() <em>Max Attempts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxAttempts()
   * @generated
   * @ordered
   */
  protected int maxAttempts = MAX_ATTEMPTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getOnFailMaxAttemptAction() <em>On Fail Max Attempt Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnFailMaxAttemptAction()
   * @generated
   * @ordered
   */
  protected OnFailAction onFailMaxAttemptAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PeriodImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArtemisPackage.Literals.PERIOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPeriod(double newPeriod)
  {
    double oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArtemisPackage.PERIOD__PERIOD, oldPeriod, period));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMaxAttempts()
  {
    return maxAttempts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxAttempts(int newMaxAttempts)
  {
    int oldMaxAttempts = maxAttempts;
    maxAttempts = newMaxAttempts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArtemisPackage.PERIOD__MAX_ATTEMPTS, oldMaxAttempts, maxAttempts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OnFailAction getOnFailMaxAttemptAction()
  {
    return onFailMaxAttemptAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnFailMaxAttemptAction(OnFailAction newOnFailMaxAttemptAction, NotificationChain msgs)
  {
    OnFailAction oldOnFailMaxAttemptAction = onFailMaxAttemptAction;
    onFailMaxAttemptAction = newOnFailMaxAttemptAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION, oldOnFailMaxAttemptAction, newOnFailMaxAttemptAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOnFailMaxAttemptAction(OnFailAction newOnFailMaxAttemptAction)
  {
    if (newOnFailMaxAttemptAction != onFailMaxAttemptAction)
    {
      NotificationChain msgs = null;
      if (onFailMaxAttemptAction != null)
        msgs = ((InternalEObject)onFailMaxAttemptAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION, null, msgs);
      if (newOnFailMaxAttemptAction != null)
        msgs = ((InternalEObject)newOnFailMaxAttemptAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION, null, msgs);
      msgs = basicSetOnFailMaxAttemptAction(newOnFailMaxAttemptAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION, newOnFailMaxAttemptAction, newOnFailMaxAttemptAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION:
        return basicSetOnFailMaxAttemptAction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArtemisPackage.PERIOD__PERIOD:
        return getPeriod();
      case ArtemisPackage.PERIOD__MAX_ATTEMPTS:
        return getMaxAttempts();
      case ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION:
        return getOnFailMaxAttemptAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArtemisPackage.PERIOD__PERIOD:
        setPeriod((Double)newValue);
        return;
      case ArtemisPackage.PERIOD__MAX_ATTEMPTS:
        setMaxAttempts((Integer)newValue);
        return;
      case ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION:
        setOnFailMaxAttemptAction((OnFailAction)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArtemisPackage.PERIOD__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case ArtemisPackage.PERIOD__MAX_ATTEMPTS:
        setMaxAttempts(MAX_ATTEMPTS_EDEFAULT);
        return;
      case ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION:
        setOnFailMaxAttemptAction((OnFailAction)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArtemisPackage.PERIOD__PERIOD:
        return period != PERIOD_EDEFAULT;
      case ArtemisPackage.PERIOD__MAX_ATTEMPTS:
        return maxAttempts != MAX_ATTEMPTS_EDEFAULT;
      case ArtemisPackage.PERIOD__ON_FAIL_MAX_ATTEMPT_ACTION:
        return onFailMaxAttemptAction != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (period: ");
    result.append(period);
    result.append(", maxAttempts: ");
    result.append(maxAttempts);
    result.append(')');
    return result.toString();
  }

} //PeriodImpl
