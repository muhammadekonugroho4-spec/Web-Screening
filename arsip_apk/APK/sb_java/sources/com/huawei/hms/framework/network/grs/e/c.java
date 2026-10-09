package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f39182b = "c";

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, PLSharedPreferences> f39183c = null;

    /* renamed from: a, reason: collision with root package name */
    private final PLSharedPreferences f39184a;

    static {
        f39183c = new ConcurrentHashMap(16);
    }

    public c(Context r5, String r6) {
        String r02 = r5.getPackageName();
        Logger.d(f39182b, "get pkgname from context is{%s}", new Object[]{r02});
        Map<String, PLSharedPreferences> r1 = f39183c;
        if (r1.containsKey(r6 + r02) == false) goto L5;
        this.f39184a = r1.get(r6 + r02);
    L6:
        a(r5);
        return;
    L5:
        PLSharedPreferences r2 = new PLSharedPreferences(r5, r6 + r02);
        this.f39184a = r2;
        r1.put(r6 + r02, r2);
        goto L6
    }

    public String a(String r3, String r4) {
        PLSharedPreferences r02 = this.f39184a;
        if (r02 != null) goto L5;
        return r4;
    L5:
        monitor-enter(r02);
        String r32 = this.f39184a.getString(r3, r4);     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r32;
    L9:
        th = move-exception;
        throw th;
    }

    public void b() {
        PLSharedPreferences r02 = this.f39184a;
        if (r02 != null) goto L5;
        return;
    L5:
        monitor-enter(r02);
        this.f39184a.clear();     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public Map<String, ?> a() {
        PLSharedPreferences r02 = this.f39184a;
        if (r02 == null) goto L5;
        monitor-enter(r02);
        Map<String, ?> r1 = this.f39184a.getAll();     // Catch: Throwable -> L10
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r1;
    L10:
        th = move-exception;
        throw th;
    L5:
        return new HashMap();
    }

    public void b(String r3, String r4) {
        PLSharedPreferences r02 = this.f39184a;
        if (r02 != null) goto L5;
        return;
    L5:
        monitor-enter(r02);
        this.f39184a.putString(r3, r4);     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }

    private void a(Context r5) {
        String r02 = f39182b;
        Logger.i(r02, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() == null) goto L13;
        r5 = ContextHolder.getAppContext();
    L13:
        String r52 = Long.toString(r5.getPackageManager().getPackageInfo(r5.getPackageName(), 16384).versionCode);     // Catch: PackageManager.NameNotFoundException -> L11
        String r1 = a("version", "");
        if (r52.equals(r1) == true) goto L15;
        Logger.i(r02, "app version changed! old version{%s} and new version{%s}", new Object[]{r1, r52});
        b();
        b("version", r52);
        return;
    L15:
        return;
    L11:
        Logger.w(f39182b, "get app version failed and catch NameNotFoundException");
    }

    public void a(String r3) {
        PLSharedPreferences r02 = this.f39184a;
        if (r02 != null) goto L5;
        return;
    L5:
        monitor-enter(r02);
        this.f39184a.remove(r3);     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }
}
