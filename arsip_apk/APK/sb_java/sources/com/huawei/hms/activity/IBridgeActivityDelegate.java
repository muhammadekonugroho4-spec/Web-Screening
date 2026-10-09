package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

/* loaded from: classes6.dex */
public interface IBridgeActivityDelegate {
    int getRequestCode();

    void onBridgeActivityCreate(Activity r1);

    void onBridgeActivityDestroy();

    boolean onBridgeActivityResult(int r1, int r2, Intent r3);

    void onBridgeConfigurationChanged();

    void onKeyUp(int r1, KeyEvent r2);
}
