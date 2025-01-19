package org.example.buttons;

public class HtmlButtonStaticFactory {
    private static final HtmlButton htmlButton = new HtmlButton();

    private HtmlButtonStaticFactory() {
        // NOOP
    }

    public static HtmlButton createHtmlButtonInstance() {
        return htmlButton;
    }
}
