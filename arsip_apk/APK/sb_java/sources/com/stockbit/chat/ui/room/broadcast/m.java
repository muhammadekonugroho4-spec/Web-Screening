package com.stockbit.chat.ui.room.broadcast;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class m implements InterfaceC4094y {

    /* renamed from: i, reason: collision with root package name */
    public static final a f58133i = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f58134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58135b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58136c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f58137e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58138f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58139g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58140h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a(Bundle r12) {
            kotlin.jvm.internal.p.l(r12, "bundle");
            r12.setClassLoader(m.class.getClassLoader());
            if (r12.containsKey("type") == false) goto L41;
            String r3 = r12.getString("type");
            if (r3 == null) goto L39;
            if (r12.containsKey("chatId") == false) goto L37;
            String r4 = r12.getString("chatId");
            String r2 = null;
            if (r12.containsKey("chatUserName") == false) goto L11;
            String r5 = r12.getString("chatUserName");
        L13:
            if (r12.containsKey("userId") == false) goto L15;
            r2 = r12.getString("userId");
        L15:
            String r6 = r2;
            if (r12.containsKey("avatar") == false) goto L22;
            String r02 = r12.getString("avatar");
            if (r02 == null) goto L21;
        L19:
            String r7 = r02;
            boolean r22 = false;
            if (r12.containsKey("isVerified") == false) goto L26;
            boolean r8 = r12.getBoolean("isVerified");
        L28:
            if (r12.containsKey("isBlocked") == false) goto L30;
            boolean r9 = r12.getBoolean("isBlocked");
        L32:
            if (r12.containsKey("isDeactivated") == false) goto L35;
            r22 = r12.getBoolean("isDeactivated");
        L35:
            return new m(r3, r4, r5, r6, r7, r8, r9, r22);
        L30:
            r9 = false;
            goto L32
        L26:
            r8 = false;
            goto L28
        L21:
            throw new IllegalArgumentException("Argument \"avatar\" is marked as non-null but was passed a null value.");
        L22:
            r02 = "";
            goto L19
        L11:
            r5 = null;
            goto L13
        L37:
            throw new IllegalArgumentException("Required argument \"chatId\" is missing and does not have an android:defaultValue");
        L39:
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        L41:
            throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f58133i = new a(null);
    }

    public m(String r2, String r3, String r4, String r5, String r6, boolean r7, boolean r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "type");
        kotlin.jvm.internal.p.l(r6, "avatar");
        this.f58134a = r2;
        this.f58135b = r3;
        this.f58136c = r4;
        this.d = r5;
        this.f58137e = r6;
        this.f58138f = r7;
        this.f58139g = r8;
        this.f58140h = r9;
    }

    public static final m fromBundle(Bundle r1) {
        return f58133i.a(r1);
    }

    public final String a() {
        return this.f58137e;
    }

    public final String b() {
        return this.f58135b;
    }

    public final String c() {
        return this.f58136c;
    }

    public final String d() {
        return this.f58134a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f58134a, r52.f58134a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f58135b, r52.f58135b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f58136c, r52.f58136c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f58137e, r52.f58137e) == true) goto L24;
        return false;
    L24:
        if (this.f58138f == r52.f58138f) goto L27;
        return false;
    L27:
        if (this.f58139g == r52.f58139g) goto L30;
        return false;
    L30:
        if (this.f58140h == r52.f58140h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f58139g;
    }

    public final boolean g() {
        return this.f58140h;
    }

    public final boolean h() {
        return this.f58138f;
    }

    public int hashCode() {
        int r02 = this.f58134a.hashCode() * 31;
        String r1 = this.f58135b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f58136c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((((((((r04 + r2) * 31) + this.f58137e.hashCode()) * 31) + Boolean.hashCode(this.f58138f)) * 31) + Boolean.hashCode(this.f58139g)) * 31) + Boolean.hashCode(this.f58140h);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final Bundle i() {
        Bundle r02 = new Bundle();
        r02.putString("type", this.f58134a);
        r02.putString("chatId", this.f58135b);
        r02.putString("chatUserName", this.f58136c);
        r02.putString("userId", this.d);
        r02.putString("avatar", this.f58137e);
        r02.putBoolean("isVerified", this.f58138f);
        r02.putBoolean("isBlocked", this.f58139g);
        r02.putBoolean("isDeactivated", this.f58140h);
        return r02;
    }

    public String toString() {
        return "ChatBroadcastRoomFragmentArgs(type=" + this.f58134a + ", chatId=" + this.f58135b + ", chatUserName=" + this.f58136c + ", userId=" + this.d + ", avatar=" + this.f58137e + ", isVerified=" + this.f58138f + ", isBlocked=" + this.f58139g + ", isDeactivated=" + this.f58140h + ')';
    }

    public /* synthetic */ m(String r2, String r3, String r4, String r5, String r6, boolean r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 4) == 0) goto L6;
        r4 = null;
    L6:
        if ((r10 & 8) == 0) goto L9;
        r5 = null;
    L9:
        if ((r10 & 16) == 0) goto L12;
        r6 = "";
    L12:
        if ((r10 & 32) == 0) goto L15;
        r7 = false;
    L15:
        if ((r10 & 64) == 0) goto L18;
        r8 = false;
    L18:
        if ((r10 & 128) == 0) goto L21;
        boolean r102 = false;
    L20:
        boolean r92 = r8;
        boolean r82 = r7;
        String r72 = r6;
        this(r2, r3, r4, r5, r72, r82, r92, r102);
        return;
    L21:
        r102 = r9;
        goto L20
    }
}
