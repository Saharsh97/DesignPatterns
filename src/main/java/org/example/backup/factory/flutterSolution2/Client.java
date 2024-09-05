package org.example.backup.factory.flutterSolution2;

import org.example.backup.factory.flutterSolution2.enums.SupportedPlatform;
import org.example.backup.factory.flutterSolution2.uiFactories.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        flutter.setTheme();
        flutter.setRefreshRate(90);

        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatform.IOS);
        uiFactory.createButton().clickButton();
        uiFactory.createDropDown().showDropDown();
    }
}
