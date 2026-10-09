package com.google.android.play.core.integrity;

/* loaded from: classes5.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f38232a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f38233b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f38234c;

    public /* synthetic */ ao(String r1, Long r2, Object r3, an r4) {
        this.f38232a = r1;
        this.f38233b = r2;
        this.f38234c = null;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f38233b;
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof IntegrityTokenRequest) == false) goto L14;
        IntegrityTokenRequest r1 = (IntegrityTokenRequest) r6;
        if (this.f38232a.equals(r1.nonce()) == false) goto L14;
        Long r3 = this.f38233b;
        if (r3 != null) goto L16;
        if (r1.cloudProjectNumber() != null) goto L14;
    L13:
        boolean r12 = true;
    L19:
        if ((r6 instanceof ao) == true) goto L21;
    L27:
        return r12;
    L21:
        if (a() == false) goto L27;
        ao r62 = (ao) r6;
        if (r12 == false) goto L26;
        Object r63 = r62.f38234c;
        return true;
    L26:
        return false;
    L16:
        if (r3.equals(r1.cloudProjectNumber()) == true) goto L13;
    L14:
        r12 = false;
        goto L19
    }

    public final int hashCode() {
        int r02 = this.f38232a.hashCode() ^ 1000003;
        Long r2 = this.f38233b;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r03 = (r02 * 1000003) ^ r22;
        if (a() == true) goto L9;
        return r03;
    L9:
        return r03 * 1000003;
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f38232a;
    }

    public final String toString() {
        String r02 = "IntegrityTokenRequest{nonce=" + this.f38232a + ", cloudProjectNumber=" + this.f38233b;
        if (a() == false) goto L6;
        r02 = r02.concat(", network=null");
    L6:
        return r02.concat("}");
    }
}
