package com.google.android.gms.internal.auth;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzgo implements Map.Entry, Comparable {
    final /* synthetic */ zzgu zza;
    private final Comparable zzb;
    private Object zzc;

    public zzgo(zzgu r1, Comparable r2, Object r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    private static final boolean zzb(Object r02, Object r1) {
        if (r02 != null) goto L9;
        if (r1 == null) goto L6;
        return false;
    L6:
        return true;
    L9:
        return r02.equals(r1);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r2) {
        return this.zzb.compareTo(((zzgo) r2).zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof Map.Entry) == true) goto L8;
        return false;
    L8:
        Map.Entry r52 = (Map.Entry) r5;
        if (zzb(this.zzb, r52.getKey()) == true) goto L11;
    L13:
        return false;
    L11:
        if (zzb(this.zzc, r52.getValue()) == false) goto L13;
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable r02 = this.zzb;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        Object r2 = this.zzc;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r03 ^ r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        zzgu.zzi(this.zza);
        Object r02 = this.zzc;
        this.zzc = r2;
        return r02;
    }

    public final String toString() {
        return String.valueOf(this.zzb) + ContainerUtils.KEY_VALUE_DELIMITER + String.valueOf(this.zzc);
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
