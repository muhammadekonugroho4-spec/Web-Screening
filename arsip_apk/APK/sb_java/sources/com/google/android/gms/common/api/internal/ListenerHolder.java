package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes5.dex */
public final class ListenerHolder<L> {
    private final Executor zaa;
    private volatile Object zab;
    private volatile ListenerKey zac;

    @KeepForSdk
    public static final class ListenerKey<L> {
        private final Object zaa;
        private final String zab;

        @KeepForSdk
        public ListenerKey(L r1, String r2) {
            this.zaa = r1;
            this.zab = r2;
        }

        @KeepForSdk
        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof ListenerKey) == true) goto L8;
            return false;
        L8:
            ListenerKey r52 = (ListenerKey) r5;
            if (this.zaa == r52.zaa) goto L11;
        L13:
            return false;
        L11:
            if (this.zab.equals(r52.zab) == false) goto L13;
            return true;
        }

        @KeepForSdk
        public int hashCode() {
            return (System.identityHashCode(this.zaa) * 31) + this.zab.hashCode();
        }

        @KeepForSdk
        public String toIdString() {
            return this.zab + "@" + System.identityHashCode(this.zaa);
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(L r1);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    public ListenerHolder(Looper r2, L r3, String r4) {
        this.zaa = new HandlerExecutor(r2);
        this.zab = Preconditions.checkNotNull(r3, "Listener must not be null");
        this.zac = new ListenerKey(r3, Preconditions.checkNotEmpty(r4));
    }

    @KeepForSdk
    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    @KeepForSdk
    public boolean hasListener() {
        if (this.zab == null) goto L6;
        return true;
    L6:
        return false;
    }

    @KeepForSdk
    public void notifyListener(final Notifier<? super L> r2) {
        Preconditions.checkNotNull(r2, "Notifier must not be null");
        Runnable r02 = new zacb(this, r2);
        this.zaa.execute(r02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zaa(Notifier r2) {
        Object r02 = this.zab;
        if (r02 != null) goto L11;
        r2.onNotifyListenerFailed();
        return;
    L11:
        r2.notifyListener(r02);     // Catch: RuntimeException -> L8
        return;
    L8:
        e = move-exception;
        r2.onNotifyListenerFailed();
        throw e;
    }

    @KeepForSdk
    public ListenerHolder(Executor r2, L r3, String r4) {
        this.zaa = (Executor) Preconditions.checkNotNull(r2, "Executor must not be null");
        this.zab = Preconditions.checkNotNull(r3, "Listener must not be null");
        this.zac = new ListenerKey(r3, Preconditions.checkNotEmpty(r4));
    }
}
