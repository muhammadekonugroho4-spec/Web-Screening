package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes5.dex */
final class zad extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ Activity zab;
    final /* synthetic */ int zac;

    public zad(Intent r1, Activity r2, int r3) {
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent r02 = this.zaa;
        if (r02 == null) goto L6;
        this.zab.startActivityForResult(r02, this.zac);
        return;
    }
}
