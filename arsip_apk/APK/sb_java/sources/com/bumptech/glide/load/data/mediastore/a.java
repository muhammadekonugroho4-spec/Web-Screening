package com.bumptech.glide.load.data.mediastore;

import java.io.File;

/* loaded from: classes4.dex */
public class a {
    public a() {
    }

    public boolean a(File r1) {
        return r1.exists();
    }

    public File b(String r2) {
        return new File(r2);
    }

    public long c(File r3) {
        return r3.length();
    }
}
