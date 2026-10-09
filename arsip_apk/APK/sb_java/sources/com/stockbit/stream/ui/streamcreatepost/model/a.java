package com.stockbit.stream.ui.streamcreatepost.model;

import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f145144a;

    /* renamed from: b, reason: collision with root package name */
    public final String f145145b;

    /* renamed from: c, reason: collision with root package name */
    public final String f145146c;
    public final Uri d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageCompressionState f145147e;

    /* renamed from: f, reason: collision with root package name */
    public final String f145148f;

    static {
    }

    public a(long r2, String r4, String r5, Uri r6, ImageCompressionState r7, String r8) {
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "path");
        p.l(r7, "compressionState");
        this.f145144a = r2;
        this.f145145b = r4;
        this.f145146c = r5;
        this.d = r6;
        this.f145147e = r7;
        this.f145148f = r8;
    }

    public static /* synthetic */ a b(a r8, long r9, String r11, String r12, Uri r13, ImageCompressionState r14, String r15, int r16, Object r17) {
        if ((r16 & 1) == 0) goto L5;
        r9 = r8.f145144a;
    L5:
        long r1 = r9;
        if ((r16 & 2) == 0) goto L8;
        r11 = r8.f145145b;
    L8:
        String r3 = r11;
        if ((r16 & 4) == 0) goto L11;
        r12 = r8.f145146c;
    L11:
        String r4 = r12;
        if ((r16 & 8) == 0) goto L14;
        r13 = r8.d;
    L14:
        Uri r5 = r13;
        if ((r16 & 16) == 0) goto L17;
        r14 = r8.f145147e;
    L17:
        ImageCompressionState r6 = r14;
        if ((r16 & 32) == 0) goto L21;
        r15 = r8.f145148f;
    L21:
        return r8.a(r1, r3, r4, r5, r6, r15);
    }

    public final a a(long r10, String r12, String r13, Uri r14, ImageCompressionState r15, String r16) {
        p.l(r12, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r13, "path");
        p.l(r15, "compressionState");
        return new a(r10, r12, r13, r14, r15, r16);
    }

    public final String c() {
        return this.f145148f;
    }

    public final ImageCompressionState d() {
        return this.f145147e;
    }

    public final long e() {
        return this.f145144a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f145144a == r82.f145144a) goto L12;
        return false;
    L12:
        if (p.g(this.f145145b, r82.f145145b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f145146c, r82.f145146c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f145147e == r82.f145147e) goto L24;
        return false;
    L24:
        if (p.g(this.f145148f, r82.f145148f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        String r02 = this.f145148f;
        if (r02 == null) goto L10;
        if (r02.length() == 0) goto L10;
        return this.f145148f;
    L10:
        return this.f145146c;
    }

    public final String g() {
        return this.f145145b;
    }

    public final String h() {
        return this.f145146c;
    }

    public int hashCode() {
        int r02 = ((((Long.hashCode(this.f145144a) * 31) + this.f145145b.hashCode()) * 31) + this.f145146c.hashCode()) * 31;
        Uri r1 = this.d;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((r02 + r12) * 31) + this.f145147e.hashCode()) * 31;
        String r13 = this.f145148f;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final Uri i() {
        return this.d;
    }

    public String toString() {
        return "Image(id=" + this.f145144a + ", name=" + this.f145145b + ", path=" + this.f145146c + ", uri=" + this.d + ", compressionState=" + this.f145147e + ", compressedPath=" + this.f145148f + ')';
    }

    public /* synthetic */ a(long r2, String r4, String r5, Uri r6, ImageCompressionState r7, String r8, int r9, i r10) {
        if ((r9 & 8) == 0) goto L6;
        r6 = null;
    L6:
        if ((r9 & 16) == 0) goto L9;
        r7 = ImageCompressionState.IDLE;
    L9:
        if ((r9 & 32) == 0) goto L12;
        String r92 = null;
    L13:
        this(r2, r4, r5, r6, r7, r92);
        return;
    L12:
        r92 = r8;
        goto L13
    }
}
