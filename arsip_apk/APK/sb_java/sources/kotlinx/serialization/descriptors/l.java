package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;

/* loaded from: classes3.dex */
public abstract class l {

    public static final class a extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f180551a = null;

        static {
            f180551a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f180552a = null;

        static {
            f180552a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ l(kotlin.jvm.internal.i r1) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String r02 = t.b(getClass()).r();
        p.i(r02);
        return r02;
    }

    public l() {
    }
}
