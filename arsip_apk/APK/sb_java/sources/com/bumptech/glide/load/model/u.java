package com.bumptech.glide.load.model;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class u implements com.bumptech.glide.load.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f33009a;

    public u(com.bumptech.glide.load.engine.bitmap_recycle.b r1) {
        this.f33009a = r1;
    }

    @Override // com.bumptech.glide.load.a
    public /* bridge */ /* synthetic */ boolean a(Object r1, File r2, com.bumptech.glide.load.f r3) {
        return c((InputStream) r1, r2, r3);
    }

    public boolean c(InputStream r5, File r6, com.bumptech.glide.load.f r7) {
        byte[] r02 = (byte[]) this.f33009a.c(65536, byte[].class);
        FileOutputStream r2 = null;
        FileOutputStream r3 = new FileOutputStream(r6);     // Catch: Throwable -> L14 IOException -> L16
    L40:
        int r62 = r5.read(r02);     // Catch: Throwable -> L7 IOException -> L9
        if (r62 == (-1)) goto L11;
        r3.write(r02, 0, r62);     // Catch: Throwable -> L7 IOException -> L9
        goto L40
    L11:
        r3.close();     // Catch: Throwable -> L7 IOException -> L9
        r3.close();     // Catch: IOException -> L29
    L13:
        this.f33009a.put(r02);
        return true;
    L9:
        e = e;
        r2 = r3;
    L19:
        if (Log.isLoggable("StreamEncoder", 3) == false) goto L21;
        Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);     // Catch: Throwable -> L14
    L21:
        if (r2 != null) goto L32;
    L23:
        this.f33009a.put(r02);
        return false;
    L32:
        r2.close();     // Catch: IOException -> L31
    L7:
        th = th;
        r2 = r3;
    L25:
        if (r2 != null) goto L36;
    L27:
        this.f33009a.put(r02);
        throw th;
    L36:
        r2.close();     // Catch: IOException -> L30
    L14:
        th = th;
    L16:
        e = e;
        goto L19
    }
}
