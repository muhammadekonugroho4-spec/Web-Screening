package androidx.compose.ui.layout;

import com.google.common.net.HttpHeaders;
import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "<init>", "(Ljava/lang/String;I)V", HttpHeaders.WIDTH, "Height", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum IntrinsicWidthHeight extends Enum<IntrinsicWidthHeight> {
    public static final IntrinsicWidthHeight Height = null;
    public static final IntrinsicWidthHeight Width = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicWidthHeight[] f18239a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f18240b = null;

    static {
        Width = new IntrinsicWidthHeight(HttpHeaders.WIDTH, 0);
        Height = new IntrinsicWidthHeight("Height", 1);
        IntrinsicWidthHeight[] r02 = a();
        f18239a = r02;
        f18240b = kotlin.enums.b.a(r02);
    }

    IntrinsicWidthHeight(String r1, int r2) {
    }

    public static final /* synthetic */ IntrinsicWidthHeight[] a() {
        return new IntrinsicWidthHeight[]{Width, Height};
    }

    public static kotlin.enums.a getEntries() {
        return f18240b;
    }

    public static IntrinsicWidthHeight valueOf(String r1) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, r1);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) f18239a.clone();
    }
}
