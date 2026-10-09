package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes5.dex */
abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f38318a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38319b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38320c;
    private final Object d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38321e;

    public y(String r3, long r4) {
        this.f38318a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");
        this.d = new Object();
        this.f38319b = r3;
        this.f38320c = r4;
    }

    public final Task a(Activity r6, int r7) {
        Object r02 = this.d;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f38321e == false) goto L11;
        Task r62 = Tasks.forResult(0);     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r62;
    L11:
        this.f38321e = true;     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        this.f38318a.a("checkAndShowDialog(%s)", new Object[]{Integer.valueOf(r7)});
        Bundle r03 = new Bundle();
        r03.putInt("dialog.intent.type", r7);
        r03.putString("package.name", this.f38319b);
        r03.putInt("playcore.integrity.version.major", 1);
        r03.putInt("playcore.integrity.version.minor", 3);
        r03.putInt("playcore.integrity.version.patch", 0);
        r03.putLong("request.token.sid", this.f38320c);
        return b(r6, r03);
    }

    public abstract Task b(Activity r1, Bundle r2);
}
