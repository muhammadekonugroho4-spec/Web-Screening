package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzpf {
    private final Map<zzpe, zzoy<?, ?>> zza;
    private final Map<Class<?>, zzpk<?, ?>> zzb;

    public /* synthetic */ zzpf(zzpc r1, zzph r2) {
        this(r1);
    }

    public static /* bridge */ /* synthetic */ Map zza(zzpf r02) {
        return r02.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzpf r02) {
        return r02.zzb;
    }

    public /* synthetic */ zzpf(zzph r1) {
        this();
    }

    public final <KeyT extends zzbo, PrimitiveT> zzpf zza(zzoy<KeyT, PrimitiveT> r5) throws GeneralSecurityException {
        if (r5 == null) goto L15;
        zzpe r02 = new zzpe(r5.zza(), r5.zzb(), null);
        if (this.zza.containsKey(r02) == false) goto L12;
        zzoy<?, ?> r1 = this.zza.get(r02);
        if (r1.equals(r5) == false) goto L11;
        if (r5.equals(r1) == false) goto L11;
        return this;
    L11:
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + String.valueOf(r02));
    L12:
        this.zza.put(r02, r5);
        return this;
    L15:
        throw new NullPointerException("primitive constructor must be non-null");
    }

    private zzpf() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzpf(zzpc r3) {
        this.zza = new HashMap(zzpc.zzb(r3));
        this.zzb = new HashMap(zzpc.zzc(r3));
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzpf zza(zzpk<InputPrimitiveT, WrapperPrimitiveT> r4) throws GeneralSecurityException {
        if (r4 == null) goto L15;
        Class<WrapperPrimitiveT> r02 = r4.zzb();
        if (this.zzb.containsKey(r02) == false) goto L12;
        zzpk<?, ?> r1 = this.zzb.get(r02);
        if (r1.equals(r4) == false) goto L11;
        if (r4.equals(r1) == false) goto L11;
        return this;
    L11:
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + String.valueOf(r02));
    L12:
        this.zzb.put(r02, r4);
        return this;
    L15:
        throw new NullPointerException("wrapper must be non-null");
    }

    public final zzpc zza() {
        return new zzpc(this, null);
    }
}
