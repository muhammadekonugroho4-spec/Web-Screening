package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
final class zzcz extends zzda {
    public /* synthetic */ zzcz(zzdc r1) {
        this();
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final URLConnection zza(URL r1, String r2) throws IOException {
        return r1.openConnection();
    }

    private zzcz() {
    }
}
