package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f43672a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f43673b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f43674c;

    public o() {
        this.f43672a = new Handler(Looper.getMainLooper());
        this.f43673b = new ConcurrentHashMap();
        this.f43674c = new AtomicLong(0);
    }

    public static /* synthetic */ void a(o r02, long r1, boolean r3) {
        b(r02, r1, r3);
    }

    public static final void b(o r02, long r1, boolean r3) {
        a.a.a.a.c.f.a(r02.f43673b.remove(Long.valueOf(r1)));
    }

    @JavascriptInterface
    public final void sendBooleanValue(final long r3, final boolean r5) {
        this.f43672a.post(new n(this, r3, r5));
    }
}
