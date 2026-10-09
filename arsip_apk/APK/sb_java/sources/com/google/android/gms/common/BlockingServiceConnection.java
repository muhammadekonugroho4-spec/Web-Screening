package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
/* loaded from: classes5.dex */
public class BlockingServiceConnection implements ServiceConnection {
    boolean zza;
    private final BlockingQueue zzb;

    public BlockingServiceConnection() {
        this.zza = false;
        this.zzb = new LinkedBlockingQueue();
    }

    @KeepForSdk
    public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.zza == true) goto L7;
        this.zza = true;
        return (IBinder) this.zzb.take();
    L7:
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @KeepForSdk
    public IBinder getServiceWithTimeout(long r2, TimeUnit r4) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zza == true) goto L10;
        this.zza = true;
        IBinder r22 = (IBinder) this.zzb.poll(r2, r4);
        if (r22 == null) goto L8;
        return r22;
    L8:
        throw new TimeoutException("Timed out waiting for the service connection");
    L10:
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r1, IBinder r2) {
        this.zzb.add(r2);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName r1) {
    }
}
