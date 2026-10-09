package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
final class zzjp extends zzjk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzjp(Iterable r1, int r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable r02 = this.zza;
        if ((r02 instanceof List) == false) goto L6;
        List r03 = (List) r02;
        return r03.subList(Math.min(r03.size(), this.zzb), r03.size()).iterator();
    L6:
        int r1 = this.zzb;
        Iterator r04 = r02.iterator();
        r04.getClass();
        int r2 = 0;
        if (r1 < 0) goto L9;
        boolean r3 = true;
    L10:
        zzjf.zzb(r3, "numberToAdvance must be nonnegative");
    L11:
        if (r2 >= r1) goto L16;
        if (r04.hasNext() == false) goto L16;
        r04.next();
        r2 = r2 + 1;
    L16:
        return new zzjo(this, r04);
    L9:
        r3 = false;
        goto L10
    }
}
