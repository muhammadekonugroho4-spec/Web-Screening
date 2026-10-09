package com.bumptech.glide.provider;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f33253a;

    public b() {
        this.f33253a = new ArrayList();
    }

    public synchronized void a(ImageHeaderParser r2) {
        monitor-enter(this);
        this.f33253a.add(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized List b() {
        monitor-enter(this);
        List r02 = this.f33253a;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }
}
