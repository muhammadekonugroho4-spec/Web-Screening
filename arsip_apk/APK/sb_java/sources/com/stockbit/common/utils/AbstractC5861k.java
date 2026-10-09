package com.stockbit.common.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.stockbit.common.utils.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC5861k {

    /* renamed from: a, reason: collision with root package name */
    public static String f62333a;

    public static String a(Context r10) {
        String r02 = f62333a;
        if (r02 == null) goto L5;
        return r02;
    L5:
        PackageManager r03 = r10.getPackageManager();
        Intent r1 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo r3 = r03.resolveActivity(r1, 0);
        if (r3 == null) goto L8;
        String r32 = r3.activityInfo.packageName;
    L9:
        List<ResolveInfo> r5 = r03.queryIntentActivities(r1, 0);
        ArrayList r6 = new ArrayList();
        Iterator<ResolveInfo> r52 = r5.iterator();
    L11:
        if (r52.hasNext() == false) goto L16;
        ResolveInfo r7 = r52.next();
        Intent r8 = new Intent();
        r8.setAction("android.support.customtabs.action.CustomTabsService");
        r8.setPackage(r7.activityInfo.packageName);
        if (r03.resolveService(r8, 0) == null) goto L11;
        r6.add(r7.activityInfo.packageName);
        goto L11
    L16:
        if (r6.isEmpty() == false) goto L19;
        f62333a = null;
    L41:
        return f62333a;
    L19:
        if (r6.size() != 1) goto L22;
        f62333a = (String) r6.get(0);
        goto L41
    L22:
        if (TextUtils.isEmpty(r32) == true) goto L29;
        if (b(r10, r1) == true) goto L29;
        if (r6.contains(r32) == false) goto L29;
        f62333a = r32;
    L29:
        if (r6.contains("com.android.chrome") == false) goto L32;
        f62333a = "com.android.chrome";
        goto L41
    L32:
        if (r6.contains("com.chrome.beta") == false) goto L35;
        f62333a = "com.chrome.beta";
        goto L41
    L35:
        if (r6.contains("com.chrome.dev") == false) goto L38;
        f62333a = "com.chrome.dev";
        goto L41
    L38:
        if (r6.contains("com.google.android.apps.chrome") == false) goto L41;
        f62333a = "com.google.android.apps.chrome";
        goto L41
    L8:
        r32 = null;
        goto L9
    }

    public static boolean b(Context r3, Intent r4) {
        List<ResolveInfo> r32 = r3.getPackageManager().queryIntentActivities(r4, 64);     // Catch: RuntimeException -> L22
        if (r32.isEmpty() == false) goto L6;
        return false;
    L6:
        Iterator<ResolveInfo> r33 = r32.iterator();     // Catch: RuntimeException -> L22
    L7:
        if (r33.hasNext() == false) goto L23;
        ResolveInfo r42 = r33.next();     // Catch: RuntimeException -> L22
        IntentFilter r1 = r42.filter;     // Catch: RuntimeException -> L22
        if (r1 == null) goto L7;
        if (r1.countDataAuthorities() == 0) goto L7;
        if (r1.countDataPaths() == 0) goto L7;
        if (r42.activityInfo == null) goto L7;
        return true;
    L23:
        return false;
    L22:
        timber.log.a.b("Runtime exception while getting specialized handlers", new Object[0]);
        goto L23
    }
}
