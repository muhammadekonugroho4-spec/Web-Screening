package com.clevertap.android.sdk.db;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final JSONArray f33820a;

    /* renamed from: b, reason: collision with root package name */
    public final List f33821b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33822c;
    public boolean d;

    public f() {
        this.f33820a = new JSONArray();
        this.f33821b = new ArrayList();
        this.f33822c = new ArrayList();
    }

    public final JSONArray a() {
        return this.f33820a;
    }

    public final List b() {
        return this.f33821b;
    }

    public final boolean c() {
        return this.d;
    }

    public final List d() {
        return this.f33822c;
    }

    public final boolean e() {
        if (this.f33820a.length() > 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void f(boolean r1) {
        this.d = r1;
    }

    public String toString() {
        return "QueueData: numItems=" + this.f33820a.length() + ", eventIds=" + this.f33821b.size() + ", profileEventIds=" + this.f33822c.size();
    }
}
