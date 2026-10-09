package com.stockbit.usecase.login.model;

/* loaded from: classes2.dex */
public final class j {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f158362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158363b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158364c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public j(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r3, "channel");
        kotlin.jvm.internal.p.l(r4, "deviceName");
        this.f158362a = r2;
        this.f158363b = r3;
        this.f158364c = r4;
    }

    public final String a() {
        return this.f158363b;
    }

    public final String b() {
        return this.f158364c;
    }

    public final String c() {
        return this.f158362a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f158362a, r52.f158362a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f158363b, r52.f158363b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f158364c, r52.f158364c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f158362a.hashCode() * 31) + this.f158363b.hashCode()) * 31) + this.f158364c.hashCode();
    }

    public String toString() {
        return "LoginTrustedDeviceApprovalUIState(token=" + this.f158362a + ", channel=" + this.f158363b + ", deviceName=" + this.f158364c + ')';
    }

    public /* synthetic */ j(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "CHANNEL_PROMPT";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
