package com.bumptech.glide.signature;

import android.content.Context;
import com.bumptech.glide.util.l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class a implements com.bumptech.glide.load.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f33369b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.c f33370c;

    public a(int r1, com.bumptech.glide.load.c r2) {
        this.f33369b = r1;
        this.f33370c = r2;
    }

    public static com.bumptech.glide.load.c c(Context r2) {
        com.bumptech.glide.load.c r02 = b.c(r2);
        return new a(r2.getResources().getConfiguration().uiMode & 48, r02);
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r3) {
        this.f33370c.b(r3);
        r3.update(ByteBuffer.allocate(4).putInt(this.f33369b).array());
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object r4) {
        if ((r4 instanceof a) == false) goto L10;
        a r42 = (a) r4;
        if (this.f33369b != r42.f33369b) goto L10;
        if (this.f33370c.equals(r42.f33370c) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return l.p(this.f33370c, this.f33369b);
    }
}
