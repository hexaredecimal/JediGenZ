package webx;

/**
 *
 * @author hexaredecimal
 */
public class Select extends WebXContainerElement {
	@Override
	public String render() {
		return String.format("<select %s>\n%s</select>", attributes.render(), super.render());
	}
}
