package webx;

/**
 *
 * @author hexaredecimal
 */
public class HGroup extends WebXContainerElement {
	@Override
	public String render() {
		return String.format("<hgroup %s>\n%s</hgroup>", attributes.render(), super.render());
	}
}
