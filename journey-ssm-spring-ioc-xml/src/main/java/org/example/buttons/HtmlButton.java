package org.example.buttons;

public class HtmlButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Clicked! Button says - 'Hello World!'");
    }
}
