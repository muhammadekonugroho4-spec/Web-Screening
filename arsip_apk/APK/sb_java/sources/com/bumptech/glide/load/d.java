package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.s;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class d implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f32568b;

    public d(i... r2) {
        if (r2.length == 0) goto L7;
        this.f32568b = Arrays.asList(r2);
        return;
    L7:
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // com.bumptech.glide.load.i
    public s a(Context r5, s r6, int r7, int r8) {
        Iterator r02 = this.f32568b.iterator();
        s r1 = r6;
    L4:
        if (r02.hasNext() == false) goto L13;
        s r2 = ((i) r02.next()).a(r5, r1, r7, r8);
        if (r1 == null) goto L12;
        if (r1.equals(r6) == true) goto L12;
        if (r1.equals(r2) == true) goto L12;
        r1.recycle();
    L12:
        r1 = r2;
        goto L4
    L13:
        return r1;
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r3) {
        Iterator r02 = this.f32568b.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((i) r02.next()).b(r3);
        goto L4
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object r2) {
        if ((r2 instanceof d) == true) goto L5;
        return false;
    L5:
        return this.f32568b.equals(((d) r2).f32568b);
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f32568b.hashCode();
    }
}
