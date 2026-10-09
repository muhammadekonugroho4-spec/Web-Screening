package com.github.piasy.biv.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Keep
/* loaded from: classes4.dex */
public final class ThreadedCallbacks implements InvocationHandler {
    private static final Handler MAIN_HANDLER = null;
    private static final Object NON_SENSE = null;
    private final Handler mHandler;
    private final Object mTarget;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f37923a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object[] f37924b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ThreadedCallbacks f37925c;

        public a(ThreadedCallbacks r1, Method r2, Object[] r3) {
            this.f37925c = r1;
            this.f37923a = r2;
            this.f37924b = r3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37923a.invoke(ThreadedCallbacks.access$000(this.f37925c), this.f37924b);     // Catch: Exception -> L4
            return;
        L4:
            e = move-exception;
            e.printStackTrace();
        }
    }

    static {
        NON_SENSE = new Object();
        MAIN_HANDLER = new Handler(Looper.getMainLooper());
    }

    private ThreadedCallbacks(Handler r1, Object r2) {
        this.mHandler = r1;
        this.mTarget = r2;
    }

    public static /* synthetic */ Object access$000(ThreadedCallbacks r02) {
        return r02.mTarget;
    }

    public static <T> T create(Class<T> r1, T r2) {
        return (T) create(MAIN_HANDLER, r1, r2);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object r2, Method r3, Object[] r4) throws Throwable {
        if (r3.getReturnType().equals(Void.TYPE) == false) goto L11;
        if (Looper.myLooper() != this.mHandler.getLooper()) goto L7;
        r3.invoke(this.mTarget, r4);
    L9:
        return NON_SENSE;
    L7:
        this.mHandler.post(new a(this, r3, r4));
        goto L9
    L11:
        throw new RuntimeException("Method should return void: " + r3);
    }

    public static <T> T create(Handler r2, Class<T> r3, T r4) {
        return (T) Proxy.newProxyInstance(r3.getClassLoader(), new Class[]{r3}, new ThreadedCallbacks(r2, r4));
    }
}
