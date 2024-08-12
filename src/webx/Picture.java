package webx;

/**
 *
 * @author hexaredecimal
 */
public class Picture extends WebXContainerElement {
	@Override
	public String render() {
		return String.format("<picture %s>\n%s</picture>", attributes.render(), super.render());
	}
}
