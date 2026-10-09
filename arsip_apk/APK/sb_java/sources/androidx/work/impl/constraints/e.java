package androidx.work.impl.constraints;

import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ boolean a(NetworkRequest r02, NetworkCapabilities r1) {
        return r02.canBeSatisfiedBy(r1);
    }
}
