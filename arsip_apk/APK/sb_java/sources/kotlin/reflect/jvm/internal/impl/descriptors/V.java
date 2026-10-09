package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* loaded from: classes3.dex */
public interface V {

    public static final class a implements V {

        /* renamed from: a, reason: collision with root package name */
        public static final a f178020a = null;

        static {
            f178020a = new a();
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.V
        public Collection a(kotlin.reflect.jvm.internal.impl.types.X r2, Collection r3, kotlin.jvm.functions.l r4, kotlin.jvm.functions.l r5) {
            kotlin.jvm.internal.p.l(r2, "currentTypeConstructor");
            kotlin.jvm.internal.p.l(r3, "superTypes");
            kotlin.jvm.internal.p.l(r4, "neighbors");
            kotlin.jvm.internal.p.l(r5, "reportLoop");
            return r3;
        }
    }

    Collection a(kotlin.reflect.jvm.internal.impl.types.X r1, Collection r2, kotlin.jvm.functions.l r3, kotlin.jvm.functions.l r4);
}
