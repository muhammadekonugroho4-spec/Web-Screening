package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.i;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f31613a = null;

    static {
        f31613a = new HashSet();
    }

    public c() {
    }

    @Override // com.airbnb.lottie.i
    public void a(String r2) {
        c(r2, null);
    }

    @Override // com.airbnb.lottie.i
    public void b(String r2, Throwable r3) {
        if (com.airbnb.lottie.c.f31053a == false) goto L6;
        Log.d("LOTTIE", r2, r3);
        return;
    }

    @Override // com.airbnb.lottie.i
    public void c(String r3, Throwable r4) {
        Set r02 = f31613a;
        if (r02.contains(r3) == false) goto L5;
        return;
    L5:
        Log.w("LOTTIE", r3, r4);
        r02.add(r3);
    }

    @Override // com.airbnb.lottie.i
    public void d(String r2) {
        e(r2, null);
    }

    public void e(String r2, Throwable r3) {
        if (com.airbnb.lottie.c.f31053a == false) goto L6;
        Log.d("LOTTIE", r2, r3);
        return;
    }
}
