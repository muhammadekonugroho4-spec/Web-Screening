package com.stockbit.withdrawaldeposit.ui.history;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class i implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f172678c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f172679a;

    /* renamed from: b, reason: collision with root package name */
    public final String f172680b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(i.class.getClassLoader());
            if (r4.containsKey("keyHistoryPeriod") == false) goto L15;
            String r02 = r4.getString("keyHistoryPeriod");
            if (r4.containsKey("keyHistoryPeriodNavResult") == false) goto L11;
            String r42 = r4.getString("keyHistoryPeriodNavResult");
            if (r42 != null) goto L13;
            throw new IllegalArgumentException("Argument \"keyHistoryPeriodNavResult\" is marked as non-null but was passed a null value.");
        L13:
            return new i(r02, r42);
        L11:
            r42 = "HISTORY_PERIOD";
            goto L13
        L15:
            throw new IllegalArgumentException("Required argument \"keyHistoryPeriod\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f172678c = new a(null);
    }

    public i(String r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "keyHistoryPeriodNavResult");
        this.f172679a = r2;
        this.f172680b = r3;
    }

    public static final i fromBundle(Bundle r1) {
        return f172678c.a(r1);
    }

    public final String a() {
        return this.f172679a;
    }

    public final String b() {
        return this.f172680b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f172679a, r52.f172679a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f172680b, r52.f172680b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f172679a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f172680b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "PeriodeDialogFragmentArgs(keyHistoryPeriod=" + this.f172679a + ", keyHistoryPeriodNavResult=" + this.f172680b + ')';
    }
}
