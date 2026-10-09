package com.stockbit.feature.history.ui.transactionhistory;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f98457b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f98458a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(h.class.getClassLoader());
            if (r3.containsKey("extraSymbol") == false) goto L5;
            String r32 = r3.getString("extraSymbol");
        L7:
            return new h(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f98457b = new a(null);
    }

    public h(String r1) {
        this.f98458a = r1;
    }

    public static final h fromBundle(Bundle r1) {
        return f98457b.a(r1);
    }

    public final String a() {
        return this.f98458a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("extraSymbol", this.f98458a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f98458a, ((h) r4).f98458a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f98458a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "HistoryTransactionFragmentArgs(extraSymbol=" + this.f98458a + ')';
    }
}
