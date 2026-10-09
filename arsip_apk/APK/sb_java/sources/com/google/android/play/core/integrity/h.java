package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes5.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f38298a;

    public /* synthetic */ h(String r1, g r2) {
        this.f38298a = r1;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String a() {
        return this.f38298a;
    }

    public final boolean equals(Object r4) {
        if (r4 != this) goto L6;
        return true;
    L6:
        if ((r4 instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) == false) goto L15;
        StandardIntegrityManager.StandardIntegrityTokenRequest r42 = (StandardIntegrityManager.StandardIntegrityTokenRequest) r4;
        String r1 = this.f38298a;
        if (r1 != null) goto L14;
        if (r42.a() == null) goto L12;
        return false;
    L12:
        return true;
    L14:
        return r1.equals(r42.a());
    L15:
        return false;
    }

    public final int hashCode() {
        String r02 = this.f38298a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return r03 ^ 1000003;
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f38298a + "}";
    }
}
