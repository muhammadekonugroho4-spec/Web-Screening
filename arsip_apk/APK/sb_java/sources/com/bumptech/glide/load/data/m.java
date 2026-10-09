package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class m extends b {
    public m(AssetManager r1, String r2) {
        super(r1, r2);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public /* bridge */ /* synthetic */ void e(Object r1) {
        g((InputStream) r1);
    }

    @Override // com.bumptech.glide.load.data.b
    public /* bridge */ /* synthetic */ Object f(AssetManager r1, String r2) {
        return h(r1, r2);
    }

    public void g(InputStream r1) {
        r1.close();
    }

    public InputStream h(AssetManager r1, String r2) {
        return r1.open(r2);
    }
}
