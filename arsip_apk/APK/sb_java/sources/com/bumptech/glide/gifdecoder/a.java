package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.bumptech.glide.gifdecoder.a$a, reason: collision with other inner class name */
    public interface InterfaceC0318a {
        byte[] a(int r1);

        Bitmap b(int r1, int r2, Bitmap.Config r3);

        int[] c(int r1);

        void d(Bitmap r1);

        void e(byte[] r1);

        void f(int[] r1);
    }

    void a(Bitmap.Config r1);

    void b();

    int c();

    void clear();

    int d();

    Bitmap e();

    void f();

    int g();

    ByteBuffer getData();

    int h();

    int i();
}
