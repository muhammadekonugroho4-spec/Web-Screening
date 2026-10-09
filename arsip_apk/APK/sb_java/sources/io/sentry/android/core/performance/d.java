package io.sentry.android.core.performance;

import android.app.ActivityManager;
import java.util.List;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ List a(ActivityManager r02, int r1) {
        return r02.getHistoricalProcessStartReasons(r1);
    }
}
