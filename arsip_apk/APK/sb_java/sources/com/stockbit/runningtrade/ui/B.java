package com.stockbit.runningtrade.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class B implements InterfaceC4094y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f131143g = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f131144a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131145b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f131146c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131147e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f131148f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final B a(Bundle r11) {
            kotlin.jvm.internal.p.l(r11, "bundle");
            r11.setClassLoader(B.class.getClassLoader());
            boolean r2 = false;
            if (r11.containsKey("isFromDeeplink") == false) goto L5;
            boolean r6 = r11.getBoolean("isFromDeeplink");
        L7:
            if (r11.containsKey("EXTRA_SYMBOL") == false) goto L33;
            String r4 = r11.getString("EXTRA_SYMBOL");
            if (r11.containsKey("EXTRA_SYMBOL_LOGO") == false) goto L31;
            String r5 = r11.getString("EXTRA_SYMBOL_LOGO");
            String r3 = "";
            if (r11.containsKey("filterDate") == false) goto L17;
            String r02 = r11.getString("filterDate");
            if (r02 == null) goto L16;
            String r7 = r02;
        L19:
            if (r11.containsKey("filterMaxDate") == false) goto L22;
            r3 = r11.getString("filterMaxDate");
            if (r3 != null) goto L22;
            throw new IllegalArgumentException("Argument \"filterMaxDate\" is marked as non-null but was passed a null value.");
        L22:
            String r8 = r3;
            if (r11.containsKey("isOpenMergeView") == false) goto L29;
            r2 = r11.getBoolean("isOpenMergeView");
        L29:
            return new B(r4, r5, r6, r7, r8, r2);
        L16:
            throw new IllegalArgumentException("Argument \"filterDate\" is marked as non-null but was passed a null value.");
        L17:
            r7 = "";
            goto L19
        L31:
            throw new IllegalArgumentException("Required argument \"EXTRA_SYMBOL_LOGO\" is missing and does not have an android:defaultValue");
        L33:
            throw new IllegalArgumentException("Required argument \"EXTRA_SYMBOL\" is missing and does not have an android:defaultValue");
        L5:
            r6 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f131143g = new a(null);
    }

    public B(String r2, String r3, boolean r4, String r5, String r6, boolean r7) {
        kotlin.jvm.internal.p.l(r5, "filterDate");
        kotlin.jvm.internal.p.l(r6, "filterMaxDate");
        this.f131144a = r2;
        this.f131145b = r3;
        this.f131146c = r4;
        this.d = r5;
        this.f131147e = r6;
        this.f131148f = r7;
    }

    public static final B fromBundle(Bundle r1) {
        return f131143g.a(r1);
    }

    public final String a() {
        return this.f131144a;
    }

    public final String b() {
        return this.f131145b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f131147e;
    }

    public final boolean e() {
        return this.f131146c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof B) == true) goto L8;
        return false;
    L8:
        B r52 = (B) r5;
        if (kotlin.jvm.internal.p.g(this.f131144a, r52.f131144a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f131145b, r52.f131145b) == true) goto L15;
        return false;
    L15:
        if (this.f131146c == r52.f131146c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f131147e, r52.f131147e) == true) goto L24;
        return false;
    L24:
        if (this.f131148f == r52.f131148f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f131148f;
    }

    public final Bundle g() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isFromDeeplink", this.f131146c);
        r02.putString("EXTRA_SYMBOL", this.f131144a);
        r02.putString("EXTRA_SYMBOL_LOGO", this.f131145b);
        r02.putString("filterDate", this.d);
        r02.putString("filterMaxDate", this.f131147e);
        r02.putBoolean("isOpenMergeView", this.f131148f);
        return r02;
    }

    public int hashCode() {
        String r02 = this.f131144a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f131145b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return ((((((((r04 + r1) * 31) + Boolean.hashCode(this.f131146c)) * 31) + this.d.hashCode()) * 31) + this.f131147e.hashCode()) * 31) + Boolean.hashCode(this.f131148f);
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "RunningTradeFragmentArgs(EXTRASYMBOL=" + this.f131144a + ", EXTRASYMBOLLOGO=" + this.f131145b + ", isFromDeeplink=" + this.f131146c + ", filterDate=" + this.d + ", filterMaxDate=" + this.f131147e + ", isOpenMergeView=" + this.f131148f + ')';
    }

    public /* synthetic */ B(String r3, String r4, boolean r5, String r6, String r7, boolean r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 4) == 0) goto L6;
        r5 = false;
    L6:
        if ((r9 & 8) == 0) goto L9;
        r6 = "";
    L9:
        if ((r9 & 16) == 0) goto L12;
        r7 = "";
    L12:
        if ((r9 & 32) == 0) goto L15;
        boolean r92 = false;
    L14:
        String r82 = r7;
        this(r3, r4, r5, r6, r82, r92);
        return;
    L15:
        r92 = r8;
        goto L14
    }
}
