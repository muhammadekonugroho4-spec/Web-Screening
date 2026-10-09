package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclableBufferedInputStream f32590a;

    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f32591a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b r1) {
            this.f32591a = r1;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public /* bridge */ /* synthetic */ e b(Object r1) {
            return c((InputStream) r1);
        }

        public e c(InputStream r3) {
            return new k(r3, this.f32591a);
        }
    }

    public k(InputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        RecyclableBufferedInputStream r02 = new RecyclableBufferedInputStream(r2, r3);
        this.f32590a = r02;
        r02.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public /* bridge */ /* synthetic */ Object a() {
        return d();
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f32590a.release();
    }

    public void c() {
        this.f32590a.f();
    }

    public InputStream d() {
        this.f32590a.reset();
        return this.f32590a;
    }
}
