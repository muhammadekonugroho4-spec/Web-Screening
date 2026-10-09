package org.slf4j.helpers;

import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes3.dex */
public class b implements org.slf4j.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f183030a;

    /* renamed from: b, reason: collision with root package name */
    public volatile org.slf4j.b f183031b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f183032c;
    public Method d;

    /* renamed from: e, reason: collision with root package name */
    public Queue f183033e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f183034f;

    public b(String r1, Queue r2, boolean r3) {
        this.f183030a = r1;
        this.f183033e = r2;
        this.f183034f = r3;
    }

    public boolean a() {
        Boolean r02 = this.f183032c;
        if (r02 != null) goto L5;
        this.d = this.f183031b.getClass().getMethod("log", new Class[]{org.slf4j.event.a.class});     // Catch: NoSuchMethodException -> L8
        this.f183032c = Boolean.TRUE;     // Catch: NoSuchMethodException -> L8
    L10:
        return this.f183032c.booleanValue();
    L8:
        this.f183032c = Boolean.FALSE;
        goto L10
    L5:
        return r02.booleanValue();
    }

    public boolean b() {
        return this.f183031b instanceof NOPLogger;
    }

    public boolean c() {
        if (this.f183031b != null) goto L6;
        return true;
    L6:
        return false;
    }

    public void d(org.slf4j.event.a r3) {
        if (a() == false) goto L9;
        this.d.invoke(this.f183031b, new Object[]{r3});     // Catch: Throwable -> L6
        return;
    L10:
        return;
    }

    public void e(org.slf4j.b r1) {
        this.f183031b = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L14:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L14;
        if (this.f183030a.equals(((b) r5).f183030a) == true) goto L13;
        return false;
    L13:
        return true;
    }

    @Override // org.slf4j.b
    public String getName() {
        return this.f183030a;
    }

    public int hashCode() {
        return this.f183030a.hashCode();
    }
}
