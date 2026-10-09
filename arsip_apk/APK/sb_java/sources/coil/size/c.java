package coil.size;

/* loaded from: classes4.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final int f30234a;

        public a(int r2) {
            super(null);
            this.f30234a = r2;
            if (r2 <= 0) goto L6;
            return;
        L6:
            throw new IllegalArgumentException("px must be > 0.");
        }

        public boolean equals(Object r3) {
            if (this != r3) goto L6;
            return true;
        L6:
            if ((r3 instanceof a) == true) goto L8;
            return false;
        L8:
            if (this.f30234a != ((a) r3).f30234a) goto L12;
            return true;
        L12:
            return false;
        }

        public int hashCode() {
            return this.f30234a;
        }

        public String toString() {
            return String.valueOf(this.f30234a);
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30235a = null;

        static {
            f30235a = new b();
        }

        public b() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
