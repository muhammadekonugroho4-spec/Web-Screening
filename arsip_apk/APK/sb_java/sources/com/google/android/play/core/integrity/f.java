package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes5.dex */
final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private String f38297a;

    public f() {
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new h(this.f38297a, null);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String r1) {
        this.f38297a = r1;
        return this;
    }
}
