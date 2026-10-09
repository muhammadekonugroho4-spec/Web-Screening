package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes5.dex */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final long f38296a;

    public /* synthetic */ e(long r1, int r3, d r4) {
        this.f38296a = r1;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final int a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.f38296a;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) == false) goto L11;
        StandardIntegrityManager.PrepareIntegrityTokenRequest r82 = (StandardIntegrityManager.PrepareIntegrityTokenRequest) r8;
        if (this.f38296a != r82.b()) goto L11;
        r82.a();
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        long r02 = this.f38296a;
        return (((int) (r02 ^ (r02 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f38296a + ", webViewRequestMode=0}";
    }
}
