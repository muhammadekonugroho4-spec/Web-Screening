package com.stockbit.eipo.ui.company;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.eipo.EipoEntryPoint;

/* loaded from: classes8.dex */
public final class M implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f89386c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f89387a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f89388b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final M a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(M.class.getClassLoader());
            if (r4.containsKey(EipoEntryPoint.EXTRA_EMITEN_CODE) == false) goto L5;
            String r02 = r4.getString(EipoEntryPoint.EXTRA_EMITEN_CODE);
        L7:
            if (r4.containsKey(EipoEntryPoint.EXTRA_IS_PERFORM_UNBOXING) == false) goto L9;
            boolean r42 = r4.getBoolean(EipoEntryPoint.EXTRA_IS_PERFORM_UNBOXING);
        L11:
            return new M(r02, r42);
        L9:
            r42 = false;
            goto L11
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f89386c = new a(null);
    }

    public M(String r1, boolean r2) {
        this.f89387a = r1;
        this.f89388b = r2;
    }

    public static final M fromBundle(Bundle r1) {
        return f89386c.a(r1);
    }

    public final String a() {
        return this.f89387a;
    }

    public final boolean b() {
        return this.f89388b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof M) == true) goto L8;
        return false;
    L8:
        M r52 = (M) r5;
        if (kotlin.jvm.internal.p.g(this.f89387a, r52.f89387a) == true) goto L12;
        return false;
    L12:
        if (this.f89388b == r52.f89388b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f89387a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f89388b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "EIpoCompanyFragmentArgs(emitenCode=" + this.f89387a + ", performUnBoxing=" + this.f89388b + ')';
    }
}
