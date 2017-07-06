package com.a51coding.aidenzou.autotask.autotask;

import android.content.Context;
import android.net.wifi.WifiManager;

public class Tools {

    // WIFI网络开关
    public static void toggleWiFi(Context context, boolean enabled) {
        // 获取当前apk的WiFi Service
        WifiManager wm = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        // 调用函数打开/关闭WiFi,status为boolean变量true/false
        wm.setWifiEnabled(enabled);
    }
}