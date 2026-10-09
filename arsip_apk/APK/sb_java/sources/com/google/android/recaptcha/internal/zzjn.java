package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Queue;

/* loaded from: classes5.dex */
public abstract class zzjn extends zzjl implements Queue {
    public zzjn() {
    }

    @Override // java.util.Queue
    public final Object element() {
        return zzd().element();
    }

    public boolean offer(Object r2) {
        return zzd().offer(r2);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zzd().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zzd().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zzd().remove();
    }

    @Override // com.google.android.recaptcha.internal.zzjl
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    public abstract Queue zzd();
}
