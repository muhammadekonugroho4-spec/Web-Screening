package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zab {
    public final Set zaa;

    public zab(Set r1) {
        Preconditions.checkNotNull(r1);
        this.zaa = Collections.unmodifiableSet(r1);
    }
}
