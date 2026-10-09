package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.p;
import kotlin.w;

/* loaded from: classes5.dex */
public abstract class zzfx implements InvocationHandler {
    private final Object zza;

    public zzfx(Object r1) {
        this.zza = r1;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object r3, Method r4, Object[] r5) {
        if (p.g(r4.getName(), "toString") == false) goto L9;
        if (r4.getParameterTypes().length != 0) goto L9;
        return "Proxy@".concat(String.valueOf(Integer.toHexString(r3.hashCode())));
    L9:
        if (p.g(r4.getName(), "hashCode") == false) goto L15;
        if (r4.getParameterTypes().length != 0) goto L15;
        return Integer.valueOf(System.identityHashCode(r3));
    L15:
        if (p.g(r4.getName(), "equals") == false) goto L34;
        if (r4.getParameterTypes().length == 0) goto L34;
        boolean r42 = false;
        if (r5 == null) goto L32;
        if (r5.length == 0) goto L32;
        Object r52 = r5[0];
        if (r52 == null) goto L27;
        int r53 = r52.hashCode();
    L29:
        if (r53 != r3.hashCode()) goto L32;
        r42 = true;
        goto L32
    L27:
        r53 = 0;
    L32:
        return Boolean.valueOf(r42);
    L34:
        if (zza(r3, r4, r5) == true) goto L38;
        return w.f180450a;
    L38:
        if (this.zza == null) goto L40;
    L42:
        Object r32 = this.zza;
        if (r32 == null) goto L51;
        if (p.g(zzkm.zza(r32.getClass()), zzkm.zza(r4.getReturnType())) == false) goto L51;
    L46:
        Object r33 = this.zza;
        if (r33 == null) goto L49;
        return r33;
    L49:
        return w.f180450a;
    L51:
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + r4.getReturnType());
    L40:
        if (p.g(r4.getReturnType(), Void.TYPE) == false) goto L42;
        goto L42
    }

    public abstract boolean zza(Object r1, Method r2, Object[] r3);
}
