package org.example.factory.flutterSolution;

import org.example.factory.flutterSolution.enums.SupportedPlatform;
import org.example.factory.flutterSolution.factories.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        flutter.setTheme();
        flutter.setRefreshRate(90);

        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatform.ANDROID);
        uiFactory.createButton().showButton();
        uiFactory.createDropDown().hideDropDown();
        uiFactory.createMessage().writeText("hello");
    }
}
