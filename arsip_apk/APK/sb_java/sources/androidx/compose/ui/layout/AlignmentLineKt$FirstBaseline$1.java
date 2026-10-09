package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements kotlin.jvm.functions.p {

    /* renamed from: a, reason: collision with root package name */
    public static final AlignmentLineKt$FirstBaseline$1 f18227a = null;

    static {
        f18227a = new AlignmentLineKt$FirstBaseline$1();
    }

    public AlignmentLineKt$FirstBaseline$1() {
        super(2, kotlin.math.b.class, "min", "min(II)I", 1);
    }

    @Override // kotlin.jvm.functions.p
    public /* bridge */ /* synthetic */ Object invoke(Object r1, Object r2) {
        return s(((Number) r1).intValue(), ((Number) r2).intValue());
    }

    public final Integer s(int r1, int r2) {
        return Integer.valueOf(Math.min(r1, r2));
    }
}
