package com.stockbit.brokeractivity.ui.topbroker;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class D implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f49104b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f49105a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final D a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(D.class.getClassLoader());
            if (r3.containsKey("isFromDeeplink") == false) goto L5;
            boolean r32 = r3.getBoolean("isFromDeeplink");
        L7:
            return new D(r32);
        L5:
            r32 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f49104b = new a(null);
    }

    public D(boolean r1) {
        this.f49105a = r1;
    }

    public static final D fromBundle(Bundle r1) {
        return f49104b.a(r1);
    }

    public final boolean a() {
        return this.f49105a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isFromDeeplink", this.f49105a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof D) == true) goto L9;
        return false;
    L9:
        if (this.f49105a == ((D) r4).f49105a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f49105a);
    }

    public String toString() {
        return "TopBrokerFragmentArgs(isFromDeeplink=" + this.f49105a + ')';
    }

    public /* synthetic */ D(boolean r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }
}
