package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.d;
import java.io.File;

/* loaded from: classes4.dex */
public final class f extends d {

    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f32725a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32726b;

        public a(Context r1, String r2) {
            this.f32725a = r1;
            this.f32726b = r2;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.a
        public File a() {
            File r02 = this.f32725a.getCacheDir();
            if (r02 != null) goto L7;
            return null;
        L7:
            if (this.f32726b != null) goto L9;
            return r02;
        L9:
            return new File(r02, this.f32726b);
        }
    }

    public f(Context r4) {
        this(r4, "image_manager_disk_cache", 262144000);
    }

    public f(Context r2, String r3, long r4) {
        super(new a(r2, r3), r4);
    }
}
