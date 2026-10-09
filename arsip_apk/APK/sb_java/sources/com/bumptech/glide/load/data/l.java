package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f32592a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f32593b;

    /* renamed from: c, reason: collision with root package name */
    public Object f32594c;

    public l(ContentResolver r1, Uri r2) {
        this.f32593b = r1;
        this.f32592a = r2;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object r02 = this.f32594c;
        if (r02 == null) goto L9;
        e(r02);     // Catch: IOException -> L6
        return;
    L10:
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
    public final void d(Priority r3, d.a r4) {
        Object r32 = f(this.f32592a, this.f32593b);     // Catch: FileNotFoundException -> L4
        this.f32594c = r32;     // Catch: FileNotFoundException -> L4
        r4.e(r32);     // Catch: FileNotFoundException -> L4
        return;
    L4:
        e = move-exception;
        if (Log.isLoggable("LocalUriFetcher", 3) == false) goto L8;
        Log.d("LocalUriFetcher", "Failed to open Uri", e);
    L8:
        r4.f(e);
    }

    public abstract void e(Object r1);

    public abstract Object f(Uri r1, ContentResolver r2);
}
