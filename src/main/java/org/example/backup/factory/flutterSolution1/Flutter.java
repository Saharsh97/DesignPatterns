package org.example.backup.factory.flutterSolution1;

import org.example.backup.factory.flutterSolution1.enums.SupportedPlatform;
import org.example.backup.factory.flutterSolution1.uiFactories.AndroidUIFactory;
import org.example.backup.factory.flutterSolution1.uiFactories.IOSUIFactory;
import org.example.backup.factory.flutterSolution1.uiFactories.UIFactory;
import org.example.backup.factory.flutterSolution1.uiFactories.WindowsUIFactory;

public class Flutter {
    public void setRefreshRate(int refreshRate) {

    }

    public void setTheme(){

    }

    public UIFactory getUIFactory(SupportedPlatform platform) {
        if(platform == SupportedPlatform.ANDROID) {
            return new AndroidUIFactory();
        }
        if(platform == SupportedPlatform.IOS) {
            return new IOSUIFactory();
        }
        if(platform == SupportedPlatform.WINDOWS) {
            return new WindowsUIFactory();
        }
        return null;
    }
}
