package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
final class zzc extends zza {
    public /* synthetic */ zzc(zzb r1) {
        this();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zza
    public final URLConnection zza(URL r1, String r2) throws IOException {
        return r1.openConnection();
    }

    private zzc() {
    }
}
