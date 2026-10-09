package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32888a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f32889b;

    public static final class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message r3) {
            if (r3.what != 1) goto L6;
            ((s) r3.obj).recycle();
            return true;
        L6:
            return false;
        }
    }

    public v() {
        this.f32889b = new Handler(Looper.getMainLooper(), new a());
    }

    public synchronized void a(s r3, boolean r4) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f32888a == true) goto L10;
        if (r4 == true) goto L10;
        this.f32888a = true;     // Catch: Throwable -> L8
        r3.recycle();     // Catch: Throwable -> L8
        this.f32888a = false;     // Catch: Throwable -> L8
    L11:
        monitor-exit(this);
        return;
    L10:
        this.f32889b.obtainMessage(1, r3).sendToTarget();     // Catch: Throwable -> L8
        goto L11
    }
}
