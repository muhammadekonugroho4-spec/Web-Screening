package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzaf {
    public static final Appendable zza(Appendable r2, Iterator r3, zzag r4, String r5) throws IOException {
        if (r3.hasNext() == false) goto L8;
        Map.Entry r52 = (Map.Entry) r3.next();
        r2.append(zzag.zzd(r52.getKey()));
        r2.append(" : ");
        r2.append(zzag.zzd(r52.getValue()));
    L6:
        if (r3.hasNext() == false) goto L8;
        r2.append(zzag.zzc(r4));
        Map.Entry r53 = (Map.Entry) r3.next();
        r2.append(zzag.zzd(r53.getKey()));
        r2.append(" : ");
        r2.append(zzag.zzd(r53.getValue()));
    L8:
        return r2;
    }
}
