package androidx.compose.animation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "", "<init>", "(Ljava/lang/String;I)V", "PreEnter", "Visible", "PostExit", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum EnterExitState extends Enum<EnterExitState> {
    public static final EnterExitState PostExit = null;
    public static final EnterExitState PreEnter = null;
    public static final EnterExitState Visible = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnterExitState[] f6543a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f6544b = null;

    static {
        PreEnter = new EnterExitState("PreEnter", 0);
        Visible = new EnterExitState("Visible", 1);
        PostExit = new EnterExitState("PostExit", 2);
        EnterExitState[] r02 = a();
        f6543a = r02;
        f6544b = kotlin.enums.b.a(r02);
    }

    EnterExitState(String r1, int r2) {
    }

    public static final /* synthetic */ EnterExitState[] a() {
        return new EnterExitState[]{PreEnter, Visible, PostExit};
    }

    public static kotlin.enums.a getEntries() {
        return f6544b;
    }

    public static EnterExitState valueOf(String r1) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, r1);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) f6543a.clone();
    }
}
