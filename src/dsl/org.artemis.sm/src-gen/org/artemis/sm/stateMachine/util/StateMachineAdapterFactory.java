/**
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.stateMachine.util;

import org.artemis.sm.stateMachine.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.artemis.sm.stateMachine.StateMachinePackage
 * @generated
 */
public class StateMachineAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StateMachinePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StateMachinePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateMachineSwitch<Adapter> modelSwitch =
    new StateMachineSwitch<Adapter>()
    {
      @Override
      public Adapter caseMonitor(Monitor object)
      {
        return createMonitorAdapter();
      }
      @Override
      public Adapter caseStateMachine(StateMachine object)
      {
        return createStateMachineAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseStartTask(StartTask object)
      {
        return createStartTaskAdapter();
      }
      @Override
      public Adapter caseEndTask(EndTask object)
      {
        return createEndTaskAdapter();
      }
      @Override
      public Adapter caseAnyEvent(AnyEvent object)
      {
        return createAnyEventAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseUntypedVariable(UntypedVariable object)
      {
        return createUntypedVariableAdapter();
      }
      @Override
      public Adapter caseTypedVariable(TypedVariable object)
      {
        return createTypedVariableAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseAssignmentAction(AssignmentAction object)
      {
        return createAssignmentActionAdapter();
      }
      @Override
      public Adapter caseOnFailAction(OnFailAction object)
      {
        return createOnFailActionAdapter();
      }
      @Override
      public Adapter caseRestartPath(RestartPath object)
      {
        return createRestartPathAdapter();
      }
      @Override
      public Adapter caseSkipPath(SkipPath object)
      {
        return createSkipPathAdapter();
      }
      @Override
      public Adapter caseRestartTask(RestartTask object)
      {
        return createRestartTaskAdapter();
      }
      @Override
      public Adapter caseSkipTask(SkipTask object)
      {
        return createSkipTaskAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExpressionNot(ExpressionNot object)
      {
        return createExpressionNotAdapter();
      }
      @Override
      public Adapter caseExpressionMinus(ExpressionMinus object)
      {
        return createExpressionMinusAdapter();
      }
      @Override
      public Adapter caseExpressionPlus(ExpressionPlus object)
      {
        return createExpressionPlusAdapter();
      }
      @Override
      public Adapter caseExpressionLevel8(ExpressionLevel8 object)
      {
        return createExpressionLevel8Adapter();
      }
      @Override
      public Adapter caseExpressionBracket(ExpressionBracket object)
      {
        return createExpressionBracketAdapter();
      }
      @Override
      public Adapter caseExpressionConstantBool(ExpressionConstantBool object)
      {
        return createExpressionConstantBoolAdapter();
      }
      @Override
      public Adapter caseExpressionConstantInt(ExpressionConstantInt object)
      {
        return createExpressionConstantIntAdapter();
      }
      @Override
      public Adapter caseExpressionConstantReal(ExpressionConstantReal object)
      {
        return createExpressionConstantRealAdapter();
      }
      @Override
      public Adapter caseExpressionConstantString(ExpressionConstantString object)
      {
        return createExpressionConstantStringAdapter();
      }
      @Override
      public Adapter caseExpressionVariable(ExpressionVariable object)
      {
        return createExpressionVariableAdapter();
      }
      @Override
      public Adapter caseExpressionAnd(ExpressionAnd object)
      {
        return createExpressionAndAdapter();
      }
      @Override
      public Adapter caseExpressionOr(ExpressionOr object)
      {
        return createExpressionOrAdapter();
      }
      @Override
      public Adapter caseExpressionEqual(ExpressionEqual object)
      {
        return createExpressionEqualAdapter();
      }
      @Override
      public Adapter caseExpressionNEqual(ExpressionNEqual object)
      {
        return createExpressionNEqualAdapter();
      }
      @Override
      public Adapter caseExpressionGeq(ExpressionGeq object)
      {
        return createExpressionGeqAdapter();
      }
      @Override
      public Adapter caseExpressionGreater(ExpressionGreater object)
      {
        return createExpressionGreaterAdapter();
      }
      @Override
      public Adapter caseExpressionLeq(ExpressionLeq object)
      {
        return createExpressionLeqAdapter();
      }
      @Override
      public Adapter caseExpressionLess(ExpressionLess object)
      {
        return createExpressionLessAdapter();
      }
      @Override
      public Adapter caseExpressionAddition(ExpressionAddition object)
      {
        return createExpressionAdditionAdapter();
      }
      @Override
      public Adapter caseExpressionSubtraction(ExpressionSubtraction object)
      {
        return createExpressionSubtractionAdapter();
      }
      @Override
      public Adapter caseExpressionMultiply(ExpressionMultiply object)
      {
        return createExpressionMultiplyAdapter();
      }
      @Override
      public Adapter caseExpressionDivision(ExpressionDivision object)
      {
        return createExpressionDivisionAdapter();
      }
      @Override
      public Adapter caseExpressionMaximum(ExpressionMaximum object)
      {
        return createExpressionMaximumAdapter();
      }
      @Override
      public Adapter caseExpressionMinimum(ExpressionMinimum object)
      {
        return createExpressionMinimumAdapter();
      }
      @Override
      public Adapter caseExpressionPower(ExpressionPower object)
      {
        return createExpressionPowerAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.Monitor <em>Monitor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.Monitor
   * @generated
   */
  public Adapter createMonitorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.StateMachine
   * @generated
   */
  public Adapter createStateMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.StartTask <em>Start Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.StartTask
   * @generated
   */
  public Adapter createStartTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.EndTask <em>End Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.EndTask
   * @generated
   */
  public Adapter createEndTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.AnyEvent <em>Any Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.AnyEvent
   * @generated
   */
  public Adapter createAnyEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.UntypedVariable <em>Untyped Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.UntypedVariable
   * @generated
   */
  public Adapter createUntypedVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.TypedVariable <em>Typed Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.TypedVariable
   * @generated
   */
  public Adapter createTypedVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.AssignmentAction <em>Assignment Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.AssignmentAction
   * @generated
   */
  public Adapter createAssignmentActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.OnFailAction <em>On Fail Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.OnFailAction
   * @generated
   */
  public Adapter createOnFailActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.RestartPath <em>Restart Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.RestartPath
   * @generated
   */
  public Adapter createRestartPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.SkipPath <em>Skip Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.SkipPath
   * @generated
   */
  public Adapter createSkipPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.RestartTask <em>Restart Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.RestartTask
   * @generated
   */
  public Adapter createRestartTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.SkipTask <em>Skip Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.SkipTask
   * @generated
   */
  public Adapter createSkipTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionNot <em>Expression Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionNot
   * @generated
   */
  public Adapter createExpressionNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionMinus <em>Expression Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionMinus
   * @generated
   */
  public Adapter createExpressionMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionPlus <em>Expression Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionPlus
   * @generated
   */
  public Adapter createExpressionPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionLevel8 <em>Expression Level8</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionLevel8
   * @generated
   */
  public Adapter createExpressionLevel8Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionBracket <em>Expression Bracket</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionBracket
   * @generated
   */
  public Adapter createExpressionBracketAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionConstantBool <em>Expression Constant Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionConstantBool
   * @generated
   */
  public Adapter createExpressionConstantBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionConstantInt <em>Expression Constant Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionConstantInt
   * @generated
   */
  public Adapter createExpressionConstantIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionConstantReal <em>Expression Constant Real</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionConstantReal
   * @generated
   */
  public Adapter createExpressionConstantRealAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionConstantString <em>Expression Constant String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionConstantString
   * @generated
   */
  public Adapter createExpressionConstantStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionVariable <em>Expression Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionVariable
   * @generated
   */
  public Adapter createExpressionVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionAnd <em>Expression And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionAnd
   * @generated
   */
  public Adapter createExpressionAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionOr <em>Expression Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionOr
   * @generated
   */
  public Adapter createExpressionOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionEqual <em>Expression Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionEqual
   * @generated
   */
  public Adapter createExpressionEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionNEqual <em>Expression NEqual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionNEqual
   * @generated
   */
  public Adapter createExpressionNEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionGeq <em>Expression Geq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionGeq
   * @generated
   */
  public Adapter createExpressionGeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionGreater <em>Expression Greater</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionGreater
   * @generated
   */
  public Adapter createExpressionGreaterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionLeq <em>Expression Leq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionLeq
   * @generated
   */
  public Adapter createExpressionLeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionLess <em>Expression Less</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionLess
   * @generated
   */
  public Adapter createExpressionLessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionAddition <em>Expression Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionAddition
   * @generated
   */
  public Adapter createExpressionAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionSubtraction <em>Expression Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionSubtraction
   * @generated
   */
  public Adapter createExpressionSubtractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionMultiply <em>Expression Multiply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionMultiply
   * @generated
   */
  public Adapter createExpressionMultiplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionDivision <em>Expression Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionDivision
   * @generated
   */
  public Adapter createExpressionDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionMaximum <em>Expression Maximum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionMaximum
   * @generated
   */
  public Adapter createExpressionMaximumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionMinimum <em>Expression Minimum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionMinimum
   * @generated
   */
  public Adapter createExpressionMinimumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.artemis.sm.stateMachine.ExpressionPower <em>Expression Power</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.artemis.sm.stateMachine.ExpressionPower
   * @generated
   */
  public Adapter createExpressionPowerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //StateMachineAdapterFactory
