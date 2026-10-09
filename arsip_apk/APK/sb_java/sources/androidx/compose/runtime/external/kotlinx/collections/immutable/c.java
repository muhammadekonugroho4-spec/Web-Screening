package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.List;
import kotlin.collections.AbstractC11760d;

/* loaded from: classes.dex */
public interface c extends List, b, kotlin.jvm.internal.markers.a {

    public static final class a extends AbstractC11760d implements c {

        /* renamed from: b, reason: collision with root package name */
        public final c f16176b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16177c;
        public final int d;

        /* renamed from: e, reason: collision with root package name */
        public int f16178e;

        public a(c r1, int r2, int r3) {
            this.f16176b = r1;
            this.f16177c = r2;
            this.d = r3;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.d.c(r2, r3, r1.size());
            this.f16178e = r3 - r2;
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List
        public Object get(int r3) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.d.a(r3, this.f16178e);
            return this.f16176b.get(this.f16177c + r3);
        }

        @Override // kotlin.collections.AbstractC11758b
        public int getSize() {
            return this.f16178e;
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.c
        public /* bridge */ /* synthetic */ List subList(int r1, int r2) {
            return subList(r1, r2);
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.c
        public c subList(int r4, int r5) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.d.c(r4, r5, this.f16178e);
            c r1 = this.f16176b;
            int r2 = this.f16177c;
            return new a(r1, r4 + r2, r2 + r5);
        }
    }

    @Override // java.util.List
    default c subList(int r2, int r3) {
        return new a(this, r2, r3);
    }
}
