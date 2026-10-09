package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzag {
    private final String zza;

    private zzag(String r1) {
        this.zza = ",\n  ";
    }

    public static zzag zza(String r1) {
        return new zzag(",\n  ");
    }

    public static /* bridge */ /* synthetic */ String zzc(zzag r02) {
        return r02.zza;
    }

    public static final CharSequence zzd(Object r1) {
        r1.getClass();
        if ((r1 instanceof CharSequence) == false) goto L7;
        return (CharSequence) r1;
    L7:
        return r1.toString();
    }

    public final Appendable zzb(Appendable r2, Iterator r3) throws IOException {
        if (r3.hasNext() == false) goto L8;
        r2.append(zzd(r3.next()));
    L6:
        if (r3.hasNext() == false) goto L8;
        r2.append(this.zza);
        r2.append(zzd(r3.next()));
    L8:
        return r2;
    }
}
