package io.sentry.clientreport;

import io.sentry.util.v;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f176164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f176165b;

    public d(String r1, String r2) {
        this.f176164a = r1;
        this.f176165b = r2;
    }

    public String a() {
        return this.f176165b;
    }

    public String b() {
        return this.f176164a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (v.a(b(), r52.b()) == true) goto L11;
    L13:
        return false;
    L11:
        if (v.a(a(), r52.a()) == false) goto L13;
        return true;
    }

    public int hashCode() {
        return v.b(new Object[]{b(), a()});
    }
}
