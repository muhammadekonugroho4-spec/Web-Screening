package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\fJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH\u0007¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u000fJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007¢\u0006\u0004\b\t\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/analytics/ktx/ParametersBuilder;", "", "<init>", "()V", "", Constants.KEY_KEY, "", "value", "Lkotlin/w;", "param", "(Ljava/lang/String;D)V", "", "(Ljava/lang/String;J)V", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;[Landroid/os/Bundle;)V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 1, mv = {2, 1, 0}, xi = 48)
@e
/* loaded from: classes6.dex */
public final class ParametersBuilder {
    private final Bundle zza;

    public ParametersBuilder() {
        this.zza = new Bundle();
    }

    public final Bundle getBundle() {
        return this.zza;
    }

    @e
    public final void param(String r2, double r3) {
        p.l(r2, Constants.KEY_KEY);
        this.zza.putDouble(r2, r3);
    }

    @e
    public final void param(String r2, long r3) {
        p.l(r2, Constants.KEY_KEY);
        this.zza.putLong(r2, r3);
    }

    @e
    public final void param(String r2, Bundle r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.zza.putBundle(r2, r3);
    }

    @e
    public final void param(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.zza.putString(r2, r3);
    }

    @e
    public final void param(String r2, Bundle[] r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.zza.putParcelableArray(r2, r3);
    }
}
