package org.example.backup.factory.flutterSolution2;

import org.example.backup.factory.flutterSolution2.enums.SupportedPlatform;
import org.example.backup.factory.flutterSolution2.uiFactories.UIFactory;

public class Flutter {
    public void setRefreshRate(int refreshRate) {
        System.out.println("Refresh Rate set to " + refreshRate);
    }

    public void setTheme(){
        System.out.println("setting theme to Dark");
    }

    public UIFactory getUIFactory(SupportedPlatform platform) {
        return UIPracticalFactory.getUIFactoryFromSupportedPlatform(platform);
    }
}
