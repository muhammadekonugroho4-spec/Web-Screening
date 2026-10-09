package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f33371a = null;

    static {
        f33371a = new ConcurrentHashMap();
    }

    public static PackageInfo a(Context r3) {
        return r3.getPackageManager().getPackageInfo(r3.getPackageName(), 0);
    L4:
        e = move-exception;
        Log.e("AppVersionSignature", "Cannot resolve info for" + r3.getPackageName(), e);
        return null;
    }

    public static String b(PackageInfo r02) {
        if (r02 == null) goto L6;
        return String.valueOf(r02.versionCode);
    L6:
        return UUID.randomUUID().toString();
    }

    public static com.bumptech.glide.load.c c(Context r3) {
        String r02 = r3.getPackageName();
        ConcurrentMap r1 = f33371a;
        com.bumptech.glide.load.c r2 = (com.bumptech.glide.load.c) r1.get(r02);
        if (r2 != null) goto L8;
        com.bumptech.glide.load.c r32 = d(r3);
        com.bumptech.glide.load.c r03 = (com.bumptech.glide.load.c) r1.putIfAbsent(r02, r32);
        if (r03 != null) goto L7;
        return r32;
    L7:
        return r03;
    L8:
        return r2;
    }

    public static com.bumptech.glide.load.c d(Context r1) {
        return new d(b(a(r1)));
    }
}
