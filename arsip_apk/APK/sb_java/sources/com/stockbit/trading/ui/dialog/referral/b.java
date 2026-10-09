package com.stockbit.trading.ui.dialog.referral;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f147395c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f147396a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f147397b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(b.class.getClassLoader());
            if (r4.containsKey("referralCode") == false) goto L5;
            String r02 = r4.getString("referralCode");
        L7:
            if (r4.containsKey("isFromSocialRegister") == false) goto L9;
            boolean r42 = r4.getBoolean("isFromSocialRegister");
        L11:
            return new b(r02, r42);
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
        f147395c = new a(null);
    }

    public b(String r1, boolean r2) {
        this.f147396a = r1;
        this.f147397b = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f147395c.a(r1);
    }

    public final String a() {
        return this.f147396a;
    }

    public final boolean b() {
        return this.f147397b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f147396a, r52.f147396a) == true) goto L12;
        return false;
    L12:
        if (this.f147397b == r52.f147397b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f147396a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f147397b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "ReferralDialogFragmentArgs(referralCode=" + this.f147396a + ", isFromSocialRegister=" + this.f147397b + ')';
    }
}
