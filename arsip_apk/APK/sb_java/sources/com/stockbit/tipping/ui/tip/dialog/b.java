package com.stockbit.tipping.ui.tip.dialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f146126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f146127b;

    /* renamed from: c, reason: collision with root package name */
    public final String f146128c;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(b.class.getClassLoader());
            if (r6.containsKey("tippingTipStatusCode") == false) goto L14;
            int r02 = r6.getInt("tippingTipStatusCode");
            String r3 = null;
            if (r6.containsKey("tippingTipGrossAmount") == false) goto L7;
            String r1 = r6.getString("tippingTipGrossAmount");
        L9:
            if (r6.containsKey("tippingTipTransactionTime") == false) goto L12;
            r3 = r6.getString("tippingTipTransactionTime");
        L12:
            return new b(r02, r1, r3);
        L7:
            r1 = null;
            goto L9
        L14:
            throw new IllegalArgumentException("Required argument \"tippingTipStatusCode\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public b(int r1, String r2, String r3) {
        this.f146126a = r1;
        this.f146127b = r2;
        this.f146128c = r3;
    }

    public static final b fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f146127b;
    }

    public final int b() {
        return this.f146126a;
    }

    public final String c() {
        return this.f146128c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f146126a == r52.f146126a) goto L12;
        return false;
    L12:
        if (p.g(this.f146127b, r52.f146127b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f146128c, r52.f146128c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f146126a) * 31;
        String r1 = this.f146127b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f146128c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingTipDialogFragmentArgs(tippingTipStatusCode=" + this.f146126a + ", tippingTipGrossAmount=" + this.f146127b + ", tippingTipTransactionTime=" + this.f146128c + ')';
    }
}
