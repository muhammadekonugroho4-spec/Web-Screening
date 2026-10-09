package androidx.compose.ui.node;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/Invalidation;", "", "<init>", "(Ljava/lang/String;I)V", "LookaheadMeasurement", "LookaheadPlacement", "Measurement", "Placement", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum Invalidation extends Enum<Invalidation> {
    public static final Invalidation LookaheadMeasurement = null;
    public static final Invalidation LookaheadPlacement = null;
    public static final Invalidation Measurement = null;
    public static final Invalidation Placement = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Invalidation[] f18518a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f18519b = null;

    static {
        LookaheadMeasurement = new Invalidation("LookaheadMeasurement", 0);
        LookaheadPlacement = new Invalidation("LookaheadPlacement", 1);
        Measurement = new Invalidation("Measurement", 2);
        Placement = new Invalidation("Placement", 3);
        Invalidation[] r02 = a();
        f18518a = r02;
        f18519b = kotlin.enums.b.a(r02);
    }

    Invalidation(String r1, int r2) {
    }

    public static final /* synthetic */ Invalidation[] a() {
        return new Invalidation[]{LookaheadMeasurement, LookaheadPlacement, Measurement, Placement};
    }

    public static kotlin.enums.a getEntries() {
        return f18519b;
    }

    public static Invalidation valueOf(String r1) {
        return (Invalidation) Enum.valueOf(Invalidation.class, r1);
    }

    public static Invalidation[] values() {
        return (Invalidation[]) f18518a.clone();
    }
}
