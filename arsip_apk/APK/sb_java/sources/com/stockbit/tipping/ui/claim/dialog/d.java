package com.stockbit.tipping.ui.claim.dialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f145935e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f145936a;

    /* renamed from: b, reason: collision with root package name */
    public final String f145937b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f145938c;
    public final boolean d;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final d a(Bundle r7) {
            p.l(r7, "bundle");
            r7.setClassLoader(d.class.getClassLoader());
            String r2 = null;
            if (r7.containsKey("tippingClaimDialogValue") == false) goto L5;
            String r02 = r7.getString("tippingClaimDialogValue");
        L7:
            if (r7.containsKey("tippingClaimDialogMessage") == false) goto L9;
            r2 = r7.getString("tippingClaimDialogMessage");
        L9:
            boolean r4 = false;
            if (r7.containsKey("tippingClaimDialogIsGopayNumberExist") == false) goto L12;
            boolean r1 = r7.getBoolean("tippingClaimDialogIsGopayNumberExist");
        L14:
            if (r7.containsKey("tippingClaimDialogIsSuccess") == false) goto L17;
            r4 = r7.getBoolean("tippingClaimDialogIsSuccess");
        L17:
            return new d(r02, r2, r1, r4);
        L12:
            r1 = false;
            goto L14
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f145935e = new a(null);
    }

    public d(String r1, String r2, boolean r3, boolean r4) {
        this.f145936a = r1;
        this.f145937b = r2;
        this.f145938c = r3;
        this.d = r4;
    }

    public static final d fromBundle(Bundle r1) {
        return f145935e.a(r1);
    }

    public final boolean a() {
        return this.f145938c;
    }

    public final String b() {
        return this.f145937b;
    }

    public final String c() {
        return this.f145936a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f145936a, r52.f145936a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f145937b, r52.f145937b) == true) goto L15;
        return false;
    L15:
        if (this.f145938c == r52.f145938c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f145936a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f145937b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return ((((r04 + r1) * 31) + Boolean.hashCode(this.f145938c)) * 31) + Boolean.hashCode(this.d);
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingClaimDialogFragmentArgs(tippingClaimDialogValue=" + this.f145936a + ", tippingClaimDialogMessage=" + this.f145937b + ", tippingClaimDialogIsGopayNumberExist=" + this.f145938c + ", tippingClaimDialogIsSuccess=" + this.d + ')';
    }
}
