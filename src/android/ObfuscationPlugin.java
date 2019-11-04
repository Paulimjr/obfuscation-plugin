package com.obfuscation.plugin;

import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

/**
 * Created on : Oct 10, 2019 Author : Paulo Camilo
 */
public class ObfuscationPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        Log.v(ObfuscationPlugin.class.getSimpleName(), "Test Obfuscation plugin functionality...");
        return true;
    }
}