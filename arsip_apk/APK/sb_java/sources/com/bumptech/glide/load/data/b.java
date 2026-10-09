package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f32571a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f32572b;

    /* renamed from: c, reason: collision with root package name */
    public Object f32573c;

    public b(AssetManager r1, String r2) {
        this.f32572b = r1;
        this.f32571a = r2;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object r02 = this.f32573c;
        if (r02 == null) goto L10;
        e(r02);     // Catch: IOException -> L7
        return;
    L11:
        return;
    }

    @Override // com.bumptech.glide.load.data.d
    public DataSource c() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(Priority r3, d.a r4) {
        Object r32 = f(this.f32572b, this.f32571a);     // Catch: IOException -> L4
        this.f32573c = r32;     // Catch: IOException -> L4
        r4.e(r32);     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        if (Log.isLoggable("AssetPathFetcher", 3) == false) goto L8;
        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
    L8:
        r4.f(e);
    }

    public abstract void e(Object r1);

    public abstract Object f(AssetManager r1, String r2);
}
