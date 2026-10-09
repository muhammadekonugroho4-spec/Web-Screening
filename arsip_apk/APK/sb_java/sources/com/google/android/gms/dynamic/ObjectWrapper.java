package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

@RetainForClient
@KeepForSdk
/* loaded from: classes5.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final Object zza;

    private ObjectWrapper(Object r1) {
        this.zza = r1;
    }

    @KeepForSdk
    public static <T> T unwrap(IObjectWrapper r7) {
        if ((r7 instanceof ObjectWrapper) == true) goto L5;
        IBinder r72 = r7.asBinder();
        Field[] r02 = r72.getClass().getDeclaredFields();
        int r1 = r02.length;
        int r2 = 0;
        Field r4 = null;
        int r3 = 0;
    L7:
        if (r2 >= r1) goto L13;
        Field r5 = r02[r2];
        if (r5.isSynthetic() == true) goto L11;
        r3 = r3 + 1;
        r4 = r5;
    L11:
        r2 = r2 + 1;
        goto L7
    L13:
        if (r3 != 1) goto L28;
        Preconditions.checkNotNull(r4);
        if (r4.isAccessible() == true) goto L26;
        r4.setAccessible(true);
        return (T) r4.get(r72);
    L19:
        e = move-exception;
        throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
    L22:
        e = move-exception;
        throw new IllegalArgumentException("Binder object is null.", e);
    L26:
        throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    L28:
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + r02.length);
    L5:
        return (T) ((ObjectWrapper) r7).zza;
    }

    @KeepForSdk
    public static <T> IObjectWrapper wrap(T r1) {
        return new ObjectWrapper(r1);
    }
}
