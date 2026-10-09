package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f33119a;

    /* renamed from: com.bumptech.glide.load.resource.bytes.a$a, reason: collision with other inner class name */
    public static class C0334a implements e.a {
        public C0334a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public /* bridge */ /* synthetic */ e b(Object r1) {
            return c((ByteBuffer) r1);
        }

        public e c(ByteBuffer r2) {
            return new a(r2);
        }
    }

    public a(ByteBuffer r1) {
        this.f33119a = r1;
    }

    @Override // com.bumptech.glide.load.data.e
    public /* bridge */ /* synthetic */ Object a() {
        return c();
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    public ByteBuffer c() {
        this.f33119a.position(0);
        return this.f33119a;
    }
}
