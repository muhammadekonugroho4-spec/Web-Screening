package com.fingerprintjs.android.fingerprint;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37048a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37049b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37050c;
    public final String d;

    public b(String r2, String r3, String r4, String r5) {
        p.l(r2, Constants.DEVICE_ID_TAG);
        p.l(r3, "gsfId");
        p.l(r4, "androidId");
        p.l(r5, "mediaDrmId");
        this.f37048a = r2;
        this.f37049b = r3;
        this.f37050c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f37050c;
    }

    public final String b() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f37048a, r52.f37048a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f37049b, r52.f37049b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f37050c, r52.f37050c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f37048a.hashCode() * 31) + this.f37049b.hashCode()) * 31) + this.f37050c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DeviceIdResult(deviceId=" + this.f37048a + ", gsfId=" + this.f37049b + ", androidId=" + this.f37050c + ", mediaDrmId=" + this.d + ')';
    }
}
