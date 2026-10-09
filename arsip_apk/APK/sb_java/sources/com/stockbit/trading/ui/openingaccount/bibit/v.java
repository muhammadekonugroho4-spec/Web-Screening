package com.stockbit.trading.ui.openingaccount.bibit;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f147963a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f147964b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f147965c;

    static {
    }

    public v(String r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "phoneNumber");
        this.f147963a = r2;
        this.f147964b = r3;
        this.f147965c = r4;
    }

    public static /* synthetic */ v b(v r02, String r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f147963a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f147964b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f147965c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final v a(String r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "phoneNumber");
        return new v(r2, r3, r4);
    }

    public final String c() {
        return this.f147963a;
    }

    public final boolean d() {
        return this.f147965c;
    }

    public final boolean e() {
        return this.f147964b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (kotlin.jvm.internal.p.g(this.f147963a, r52.f147963a) == true) goto L12;
        return false;
    L12:
        if (this.f147964b == r52.f147964b) goto L15;
        return false;
    L15:
        if (this.f147965c == r52.f147965c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f147963a.hashCode() * 31) + Boolean.hashCode(this.f147964b)) * 31) + Boolean.hashCode(this.f147965c);
    }

    public String toString() {
        return "RegistrationBibitState(phoneNumber=" + this.f147963a + ", isLoading=" + this.f147964b + ", isFromSocial=" + this.f147965c + ')';
    }

    public /* synthetic */ v(String r2, boolean r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
