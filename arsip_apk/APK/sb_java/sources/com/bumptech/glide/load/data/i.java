package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public class i extends l {
    public i(ContentResolver r1, Uri r2) {
        super(r1, r2);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.l
    public /* bridge */ /* synthetic */ void e(Object r1) {
        g((ParcelFileDescriptor) r1);
    }

    @Override // com.bumptech.glide.load.data.l
    public /* bridge */ /* synthetic */ Object f(Uri r1, ContentResolver r2) {
        return h(r1, r2);
    }

    public void g(ParcelFileDescriptor r1) {
        r1.close();
    }

    public ParcelFileDescriptor h(Uri r3, ContentResolver r4) {
        AssetFileDescriptor r42 = r4.openAssetFileDescriptor(r3, "r");
        if (r42 == null) goto L7;
        return r42.getParcelFileDescriptor();
    L7:
        throw new FileNotFoundException("FileDescriptor is null for: " + r3);
    }
}
