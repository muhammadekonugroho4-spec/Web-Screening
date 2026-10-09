package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33249a;

    public d(Context r1) {
        this.f33249a = r1;
    }

    public static b c(String r3) {
        Class<?> r32 = Class.forName(r3);     // Catch: ClassNotFoundException -> L24
        Object r02 = null;
        r02 = r32.getDeclaredConstructor(null).newInstance(null);     // Catch: InvocationTargetException -> L6 NoSuchMethodException -> L8 IllegalAccessException -> L10 InstantiationException -> L12
    L19:
        if ((r02 instanceof b) == false) goto L23;
        return (b) r02;
    L23:
        throw new RuntimeException("Expected instanceof GlideModule, but found: " + r02);
    L10:
        e = move-exception;
        d(r32, e);
    L12:
        e = move-exception;
        d(r32, e);
    L8:
        e = move-exception;
        d(r32, e);
    L6:
        e = move-exception;
        d(r32, e);
    L24:
        e = move-exception;
        throw new IllegalArgumentException("Unable to find GlideModule implementation", e);
    }

    public static void d(Class r3, Exception r4) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + r3, r4);
    }

    public final ApplicationInfo a() {
        return this.f33249a.getPackageManager().getApplicationInfo(this.f33249a.getPackageName(), 128);
    }

    public List b() {
        if (Log.isLoggable("ManifestParser", 3) == false) goto L5;
        Log.d("ManifestParser", "Loading Glide modules");
    L5:
        ArrayList r2 = new ArrayList();
        ApplicationInfo r3 = a();     // Catch: PackageManager.NameNotFoundException -> L14
        if (r3 == null) goto L30;
        if (r3.metaData == null) goto L30;
        if (Log.isLoggable("ManifestParser", 2) == false) goto L16;
        Log.v("ManifestParser", "Got app info metadata: " + r3.metaData);     // Catch: PackageManager.NameNotFoundException -> L14
    L16:
        Iterator<String> r4 = r3.metaData.keySet().iterator();     // Catch: PackageManager.NameNotFoundException -> L14
    L18:
        if (r4.hasNext() == false) goto L26;
        String r5 = r4.next();     // Catch: PackageManager.NameNotFoundException -> L14
        if ("GlideModule".equals(r3.metaData.get(r5)) == false) goto L18;
        r2.add(c(r5));     // Catch: PackageManager.NameNotFoundException -> L14
        if (Log.isLoggable("ManifestParser", 3) == false) goto L18;
        Log.d("ManifestParser", "Loaded Glide module: " + r5);     // Catch: PackageManager.NameNotFoundException -> L14
        goto L18
    L26:
        if (Log.isLoggable("ManifestParser", 3) == false) goto L32;
        Log.d("ManifestParser", "Finished loading Glide modules");
        return r2;
    L32:
        return r2;
    L30:
        if (Log.isLoggable("ManifestParser", 3) == false) goto L32;
        Log.d("ManifestParser", "Got null app info metadata");     // Catch: PackageManager.NameNotFoundException -> L14
    L14:
        e = move-exception;
        throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
    }
}
