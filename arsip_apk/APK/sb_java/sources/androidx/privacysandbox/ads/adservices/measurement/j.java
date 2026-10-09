package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager r02, WebTriggerRegistrationRequest r1, Executor r2, OutcomeReceiver r3) {
        r02.registerWebTrigger(r1, r2, r3);
    }
}
