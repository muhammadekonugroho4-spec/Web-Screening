package com.stockbit.setting.ui.transferstock;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f136803b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136804a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final d a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(d.class.getClassLoader());
            if (r3.containsKey("interceptBack") == false) goto L5;
            boolean r32 = r3.getBoolean("interceptBack");
        L7:
            return new d(r32);
        L5:
            r32 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f136803b = new a(null);
    }

    public d(boolean r1) {
        this.f136804a = r1;
    }

    public static final d fromBundle(Bundle r1) {
        return f136803b.a(r1);
    }

    public final boolean a() {
        return this.f136804a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putBoolean("interceptBack", this.f136804a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (this.f136804a == ((d) r4).f136804a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f136804a);
    }

    public String toString() {
        return "OnboardingTransferStockFragmentArgs(interceptBack=" + this.f136804a + ')';
    }
}
