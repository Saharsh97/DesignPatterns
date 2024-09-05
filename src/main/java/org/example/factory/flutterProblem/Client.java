package org.example.factory.flutterProblem;

import org.example.factory.flutterProblem.enums.SupportedPlatform;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        flutter.setTheme();
        flutter.setRefreshRate(90);

        flutter.createButton(SupportedPlatform.ANDROID);
        flutter.createDropDown(SupportedPlatform.IOS);
    }
}
