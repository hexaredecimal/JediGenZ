package webx;

/**
 *
 * @author hexaredecimal
 */
public class Content extends WebXContainerElement {
	@Override
	public String render() {
		return String.format("<content %s>\n%s</content>", attributes.render(), super.render());
	}
}
