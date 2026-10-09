package com.stockbit.transferstock.ui.brokers;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f150766b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f150767a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final g a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(g.class.getClassLoader());
            if (r3.containsKey("fromOnboard") == false) goto L5;
            boolean r32 = r3.getBoolean("fromOnboard");
        L7:
            return new g(r32);
        L5:
            r32 = true;
            goto L7
        }

        public a() {
        }
    }

    static {
        f150766b = new a(null);
    }

    public g(boolean r1) {
        this.f150767a = r1;
    }

    public static final g fromBundle(Bundle r1) {
        return f150766b.a(r1);
    }

    public final boolean a() {
        return this.f150767a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putBoolean("fromOnboard", this.f150767a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (this.f150767a == ((g) r4).f150767a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f150767a);
    }

    public String toString() {
        return "BrokerFragmentArgs(fromOnboard=" + this.f150767a + ')';
    }
}
