package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes5.dex */
final class zzdv {
    private final Deque zza;

    private zzdv(boolean r2) {
        this.zza = new ArrayDeque(16);
    }

    public static zzdv zza() {
        return new zzdv(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty() == false) goto L7;
        return 0;
    L7:
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long r2) {
        this.zza.pop();
        this.zza.push(Long.valueOf(r2));
    }

    public final void zzb() throws IOException {
        if (this.zza.isEmpty() == false) goto L6;
        return;
    L6:
        throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", new Object[]{Integer.valueOf(this.zza.size()), Long.valueOf(zzh())}));
    }

    public final void zzc() throws IOException {
        long r02 = zzh();
        if (r02 >= 0) goto L11;
        if (r02 == (-5)) goto L9;
        this.zza.pop();
        return;
    L9:
        throw new IOException("expected a value for dangling key in indefinite-length map");
    L11:
        throw new IOException(String.format("expected indefinite length scope but found %s", new Object[]{Long.valueOf(r02)}));
    }

    public final void zzd() throws IOException {
        long r02 = zzh();
        if (r02 == (-1)) goto L9;
        if (r02 == (-2)) goto L7;
        return;
    L7:
        r02 = -2;
    L9:
        throw new IOException(String.format("expected non-string scope but found %s", new Object[]{Long.valueOf(r02)}));
    }

    public final void zze(long r5) throws IOException {
        long r02 = zzh();
        if (r02 != r5) goto L5;
        return;
    L5:
        if (r02 == (-1)) goto L11;
        if (r02 != (-2)) goto L13;
        r02 = -2;
        goto L11
    L13:
        return;
    L11:
        throw new IOException(String.format("expected non-string scope or scope %s but found %s", new Object[]{Long.valueOf(r5), Long.valueOf(r02)}));
    }

    public final void zzf() {
        long r02 = zzh();
        if (r02 != 1) goto L6;
        this.zza.pop();
        return;
    L6:
        if (r02 <= 1) goto L10;
        zzi(r02 - 1);
        return;
    L10:
        if (r02 != (-4)) goto L14;
        zzi(-5);
        return;
    L14:
        if (r02 != (-5)) goto L17;
        zzi(-4);
        return;
    }

    public final void zzg(long r2) {
        this.zza.push(Long.valueOf(r2));
    }
}
