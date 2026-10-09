package dagger.hilt.android.internal.lifecycle;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f173950a;

    public /* synthetic */ d(f r1) {
        this.f173950a = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f173950a.a();
    }
}
