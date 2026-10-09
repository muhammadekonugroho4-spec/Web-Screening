package com.google.android.gms.internal.time;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzgn implements Comparator {
    public zzgn() {
    }

    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        return ((String) ((Map.Entry) r1).getKey()).compareTo((String) ((Map.Entry) r2).getKey());
    }
}
