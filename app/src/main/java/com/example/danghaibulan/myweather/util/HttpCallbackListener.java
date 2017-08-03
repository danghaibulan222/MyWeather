package com.example.danghaibulan.myweather.util;

/**
 * Created by danghaibulan on 17-8-2.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);

}
