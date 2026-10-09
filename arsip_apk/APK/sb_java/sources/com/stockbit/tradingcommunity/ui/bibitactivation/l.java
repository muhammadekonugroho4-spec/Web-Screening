package com.stockbit.tradingcommunity.ui.bibitactivation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class l implements InterfaceC4094y {

    /* renamed from: j, reason: collision with root package name */
    public static final a f149378j = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f149379a;

    /* renamed from: b, reason: collision with root package name */
    public final String f149380b;

    /* renamed from: c, reason: collision with root package name */
    public final String f149381c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f149382e;

    /* renamed from: f, reason: collision with root package name */
    public final String f149383f;

    /* renamed from: g, reason: collision with root package name */
    public final int f149384g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f149385h;

    /* renamed from: i, reason: collision with root package name */
    public final String f149386i;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final l a(Bundle r12) {
            kotlin.jvm.internal.p.l(r12, "bundle");
            r12.setClassLoader(l.class.getClassLoader());
            if (r12.containsKey("url") == false) goto L6;
            String r02 = r12.getString("url");
        L5:
            String r2 = r02;
            String r3 = "";
            if (r12.containsKey("communityName") == false) goto L14;
            String r03 = r12.getString("communityName");
            if (r03 != null) goto L16;
            throw new IllegalArgumentException("Argument \"communityName\" is marked as non-null but was passed a null value.");
        L16:
            if (r12.containsKey("tradingCommunityCode") == false) goto L22;
            String r1 = r12.getString("tradingCommunityCode");
            if (r1 == null) goto L21;
            String r4 = r1;
        L24:
            if (r12.containsKey("leaderUserName") == false) goto L30;
            String r13 = r12.getString("leaderUserName");
            if (r13 == null) goto L29;
            String r5 = r13;
        L32:
            if (r12.containsKey("userName") == false) goto L38;
            String r14 = r12.getString("userName");
            if (r14 == null) goto L37;
            String r6 = r14;
        L40:
            if (r12.containsKey("userPhoneNumber") == false) goto L43;
            r3 = r12.getString("userPhoneNumber");
            if (r3 != null) goto L43;
            throw new IllegalArgumentException("Argument \"userPhoneNumber\" is marked as non-null but was passed a null value.");
        L43:
            String r7 = r3;
            boolean r8 = false;
            if (r12.containsKey("roomId") == false) goto L49;
            int r15 = r12.getInt("roomId");
        L51:
            if (r12.containsKey("isExistingMember") == false) goto L53;
            r8 = r12.getBoolean("isExistingMember");
        L53:
            boolean r9 = r8;
            if (r12.containsKey("entryPoint") == false) goto L60;
            String r122 = r12.getString("entryPoint");
            if (r122 == null) goto L59;
        L62:
            return new l(r2, r03, r4, r5, r6, r7, r15, r9, r122);
        L59:
            throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
        L60:
            r122 = "SETTINGS";
            goto L62
        L49:
            r15 = 0;
            goto L51
        L37:
            throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
        L38:
            r6 = "";
            goto L40
        L29:
            throw new IllegalArgumentException("Argument \"leaderUserName\" is marked as non-null but was passed a null value.");
        L30:
            r5 = "";
            goto L32
        L21:
            throw new IllegalArgumentException("Argument \"tradingCommunityCode\" is marked as non-null but was passed a null value.");
        L22:
            r4 = "";
            goto L24
        L14:
            r03 = "";
            goto L16
        L6:
            r02 = null;
            goto L5
        }

        public a() {
        }
    }

    static {
        f149378j = new a(null);
    }

    public l(String r2, String r3, String r4, String r5, String r6, String r7, int r8, boolean r9, String r10) {
        kotlin.jvm.internal.p.l(r3, "communityName");
        kotlin.jvm.internal.p.l(r4, "tradingCommunityCode");
        kotlin.jvm.internal.p.l(r5, "leaderUserName");
        kotlin.jvm.internal.p.l(r6, "userName");
        kotlin.jvm.internal.p.l(r7, "userPhoneNumber");
        kotlin.jvm.internal.p.l(r10, "entryPoint");
        this.f149379a = r2;
        this.f149380b = r3;
        this.f149381c = r4;
        this.d = r5;
        this.f149382e = r6;
        this.f149383f = r7;
        this.f149384g = r8;
        this.f149385h = r9;
        this.f149386i = r10;
    }

    public static final l fromBundle(Bundle r1) {
        return f149378j.a(r1);
    }

    public final String a() {
        return this.f149380b;
    }

    public final String b() {
        return this.f149386i;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.f149384g;
    }

    public final String e() {
        return this.f149381c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f149379a, r52.f149379a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f149380b, r52.f149380b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f149381c, r52.f149381c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f149382e, r52.f149382e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f149383f, r52.f149383f) == true) goto L27;
        return false;
    L27:
        if (this.f149384g == r52.f149384g) goto L30;
        return false;
    L30:
        if (this.f149385h == r52.f149385h) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f149386i, r52.f149386i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f149379a;
    }

    public final String g() {
        return this.f149382e;
    }

    public final String h() {
        return this.f149383f;
    }

    public int hashCode() {
        String r02 = this.f149379a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((((((((r03 * 31) + this.f149380b.hashCode()) * 31) + this.f149381c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149382e.hashCode()) * 31) + this.f149383f.hashCode()) * 31) + Integer.hashCode(this.f149384g)) * 31) + Boolean.hashCode(this.f149385h)) * 31) + this.f149386i.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public final boolean i() {
        return this.f149385h;
    }

    public String toString() {
        return "TradingCommunityBibitActivationFragmentArgs(url=" + this.f149379a + ", communityName=" + this.f149380b + ", tradingCommunityCode=" + this.f149381c + ", leaderUserName=" + this.d + ", userName=" + this.f149382e + ", userPhoneNumber=" + this.f149383f + ", roomId=" + this.f149384g + ", isExistingMember=" + this.f149385h + ", entryPoint=" + this.f149386i + ')';
    }
}
