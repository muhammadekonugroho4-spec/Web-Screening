package androidx.compose.ui.layout;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMinMax;", "", "<init>", "(Ljava/lang/String;I)V", "Min", "Max", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum IntrinsicMinMax extends Enum<IntrinsicMinMax> {
    public static final IntrinsicMinMax Max = null;
    public static final IntrinsicMinMax Min = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicMinMax[] f18237a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f18238b = null;

    static {
        Min = new IntrinsicMinMax("Min", 0);
        Max = new IntrinsicMinMax("Max", 1);
        IntrinsicMinMax[] r02 = a();
        f18237a = r02;
        f18238b = kotlin.enums.b.a(r02);
    }

    IntrinsicMinMax(String r1, int r2) {
    }

    public static final /* synthetic */ IntrinsicMinMax[] a() {
        return new IntrinsicMinMax[]{Min, Max};
    }

    public static kotlin.enums.a getEntries() {
        return f18238b;
    }

    public static IntrinsicMinMax valueOf(String r1) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, r1);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) f18237a.clone();
    }
}
