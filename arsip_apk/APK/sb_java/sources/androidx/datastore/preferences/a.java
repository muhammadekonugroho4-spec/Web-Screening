package androidx.datastore.preferences;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {
    public static final File a(Context r1, String r2) {
        p.l(r1, "<this>");
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return androidx.datastore.a.a(r1, p.u(r2, ".preferences_pb"));
    }
}
