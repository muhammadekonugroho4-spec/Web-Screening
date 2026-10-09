package com.facebook.internal.instrument.crashshield;

import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.b;
import com.facebook.v;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36496a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f36497b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f36498c;

    /* renamed from: com.facebook.internal.instrument.crashshield.a$a, reason: collision with other inner class name */
    public static final class RunnableC0381a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f36499a;

        public RunnableC0381a(Throwable r1) {
            this.f36499a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.f36499a);
        }
    }

    static {
        f36496a = new a();
        f36497b = Collections.newSetFromMap(new WeakHashMap());
    }

    public a() {
    }

    public static final void a() {
        f36498c = true;
    }

    public static final void b(Throwable r1, Object r2) {
        p.l(r2, "o");
        if (f36498c == true) goto L5;
        return;
    L5:
        f36497b.add(r2);
        if (v.p() == false) goto L8;
        b.c(r1);
        InstrumentData.a.b(r1, InstrumentData.Type.CrashShield).g();
    L8:
        e(r1);
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object r1) {
        p.l(r1, "o");
        return f36497b.contains(r1);
    }

    public static final void e(Throwable r2) {
        if (c() == false) goto L6;
        new Handler(Looper.getMainLooper()).post(new RunnableC0381a(r2));
        return;
    }
}
