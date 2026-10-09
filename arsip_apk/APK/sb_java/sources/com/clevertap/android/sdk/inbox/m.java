package com.clevertap.android.sdk.inbox;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f34522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34523b;

    public m(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "url");
        kotlin.jvm.internal.p.l(r3, "contentDescription");
        this.f34522a = r2;
        this.f34523b = r3;
    }

    public final String a() {
        return this.f34523b;
    }

    public final String b() {
        return this.f34522a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f34522a, r52.f34522a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f34523b, r52.f34523b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f34522a.hashCode() * 31) + this.f34523b.hashCode();
    }

    public String toString() {
        return "CTInboxImageData(url=" + this.f34522a + ", contentDescription=" + this.f34523b + ')';
    }
}
