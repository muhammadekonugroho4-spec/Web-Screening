package com.fingerprintjs.android.fingerprint.info_providers;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37310b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37311c;

    public b(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "cameraName");
        kotlin.jvm.internal.p.l(r3, "cameraType");
        kotlin.jvm.internal.p.l(r4, "cameraOrientation");
        this.f37309a = r2;
        this.f37310b = r3;
        this.f37311c = r4;
    }

    public final String a() {
        return this.f37309a;
    }

    public final String b() {
        return this.f37311c;
    }

    public final String c() {
        return this.f37310b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f37309a, r52.f37309a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f37310b, r52.f37310b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f37311c, r52.f37311c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f37309a.hashCode() * 31) + this.f37310b.hashCode()) * 31) + this.f37311c.hashCode();
    }

    public String toString() {
        return "CameraInfo(cameraName=" + this.f37309a + ", cameraType=" + this.f37310b + ", cameraOrientation=" + this.f37311c + ')';
    }
}
