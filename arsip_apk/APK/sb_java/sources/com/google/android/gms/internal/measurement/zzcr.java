package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzcr implements SharedPreferences {
    private final Map<String, Object> zza;
    private final Set<SharedPreferences.OnSharedPreferenceChangeListener> zzb;

    public zzcr() {
        this.zza = new HashMap();
        this.zzb = new HashSet();
    }

    public static /* bridge */ /* synthetic */ Map zza(zzcr r02) {
        return r02.zza;
    }

    public static /* bridge */ /* synthetic */ Set zzb(zzcr r02) {
        return r02.zzb;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String r2) {
        return this.zza.containsKey(r2);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new zzcu(this, null);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        return this.zza;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String r1, boolean r2) {
        return ((Boolean) zza(r1, Boolean.valueOf(r2))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String r1, float r2) {
        return ((Float) zza(r1, Float.valueOf(r2))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String r1, int r2) {
        return ((Integer) zza(r1, Integer.valueOf(r2))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String r1, long r2) {
        return ((Long) zza(r1, Long.valueOf(r2))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String r1, String r2) {
        return (String) zza(r1, r2);
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String r1, Set<String> r2) {
        return (Set) zza(r1, r2);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener r2) {
        this.zzb.add(r2);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener r2) {
        this.zzb.remove(r2);
    }

    private final <T> T zza(String r2, T r3) {
        T r22 = (T) this.zza.get(r2);
        if (r22 == null) goto L5;
        return r22;
    L5:
        return r3;
    }
}
