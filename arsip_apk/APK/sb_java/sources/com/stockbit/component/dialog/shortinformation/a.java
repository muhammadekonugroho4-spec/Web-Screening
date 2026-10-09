package com.stockbit.component.dialog.shortinformation;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f70769a;

    static {
    }

    public a(String r2) {
        kotlin.jvm.internal.p.l(r2, "titleId");
        this.f70769a = r2;
    }

    public final String a() {
        return this.f70769a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f70769a, ((a) r4).f70769a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f70769a.hashCode();
    }

    public String toString() {
        return "DialogShortInformationIdentifier(titleId=" + this.f70769a + ')';
    }

    public /* synthetic */ a(String r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
