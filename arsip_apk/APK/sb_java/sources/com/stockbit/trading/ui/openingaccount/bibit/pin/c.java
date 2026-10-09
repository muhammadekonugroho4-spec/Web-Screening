package com.stockbit.trading.ui.openingaccount.bibit.pin;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class c implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f147942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f147943b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f147944c;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final c a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(c.class.getClassLoader());
            if (r5.containsKey("webiewUrl") == false) goto L19;
            String r02 = r5.getString("webiewUrl");
            if (r02 == null) goto L17;
            if (r5.containsKey("exitUrl") == false) goto L15;
            String r1 = r5.getString("exitUrl");
            if (r5.containsKey("isFromSocial") == false) goto L11;
            boolean r52 = r5.getBoolean("isFromSocial");
        L13:
            return new c(r02, r1, r52);
        L11:
            r52 = false;
            goto L13
        L15:
            throw new IllegalArgumentException("Required argument \"exitUrl\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"webiewUrl\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"webiewUrl\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public c(String r2, String r3, boolean r4) {
        p.l(r2, "webiewUrl");
        this.f147942a = r2;
        this.f147943b = r3;
        this.f147944c = r4;
    }

    public static final c fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f147943b;
    }

    public final String b() {
        return this.f147942a;
    }

    public final boolean c() {
        return this.f147944c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f147942a, r52.f147942a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f147943b, r52.f147943b) == true) goto L15;
        return false;
    L15:
        if (this.f147944c == r52.f147944c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f147942a.hashCode() * 31;
        String r1 = this.f147943b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f147944c);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "RegistrationBibitPinFragmentArgs(webiewUrl=" + this.f147942a + ", exitUrl=" + this.f147943b + ", isFromSocial=" + this.f147944c + ')';
    }
}
