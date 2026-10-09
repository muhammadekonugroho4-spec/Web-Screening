package com.stockbit.tradingcommunity.ui.current;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class n implements InterfaceC4094y {

    /* renamed from: m, reason: collision with root package name */
    public static final a f149506m = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f149507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f149508b;

    /* renamed from: c, reason: collision with root package name */
    public final String f149509c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f149510e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f149511f;

    /* renamed from: g, reason: collision with root package name */
    public final String f149512g;

    /* renamed from: h, reason: collision with root package name */
    public final String f149513h;

    /* renamed from: i, reason: collision with root package name */
    public final String f149514i;

    /* renamed from: j, reason: collision with root package name */
    public final String f149515j;

    /* renamed from: k, reason: collision with root package name */
    public final String f149516k;

    /* renamed from: l, reason: collision with root package name */
    public final String f149517l;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n a(Bundle r15) {
            kotlin.jvm.internal.p.l(r15, "bundle");
            r15.setClassLoader(n.class.getClassLoader());
            String r2 = "";
            if (r15.containsKey("communityName") == false) goto L9;
            String r02 = r15.getString("communityName");
            if (r02 == null) goto L8;
            String r3 = r02;
        L11:
            if (r15.containsKey("totalBuy") == false) goto L17;
            String r03 = r15.getString("totalBuy");
            if (r03 == null) goto L16;
            String r4 = r03;
        L19:
            if (r15.containsKey("totalSell") == false) goto L25;
            String r04 = r15.getString("totalSell");
            if (r04 == null) goto L24;
            String r5 = r04;
        L27:
            if (r15.containsKey("leaveDate") == false) goto L33;
            String r05 = r15.getString("leaveDate");
            if (r05 == null) goto L32;
            String r6 = r05;
        L35:
            if (r15.containsKey("ableToLeave") == false) goto L38;
            boolean r06 = r15.getBoolean("ableToLeave");
        L37:
            boolean r7 = r06;
            if (r15.containsKey("leaderUserName") == false) goto L46;
            String r07 = r15.getString("leaderUserName");
            if (r07 == null) goto L45;
            String r8 = r07;
        L48:
            if (r15.containsKey("leaderFullName") == false) goto L54;
            String r08 = r15.getString("leaderFullName");
            if (r08 == null) goto L53;
            String r9 = r08;
        L56:
            if (r15.containsKey("userName") == false) goto L62;
            String r09 = r15.getString("userName");
            if (r09 == null) goto L61;
            String r10 = r09;
        L64:
            if (r15.containsKey("userPhoneNumber") == false) goto L70;
            String r010 = r15.getString("userPhoneNumber");
            if (r010 == null) goto L69;
            String r11 = r010;
        L72:
            if (r15.containsKey("bibitLinkageState") == false) goto L75;
            r2 = r15.getString("bibitLinkageState");
            if (r2 != null) goto L75;
            throw new IllegalArgumentException("Argument \"bibitLinkageState\" is marked as non-null but was passed a null value.");
        L75:
            String r12 = r2;
            if (r15.containsKey("isLeaderHasPILicense") == false) goto L91;
            boolean r22 = r15.getBoolean("isLeaderHasPILicense");
            if (r15.containsKey("entryPoint") == false) goto L87;
            String r152 = r15.getString("entryPoint");
            if (r152 == null) goto L86;
        L89:
            return new n(r22, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r152);
        L86:
            throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
        L87:
            r152 = "SETTINGS";
            goto L89
        L91:
            throw new IllegalArgumentException("Required argument \"isLeaderHasPILicense\" is missing and does not have an android:defaultValue");
        L69:
            throw new IllegalArgumentException("Argument \"userPhoneNumber\" is marked as non-null but was passed a null value.");
        L70:
            r11 = "";
            goto L72
        L61:
            throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
        L62:
            r10 = "";
            goto L64
        L53:
            throw new IllegalArgumentException("Argument \"leaderFullName\" is marked as non-null but was passed a null value.");
        L54:
            r9 = "";
            goto L56
        L45:
            throw new IllegalArgumentException("Argument \"leaderUserName\" is marked as non-null but was passed a null value.");
        L46:
            r8 = "";
            goto L48
        L38:
            r06 = false;
            goto L37
        L32:
            throw new IllegalArgumentException("Argument \"leaveDate\" is marked as non-null but was passed a null value.");
        L33:
            r6 = "";
            goto L35
        L24:
            throw new IllegalArgumentException("Argument \"totalSell\" is marked as non-null but was passed a null value.");
        L25:
            r5 = "";
            goto L27
        L16:
            throw new IllegalArgumentException("Argument \"totalBuy\" is marked as non-null but was passed a null value.");
        L17:
            r4 = "";
            goto L19
        L8:
            throw new IllegalArgumentException("Argument \"communityName\" is marked as non-null but was passed a null value.");
        L9:
            r3 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f149506m = new a(null);
    }

    public n(boolean r2, String r3, String r4, String r5, String r6, boolean r7, String r8, String r9, String r10, String r11, String r12, String r13) {
        kotlin.jvm.internal.p.l(r3, "communityName");
        kotlin.jvm.internal.p.l(r4, "totalBuy");
        kotlin.jvm.internal.p.l(r5, "totalSell");
        kotlin.jvm.internal.p.l(r6, "leaveDate");
        kotlin.jvm.internal.p.l(r8, "leaderUserName");
        kotlin.jvm.internal.p.l(r9, "leaderFullName");
        kotlin.jvm.internal.p.l(r10, "userName");
        kotlin.jvm.internal.p.l(r11, "userPhoneNumber");
        kotlin.jvm.internal.p.l(r12, "bibitLinkageState");
        kotlin.jvm.internal.p.l(r13, "entryPoint");
        this.f149507a = r2;
        this.f149508b = r3;
        this.f149509c = r4;
        this.d = r5;
        this.f149510e = r6;
        this.f149511f = r7;
        this.f149512g = r8;
        this.f149513h = r9;
        this.f149514i = r10;
        this.f149515j = r11;
        this.f149516k = r12;
        this.f149517l = r13;
    }

    public static final n fromBundle(Bundle r1) {
        return f149506m.a(r1);
    }

    public final boolean a() {
        return this.f149511f;
    }

    public final String b() {
        return this.f149516k;
    }

    public final String c() {
        return this.f149508b;
    }

    public final String d() {
        return this.f149513h;
    }

    public final String e() {
        return this.f149512g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (this.f149507a == r52.f149507a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f149508b, r52.f149508b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f149509c, r52.f149509c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f149510e, r52.f149510e) == true) goto L24;
        return false;
    L24:
        if (this.f149511f == r52.f149511f) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f149512g, r52.f149512g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f149513h, r52.f149513h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f149514i, r52.f149514i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f149515j, r52.f149515j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f149516k, r52.f149516k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f149517l, r52.f149517l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f149510e;
    }

    public final String g() {
        return this.f149509c;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.f149507a) * 31) + this.f149508b.hashCode()) * 31) + this.f149509c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149510e.hashCode()) * 31) + Boolean.hashCode(this.f149511f)) * 31) + this.f149512g.hashCode()) * 31) + this.f149513h.hashCode()) * 31) + this.f149514i.hashCode()) * 31) + this.f149515j.hashCode()) * 31) + this.f149516k.hashCode()) * 31) + this.f149517l.hashCode();
    }

    public final String i() {
        return this.f149514i;
    }

    public final String j() {
        return this.f149515j;
    }

    public final boolean k() {
        return this.f149507a;
    }

    public String toString() {
        return "CurrentCommunityFragmentArgs(isLeaderHasPILicense=" + this.f149507a + ", communityName=" + this.f149508b + ", totalBuy=" + this.f149509c + ", totalSell=" + this.d + ", leaveDate=" + this.f149510e + ", ableToLeave=" + this.f149511f + ", leaderUserName=" + this.f149512g + ", leaderFullName=" + this.f149513h + ", userName=" + this.f149514i + ", userPhoneNumber=" + this.f149515j + ", bibitLinkageState=" + this.f149516k + ", entryPoint=" + this.f149517l + ')';
    }
}
