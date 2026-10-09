package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager r02, Executor r1, OutcomeReceiver r2) {
        r02.getMeasurementApiStatus(r1, r2);
    }
}
