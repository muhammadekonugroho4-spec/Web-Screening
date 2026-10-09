package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class d implements a.InterfaceC0322a {

    /* renamed from: a, reason: collision with root package name */
    public final long f32719a;

    /* renamed from: b, reason: collision with root package name */
    public final a f32720b;

    public interface a {
        File a();
    }

    public d(a r1, long r2) {
        this.f32719a = r2;
        this.f32720b = r1;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0322a
    public com.bumptech.glide.load.engine.cache.a build() {
        File r02 = this.f32720b.a();
        if (r02 != null) goto L6;
        return null;
    L6:
        if (r02.isDirectory() == true) goto L12;
        if (r02.mkdirs() == true) goto L12;
        return null;
    L12:
        return e.c(r02, this.f32719a);
    }
}
