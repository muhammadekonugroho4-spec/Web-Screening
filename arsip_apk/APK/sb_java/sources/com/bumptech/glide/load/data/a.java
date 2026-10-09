package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class a extends l {
    public a(ContentResolver r1, Uri r2) {
        super(r1, r2);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.l
    public /* bridge */ /* synthetic */ void e(Object r1) {
        g((AssetFileDescriptor) r1);
    }

    @Override // com.bumptech.glide.load.data.l
    public /* bridge */ /* synthetic */ Object f(Uri r1, ContentResolver r2) {
        return h(r1, r2);
    }

    public void g(AssetFileDescriptor r1) {
        r1.close();
    }

    public AssetFileDescriptor h(Uri r3, ContentResolver r4) {
        AssetFileDescriptor r42 = r4.openAssetFileDescriptor(r3, "r");
        if (r42 == null) goto L6;
        return r42;
    L6:
        throw new FileNotFoundException("FileDescriptor is null for: " + r3);
    }
}
