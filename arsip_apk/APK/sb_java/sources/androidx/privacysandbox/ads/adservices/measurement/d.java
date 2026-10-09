package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager r02, WebSourceRegistrationRequest r1, Executor r2, OutcomeReceiver r3) {
        r02.registerWebSource(r1, r2, r3);
    }
}
