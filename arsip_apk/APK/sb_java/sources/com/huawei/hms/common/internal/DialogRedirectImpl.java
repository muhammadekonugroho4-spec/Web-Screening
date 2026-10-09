package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes6.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f39108a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39109b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f39110c;

    public DialogRedirectImpl(Intent r1, Activity r2, int r3) {
        this.f39110c = r1;
        this.f39108a = r2;
        this.f39109b = r3;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Intent r02 = this.f39110c;
        if (r02 == null) goto L6;
        this.f39108a.startActivityForResult(r02, this.f39109b);
        return;
    }
}
