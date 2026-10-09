package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

/* loaded from: classes4.dex */
public interface e {

    public interface a {
        void b(com.bumptech.glide.load.c r1, Exception r2, com.bumptech.glide.load.data.d r3, DataSource r4);

        void c();

        void d(com.bumptech.glide.load.c r1, Object r2, com.bumptech.glide.load.data.d r3, DataSource r4, com.bumptech.glide.load.c r5);
    }

    boolean a();

    void cancel();
}
