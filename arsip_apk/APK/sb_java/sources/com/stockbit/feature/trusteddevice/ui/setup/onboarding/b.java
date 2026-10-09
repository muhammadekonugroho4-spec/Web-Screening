package com.stockbit.feature.trusteddevice.ui.setup.onboarding;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f118694a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118696c;
    public final int d;

    static {
    }

    public b(String r2, String r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r3, "message");
        this.f118694a = r2;
        this.f118695b = r3;
        this.f118696c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f118696c;
    }

    public final int b() {
        return this.d;
    }

    public final String c() {
        return this.f118695b;
    }

    public final String d() {
        return this.f118694a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f118694a, r52.f118694a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f118695b, r52.f118695b) == true) goto L15;
        return false;
    L15:
        if (this.f118696c == r52.f118696c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f118694a.hashCode() * 31) + this.f118695b.hashCode()) * 31) + Integer.hashCode(this.f118696c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "SetupBlockedUIState(title=" + this.f118694a + ", message=" + this.f118695b + ", buttonText=" + this.f118696c + ", image=" + this.d + ')';
    }
}
