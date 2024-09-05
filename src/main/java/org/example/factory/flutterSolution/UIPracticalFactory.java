package org.example.factory.flutterSolution;

import org.example.factory.flutterSolution.enums.SupportedPlatform;
import org.example.factory.flutterSolution.factories.*;

public class UIPracticalFactory {
    // this is also a factory method?
    // because it is just giving you back the corresponding object
    public static UIFactory getUIFactoryBasedOnPlatform(SupportedPlatform platform){
        if(platform == SupportedPlatform.ANDROID){
            return new AndroidUIFactory();
        }
        if(platform == SupportedPlatform.IOS){
            return new IOSUIFactory();
        }
        if(platform == SupportedPlatform.LINUX){
            return new LinuxUIFactory();
        }
        if(platform == SupportedPlatform.WINDOWS){
            return new WindowsUIFactory();
        }
        // add more platforms as you wish.
        throw new RuntimeException("invalid input");
    }
}
