package org.example.buttons;

/**
 * HTML Button Instance Factory
 */
public class HtmlButtonFactory {
    private static final HtmlButton htmlButton = new HtmlButton();

    private HtmlButtonFactory() {
        // NOOP
    }

    public HtmlButton createHtmlButton() {
        return htmlButton;
    }
}
