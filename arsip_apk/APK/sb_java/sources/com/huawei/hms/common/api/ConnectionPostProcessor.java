package com.huawei.hms.common.api;

import android.app.Activity;
import com.huawei.hms.api.HuaweiApiClient;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public interface ConnectionPostProcessor {
    void run(HuaweiApiClient r1, WeakReference<Activity> r2);
}
