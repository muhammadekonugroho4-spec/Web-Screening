package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes3.dex */
public abstract class o {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180115a = null;

        static {
            int[] r02 = new int[Variance.values().length];
            r02[Variance.INVARIANT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r02[Variance.IN_VARIANCE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r02[Variance.OUT_VARIANCE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            f180115a = r02;
        }
    }

    public static final TypeVariance a(Variance r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        int r12 = a.f180115a[r1.ordinal()];
        if (r12 == 1) goto L15;
        if (r12 == 2) goto L13;
        if (r12 != 3) goto L11;
        return TypeVariance.OUT;
    L11:
        throw new NoWhenBranchMatchedException();
    L13:
        return TypeVariance.IN;
    L15:
        return TypeVariance.INV;
    }
}
