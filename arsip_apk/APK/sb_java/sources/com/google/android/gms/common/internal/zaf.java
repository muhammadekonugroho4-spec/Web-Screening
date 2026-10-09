package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes5.dex */
final class zaf extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ LifecycleFragment zab;

    public zaf(Intent r1, LifecycleFragment r2, int r3) {
        this.zaa = r1;
        this.zab = r2;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent r02 = this.zaa;
        if (r02 == null) goto L6;
        this.zab.startActivityForResult(r02, 2);
        return;
    }
}
