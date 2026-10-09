package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements kotlin.jvm.functions.l {

    /* renamed from: a, reason: collision with root package name */
    public static final SequencesKt___SequencesKt$flatMap$2 f180293a = null;

    static {
        f180293a = new SequencesKt___SequencesKt$flatMap$2();
    }

    public SequencesKt___SequencesKt$flatMap$2() {
        super(1, i.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.l
    public /* bridge */ /* synthetic */ Object invoke(Object r1) {
        return s((i) r1);
    }

    public final Iterator s(i r2) {
        kotlin.jvm.internal.p.l(r2, "p0");
        return r2.iterator();
    }
}
