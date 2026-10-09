package androidx.compose.ui.platform;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Shown", "Hidden", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum TextToolbarStatus extends Enum<TextToolbarStatus> {
    public static final TextToolbarStatus Hidden = null;
    public static final TextToolbarStatus Shown = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TextToolbarStatus[] f19219a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f19220b = null;

    static {
        Shown = new TextToolbarStatus("Shown", 0);
        Hidden = new TextToolbarStatus("Hidden", 1);
        TextToolbarStatus[] r02 = a();
        f19219a = r02;
        f19220b = kotlin.enums.b.a(r02);
    }

    TextToolbarStatus(String r1, int r2) {
    }

    public static final /* synthetic */ TextToolbarStatus[] a() {
        return new TextToolbarStatus[]{Shown, Hidden};
    }

    public static kotlin.enums.a getEntries() {
        return f19220b;
    }

    public static TextToolbarStatus valueOf(String r1) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, r1);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) f19219a.clone();
    }
}
