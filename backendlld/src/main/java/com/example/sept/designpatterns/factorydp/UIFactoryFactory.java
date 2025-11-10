package com.example.sept.designpatterns.factorydp;

/**
 * This should be the only class
 * responsible for any if-else conditions related to factories...
 * 
 * This is PracticalFactory. Used 99% of times.
 * 
 */
public class UIFactoryFactory {
    
    /**
     * practical factory implementation... 
     * used 99% of times.
     * @param platform
     * @return
     * @throws Exception
     */
    public static UIFactory getUIFactory(String platform) throws Exception{
        switch (platform) {
            case "ios":
                return new IosUIFactory();
            case "Android":
                return new AndroidUIFactory();
            default:
                throw new Exception("Not Supported...");
        }
    }
}
