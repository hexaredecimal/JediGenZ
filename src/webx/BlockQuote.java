package webx;

/**
 *
 * @author hexaredecimal
 */
public class BlockQuote extends WebXContainerElement {
	
	public BlockQuote cite(String url) {
		this.attributes.addAttribute("cite", url);
		return this;
	}
	
	@Override
	public String render() {
		return String.format("<blockquote %s>\n%s</blockquote>", attributes.render(), super.render());
	}
}
