package androidx.compose.foundation.text.contextmenu.modifier;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "", "<init>", "(Ljava/lang/String;I)V", "Uninitialized", "Detached", "Attached", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum ToolbarHandlerState extends Enum<ToolbarHandlerState> {
    public static final ToolbarHandlerState Attached = null;
    public static final ToolbarHandlerState Detached = null;
    public static final ToolbarHandlerState Uninitialized = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ToolbarHandlerState[] f9871a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f9872b = null;

    static {
        Uninitialized = new ToolbarHandlerState("Uninitialized", 0);
        Detached = new ToolbarHandlerState("Detached", 1);
        Attached = new ToolbarHandlerState("Attached", 2);
        ToolbarHandlerState[] r02 = a();
        f9871a = r02;
        f9872b = kotlin.enums.b.a(r02);
    }

    ToolbarHandlerState(String r1, int r2) {
    }

    public static final /* synthetic */ ToolbarHandlerState[] a() {
        return new ToolbarHandlerState[]{Uninitialized, Detached, Attached};
    }

    public static kotlin.enums.a getEntries() {
        return f9872b;
    }

    public static ToolbarHandlerState valueOf(String r1) {
        return (ToolbarHandlerState) Enum.valueOf(ToolbarHandlerState.class, r1);
    }

    public static ToolbarHandlerState[] values() {
        return (ToolbarHandlerState[]) f9871a.clone();
    }
}
