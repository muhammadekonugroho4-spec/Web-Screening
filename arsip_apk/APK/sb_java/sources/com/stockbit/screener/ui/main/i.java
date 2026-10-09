package com.stockbit.screener.ui.main;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class i implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f132611e = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f132612a;

    /* renamed from: b, reason: collision with root package name */
    public final long f132613b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132614c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r8) {
            kotlin.jvm.internal.p.l(r8, "bundle");
            r8.setClassLoader(i.class.getClassLoader());
            if (r8.containsKey("isFromDeeplink") == false) goto L6;
            boolean r02 = r8.getBoolean("isFromDeeplink");
        L5:
            boolean r2 = r02;
            if (r8.containsKey("presetId") == false) goto L11;
            long r03 = r8.getLong("presetId");
        L10:
            long r3 = r03;
            String r5 = null;
            if (r8.containsKey("presetDetail") == false) goto L15;
            String r04 = r8.getString("presetDetail");
        L17:
            if (r8.containsKey("requestKey") == false) goto L20;
            r5 = r8.getString("requestKey");
        L20:
            return new i(r2, r3, r04, r5);
        L15:
            r04 = null;
            goto L17
        L11:
            r03 = 0;
            goto L10
        L6:
            r02 = false;
            goto L5
        }

        public a() {
        }
    }

    static {
        f132611e = new a(null);
    }

    public i(boolean r1, long r2, String r4, String r5) {
        this.f132612a = r1;
        this.f132613b = r2;
        this.f132614c = r4;
        this.d = r5;
    }

    public static final i fromBundle(Bundle r1) {
        return f132611e.a(r1);
    }

    public final String a() {
        return this.f132614c;
    }

    public final long b() {
        return this.f132613b;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.f132612a;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isFromDeeplink", this.f132612a);
        r02.putLong("presetId", this.f132613b);
        r02.putString("presetDetail", this.f132614c);
        r02.putString("requestKey", this.d);
        return r02;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof i) == true) goto L8;
        return false;
    L8:
        i r82 = (i) r8;
        if (this.f132612a == r82.f132612a) goto L12;
        return false;
    L12:
        if (this.f132613b == r82.f132613b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f132614c, r82.f132614c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((Boolean.hashCode(this.f132612a) * 31) + Long.hashCode(this.f132613b)) * 31;
        String r1 = this.f132614c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ScreenerMainFragmentArgs(isFromDeeplink=" + this.f132612a + ", presetId=" + this.f132613b + ", presetDetail=" + this.f132614c + ", requestKey=" + this.d + ')';
    }

    public /* synthetic */ i(boolean r2, long r3, String r5, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        String r82 = null;
    L16:
        this(r2, r3, r5, r82);
        return;
    L15:
        r82 = r6;
        goto L16
    }
}
