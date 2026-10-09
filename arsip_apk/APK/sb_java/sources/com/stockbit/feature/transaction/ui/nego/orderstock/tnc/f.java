package com.stockbit.feature.transaction.ui.nego.orderstock.tnc;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f115066b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f115067a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(f.class.getClassLoader());
            if (r3.containsKey("url") == false) goto L9;
            String r32 = r3.getString("url");
            if (r32 != null) goto L11;
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        L11:
            return new f(r32);
        L9:
            r32 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f115066b = new a(null);
    }

    public f(String r2) {
        kotlin.jvm.internal.p.l(r2, "url");
        this.f115067a = r2;
    }

    public static final f fromBundle(Bundle r1) {
        return f115066b.a(r1);
    }

    public final String a() {
        return this.f115067a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f115067a, ((f) r4).f115067a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f115067a.hashCode();
    }

    public String toString() {
        return "OrderNegoTnCFragmentArgs(url=" + this.f115067a + ')';
    }
}
