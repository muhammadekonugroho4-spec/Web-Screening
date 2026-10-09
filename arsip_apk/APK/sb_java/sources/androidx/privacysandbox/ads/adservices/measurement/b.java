package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.view.InputEvent;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager r02, Uri r1, InputEvent r2, Executor r3, OutcomeReceiver r4) {
        r02.registerSource(r1, r2, r3, r4);
    }
}
