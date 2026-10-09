package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzad {
    private static final ImmutableSet<String> zza = null;
    private String zzb;
    private long zzc;
    private Map<String, Object> zzd;

    static {
        zza = ImmutableSet.of("_syn", "_err", "_el");
    }

    public zzad(String r1, long r2, Map<String, Object> r4) {
        this.zzb = r1;
        this.zzc = r2;
        HashMap r12 = new HashMap();
        this.zzd = r12;
        if (r4 == null) goto L6;
        r12.putAll(r4);
        return;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new zzad(this.zzb, this.zzc, new HashMap(this.zzd));
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof zzad) == true) goto L8;
        return false;
    L8:
        zzad r72 = (zzad) r7;
        if (this.zzc == r72.zzc) goto L12;
        return false;
    L12:
        if (this.zzb.equals(r72.zzb) == true) goto L15;
        return false;
    L15:
        return this.zzd.equals(r72.zzd);
    }

    public final int hashCode() {
        int r02 = this.zzb.hashCode() * 31;
        long r1 = this.zzc;
        return ((r02 + ((int) (r1 ^ (r1 >>> 32)))) * 31) + this.zzd.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.zzb + "', timestamp=" + this.zzc + ", params=" + String.valueOf(this.zzd) + "}";
    }

    public final long zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final Map<String, Object> zzc() {
        return this.zzd;
    }

    public final Object zza(String r2) {
        if (this.zzd.containsKey(r2) == true) goto L5;
        return null;
    L5:
        return this.zzd.get(r2);
    }

    public final void zzb(String r1) {
        this.zzb = r1;
    }

    public static Object zza(String r1, Object r2, Object r3) {
        if (zza.contains(r1) == false) goto L9;
        if ((r3 instanceof Double) == false) goto L9;
        return Long.valueOf(Math.round(((Double) r3).doubleValue()));
    L9:
        if (r1.startsWith("_") == false) goto L16;
        if ((r2 instanceof String) == false) goto L13;
        return r3;
    L13:
        if (r2 == null) goto L26;
        return r2;
    L26:
        return r3;
    L16:
        if ((r2 instanceof Double) == false) goto L19;
        return r3;
    L19:
        if ((r2 instanceof Long) == false) goto L23;
        return Long.valueOf(Math.round(((Double) r3).doubleValue()));
    L23:
        if ((r2 instanceof String) == false) goto L26;
        return r3.toString();
    }

    public final void zza(String r2, Object r3) {
        if (r3 != null) goto L5;
        this.zzd.remove(r2);
        return;
    L5:
        Object r32 = zza(r2, this.zzd.get(r2), r3);
        this.zzd.put(r2, r32);
    }
}
