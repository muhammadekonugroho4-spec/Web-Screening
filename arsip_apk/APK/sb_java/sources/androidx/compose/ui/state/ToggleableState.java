package androidx.compose.ui.state;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/state/ToggleableState;", "", "<init>", "(Ljava/lang/String;I)V", "On", "Off", "Indeterminate", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum ToggleableState extends Enum<ToggleableState> {
    public static final ToggleableState Indeterminate = null;
    public static final ToggleableState Off = null;
    public static final ToggleableState On = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ToggleableState[] f19613a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f19614b = null;

    static {
        On = new ToggleableState("On", 0);
        Off = new ToggleableState("Off", 1);
        Indeterminate = new ToggleableState("Indeterminate", 2);
        ToggleableState[] r02 = a();
        f19613a = r02;
        f19614b = b.a(r02);
    }

    ToggleableState(String r1, int r2) {
    }

    public static final /* synthetic */ ToggleableState[] a() {
        return new ToggleableState[]{On, Off, Indeterminate};
    }

    public static kotlin.enums.a getEntries() {
        return f19614b;
    }

    public static ToggleableState valueOf(String r1) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, r1);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) f19613a.clone();
    }
}
