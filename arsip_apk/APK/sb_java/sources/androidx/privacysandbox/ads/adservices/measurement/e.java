package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager r02, DeletionRequest r1, Executor r2, OutcomeReceiver r3) {
        r02.deleteRegistrations(r1, r2, r3);
    }
}
