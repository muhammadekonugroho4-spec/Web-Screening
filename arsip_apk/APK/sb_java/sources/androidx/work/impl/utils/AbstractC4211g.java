package androidx.work.impl.utils;

import android.app.ActivityManager;
import java.util.List;

/* renamed from: androidx.work.impl.utils.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC4211g {
    public static /* bridge */ /* synthetic */ List a(ActivityManager r02, String r1, int r2, int r3) {
        return r02.getHistoricalProcessExitReasons(r1, r2, r3);
    }
}
