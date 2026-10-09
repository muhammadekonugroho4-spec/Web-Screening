package com.stockbit.tradingcommunity.ui.success;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: j, reason: collision with root package name */
    public static final a f149872j = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f149873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f149874b;

    /* renamed from: c, reason: collision with root package name */
    public final String f149875c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f149876e;

    /* renamed from: f, reason: collision with root package name */
    public final String f149877f;

    /* renamed from: g, reason: collision with root package name */
    public final int f149878g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f149879h;

    /* renamed from: i, reason: collision with root package name */
    public final String f149880i;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r12) {
            p.l(r12, "bundle");
            r12.setClassLoader(g.class.getClassLoader());
            String r2 = "";
            if (r12.containsKey("tradingCommunityCode") == false) goto L9;
            String r02 = r12.getString("tradingCommunityCode");
            if (r02 == null) goto L8;
            String r3 = r02;
        L11:
            if (r12.containsKey("tradingCommunityName") == false) goto L17;
            String r03 = r12.getString("tradingCommunityName");
            if (r03 == null) goto L16;
            String r4 = r03;
        L19:
            if (r12.containsKey("leaderUserName") == false) goto L25;
            String r04 = r12.getString("leaderUserName");
            if (r04 == null) goto L24;
            String r5 = r04;
        L27:
            if (r12.containsKey("userName") == false) goto L33;
            String r05 = r12.getString("userName");
            if (r05 == null) goto L32;
            String r6 = r05;
        L35:
            if (r12.containsKey("userPhoneNumber") == false) goto L38;
            r2 = r12.getString("userPhoneNumber");
            if (r2 != null) goto L38;
            throw new IllegalArgumentException("Argument \"userPhoneNumber\" is marked as non-null but was passed a null value.");
        L38:
            String r7 = r2;
            boolean r22 = false;
            if (r12.containsKey("roomId") == false) goto L44;
            int r8 = r12.getInt("roomId");
        L46:
            if (r12.containsKey("isExistingMember") == false) goto L48;
            r22 = r12.getBoolean("isExistingMember");
        L48:
            boolean r9 = r22;
            if (r12.containsKey("isLeaderHasPILicense") == false) goto L61;
            boolean r23 = r12.getBoolean("isLeaderHasPILicense");
            if (r12.containsKey("entryPoint") == false) goto L57;
            String r122 = r12.getString("entryPoint");
            if (r122 == null) goto L56;
        L59:
            return new g(r23, r3, r4, r5, r6, r7, r8, r9, r122);
        L56:
            throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
        L57:
            r122 = "SETTINGS";
            goto L59
        L61:
            throw new IllegalArgumentException("Required argument \"isLeaderHasPILicense\" is missing and does not have an android:defaultValue");
        L44:
            r8 = 0;
            goto L46
        L32:
            throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
        L33:
            r6 = "";
            goto L35
        L24:
            throw new IllegalArgumentException("Argument \"leaderUserName\" is marked as non-null but was passed a null value.");
        L25:
            r5 = "";
            goto L27
        L16:
            throw new IllegalArgumentException("Argument \"tradingCommunityName\" is marked as non-null but was passed a null value.");
        L17:
            r4 = "";
            goto L19
        L8:
            throw new IllegalArgumentException("Argument \"tradingCommunityCode\" is marked as non-null but was passed a null value.");
        L9:
            r3 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f149872j = new a(null);
    }

    public g(boolean r2, String r3, String r4, String r5, String r6, String r7, int r8, boolean r9, String r10) {
        p.l(r3, "tradingCommunityCode");
        p.l(r4, "tradingCommunityName");
        p.l(r5, "leaderUserName");
        p.l(r6, "userName");
        p.l(r7, "userPhoneNumber");
        p.l(r10, "entryPoint");
        this.f149873a = r2;
        this.f149874b = r3;
        this.f149875c = r4;
        this.d = r5;
        this.f149876e = r6;
        this.f149877f = r7;
        this.f149878g = r8;
        this.f149879h = r9;
        this.f149880i = r10;
    }

    public static final g fromBundle(Bundle r1) {
        return f149872j.a(r1);
    }

    public final String a() {
        return this.f149880i;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.f149878g;
    }

    public final String d() {
        return this.f149874b;
    }

    public final String e() {
        return this.f149875c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f149873a == r52.f149873a) goto L12;
        return false;
    L12:
        if (p.g(this.f149874b, r52.f149874b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f149875c, r52.f149875c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f149876e, r52.f149876e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f149877f, r52.f149877f) == true) goto L27;
        return false;
    L27:
        if (this.f149878g == r52.f149878g) goto L30;
        return false;
    L30:
        if (this.f149879h == r52.f149879h) goto L33;
        return false;
    L33:
        if (p.g(this.f149880i, r52.f149880i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f149876e;
    }

    public final String g() {
        return this.f149877f;
    }

    public final boolean h() {
        return this.f149879h;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f149873a) * 31) + this.f149874b.hashCode()) * 31) + this.f149875c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149876e.hashCode()) * 31) + this.f149877f.hashCode()) * 31) + Integer.hashCode(this.f149878g)) * 31) + Boolean.hashCode(this.f149879h)) * 31) + this.f149880i.hashCode();
    }

    public final boolean i() {
        return this.f149873a;
    }

    public String toString() {
        return "SuccessTradingCommunityFragmentArgs(isLeaderHasPILicense=" + this.f149873a + ", tradingCommunityCode=" + this.f149874b + ", tradingCommunityName=" + this.f149875c + ", leaderUserName=" + this.d + ", userName=" + this.f149876e + ", userPhoneNumber=" + this.f149877f + ", roomId=" + this.f149878g + ", isExistingMember=" + this.f149879h + ", entryPoint=" + this.f149880i + ')';
    }
}
