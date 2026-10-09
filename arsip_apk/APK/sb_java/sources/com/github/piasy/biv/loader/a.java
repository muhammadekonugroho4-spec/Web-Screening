package com.github.piasy.biv.loader;

import android.net.Uri;
import java.io.File;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.github.piasy.biv.loader.a$a, reason: collision with other inner class name */
    public interface InterfaceC0393a {
        void onCacheHit(int r1, File r2);

        void onCacheMiss(int r1, File r2);

        void onFail(Exception r1);

        void onFinish();

        void onProgress(int r1);

        void onStart();

        void onSuccess(File r1);
    }

    void a(int r1, Uri r2, InterfaceC0393a r3);

    void b(int r1);

    void c(Uri r1);
}
