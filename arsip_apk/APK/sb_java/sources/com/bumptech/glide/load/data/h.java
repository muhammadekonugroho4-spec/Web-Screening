package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* loaded from: classes4.dex */
public class h extends b {
    public h(AssetManager r1, String r2) {
        super(r1, r2);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public /* bridge */ /* synthetic */ void e(Object r1) {
        g((AssetFileDescriptor) r1);
    }

    @Override // com.bumptech.glide.load.data.b
    public /* bridge */ /* synthetic */ Object f(AssetManager r1, String r2) {
        return h(r1, r2);
    }

    public void g(AssetFileDescriptor r1) {
        r1.close();
    }

    public AssetFileDescriptor h(AssetManager r1, String r2) {
        return r1.openFd(r2);
    }
}
