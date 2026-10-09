package androidx.work.impl.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/model/WorkName;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "workSpecId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WorkName {

    /* renamed from: a, reason: collision with root package name */
    public final String f29421a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29422b;

    public WorkName(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, "workSpecId");
        this.f29421a = r2;
        this.f29422b = r3;
    }

    public final String a() {
        return this.f29421a;
    }

    public final String b() {
        return this.f29422b;
    }
}
