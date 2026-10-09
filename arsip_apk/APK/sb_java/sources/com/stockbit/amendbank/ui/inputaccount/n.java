package com.stockbit.amendbank.ui.inputaccount;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes6.dex */
public final class n implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46423b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f46424a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(n.class.getClassLoader());
            if (r3.containsKey("changeToken") == false) goto L11;
            String r32 = r3.getString("changeToken");
            if (r32 == null) goto L9;
            return new n(r32);
        L9:
            throw new IllegalArgumentException("Argument \"changeToken\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"changeToken\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f46423b = new a(null);
    }

    public n(String r2) {
        kotlin.jvm.internal.p.l(r2, "changeToken");
        this.f46424a = r2;
    }

    public static final n fromBundle(Bundle r1) {
        return f46423b.a(r1);
    }

    public final String a() {
        return this.f46424a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof n) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f46424a, ((n) r4).f46424a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f46424a.hashCode();
    }

    public String toString() {
        return "AmendBankInputFragmentArgs(changeToken=" + this.f46424a + ')';
    }
}
