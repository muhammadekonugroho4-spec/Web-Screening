package com.stockbit.trading.ui.landing.referral;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f147513b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f147514a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(b.class.getClassLoader());
            if (r3.containsKey("referralCode") == false) goto L5;
            String r32 = r3.getString("referralCode");
        L7:
            return new b(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f147513b = new a(null);
    }

    public b(String r1) {
        this.f147514a = r1;
    }

    public static final b fromBundle(Bundle r1) {
        return f147513b.a(r1);
    }

    public final String a() {
        return this.f147514a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f147514a, ((b) r4).f147514a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f147514a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "ReferralLandingFragmentArgs(referralCode=" + this.f147514a + ')';
    }
}
