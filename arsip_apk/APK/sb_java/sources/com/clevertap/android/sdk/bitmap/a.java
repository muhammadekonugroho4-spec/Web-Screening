package com.clevertap.android.sdk.bitmap;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f33705a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33706b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f33707c;
    public final CleverTapInstanceConfig d;

    /* renamed from: e, reason: collision with root package name */
    public long f33708e;

    /* renamed from: f, reason: collision with root package name */
    public int f33709f;

    public a(String r11, boolean r12, Context r13, CleverTapInstanceConfig r14, long r15) {
        int r7 = 0;
        this(r11, r12, r13, r14, r15, r7, 32, null);
    }

    public final String a() {
        return this.f33705a;
    }

    public final boolean b() {
        return this.f33706b;
    }

    public final Context c() {
        return this.f33707c;
    }

    public final CleverTapInstanceConfig d() {
        return this.d;
    }

    public final long e() {
        return this.f33708e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f33705a, r82.f33705a) == true) goto L12;
        return false;
    L12:
        if (this.f33706b == r82.f33706b) goto L15;
        return false;
    L15:
        if (p.g(this.f33707c, r82.f33707c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f33708e == r82.f33708e) goto L24;
        return false;
    L24:
        if (this.f33709f == r82.f33709f) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f33705a;
    }

    public final Context g() {
        return this.f33707c;
    }

    public final int h() {
        return this.f33709f;
    }

    public int hashCode() {
        String r02 = this.f33705a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + Boolean.hashCode(this.f33706b)) * 31;
        Context r2 = this.f33707c;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        CleverTapInstanceConfig r23 = this.d;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((((r05 + r1) * 31) + Long.hashCode(this.f33708e)) * 31) + Integer.hashCode(this.f33709f);
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BitmapDownloadRequest(bitmapPath=" + this.f33705a + ", fallbackToAppIcon=" + this.f33706b + ", context=" + this.f33707c + ", instanceConfig=" + this.d + ", downloadTimeLimitInMillis=" + this.f33708e + ", downloadSizeLimitInBytes=" + this.f33709f + ')';
    }

    public a(String r1, boolean r2, Context r3, CleverTapInstanceConfig r4, long r5, int r7) {
        this.f33705a = r1;
        this.f33706b = r2;
        this.f33707c = r3;
        this.d = r4;
        this.f33708e = r5;
        this.f33709f = r7;
    }

    public /* synthetic */ a(String r7, boolean r8, Context r9, CleverTapInstanceConfig r10, long r11, int r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 2) == 0) goto L5;
        boolean r02 = false;
    L6:
        CleverTapInstanceConfig r2 = null;
        if ((r14 & 4) == 0) goto L9;
        Context r1 = null;
    L11:
        if ((r14 & 8) != 0) goto L15;
        r2 = r10;
    L15:
        if ((r14 & 16) == 0) goto L17;
        long r3 = -1;
    L19:
        if ((r14 & 32) == 0) goto L22;
        int r152 = -1;
    L23:
        this(r7, r02, r1, r2, r3, r152);
        return;
    L22:
        r152 = r13;
        goto L23
    L17:
        r3 = r11;
        goto L19
    L9:
        r1 = r9;
        goto L11
    L5:
        r02 = r8;
        goto L6
    }
}
