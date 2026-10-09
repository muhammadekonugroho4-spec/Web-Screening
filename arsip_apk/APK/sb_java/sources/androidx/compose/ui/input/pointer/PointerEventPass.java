package androidx.compose.ui.input.pointer;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "<init>", "(Ljava/lang/String;I)V", "Initial", "Main", "Final", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum PointerEventPass extends Enum<PointerEventPass> {
    public static final PointerEventPass Final = null;
    public static final PointerEventPass Initial = null;
    public static final PointerEventPass Main = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PointerEventPass[] f18087a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f18088b = null;

    static {
        Initial = new PointerEventPass("Initial", 0);
        Main = new PointerEventPass("Main", 1);
        Final = new PointerEventPass("Final", 2);
        PointerEventPass[] r02 = a();
        f18087a = r02;
        f18088b = kotlin.enums.b.a(r02);
    }

    PointerEventPass(String r1, int r2) {
    }

    public static final /* synthetic */ PointerEventPass[] a() {
        return new PointerEventPass[]{Initial, Main, Final};
    }

    public static kotlin.enums.a getEntries() {
        return f18088b;
    }

    public static PointerEventPass valueOf(String r1) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, r1);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) f18087a.clone();
    }
}
