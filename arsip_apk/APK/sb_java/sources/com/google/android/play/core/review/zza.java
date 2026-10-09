package com.google.android.play.core.review;

import android.app.PendingIntent;

/* loaded from: classes5.dex */
final class zza extends ReviewInfo {
    private final PendingIntent zza;
    private final boolean zzb;

    public zza(PendingIntent r1, boolean r2) {
        if (r1 == null) goto L7;
        this.zza = r1;
        this.zzb = r2;
        return;
    L7:
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReviewInfo) == false) goto L12;
        ReviewInfo r52 = (ReviewInfo) r5;
        if (this.zza.equals(r52.zza()) == false) goto L12;
        if (this.zzb != r52.zzb()) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        int r02 = (this.zza.hashCode() ^ 1000003) * 1000003;
        if (true == this.zzb) goto L5;
        int r1 = 1237;
    L7:
        return r02 ^ r1;
    L5:
        r1 = 1231;
        goto L7
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.zza.toString() + ", isNoOp=" + this.zzb + "}";
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean zzb() {
        return this.zzb;
    }
}
