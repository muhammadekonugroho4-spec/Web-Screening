package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f38235a;

    /* renamed from: b, reason: collision with root package name */
    private final y f38236b;

    public aq(String r1, y r2) {
        this.f38235a = r1;
        this.f38236b = r2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity r2, int r3) {
        return this.f38236b.a(r2, r3);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f38235a;
    }
}
