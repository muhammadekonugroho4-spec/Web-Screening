package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes3.dex */
public abstract class l {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.functions.p f180325a;

        public a(kotlin.jvm.functions.p r1) {
            this.f180325a = r1;
        }

        @Override // kotlin.sequences.i
        public Iterator iterator() {
            return l.a(this.f180325a);
        }
    }

    public static Iterator a(kotlin.jvm.functions.p r1) {
        kotlin.jvm.internal.p.l(r1, "block");
        j r02 = new j();
        r02.g(IntrinsicsKt__IntrinsicsJvmKt.b(r1, r02, r02));
        return r02;
    }

    public static i b(kotlin.jvm.functions.p r1) {
        kotlin.jvm.internal.p.l(r1, "block");
        return new a(r1);
    }
}
