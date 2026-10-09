package com.stockbit.tipping.ui.updategopayaccount;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f146163b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f146164a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final e a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(e.class.getClassLoader());
            if (r3.containsKey("tippingAvailableCredit") == false) goto L5;
            String r32 = r3.getString("tippingAvailableCredit");
        L7:
            return new e(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f146163b = new a(null);
    }

    public e(String r1) {
        this.f146164a = r1;
    }

    public static final e fromBundle(Bundle r1) {
        return f146163b.a(r1);
    }

    public final String a() {
        return this.f146164a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f146164a, ((e) r4).f146164a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f146164a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "TippingUpdateGopayAccountFragmentArgs(tippingAvailableCredit=" + this.f146164a + ')';
    }
}
