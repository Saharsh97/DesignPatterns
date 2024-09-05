package org.example.backup.factory.flutterSolution2;

import org.example.backup.factory.flutterSolution2.enums.SupportedPlatform;
import org.example.backup.factory.flutterSolution2.uiFactories.AndroidUIFactory;
import org.example.backup.factory.flutterSolution2.uiFactories.IOSUIFactory;
import org.example.backup.factory.flutterSolution2.uiFactories.UIFactory;
import org.example.backup.factory.flutterSolution2.uiFactories.WindowsUIFactory;

// this class is meant to give you the specific objects!
// this class is meant to have the conditions for getting different types of objects!
public class UIPracticalFactory {

    public static UIFactory getUIFactoryFromSupportedPlatform(SupportedPlatform platform){
        if(platform == SupportedPlatform.ANDROID){
            return new AndroidUIFactory();
        }
        else if(platform == SupportedPlatform.IOS){
            return new IOSUIFactory();
        }
        else if(platform == SupportedPlatform.WINDOWS){
            return new WindowsUIFactory();
        }
        throw new RuntimeException("invalid parameter given");
    }
}
