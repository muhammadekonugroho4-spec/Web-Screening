package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes5.dex */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a, reason: collision with root package name */
    private final String f38287a;

    /* renamed from: b, reason: collision with root package name */
    private final y f38288b;

    public br(String r1, y r2) {
        this.f38287a = r1;
        this.f38288b = r2;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity r2, int r3) {
        return this.f38288b.a(r2, r3);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f38287a;
    }
}
