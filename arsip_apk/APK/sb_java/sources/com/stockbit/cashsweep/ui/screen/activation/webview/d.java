package com.stockbit.cashsweep.ui.screen.activation.webview;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52380b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f52381a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(d.class.getClassLoader());
            if (r3.containsKey("url") == false) goto L5;
            String r32 = r3.getString("url");
        L7:
            return new d(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f52380b = new a(null);
    }

    public d(String r1) {
        this.f52381a = r1;
    }

    public static final d fromBundle(Bundle r1) {
        return f52380b.a(r1);
    }

    public final String a() {
        return this.f52381a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f52381a, ((d) r4).f52381a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f52381a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "CashSweepActivationWebViewFragmentArgs(url=" + this.f52381a + ')';
    }
}
