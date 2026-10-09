package com.google.android.gms.internal.time;

import java.util.Random;

/* loaded from: classes5.dex */
final class zzdy extends ThreadLocal {
    public zzdy() {
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
