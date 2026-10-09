package com.huawei.hms.ui;

import android.os.Bundle;
import com.huawei.hms.base.ui.LogUtil;

/* loaded from: classes6.dex */
public class SafeBundle {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f39493a;

    public SafeBundle() {
        this(new Bundle());
    }

    public boolean containsKey(String r2) {
        return this.f39493a.containsKey(r2);
    L4:
        LogUtil.e("SafeBundle", "containsKey exception. key:");
        return false;
    }

    public Object get(String r3) {
        return this.f39493a.get(r3);
    L4:
        e = move-exception;
        LogUtil.e("SafeBundle", "get exception: " + e.getMessage(), true);
        return null;
    }

    public Bundle getBundle() {
        return this.f39493a;
    }

    public int getInt(String r2) {
        return getInt(r2, 0);
    }

    public String getString(String r3) {
        return this.f39493a.getString(r3);
    L4:
        e = move-exception;
        LogUtil.e("SafeBundle", "getString exception: " + e.getMessage(), true);
        return "";
    }

    public boolean isEmpty() {
        return this.f39493a.isEmpty();
    L4:
        LogUtil.e("SafeBundle", "isEmpty exception");
        return true;
    }

    public int size() {
        return this.f39493a.size();
    L4:
        LogUtil.e("SafeBundle", "size exception");
        return 0;
    }

    public String toString() {
        return this.f39493a.toString();
    }

    public SafeBundle(Bundle r1) {
        if (r1 != null) goto L6;
        r1 = new Bundle();
    L6:
        this.f39493a = r1;
    }

    public int getInt(String r3, int r4) {
        return this.f39493a.getInt(r3, r4);
    L4:
        e = move-exception;
        LogUtil.e("SafeBundle", "getInt exception: " + e.getMessage(), true);
        return r4;
    }

    public String getString(String r3, String r4) {
        return this.f39493a.getString(r3, r4);
    L4:
        e = move-exception;
        LogUtil.e("SafeBundle", "getString exception: " + e.getMessage(), true);
        return r4;
    }
}
