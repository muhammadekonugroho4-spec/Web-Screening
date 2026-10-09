package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f38243a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f38244b;

    public at(com.google.android.play.integrity.internal.an r1, com.google.android.play.integrity.internal.an r2) {
        this.f38243a = r1;
        this.f38244b = r2;
    }

    public final as a(Activity r8, TaskCompletionSource r9, com.google.android.play.integrity.internal.ae r10) {
        Object r02 = this.f38243a.a();
        r02.getClass();
        k r3 = (k) this.f38244b.a();
        r3.getClass();
        r8.getClass();
        r10.getClass();
        return new as((Context) r02, r3, r8, r9, r10);
    }
}
