/**
 */
package dvd_mindmap.provider;


import dvd_mindmap.Dvd_mindmapFactory;
import dvd_mindmap.Dvd_mindmapPackage;
import dvd_mindmap.DynamicValueDescriptionModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dvd_mindmap.DynamicValueDescriptionModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicValueDescriptionModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicValueDescriptionModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES);
			childrenFeatures.add(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES);
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
	 * This returns DynamicValueDescriptionModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DynamicValueDescriptionModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DynamicValueDescriptionModel_type");
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

		switch (notification.getFeatureID(DynamicValueDescriptionModel.class)) {
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES:
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES:
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

		newChildDescriptors.add
			(createChildParameter
				(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES,
				 Dvd_mindmapFactory.eINSTANCE.createEdge()));

		newChildDescriptors.add
			(createChildParameter
				(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES,
				 Dvd_mindmapFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES,
				 Dvd_mindmapFactory.eINSTANCE.createValueExchange()));

		newChildDescriptors.add
			(createChildParameter
				(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES,
				 Dvd_mindmapFactory.eINSTANCE.createOutValuePort()));

		newChildDescriptors.add
			(createChildParameter
				(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES,
				 Dvd_mindmapFactory.eINSTANCE.createValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES,
				 Dvd_mindmapFactory.eINSTANCE.createMainActor()));

		newChildDescriptors.add
			(createChildParameter
				(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES,
				 Dvd_mindmapFactory.eINSTANCE.createEnvironmentActor()));

		newChildDescriptors.add
			(createChildParameter
				(Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES,
				 Dvd_mindmapFactory.eINSTANCE.createInValuePort()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Dvd_mindmapEditPlugin.INSTANCE;
	}

}
