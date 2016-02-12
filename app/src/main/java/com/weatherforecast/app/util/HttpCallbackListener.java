package com.weatherforecast.app.util;

/**
 * Created by yanliu on 2016/2/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
