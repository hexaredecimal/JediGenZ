package webx;

/**
 *
 * @author hexaredecimal
 */
public class Td extends WebXContainerElement {
	protected String innerText; 

	public Td() {
		this.innerText = ""; 
	}
	
	public Td(String text) {
		this.innerText = text; 
	}
	
	@Override
	public String render() {
		return String.format("<td %s>%s\n%s</td>", attributes.render(), innerText, super.render());
	}
}
