package com.stockbit.cashsweep.ui.screen.history;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f52884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52885b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52886c;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final c a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(c.class.getClassLoader());
            String r2 = null;
            if (r6.containsKey("command") == false) goto L5;
            String r02 = r6.getString("command");
        L7:
            if (r6.containsKey(Constants.KEY_DATE) == false) goto L9;
            String r1 = r6.getString(Constants.KEY_DATE);
        L11:
            if (r6.containsKey("amount") == false) goto L14;
            r2 = r6.getString("amount");
        L14:
            return new c(r02, r1, r2);
        L9:
            r1 = null;
            goto L11
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public c(String r1, String r2, String r3) {
        this.f52884a = r1;
        this.f52885b = r2;
        this.f52886c = r3;
    }

    public static final c fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f52886c;
    }

    public final String b() {
        return this.f52884a;
    }

    public final String c() {
        return this.f52885b;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("command", this.f52884a);
        r02.putString(Constants.KEY_DATE, this.f52885b);
        r02.putString("amount", this.f52886c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f52884a, r52.f52884a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f52885b, r52.f52885b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f52886c, r52.f52886c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f52884a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f52885b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f52886c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CashSweepHistoryDetailFragmentArgs(command=" + this.f52884a + ", date=" + this.f52885b + ", amount=" + this.f52886c + ')';
    }
}
