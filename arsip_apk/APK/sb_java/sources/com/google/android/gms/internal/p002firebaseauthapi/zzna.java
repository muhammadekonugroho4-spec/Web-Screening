package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class zzna {
    private static final Logger zza = null;
    private static final zzna zzb = null;
    private ConcurrentMap<String, zzbn<?>> zzc;
    private ConcurrentMap<String, Boolean> zzd;

    static {
        zza = Logger.getLogger(zzna.class.getName());
        zzb = new zzna();
    }

    public zzna() {
        this.zzc = new ConcurrentHashMap();
        this.zzd = new ConcurrentHashMap();
    }

    private final synchronized zzbn<?> zzc(String r4) throws GeneralSecurityException {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.zzc.containsKey(r4) == false) goto L11;
        zzbn<?> r42 = this.zzc.get(r4);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r42;
    L11:
        throw new GeneralSecurityException("No key manager found for key type " + r4);     // Catch: Throwable -> L8
    }

    public final <P> zzbn<P> zza(String r5, Class<P> r6) throws GeneralSecurityException {
        zzbn<P> r52 = (zzbn<P>) zzc(r5);
        if (r52.zza().equals(r6) == false) goto L6;
        return r52;
    L6:
        throw new GeneralSecurityException("Primitive type " + r6.getName() + " not supported by key manager of type " + String.valueOf(r52.getClass()) + ", which only supports: " + String.valueOf(r52.zza()));
    }

    public final boolean zzb(String r2) {
        return this.zzd.get(r2).booleanValue();
    }

    public final zzbn<?> zza(String r1) throws GeneralSecurityException {
        return zzc(r1);
    }

    public static zzna zza() {
        return zzb;
    }

    private final synchronized void zza(zzbn<?> r7, boolean r8, boolean r9) throws GeneralSecurityException {
        monitor-enter(this);
        String r82 = r7.zzb();     // Catch: Throwable -> L12
        if (r9 == true) goto L6;
    L14:
        zzbn<?> r02 = this.zzc.get(r82);     // Catch: Throwable -> L12
        if (r02 != null) goto L17;
    L21:
        this.zzc.putIfAbsent(r82, r7);     // Catch: Throwable -> L12
        this.zzd.put(r82, Boolean.valueOf(r9));     // Catch: Throwable -> L12
        monitor-exit(this);
        return;
    L17:
        if (r02.getClass().equals(r7.getClass()) == true) goto L21;
        zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + r82);     // Catch: Throwable -> L12
        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{r82, r02.getClass().getName(), r7.getClass().getName()}));     // Catch: Throwable -> L12
    L6:
        if (this.zzd.containsKey(r82) == false) goto L14;
        if (this.zzd.get(r82).booleanValue() == true) goto L14;
        throw new GeneralSecurityException("New keys are already disallowed for key type " + r82);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    public final synchronized <P> void zza(zzbn<P> r2, boolean r3) throws GeneralSecurityException {
        monitor-enter(this);
        zza(r2, zzij.zza.zza, r3);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized <P> void zza(zzbn<P> r1, zzij.zza r2, boolean r3) throws GeneralSecurityException {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r2.zza() == false) goto L11;
        zza(r1, false, r3);     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L11:
        throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");     // Catch: Throwable -> L8
    }
}
