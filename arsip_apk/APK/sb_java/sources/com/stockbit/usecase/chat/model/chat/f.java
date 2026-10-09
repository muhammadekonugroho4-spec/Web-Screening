package com.stockbit.usecase.chat.model.chat;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f155204a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155205b;

    /* renamed from: c, reason: collision with root package name */
    public final RoomLastMessageType f155206c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f155207e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f155208f;

    /* renamed from: g, reason: collision with root package name */
    public final String f155209g;

    public f(int r2, String r3, RoomLastMessageType r4, String r5, boolean r6, boolean r7, String r8) {
        p.l(r3, Constants.KEY_TEXT);
        p.l(r4, "type");
        p.l(r5, "senderUsername");
        p.l(r8, "createdAt");
        this.f155204a = r2;
        this.f155205b = r3;
        this.f155206c = r4;
        this.d = r5;
        this.f155207e = r6;
        this.f155208f = r7;
        this.f155209g = r8;
    }

    public static /* synthetic */ f b(f r02, int r1, String r2, RoomLastMessageType r3, String r4, boolean r5, boolean r6, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f155204a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f155205b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f155206c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f155207e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f155208f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f155209g;
    L23:
        boolean r82 = r6;
        String r92 = r7;
        String r62 = r4;
        boolean r72 = r5;
        RoomLastMessageType r52 = r3;
        int r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92);
    }

    public final f a(int r10, String r11, RoomLastMessageType r12, String r13, boolean r14, boolean r15, String r16) {
        p.l(r11, Constants.KEY_TEXT);
        p.l(r12, "type");
        p.l(r13, "senderUsername");
        p.l(r16, "createdAt");
        return new f(r10, r11, r12, r13, r14, r15, r16);
    }

    public final String c() {
        return this.f155209g;
    }

    public final int d() {
        return this.f155204a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f155204a == r52.f155204a) goto L12;
        return false;
    L12:
        if (p.g(this.f155205b, r52.f155205b) == true) goto L15;
        return false;
    L15:
        if (this.f155206c == r52.f155206c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f155207e == r52.f155207e) goto L24;
        return false;
    L24:
        if (this.f155208f == r52.f155208f) goto L27;
        return false;
    L27:
        if (p.g(this.f155209g, r52.f155209g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f155205b;
    }

    public final RoomLastMessageType g() {
        return this.f155206c;
    }

    public final boolean h() {
        return this.f155207e;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f155204a) * 31) + this.f155205b.hashCode()) * 31) + this.f155206c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f155207e)) * 31) + Boolean.hashCode(this.f155208f)) * 31) + this.f155209g.hashCode();
    }

    public final boolean i() {
        return this.f155208f;
    }

    public String toString() {
        return "RoomLastMessageUIState(id=" + this.f155204a + ", text=" + this.f155205b + ", type=" + this.f155206c + ", senderUsername=" + this.d + ", isDeleted=" + this.f155207e + ", isMyMessage=" + this.f155208f + ", createdAt=" + this.f155209g + ")";
    }

    public /* synthetic */ f(int r3, String r4, RoomLastMessageType r5, String r6, boolean r7, boolean r8, String r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = RoomLastMessageType.ATTACHMENT_TYPE_UNSPECIFIED;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = false;
    L21:
        if ((r10 & 64) == 0) goto L24;
        String r102 = "";
    L23:
        boolean r92 = r8;
        boolean r82 = r7;
        String r72 = r6;
        RoomLastMessageType r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102);
        return;
    L24:
        r102 = r9;
        goto L23
    }
}
