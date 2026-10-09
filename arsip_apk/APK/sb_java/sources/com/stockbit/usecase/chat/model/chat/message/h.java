package com.stockbit.usecase.chat.model.chat.message;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class h implements A {

    /* renamed from: a, reason: collision with root package name */
    public final int f155265a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155266b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155267c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageEventFormatType f155268e;

    public h(int r2, String r3, boolean r4, String r5, MessageEventFormatType r6) {
        kotlin.jvm.internal.p.l(r3, "createdAt");
        kotlin.jvm.internal.p.l(r5, Constants.KEY_TEXT);
        kotlin.jvm.internal.p.l(r6, "type");
        this.f155265a = r2;
        this.f155266b = r3;
        this.f155267c = r4;
        this.d = r5;
        this.f155268e = r6;
    }

    public static /* synthetic */ h m(h r02, int r1, String r2, boolean r3, String r4, MessageEventFormatType r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f155265a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f155266b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f155267c;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.f155268e;
    L17:
        String r62 = r4;
        MessageEventFormatType r72 = r5;
        boolean r52 = r3;
        int r32 = r1;
        return r02.b(r32, r2, r52, r62, r72);
    }

    public final MessageEventFormatType A() {
        return this.f155268e;
    }

    @Override // com.stockbit.usecase.chat.model.chat.message.A
    public int B() {
        return this.f155265a;
    }

    public boolean D() {
        return this.f155267c;
    }

    public final h b(int r8, String r9, boolean r10, String r11, MessageEventFormatType r12) {
        kotlin.jvm.internal.p.l(r9, "createdAt");
        kotlin.jvm.internal.p.l(r11, Constants.KEY_TEXT);
        kotlin.jvm.internal.p.l(r12, "type");
        return new h(r8, r9, r10, r11, r12);
    }

    @Override // com.stockbit.usecase.chat.model.chat.message.A
    public /* bridge */ A c(boolean r1) {
        return super.c(r1);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f155265a == r52.f155265a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155266b, r52.f155266b) == true) goto L15;
        return false;
    L15:
        if (this.f155267c == r52.f155267c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f155268e == r52.f155268e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f155265a) * 31) + this.f155266b.hashCode()) * 31) + Boolean.hashCode(this.f155267c)) * 31) + this.d.hashCode()) * 31) + this.f155268e.hashCode();
    }

    @Override // com.stockbit.usecase.chat.model.chat.message.A
    public String s() {
        return this.f155266b;
    }

    public String toString() {
        return "MessageEventUIState(messageId=" + this.f155265a + ", createdAt=" + this.f155266b + ", isEventBefore=" + this.f155267c + ", text=" + this.d + ", type=" + this.f155268e + ")";
    }

    public final String y() {
        return this.d;
    }

    public /* synthetic */ h(int r3, String r4, boolean r5, String r6, MessageEventFormatType r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = false;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r8 & 16) == 0) goto L17;
        r7 = MessageEventFormatType.TEXT_FORMAT_REGULAR;
    L17:
        MessageEventFormatType r82 = r7;
        String r72 = r6;
        boolean r62 = r5;
        this(r3, r4, r62, r72, r82);
    }
}
