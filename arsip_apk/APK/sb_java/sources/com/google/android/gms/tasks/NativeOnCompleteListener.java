package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public NativeOnCompleteListener(long r1) {
        this.zza = r1;
    }

    @KeepForSdk
    public static void createAndAddCallback(Task<Object> r1, long r2) {
        r1.addOnCompleteListener(new NativeOnCompleteListener(r2));
    }

    @KeepForSdk
    public native void nativeOnComplete(long r1, Object r3, boolean r4, boolean r5, String r6);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(Task<Object> r10) {
        if (r10.isSuccessful() == false) goto L6;
        Object r5 = r10.getResult();
        String r8 = null;
    L11:
        nativeOnComplete(this.zza, r5, r10.isSuccessful(), r10.isCanceled(), r8);
        return;
    L6:
        if (r10.isCanceled() == true) goto L10;
        Exception r02 = r10.getException();
        if (r02 == null) goto L10;
        r8 = r02.getMessage();
        r5 = null;
    L10:
        r5 = null;
        r8 = null;
        goto L11
    }
}
