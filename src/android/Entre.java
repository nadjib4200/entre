package com.ninou.entre;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;

public class Entre extends CordovaPlugin {
     public static Map map =  new HashMap() ;
     @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
      try {

        if ("add".equals(action)) {
          JSONObject arg_object = args.getJSONObject(0);
          map.put(arg_object.getString("nom"),arg_object.getString("prenom"));
          callbackContext.success();
          return true;
        }
        if ("upadte".equals(action)) {
          JSONObject arg_object = args.getJSONObject(0);
          if(map.containsKey(arg_object.getString("nom"))){
                map.put(arg_object.getString("nom"),arg_object.getString("prenom")) ;
            }
           callbackContext.success();
           return true;
        }
        if ("get".equals(action)) {
          JSONObject arg_object = args.getJSONObject(0);
          callbackContext.success(map.get(arg_object.getString("nom")));
          return true;
        }
        if ("getAll".equals(action)) {
          String all="{";
          for(Iterator i=map.keySet().iterator();i.hasNext();){
              Object key=i.next();
              all+= "\"" + key + "\" : \"" + map.get(key) + "\"";
              if(si c pas le dernier) all += ";";
          }
          all+="}";
          callbackContext.success(all);
          return true;
        }
        if ("delete".equals(action)) {
          JSONObject arg_object = args.getJSONObject(0);
          map.remove(arg_object.getString("nom"));
          callbackContext.success();
          return true;
        }

        callbackContext.error("Invalid action");
        return false;
      } catch(Exception e) {
        System.err.println("Exception: " + e.getMessage());
        callbackContext.error(e.getMessage());
        return false;
      }
    }
}
