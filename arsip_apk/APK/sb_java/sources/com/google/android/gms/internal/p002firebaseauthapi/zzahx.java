package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzahx {
    private List<String> zza;

    public zzahx() {
        this(null);
    }

    public static zzahx zza() {
        return new zzahx(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    private zzahx(List<String> r1) {
        this.zza = new ArrayList();
    }

    public zzahx(int r2, List<String> r3) {
        if (r3 != null) goto L5;
    L13:
        this.zza = Collections.EMPTY_LIST;
        return;
    L5:
        if (r3.isEmpty() == true) goto L13;
        int r22 = 0;
    L9:
        if (r22 >= r3.size()) goto L11;
        r3.set(r22, Strings.emptyToNull(r3.get(r22)));
        r22 = r22 + 1;
        goto L9
    L11:
        this.zza = Collections.unmodifiableList(r3);
    }
}
