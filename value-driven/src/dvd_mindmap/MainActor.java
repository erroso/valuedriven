/**
 */
package dvd_mindmap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dvd_mindmap.MainActor#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @see dvd_mindmap.Dvd_mindmapPackage#getMainActor()
 * @model annotation="gmf.node figure='figures.MainActorFigure' label.icon='false' label='name' label.placement='external'"
 * @generated
 */
public interface MainActor extends Node {
	/**
	 * Returns the value of the '<em><b>Belongs To Value Exchange</b></em>' reference list.
	 * The list contents are of type {@link dvd_mindmap.ValueExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Value Exchange</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Value Exchange</em>' reference list.
	 * @see dvd_mindmap.Dvd_mindmapPackage#getMainActor_BelongsToValueExchange()
	 * @model required="true"
	 * @generated
	 */
	EList<ValueExchange> getBelongsToValueExchange();

} // MainActor
