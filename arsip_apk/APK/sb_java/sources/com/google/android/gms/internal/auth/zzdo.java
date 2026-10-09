package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdo;
import com.google.android.gms.internal.auth.zzdp;

/* loaded from: classes5.dex */
public abstract class zzdo<MessageType extends zzdp<MessageType, BuilderType>, BuilderType extends zzdo<MessageType, BuilderType>> implements zzfv {
    public zzdo() {
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return zza();
    }

    public abstract zzdo zza();

    public abstract zzdo zzb(zzdp r1);

    @Override // com.google.android.gms.internal.auth.zzfv
    public final /* bridge */ /* synthetic */ zzfv zzc(zzfw r2) {
        if (zzh().getClass().isInstance(r2) == false) goto L7;
        return zzb((zzdp) r2);
    L7:
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
