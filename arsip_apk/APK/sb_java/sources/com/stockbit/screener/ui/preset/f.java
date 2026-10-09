package com.stockbit.screener.ui.preset;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f132692f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f132693a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132694b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132695c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f132696e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r10) {
            kotlin.jvm.internal.p.l(r10, "bundle");
            r10.setClassLoader(f.class.getClassLoader());
            if (r10.containsKey("presetName") == false) goto L36;
            String r3 = r10.getString("presetName");
            if (r3 == null) goto L34;
            if (r10.containsKey("presetImageUrl") == false) goto L32;
            String r4 = r10.getString("presetImageUrl");
            if (r4 == null) goto L30;
            if (r10.containsKey("presetParentId") == false) goto L28;
            String r5 = r10.getString("presetParentId");
            if (r5 == null) goto L26;
            if (r10.containsKey("isFromDeeplink") == false) goto L18;
            boolean r02 = r10.getBoolean("isFromDeeplink");
        L17:
            boolean r8 = r02;
            if (r10.containsKey("deeplinkDetailPresetId") == false) goto L24;
            return new f(r3, r4, r5, r10.getLong("deeplinkDetailPresetId"), r8);
        L24:
            throw new IllegalArgumentException("Required argument \"deeplinkDetailPresetId\" is missing and does not have an android:defaultValue");
        L18:
            r02 = false;
            goto L17
        L26:
            throw new IllegalArgumentException("Argument \"presetParentId\" is marked as non-null but was passed a null value.");
        L28:
            throw new IllegalArgumentException("Required argument \"presetParentId\" is missing and does not have an android:defaultValue");
        L30:
            throw new IllegalArgumentException("Argument \"presetImageUrl\" is marked as non-null but was passed a null value.");
        L32:
            throw new IllegalArgumentException("Required argument \"presetImageUrl\" is missing and does not have an android:defaultValue");
        L34:
            throw new IllegalArgumentException("Argument \"presetName\" is marked as non-null but was passed a null value.");
        L36:
            throw new IllegalArgumentException("Required argument \"presetName\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f132692f = new a(null);
    }

    public f(String r2, String r3, String r4, long r5, boolean r7) {
        kotlin.jvm.internal.p.l(r2, "presetName");
        kotlin.jvm.internal.p.l(r3, "presetImageUrl");
        kotlin.jvm.internal.p.l(r4, "presetParentId");
        this.f132693a = r2;
        this.f132694b = r3;
        this.f132695c = r4;
        this.d = r5;
        this.f132696e = r7;
    }

    public static final f fromBundle(Bundle r1) {
        return f132692f.a(r1);
    }

    public final long a() {
        return this.d;
    }

    public final String b() {
        return this.f132694b;
    }

    public final String c() {
        return this.f132693a;
    }

    public final String d() {
        return this.f132695c;
    }

    public final boolean e() {
        return this.f132696e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (kotlin.jvm.internal.p.g(this.f132693a, r82.f132693a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f132694b, r82.f132694b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f132695c, r82.f132695c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f132696e == r82.f132696e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f132693a.hashCode() * 31) + this.f132694b.hashCode()) * 31) + this.f132695c.hashCode()) * 31) + Long.hashCode(this.d)) * 31) + Boolean.hashCode(this.f132696e);
    }

    public String toString() {
        return "ScreenerPresetDetailFragmentArgs(presetName=" + this.f132693a + ", presetImageUrl=" + this.f132694b + ", presetParentId=" + this.f132695c + ", deeplinkDetailPresetId=" + this.d + ", isFromDeeplink=" + this.f132696e + ')';
    }
}
