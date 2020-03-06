/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.constLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import umlrtsyntesizer.constLang.ConstLangPackage;
import umlrtsyntesizer.constLang.Param;
import umlrtsyntesizer.constLang.VarType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlrtsyntesizer.constLang.impl.ParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlrtsyntesizer.constLang.impl.ParamImpl#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamImpl extends MinimalEObjectImpl.Container implements Param
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyType()
   * @generated
   * @ordered
   */
  protected static final VarType PROPERTY_TYPE_EDEFAULT = VarType.BOOLEAN;

  /**
   * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyType()
   * @generated
   * @ordered
   */
  protected VarType propertyType = PROPERTY_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamImpl()
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
    return ConstLangPackage.Literals.PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstLangPackage.PARAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarType getPropertyType()
  {
    return propertyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyType(VarType newPropertyType)
  {
    VarType oldPropertyType = propertyType;
    propertyType = newPropertyType == null ? PROPERTY_TYPE_EDEFAULT : newPropertyType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstLangPackage.PARAM__PROPERTY_TYPE, oldPropertyType, propertyType));
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
      case ConstLangPackage.PARAM__NAME:
        return getName();
      case ConstLangPackage.PARAM__PROPERTY_TYPE:
        return getPropertyType();
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
      case ConstLangPackage.PARAM__NAME:
        setName((String)newValue);
        return;
      case ConstLangPackage.PARAM__PROPERTY_TYPE:
        setPropertyType((VarType)newValue);
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
      case ConstLangPackage.PARAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ConstLangPackage.PARAM__PROPERTY_TYPE:
        setPropertyType(PROPERTY_TYPE_EDEFAULT);
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
      case ConstLangPackage.PARAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ConstLangPackage.PARAM__PROPERTY_TYPE:
        return propertyType != PROPERTY_TYPE_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", propertyType: ");
    result.append(propertyType);
    result.append(')');
    return result.toString();
  }

} //ParamImpl