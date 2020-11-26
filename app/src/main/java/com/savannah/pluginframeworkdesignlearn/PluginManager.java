package com.savannah.pluginframeworkdesignlearn;

public class PluginManager {
    private volatile static PluginManager pluginManager;

    public static PluginManager getInstance(){
        if (pluginManager==null) {
            synchronized (PluginManager.class){
                if (pluginManager==null) {
                    pluginManager = new PluginManager();
                }
            }
        }

        return pluginManager;
    }
}
