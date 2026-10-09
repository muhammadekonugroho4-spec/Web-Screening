package com.stockbit.tradingcommunity.ui.tnc;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: i, reason: collision with root package name */
    public static final a f149954i = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f149955a;

    /* renamed from: b, reason: collision with root package name */
    public final String f149956b;

    /* renamed from: c, reason: collision with root package name */
    public final String f149957c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f149958e;

    /* renamed from: f, reason: collision with root package name */
    public final String f149959f;

    /* renamed from: g, reason: collision with root package name */
    public final int f149960g;

    /* renamed from: h, reason: collision with root package name */
    public final String f149961h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r11) {
            kotlin.jvm.internal.p.l(r11, "bundle");
            r11.setClassLoader(g.class.getClassLoader());
            if (r11.containsKey("url") == false) goto L6;
            String r02 = r11.getString("url");
        L5:
            String r2 = r02;
            String r3 = "";
            if (r11.containsKey("communityName") == false) goto L14;
            String r03 = r11.getString("communityName");
            if (r03 != null) goto L16;
            throw new IllegalArgumentException("Argument \"communityName\" is marked as non-null but was passed a null value.");
        L16:
            if (r11.containsKey("tradingCommunityCode") == false) goto L22;
            String r1 = r11.getString("tradingCommunityCode");
            if (r1 == null) goto L21;
            String r4 = r1;
        L24:
            if (r11.containsKey("leaderUserName") == false) goto L30;
            String r12 = r11.getString("leaderUserName");
            if (r12 == null) goto L29;
            String r5 = r12;
        L32:
            if (r11.containsKey("userName") == false) goto L38;
            String r13 = r11.getString("userName");
            if (r13 == null) goto L37;
            String r6 = r13;
        L40:
            if (r11.containsKey("userPhoneNumber") == false) goto L43;
            r3 = r11.getString("userPhoneNumber");
            if (r3 != null) goto L43;
            throw new IllegalArgumentException("Argument \"userPhoneNumber\" is marked as non-null but was passed a null value.");
        L43:
            String r7 = r3;
            if (r11.containsKey("roomId") == false) goto L50;
            int r14 = r11.getInt("roomId");
        L49:
            int r8 = r14;
            if (r11.containsKey("entryPoint") == false) goto L58;
            String r112 = r11.getString("entryPoint");
            if (r112 == null) goto L57;
        L60:
            return new g(r2, r03, r4, r5, r6, r7, r8, r112);
        L57:
            throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
        L58:
            r112 = "SETTINGS";
            goto L60
        L50:
            r14 = 0;
            goto L49
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
        f149954i = new a(null);
    }

    public g(String r2, String r3, String r4, String r5, String r6, String r7, int r8, String r9) {
        kotlin.jvm.internal.p.l(r3, "communityName");
        kotlin.jvm.internal.p.l(r4, "tradingCommunityCode");
        kotlin.jvm.internal.p.l(r5, "leaderUserName");
        kotlin.jvm.internal.p.l(r6, "userName");
        kotlin.jvm.internal.p.l(r7, "userPhoneNumber");
        kotlin.jvm.internal.p.l(r9, "entryPoint");
        this.f149955a = r2;
        this.f149956b = r3;
        this.f149957c = r4;
        this.d = r5;
        this.f149958e = r6;
        this.f149959f = r7;
        this.f149960g = r8;
        this.f149961h = r9;
    }

    public static final g fromBundle(Bundle r1) {
        return f149954i.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putString("url", this.f149955a);
        r02.putString("communityName", this.f149956b);
        r02.putString("tradingCommunityCode", this.f149957c);
        r02.putString("leaderUserName", this.d);
        r02.putString("userName", this.f149958e);
        r02.putString("userPhoneNumber", this.f149959f);
        r02.putInt("roomId", this.f149960g);
        r02.putString("entryPoint", this.f149961h);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f149955a, r52.f149955a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f149956b, r52.f149956b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f149957c, r52.f149957c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f149958e, r52.f149958e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f149959f, r52.f149959f) == true) goto L27;
        return false;
    L27:
        if (this.f149960g == r52.f149960g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f149961h, r52.f149961h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        String r02 = this.f149955a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((((((r03 * 31) + this.f149956b.hashCode()) * 31) + this.f149957c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149958e.hashCode()) * 31) + this.f149959f.hashCode()) * 31) + Integer.hashCode(this.f149960g)) * 31) + this.f149961h.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "TradingCommunityExistingMemberTnCFragmentArgs(url=" + this.f149955a + ", communityName=" + this.f149956b + ", tradingCommunityCode=" + this.f149957c + ", leaderUserName=" + this.d + ", userName=" + this.f149958e + ", userPhoneNumber=" + this.f149959f + ", roomId=" + this.f149960g + ", entryPoint=" + this.f149961h + ')';
    }

    public /* synthetic */ g(String r2, String r3, String r4, String r5, String r6, String r7, int r8, String r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = "SETTINGS";
    L26:
        int r102 = r8;
        String r112 = r9;
        String r82 = r6;
        String r92 = r7;
        String r62 = r4;
        String r72 = r5;
        this(r2, r3, r62, r72, r82, r92, r102, r112);
    }
}
