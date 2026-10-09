package com.stockbit.trading.ui.openingaccount.preparation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class m implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f148326b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f148327a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(m.class.getClassLoader());
            if (r3.containsKey("isFromOASocial") == false) goto L5;
            boolean r32 = r3.getBoolean("isFromOASocial");
        L7:
            return new m(r32);
        L5:
            r32 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f148326b = new a(null);
    }

    public m(boolean r1) {
        this.f148327a = r1;
    }

    public static final m fromBundle(Bundle r1) {
        return f148326b.a(r1);
    }

    public final boolean a() {
        return this.f148327a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isFromOASocial", this.f148327a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof m) == true) goto L9;
        return false;
    L9:
        if (this.f148327a == ((m) r4).f148327a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f148327a);
    }

    public String toString() {
        return "RegistrationPreparationMainFragmentArgs(isFromOASocial=" + this.f148327a + ')';
    }
}
