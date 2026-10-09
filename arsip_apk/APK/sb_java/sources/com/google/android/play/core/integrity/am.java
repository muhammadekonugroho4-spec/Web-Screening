package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes5.dex */
final class am extends IntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private String f38230a;

    /* renamed from: b, reason: collision with root package name */
    private Long f38231b;

    public am() {
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String r02 = this.f38230a;
        if (r02 == null) goto L7;
        an r3 = null;
        return new ao(r02, this.f38231b, r3, r3);
    L7:
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long r1) {
        this.f38231b = Long.valueOf(r1);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String r2) {
        if (r2 == null) goto L6;
        this.f38230a = r2;
        return this;
    L6:
        throw new NullPointerException("Null nonce");
    }
}
