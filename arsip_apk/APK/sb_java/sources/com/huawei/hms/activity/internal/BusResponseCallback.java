package com.huawei.hms.activity.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes6.dex */
public interface BusResponseCallback {
    BusResponseResult innerError(Activity r1, int r2, String r3);

    BusResponseResult succeedReturn(Activity r1, int r2, Intent r3);
}
