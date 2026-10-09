package androidx.compose.ui.contentcapture;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW_APPEAR", "VIEW_DISAPPEAR", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
enum ContentCaptureEventType extends Enum<ContentCaptureEventType> {
    public static final ContentCaptureEventType VIEW_APPEAR = null;
    public static final ContentCaptureEventType VIEW_DISAPPEAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ContentCaptureEventType[] f16861a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f16862b = null;

    static {
        VIEW_APPEAR = new ContentCaptureEventType("VIEW_APPEAR", 0);
        VIEW_DISAPPEAR = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);
        ContentCaptureEventType[] r02 = a();
        f16861a = r02;
        f16862b = kotlin.enums.b.a(r02);
    }

    ContentCaptureEventType(String r1, int r2) {
    }

    public static final /* synthetic */ ContentCaptureEventType[] a() {
        return new ContentCaptureEventType[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    public static kotlin.enums.a getEntries() {
        return f16862b;
    }

    public static ContentCaptureEventType valueOf(String r1) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, r1);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) f16861a.clone();
    }
}
