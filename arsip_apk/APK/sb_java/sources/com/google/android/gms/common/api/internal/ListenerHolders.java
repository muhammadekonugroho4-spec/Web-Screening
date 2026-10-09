package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes5.dex */
public class ListenerHolders {
    private final Set zaa;

    public ListenerHolders() {
        this.zaa = Collections.newSetFromMap(new WeakHashMap());
    }

    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(L r1, Looper r2, String r3) {
        Preconditions.checkNotNull(r1, "Listener must not be null");
        Preconditions.checkNotNull(r2, "Looper must not be null");
        Preconditions.checkNotNull(r3, "Listener type must not be null");
        return new ListenerHolder(r2, r1, r3);
    }

    @KeepForSdk
    public static <L> ListenerHolder.ListenerKey<L> createListenerKey(L r1, String r2) {
        Preconditions.checkNotNull(r1, "Listener must not be null");
        Preconditions.checkNotNull(r2, "Listener type must not be null");
        Preconditions.checkNotEmpty(r2, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey(r1, r2);
    }

    public final ListenerHolder zaa(Object r2, Looper r3, String r4) {
        Set r42 = this.zaa;
        ListenerHolder r22 = createListenerHolder(r2, r3, "NO_TYPE");
        r42.add(r22);
        return r22;
    }

    public final void zab() {
        Iterator r02 = this.zaa.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((ListenerHolder) r02.next()).clear();
        goto L4
    L6:
        this.zaa.clear();
    }

    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(L r1, Executor r2, String r3) {
        Preconditions.checkNotNull(r1, "Listener must not be null");
        Preconditions.checkNotNull(r2, "Executor must not be null");
        Preconditions.checkNotNull(r3, "Listener type must not be null");
        return new ListenerHolder(r2, r1, r3);
    }
}
