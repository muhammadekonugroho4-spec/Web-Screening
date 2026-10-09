package androidx.compose.ui.focus;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "Landroidx/compose/ui/focus/y;", "", "<init>", "(Ljava/lang/String;I)V", "", "isFocused", "()Z", "getHasFocus", "hasFocus", "isCaptured", "Active", "ActiveParent", "Captured", "Inactive", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum FocusStateImpl extends Enum<FocusStateImpl> implements y {
    public static final FocusStateImpl Active = null;
    public static final FocusStateImpl ActiveParent = null;
    public static final FocusStateImpl Captured = null;
    public static final FocusStateImpl Inactive = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FocusStateImpl[] f17003a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f17004b = null;

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17005a = null;

        static {
            int[] r02 = new int[FocusStateImpl.values().length];
            r02[FocusStateImpl.Captured.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L13:
            r02[FocusStateImpl.Active.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L19:
            r02[FocusStateImpl.ActiveParent.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L15:
            r02[FocusStateImpl.Inactive.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L7:
            f17005a = r02;
        }
    }

    static {
        Active = new FocusStateImpl("Active", 0);
        ActiveParent = new FocusStateImpl("ActiveParent", 1);
        Captured = new FocusStateImpl("Captured", 2);
        Inactive = new FocusStateImpl("Inactive", 3);
        FocusStateImpl[] r02 = a();
        f17003a = r02;
        f17004b = kotlin.enums.b.a(r02);
    }

    FocusStateImpl(String r1, int r2) {
    }

    public static final /* synthetic */ FocusStateImpl[] a() {
        return new FocusStateImpl[]{Active, ActiveParent, Captured, Inactive};
    }

    public static kotlin.enums.a getEntries() {
        return f17004b;
    }

    public static FocusStateImpl valueOf(String r1) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, r1);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) f17003a.clone();
    }

    @Override // androidx.compose.ui.focus.y
    public boolean getHasFocus() {
        int r02 = a.f17005a[ordinal()];
        if (r02 != 1) goto L5;
    L14:
        return true;
    L5:
        if (r02 == 2) goto L14;
        if (r02 == 3) goto L14;
        if (r02 != 4) goto L13;
        return false;
    L13:
        throw new NoWhenBranchMatchedException();
    }

    public boolean isCaptured() {
        int r02 = a.f17005a[ordinal()];
        if (r02 != 1) goto L5;
        return true;
    L5:
        if (r02 != 2) goto L7;
        return false;
    L7:
        if (r02 != 3) goto L9;
        return false;
    L9:
        if (r02 != 4) goto L12;
        return false;
    L12:
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.y
    public boolean isFocused() {
        int r02 = a.f17005a[ordinal()];
        if (r02 != 1) goto L5;
    L15:
        return true;
    L5:
        if (r02 == 2) goto L15;
        if (r02 != 3) goto L9;
        return false;
    L9:
        if (r02 != 4) goto L12;
        return false;
    L12:
        throw new NoWhenBranchMatchedException();
    }
}
