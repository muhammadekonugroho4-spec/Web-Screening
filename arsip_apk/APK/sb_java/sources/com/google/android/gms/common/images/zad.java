package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes5.dex */
final class zad {
    public final Uri zaa;

    public zad(Uri r1) {
        this.zaa = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof zad) == true) goto L10;
        return false;
    L10:
        return Objects.equal(((zad) r2).zaa, this.zaa);
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zaa});
    }
}
