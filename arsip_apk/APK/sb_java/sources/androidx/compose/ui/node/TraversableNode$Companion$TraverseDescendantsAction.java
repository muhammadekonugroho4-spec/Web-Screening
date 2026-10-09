package androidx.compose.ui.node;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"androidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction", "", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<init>", "(Ljava/lang/String;I)V", "ContinueTraversal", "SkipSubtreeAndContinueTraversal", "CancelTraversal", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum TraversableNode$Companion$TraverseDescendantsAction extends Enum<TraversableNode$Companion$TraverseDescendantsAction> {
    public static final TraversableNode$Companion$TraverseDescendantsAction CancelTraversal = null;
    public static final TraversableNode$Companion$TraverseDescendantsAction ContinueTraversal = null;
    public static final TraversableNode$Companion$TraverseDescendantsAction SkipSubtreeAndContinueTraversal = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TraversableNode$Companion$TraverseDescendantsAction[] f18764a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f18765b = null;

    static {
        ContinueTraversal = new TraversableNode$Companion$TraverseDescendantsAction("ContinueTraversal", 0);
        SkipSubtreeAndContinueTraversal = new TraversableNode$Companion$TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
        CancelTraversal = new TraversableNode$Companion$TraverseDescendantsAction("CancelTraversal", 2);
        TraversableNode$Companion$TraverseDescendantsAction[] r02 = a();
        f18764a = r02;
        f18765b = kotlin.enums.b.a(r02);
    }

    TraversableNode$Companion$TraverseDescendantsAction(String r1, int r2) {
    }

    public static final /* synthetic */ TraversableNode$Companion$TraverseDescendantsAction[] a() {
        return new TraversableNode$Companion$TraverseDescendantsAction[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
    }

    public static kotlin.enums.a getEntries() {
        return f18765b;
    }

    public static TraversableNode$Companion$TraverseDescendantsAction valueOf(String r1) {
        return (TraversableNode$Companion$TraverseDescendantsAction) Enum.valueOf(TraversableNode$Companion$TraverseDescendantsAction.class, r1);
    }

    public static TraversableNode$Companion$TraverseDescendantsAction[] values() {
        return (TraversableNode$Companion$TraverseDescendantsAction[]) f18764a.clone();
    }
}
