package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes5.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f38294a;

    /* renamed from: b, reason: collision with root package name */
    private byte f38295b;

    public c() {
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int r1) {
        this.f38295b = (byte) (this.f38295b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f38295b == 3) goto L13;
        StringBuilder r02 = new StringBuilder();
        if ((this.f38295b & 1) != 0) goto L8;
        r02.append(" cloudProjectNumber");
    L8:
        if ((this.f38295b & 2) != 0) goto L11;
        r02.append(" webViewRequestMode");
    L11:
        throw new IllegalStateException("Missing required properties:".concat(r02.toString()));
    L13:
        return new e(this.f38294a, 0, null);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long r1) {
        this.f38294a = r1;
        this.f38295b = (byte) (this.f38295b | 1);
        return this;
    }
}
