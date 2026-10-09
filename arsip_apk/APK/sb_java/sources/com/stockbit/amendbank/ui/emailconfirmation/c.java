package com.stockbit.amendbank.ui.emailconfirmation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f46298c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f46299a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46300b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final c a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(c.class.getClassLoader());
            if (r4.containsKey("amend_bank_token") == false) goto L5;
            String r02 = r4.getString("amend_bank_token");
        L7:
            if (r4.containsKey("isFromForgot") == false) goto L9;
            boolean r42 = r4.getBoolean("isFromForgot");
        L11:
            return new c(r02, r42);
        L9:
            r42 = false;
            goto L11
        L5:
            r02 = "";
            goto L7
        }

        public a() {
        }
    }

    static {
        f46298c = new a(null);
    }

    public c(String r1, boolean r2) {
        this.f46299a = r1;
        this.f46300b = r2;
    }

    public static final c fromBundle(Bundle r1) {
        return f46298c.a(r1);
    }

    public final String a() {
        return this.f46299a;
    }

    public final boolean b() {
        return this.f46300b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("amend_bank_token", this.f46299a);
        r02.putBoolean("isFromForgot", this.f46300b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f46299a, r52.f46299a) == true) goto L12;
        return false;
    L12:
        if (this.f46300b == r52.f46300b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f46299a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f46300b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "AmendBankTokenValidationFragmentArgs(amendBankToken=" + this.f46299a + ", isFromForgot=" + this.f46300b + ')';
    }

    public /* synthetic */ c(String r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2);
    }
}
