package com.appmattus.certificatetransparency.internal.verifier;

/* loaded from: classes4.dex */
public final class j extends com.appmattus.certificatetransparency.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f32270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32271b;

    public j(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "sctLogId");
        kotlin.jvm.internal.p.l(r3, "logServerId");
        this.f32270a = r2;
        this.f32271b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f32270a, r52.f32270a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f32271b, r52.f32271b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f32270a.hashCode() * 31) + this.f32271b.hashCode();
    }

    public String toString() {
        return "Log ID of SCT, " + this.f32270a + ", does not match this log's ID, " + this.f32271b;
    }
}
