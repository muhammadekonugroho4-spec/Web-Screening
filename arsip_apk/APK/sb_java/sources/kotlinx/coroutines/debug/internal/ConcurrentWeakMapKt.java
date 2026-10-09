package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0000\u001a\u000e\u0010\b\u001a\u00020\u0006*\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\n\u001a\u00020\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"MAGIC", "", "MIN_CAPACITY", "REHASH", "Lkotlinx/coroutines/internal/Symbol;", "MARKED_NULL", "Lkotlinx/coroutines/debug/internal/Marked;", "MARKED_TRUE", "mark", "", "noImpl", "", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConcurrentWeakMapKt {
    private static final int MAGIC = -1640531527;
    private static final Marked MARKED_NULL = null;
    private static final Marked MARKED_TRUE = null;
    private static final int MIN_CAPACITY = 16;
    private static final Symbol REHASH = null;

    static {
        REHASH = new Symbol("REHASH");
        MARKED_NULL = new Marked(null);
        MARKED_TRUE = new Marked(Boolean.TRUE);
    }

    public static final /* synthetic */ Symbol access$getREHASH$p() {
        return REHASH;
    }

    public static final /* synthetic */ Marked access$mark(Object r02) {
        return mark(r02);
    }

    public static final /* synthetic */ Void access$noImpl() {
        return noImpl();
    }

    private static final Marked mark(Object r1) {
        if (r1 != null) goto L6;
        return MARKED_NULL;
    L6:
        if (p.g(r1, Boolean.TRUE) == false) goto L10;
        return MARKED_TRUE;
    L10:
        return new Marked(r1);
    }

    private static final Void noImpl() {
        throw new UnsupportedOperationException("not implemented");
    }
}
