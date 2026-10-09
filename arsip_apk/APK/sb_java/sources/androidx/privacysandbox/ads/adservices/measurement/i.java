package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager r02, Uri r1, Executor r2, OutcomeReceiver r3) {
        r02.registerTrigger(r1, r2, r3);
    }
}
