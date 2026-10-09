package com.stockbit.chat.ui.more;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: l, reason: collision with root package name */
    public static final a f56572l = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f56573a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56574b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56575c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56576e;

    /* renamed from: f, reason: collision with root package name */
    public final String f56577f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56578g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56579h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56580i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f56581j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f56582k;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r15) {
            p.l(r15, "bundle");
            r15.setClassLoader(h.class.getClassLoader());
            if (r15.containsKey("chatId") == false) goto L54;
            String r3 = r15.getString("chatId");
            if (r15.containsKey("chatUserName") == false) goto L52;
            String r4 = r15.getString("chatUserName");
            if (r4 == null) goto L50;
            if (r15.containsKey("chatUserId") == false) goto L48;
            String r5 = r15.getString("chatUserId");
            if (r5 == null) goto L46;
            if (r15.containsKey("fullName") == false) goto L44;
            String r6 = r15.getString("fullName");
            if (r15.containsKey("isVerified") == false) goto L42;
            boolean r7 = r15.getBoolean("isVerified");
            if (r15.containsKey("avatar") == false) goto L40;
            String r8 = r15.getString("avatar");
            boolean r2 = false;
            if (r15.containsKey("isBlockedUser") == false) goto L21;
            boolean r9 = r15.getBoolean("isBlockedUser");
        L23:
            if (r15.containsKey("isAdmin") == false) goto L25;
            boolean r10 = r15.getBoolean("isAdmin");
        L27:
            if (r15.containsKey("isDeactivated") == false) goto L29;
            boolean r11 = r15.getBoolean("isDeactivated");
        L31:
            if (r15.containsKey("isAutoShareActive") == false) goto L33;
            boolean r12 = r15.getBoolean("isAutoShareActive");
        L35:
            if (r15.containsKey("isShareValue") == false) goto L38;
            r2 = r15.getBoolean("isShareValue");
        L38:
            return new h(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r2);
        L33:
            r12 = false;
            goto L35
        L29:
            r11 = false;
            goto L31
        L25:
            r10 = false;
            goto L27
        L21:
            r9 = false;
            goto L23
        L40:
            throw new IllegalArgumentException("Required argument \"avatar\" is missing and does not have an android:defaultValue");
        L42:
            throw new IllegalArgumentException("Required argument \"isVerified\" is missing and does not have an android:defaultValue");
        L44:
            throw new IllegalArgumentException("Required argument \"fullName\" is missing and does not have an android:defaultValue");
        L46:
            throw new IllegalArgumentException("Argument \"chatUserId\" is marked as non-null but was passed a null value.");
        L48:
            throw new IllegalArgumentException("Required argument \"chatUserId\" is missing and does not have an android:defaultValue");
        L50:
            throw new IllegalArgumentException("Argument \"chatUserName\" is marked as non-null but was passed a null value.");
        L52:
            throw new IllegalArgumentException("Required argument \"chatUserName\" is missing and does not have an android:defaultValue");
        L54:
            throw new IllegalArgumentException("Required argument \"chatId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f56572l = new a(null);
    }

    public h(String r2, String r3, String r4, String r5, boolean r6, String r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        p.l(r3, "chatUserName");
        p.l(r4, "chatUserId");
        this.f56573a = r2;
        this.f56574b = r3;
        this.f56575c = r4;
        this.d = r5;
        this.f56576e = r6;
        this.f56577f = r7;
        this.f56578g = r8;
        this.f56579h = r9;
        this.f56580i = r10;
        this.f56581j = r11;
        this.f56582k = r12;
    }

    public static final h fromBundle(Bundle r1) {
        return f56572l.a(r1);
    }

    public final String a() {
        return this.f56573a;
    }

    public final String b() {
        return this.f56575c;
    }

    public final String c() {
        return this.f56574b;
    }

    public final boolean d() {
        return this.f56579h;
    }

    public final boolean e() {
        return this.f56581j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f56573a, r52.f56573a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f56574b, r52.f56574b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f56575c, r52.f56575c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f56576e == r52.f56576e) goto L24;
        return false;
    L24:
        if (p.g(this.f56577f, r52.f56577f) == true) goto L27;
        return false;
    L27:
        if (this.f56578g == r52.f56578g) goto L30;
        return false;
    L30:
        if (this.f56579h == r52.f56579h) goto L33;
        return false;
    L33:
        if (this.f56580i == r52.f56580i) goto L36;
        return false;
    L36:
        if (this.f56581j == r52.f56581j) goto L39;
        return false;
    L39:
        if (this.f56582k == r52.f56582k) goto L41;
        return false;
    L41:
        return true;
    }

    public final boolean f() {
        return this.f56578g;
    }

    public final boolean g() {
        return this.f56580i;
    }

    public final boolean h() {
        return this.f56582k;
    }

    public int hashCode() {
        String r02 = this.f56573a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((((r03 * 31) + this.f56574b.hashCode()) * 31) + this.f56575c.hashCode()) * 31;
        String r2 = this.d;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (((r04 + r22) * 31) + Boolean.hashCode(this.f56576e)) * 31;
        String r23 = this.f56577f;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((((((((((r05 + r1) * 31) + Boolean.hashCode(this.f56578g)) * 31) + Boolean.hashCode(this.f56579h)) * 31) + Boolean.hashCode(this.f56580i)) * 31) + Boolean.hashCode(this.f56581j)) * 31) + Boolean.hashCode(this.f56582k);
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ChatMoreFragmentArgs(chatId=" + this.f56573a + ", chatUserName=" + this.f56574b + ", chatUserId=" + this.f56575c + ", fullName=" + this.d + ", isVerified=" + this.f56576e + ", avatar=" + this.f56577f + ", isBlockedUser=" + this.f56578g + ", isAdmin=" + this.f56579h + ", isDeactivated=" + this.f56580i + ", isAutoShareActive=" + this.f56581j + ", isShareValue=" + this.f56582k + ')';
    }
}
