package com.bumptech.glide.load.model;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class c implements com.bumptech.glide.load.a {
    public c() {
    }

    @Override // com.bumptech.glide.load.a
    public /* bridge */ /* synthetic */ boolean a(Object r1, File r2, com.bumptech.glide.load.f r3) {
        return c((ByteBuffer) r1, r2, r3);
    }

    public boolean c(ByteBuffer r1, File r2, com.bumptech.glide.load.f r3) {
        com.bumptech.glide.util.a.f(r1, r2);     // Catch: IOException -> L5
        return true;
    L5:
        e = move-exception;
        if (Log.isLoggable("ByteBufferEncoder", 3) == false) goto L13;
        Log.d("ByteBufferEncoder", "Failed to write data", e);
        return false;
    L13:
        return false;
    }
}
