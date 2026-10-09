package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* loaded from: classes5.dex */
abstract class zzjs implements zzjw {
    public zzjs() {
    }

    @Override // com.google.android.recaptcha.internal.zzjw
    public final zzjv zza(CharSequence r4, Charset r5) {
        zzjx r02 = zzb();
        byte[] r42 = r4.toString().getBytes(r5);
        r42.getClass();
        zzjr r1 = (zzjr) r02;
        r1.zza(r42, 0, r42.length);
        return r02.zzb();
    }
}
