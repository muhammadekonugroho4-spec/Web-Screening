package com.stockbit.domain.model.chat.room;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f81348a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81349b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81350c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81351e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81352f;

    public h(int r2, String r3, String r4, String r5, boolean r6, String r7) {
        p.l(r3, Constants.KEY_TEXT);
        p.l(r4, "senderUsername");
        p.l(r5, "type");
        p.l(r7, "createdAt");
        this.f81348a = r2;
        this.f81349b = r3;
        this.f81350c = r4;
        this.d = r5;
        this.f81351e = r6;
        this.f81352f = r7;
    }

    public final String a() {
        return this.f81352f;
    }

    public final int b() {
        return this.f81348a;
    }

    public final String c() {
        return this.f81350c;
    }

    public final String d() {
        return this.f81349b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f81348a == r52.f81348a) goto L12;
        return false;
    L12:
        if (p.g(this.f81349b, r52.f81349b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81350c, r52.f81350c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f81351e == r52.f81351e) goto L24;
        return false;
    L24:
        if (p.g(this.f81352f, r52.f81352f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f81351e;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f81348a) * 31) + this.f81349b.hashCode()) * 31) + this.f81350c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f81351e)) * 31) + this.f81352f.hashCode();
    }

    public String toString() {
        return "RoomLastMessageEntity(id=" + this.f81348a + ", text=" + this.f81349b + ", senderUsername=" + this.f81350c + ", type=" + this.d + ", isDeleted=" + this.f81351e + ", createdAt=" + this.f81352f + ")";
    }

    public /* synthetic */ h(int r3, String r4, String r5, String r6, boolean r7, String r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r9 & 32) == 0) goto L21;
        String r92 = "";
    L20:
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92);
        return;
    L21:
        r92 = r8;
        goto L20
    }
}
