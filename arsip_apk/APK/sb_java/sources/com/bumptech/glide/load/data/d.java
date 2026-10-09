package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes4.dex */
public interface d {

    public interface a {
        void e(Object r1);

        void f(Exception r1);
    }

    Class a();

    void b();

    DataSource c();

    void cancel();

    void d(Priority r1, a r2);
}
