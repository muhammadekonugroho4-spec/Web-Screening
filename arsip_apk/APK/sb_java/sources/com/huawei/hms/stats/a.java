package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static HiAnalyticsInstance f39450a;

    private static HiAnalyticsInstance a(Context r02) {
        HiAnalyticsInstance r03 = HMSBIInitializer.getInstance(r02).getAnalyticsInstance();
        f39450a = r03;
        return r03;
    }

    public static void b(Context r02, int r1, String r2, LinkedHashMap<String, String> r3) {
        if (a(r02) == null) goto L6;
        f39450a.onStreamEvent(r1, r2, r3);
        return;
    }

    public static void a(Context r1, String r2, String r3) {
        if (a(r1) == null) goto L6;
        f39450a.onEvent(r1, r2, r3);
        return;
    }

    public static void a(Context r02, int r1, String r2, LinkedHashMap<String, String> r3) {
        if (a(r02) == null) goto L6;
        f39450a.onEvent(r1, r2, r3);
        return;
    }

    public static void a(Context r02, int r1) {
        if (a(r02) == null) goto L6;
        f39450a.onReport(r1);
        return;
    }
}
