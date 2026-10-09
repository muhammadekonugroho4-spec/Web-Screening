package com.stockbit.chat.ui.room.personal;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class Y implements InterfaceC4094y {

    /* renamed from: k, reason: collision with root package name */
    public static final a f58701k = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f58702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58704c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f58705e;

    /* renamed from: f, reason: collision with root package name */
    public final String f58706f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58707g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58708h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f58709i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f58710j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final Y a(Bundle r14) {
            kotlin.jvm.internal.p.l(r14, "bundle");
            r14.setClassLoader(Y.class.getClassLoader());
            if (r14.containsKey("type") == false) goto L50;
            String r3 = r14.getString("type");
            if (r3 == null) goto L48;
            if (r14.containsKey("chatId") == false) goto L46;
            String r4 = r14.getString("chatId");
            String r2 = null;
            if (r14.containsKey("chatUserName") == false) goto L11;
            String r5 = r14.getString("chatUserName");
        L13:
            if (r14.containsKey("isChatEnabled") == false) goto L16;
            boolean r02 = r14.getBoolean("isChatEnabled");
        L15:
            boolean r6 = r02;
            if (r14.containsKey("userId") == false) goto L20;
            r2 = r14.getString("userId");
        L20:
            String r7 = r2;
            if (r14.containsKey("avatar") == false) goto L27;
            String r03 = r14.getString("avatar");
            if (r03 == null) goto L26;
        L24:
            String r8 = r03;
            boolean r22 = false;
            if (r14.containsKey("isVerified") == false) goto L31;
            boolean r9 = r14.getBoolean("isVerified");
        L33:
            if (r14.containsKey("isBlocked") == false) goto L35;
            boolean r10 = r14.getBoolean("isBlocked");
        L37:
            if (r14.containsKey("isDeactivated") == false) goto L39;
            boolean r11 = r14.getBoolean("isDeactivated");
        L41:
            if (r14.containsKey("isFromDeeplink") == false) goto L44;
            r22 = r14.getBoolean("isFromDeeplink");
        L44:
            return new Y(r3, r4, r5, r6, r7, r8, r9, r10, r11, r22);
        L39:
            r11 = false;
            goto L41
        L35:
            r10 = false;
            goto L37
        L31:
            r9 = false;
            goto L33
        L26:
            throw new IllegalArgumentException("Argument \"avatar\" is marked as non-null but was passed a null value.");
        L27:
            r03 = "";
            goto L24
        L16:
            r02 = true;
            goto L15
        L11:
            r5 = null;
            goto L13
        L46:
            throw new IllegalArgumentException("Required argument \"chatId\" is missing and does not have an android:defaultValue");
        L48:
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        L50:
            throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f58701k = new a(null);
    }

    public Y(String r2, String r3, String r4, boolean r5, String r6, String r7, boolean r8, boolean r9, boolean r10, boolean r11) {
        kotlin.jvm.internal.p.l(r2, "type");
        kotlin.jvm.internal.p.l(r7, "avatar");
        this.f58702a = r2;
        this.f58703b = r3;
        this.f58704c = r4;
        this.d = r5;
        this.f58705e = r6;
        this.f58706f = r7;
        this.f58707g = r8;
        this.f58708h = r9;
        this.f58709i = r10;
        this.f58710j = r11;
    }

    public static final Y fromBundle(Bundle r1) {
        return f58701k.a(r1);
    }

    public final String a() {
        return this.f58706f;
    }

    public final String b() {
        return this.f58703b;
    }

    public final String c() {
        return this.f58704c;
    }

    public final String d() {
        return this.f58702a;
    }

    public final String e() {
        return this.f58705e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Y) == true) goto L8;
        return false;
    L8:
        Y r52 = (Y) r5;
        if (kotlin.jvm.internal.p.g(this.f58702a, r52.f58702a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f58703b, r52.f58703b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f58704c, r52.f58704c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f58705e, r52.f58705e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f58706f, r52.f58706f) == true) goto L27;
        return false;
    L27:
        if (this.f58707g == r52.f58707g) goto L30;
        return false;
    L30:
        if (this.f58708h == r52.f58708h) goto L33;
        return false;
    L33:
        if (this.f58709i == r52.f58709i) goto L36;
        return false;
    L36:
        if (this.f58710j == r52.f58710j) goto L38;
        return false;
    L38:
        return true;
    }

    public final boolean f() {
        return this.f58708h;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.f58709i;
    }

    public int hashCode() {
        int r02 = this.f58702a.hashCode() * 31;
        String r1 = this.f58703b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f58704c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (((r03 + r14) * 31) + Boolean.hashCode(this.d)) * 31;
        String r15 = this.f58705e;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((((((((((r04 + r2) * 31) + this.f58706f.hashCode()) * 31) + Boolean.hashCode(this.f58707g)) * 31) + Boolean.hashCode(this.f58708h)) * 31) + Boolean.hashCode(this.f58709i)) * 31) + Boolean.hashCode(this.f58710j);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final boolean i() {
        return this.f58710j;
    }

    public final boolean j() {
        return this.f58707g;
    }

    public final Bundle k() {
        Bundle r02 = new Bundle();
        r02.putString("type", this.f58702a);
        r02.putString("chatId", this.f58703b);
        r02.putString("chatUserName", this.f58704c);
        r02.putBoolean("isChatEnabled", this.d);
        r02.putString("userId", this.f58705e);
        r02.putString("avatar", this.f58706f);
        r02.putBoolean("isVerified", this.f58707g);
        r02.putBoolean("isBlocked", this.f58708h);
        r02.putBoolean("isDeactivated", this.f58709i);
        r02.putBoolean("isFromDeeplink", this.f58710j);
        return r02;
    }

    public String toString() {
        return "ChatRoomFragmentArgs(type=" + this.f58702a + ", chatId=" + this.f58703b + ", chatUserName=" + this.f58704c + ", isChatEnabled=" + this.d + ", userId=" + this.f58705e + ", avatar=" + this.f58706f + ", isVerified=" + this.f58707g + ", isBlocked=" + this.f58708h + ", isDeactivated=" + this.f58709i + ", isFromDeeplink=" + this.f58710j + ')';
    }

    public /* synthetic */ Y(String r2, String r3, String r4, boolean r5, String r6, String r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 4) == 0) goto L6;
        r4 = null;
    L6:
        if ((r12 & 8) == 0) goto L9;
        r5 = true;
    L9:
        if ((r12 & 16) == 0) goto L12;
        r6 = null;
    L12:
        if ((r12 & 32) == 0) goto L15;
        r7 = "";
    L15:
        if ((r12 & 64) == 0) goto L18;
        r8 = false;
    L18:
        if ((r12 & 128) == 0) goto L21;
        r9 = false;
    L21:
        if ((r12 & 256) == 0) goto L24;
        r10 = false;
    L24:
        if ((r12 & 512) == 0) goto L27;
        boolean r122 = false;
    L26:
        boolean r112 = r10;
        boolean r102 = r9;
        boolean r92 = r8;
        String r82 = r7;
        String r72 = r6;
        this(r2, r3, r4, r5, r72, r82, r92, r102, r112, r122);
        return;
    L27:
        r122 = r11;
        goto L26
    }
}
