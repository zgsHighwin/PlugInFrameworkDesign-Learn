package com.savannah.stander;

import android.app.Activity;
import android.os.Bundle;

public interface ActivityInterface {

     /**
      * 把宿主的环境给插件
      * @param appActivity
      */
     void insertAppContext(Activity appActivity);

     void onCreate(Bundle savedInstanceState);

     void onStart() ;

     void onPause();

     void onResume();

     void onStop();

     void onDestroy() ;

}
