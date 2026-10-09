package com.stockbit.userauth.ui.pin.validation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class z implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f165416c = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f165417a;

    /* renamed from: b, reason: collision with root package name */
    public final String f165418b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final z a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(z.class.getClassLoader());
            if (r4.containsKey("showBrokerSelector") == false) goto L5;
            boolean r02 = r4.getBoolean("showBrokerSelector");
        L7:
            if (r4.containsKey("resultNavigationKey") == false) goto L13;
            String r42 = r4.getString("resultNavigationKey");
            if (r42 != null) goto L15;
            throw new IllegalArgumentException("Argument \"resultNavigationKey\" is marked as non-null but was passed a null value.");
        L15:
            return new z(r02, r42);
        L13:
            r42 = "RC_PIN_LOGIN";
            goto L15
        L5:
            r02 = true;
            goto L7
        }

        public a() {
        }
    }

    static {
        f165416c = new a(null);
    }

    public z(boolean r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "resultNavigationKey");
        this.f165417a = r2;
        this.f165418b = r3;
    }

    public static final z fromBundle(Bundle r1) {
        return f165416c.a(r1);
    }

    public final String a() {
        return this.f165418b;
    }

    public final boolean b() {
        return this.f165417a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putBoolean("showBrokerSelector", this.f165417a);
        r02.putString("resultNavigationKey", this.f165418b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof z) == true) goto L8;
        return false;
    L8:
        z r52 = (z) r5;
        if (this.f165417a == r52.f165417a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f165418b, r52.f165418b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f165417a) * 31) + this.f165418b.hashCode();
    }

    public String toString() {
        return "SecuritiesPinLoginFragmentArgs(showBrokerSelector=" + this.f165417a + ", resultNavigationKey=" + this.f165418b + ')';
    }
}
