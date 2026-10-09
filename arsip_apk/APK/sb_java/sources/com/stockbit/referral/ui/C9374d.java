package com.stockbit.referral.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.referral.ui.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9374d implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f129023c = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f129025b;

    /* renamed from: com.stockbit.referral.ui.d$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C9374d a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(C9374d.class.getClassLoader());
            if (r4.containsKey("isFromSpinner") == false) goto L5;
            boolean r02 = r4.getBoolean("isFromSpinner");
        L7:
            if (r4.containsKey("termsId") == false) goto L13;
            String r42 = r4.getString("termsId");
            if (r42 != null) goto L15;
            throw new IllegalArgumentException("Argument \"termsId\" is marked as non-null but was passed a null value.");
        L15:
            return new C9374d(r02, r42);
        L13:
            r42 = "";
            goto L15
        L5:
            r02 = true;
            goto L7
        }

        public a() {
        }
    }

    static {
        f129023c = new a(null);
    }

    public C9374d(boolean r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "termsId");
        this.f129024a = r2;
        this.f129025b = r3;
    }

    public static final C9374d fromBundle(Bundle r1) {
        return f129023c.a(r1);
    }

    public final String a() {
        return this.f129025b;
    }

    public final boolean b() {
        return this.f129024a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C9374d) == true) goto L8;
        return false;
    L8:
        C9374d r52 = (C9374d) r5;
        if (this.f129024a == r52.f129024a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f129025b, r52.f129025b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f129024a) * 31) + this.f129025b.hashCode();
    }

    public String toString() {
        return "AgreementFragmentArgs(isFromSpinner=" + this.f129024a + ", termsId=" + this.f129025b + ')';
    }
}
