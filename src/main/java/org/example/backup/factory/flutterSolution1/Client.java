package org.example.backup.factory.flutterSolution1;

import org.example.backup.factory.flutterSolution1.enums.SupportedPlatform;
import org.example.backup.factory.flutterSolution1.uiFactories.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        flutter.setTheme();
        flutter.setRefreshRate(90);

        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatform.WINDOWS);
        uiFactory.createButton().clickButton();
        uiFactory.createDropDown().showDropDown();
        uiFactory.createMessage().writeText("hey there");
    }
}
