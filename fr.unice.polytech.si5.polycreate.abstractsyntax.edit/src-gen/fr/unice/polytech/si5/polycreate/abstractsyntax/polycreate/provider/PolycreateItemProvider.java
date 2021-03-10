/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.provider;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreateFactory;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolycreateItemProvider extends NamedELementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PolycreatePackage.Literals.POLYCREATE__OPERATION);
			childrenFeatures.add(PolycreatePackage.Literals.POLYCREATE__VARIABLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Polycreate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Polycreate"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Polycreate) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Polycreate_type")
				: getString("_UI_Polycreate_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Polycreate.class)) {
		case PolycreatePackage.POLYCREATE__OPERATION:
		case PolycreatePackage.POLYCREATE__VARIABLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__OPERATION,
				PolycreateFactory.eINSTANCE.createGoForward()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__OPERATION,
				PolycreateFactory.eINSTANCE.createGoBackward()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__OPERATION,
				PolycreateFactory.eINSTANCE.createOpenGripper()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__OPERATION,
				PolycreateFactory.eINSTANCE.createCloseGripper()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__OPERATION,
				PolycreateFactory.eINSTANCE.createTurn()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__OPERATION,
				PolycreateFactory.eINSTANCE.createStop()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__OPERATION,
				PolycreateFactory.eINSTANCE.createStructuralCondition()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__VARIABLE,
				PolycreateFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__VARIABLE,
				PolycreateFactory.eINSTANCE.createGripperSensor()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__VARIABLE,
				PolycreateFactory.eINSTANCE.createRightSensor()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__VARIABLE,
				PolycreateFactory.eINSTANCE.createLeftSensor()));

		newChildDescriptors.add(createChildParameter(PolycreatePackage.Literals.POLYCREATE__VARIABLE,
				PolycreateFactory.eINSTANCE.createObject()));
	}

}
