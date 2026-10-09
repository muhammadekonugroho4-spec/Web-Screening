package com.stockbit.usecase.trusteddevice.resource.change;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10979h implements InterfaceC10982k {

    /* renamed from: a, reason: collision with root package name */
    public final long f164280a;

    public C10979h(long r1) {
        this.f164280a = r1;
    }

    public final long a() {
        return this.f164280a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C10979h) == true) goto L9;
        return false;
    L9:
        if (this.f164280a == ((C10979h) r8).f164280a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Long.hashCode(this.f164280a);
    }

    public String toString() {
        return "AppCheckError(retryTimeLeft=" + this.f164280a + ')';
    }
}
