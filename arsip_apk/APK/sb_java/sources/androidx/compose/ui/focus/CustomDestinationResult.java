package androidx.compose.ui.focus;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Cancelled", "Redirected", "RedirectCancelled", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum CustomDestinationResult extends Enum<CustomDestinationResult> {
    public static final CustomDestinationResult Cancelled = null;
    public static final CustomDestinationResult None = null;
    public static final CustomDestinationResult RedirectCancelled = null;
    public static final CustomDestinationResult Redirected = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CustomDestinationResult[] f16959a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f16960b = null;

    static {
        None = new CustomDestinationResult("None", 0);
        Cancelled = new CustomDestinationResult("Cancelled", 1);
        Redirected = new CustomDestinationResult("Redirected", 2);
        RedirectCancelled = new CustomDestinationResult("RedirectCancelled", 3);
        CustomDestinationResult[] r02 = a();
        f16959a = r02;
        f16960b = kotlin.enums.b.a(r02);
    }

    CustomDestinationResult(String r1, int r2) {
    }

    public static final /* synthetic */ CustomDestinationResult[] a() {
        return new CustomDestinationResult[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    public static kotlin.enums.a getEntries() {
        return f16960b;
    }

    public static CustomDestinationResult valueOf(String r1) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, r1);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) f16959a.clone();
    }
}
