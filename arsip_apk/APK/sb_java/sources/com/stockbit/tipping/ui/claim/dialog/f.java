package com.stockbit.tipping.ui.claim.dialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f145940e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f145941a;

    /* renamed from: b, reason: collision with root package name */
    public final int f145942b;

    /* renamed from: c, reason: collision with root package name */
    public final String f145943c;
    public final int d;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final f a(Bundle r7) {
            p.l(r7, "bundle");
            r7.setClassLoader(f.class.getClassLoader());
            String r2 = null;
            if (r7.containsKey("tippingClaimPreviewDialogValue") == false) goto L5;
            String r02 = r7.getString("tippingClaimPreviewDialogValue");
        L6:
            int r4 = 0;
            if (r7.containsKey("tippingClaimPreviewDialogPercentFee") == false) goto L9;
            int r1 = r7.getInt("tippingClaimPreviewDialogPercentFee");
        L11:
            if (r7.containsKey("tippingClaimPreviewDialogGopayAccount") == false) goto L14;
            r2 = r7.getString("tippingClaimPreviewDialogGopayAccount");
        L14:
            if (r7.containsKey("tippingClaimPreviewDialogStatusFee") == false) goto L17;
            r4 = r7.getInt("tippingClaimPreviewDialogStatusFee");
        L17:
            return new f(r02, r1, r2, r4);
        L9:
            r1 = 0;
            goto L11
        L5:
            r02 = null;
            goto L6
        }

        public a() {
        }
    }

    static {
        f145940e = new a(null);
    }

    public f(String r1, int r2, String r3, int r4) {
        this.f145941a = r1;
        this.f145942b = r2;
        this.f145943c = r3;
        this.d = r4;
    }

    public static final f fromBundle(Bundle r1) {
        return f145940e.a(r1);
    }

    public final String a() {
        return this.f145943c;
    }

    public final int b() {
        return this.f145942b;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f145941a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f145941a, r52.f145941a) == true) goto L12;
        return false;
    L12:
        if (this.f145942b == r52.f145942b) goto L15;
        return false;
    L15:
        if (p.g(this.f145943c, r52.f145943c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f145941a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + Integer.hashCode(this.f145942b)) * 31;
        String r2 = this.f145943c;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return ((r04 + r1) * 31) + Integer.hashCode(this.d);
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingClaimPreviewDialogFragmentArgs(tippingClaimPreviewDialogValue=" + this.f145941a + ", tippingClaimPreviewDialogPercentFee=" + this.f145942b + ", tippingClaimPreviewDialogGopayAccount=" + this.f145943c + ", tippingClaimPreviewDialogStatusFee=" + this.d + ')';
    }
}
