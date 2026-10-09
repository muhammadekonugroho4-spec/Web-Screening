package androidx.glance;

/* loaded from: classes4.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25335a = null;

    public static final class a implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f25336b = null;

        static {
            f25336b = new a();
        }

        public a() {
        }

        @Override // androidx.glance.o
        public o a(o r1) {
            return r1;
        }

        @Override // androidx.glance.o
        public Object c(Object r1, kotlin.jvm.functions.p r2) {
            return r1;
        }

        @Override // androidx.glance.o
        public boolean d(kotlin.jvm.functions.l r1) {
            return true;
        }

        @Override // androidx.glance.o
        public boolean f(kotlin.jvm.functions.l r1) {
            return false;
        }

        public String toString() {
            return "Modifier";
        }
    }

    public interface b extends o {
        @Override // androidx.glance.o
        default Object c(Object r1, kotlin.jvm.functions.p r2) {
            return r2.invoke(r1, this);
        }

        @Override // androidx.glance.o
        default boolean d(kotlin.jvm.functions.l r1) {
            return ((Boolean) r1.invoke(this)).booleanValue();
        }

        @Override // androidx.glance.o
        default boolean f(kotlin.jvm.functions.l r1) {
            return ((Boolean) r1.invoke(this)).booleanValue();
        }
    }

    static {
        f25335a = a.f25336b;
    }

    default o a(o r2) {
        if (r2 != f25335a) goto L6;
        return this;
    L6:
        return new CombinedGlanceModifier(this, r2);
    }

    Object c(Object r1, kotlin.jvm.functions.p r2);

    boolean d(kotlin.jvm.functions.l r1);

    boolean f(kotlin.jvm.functions.l r1);
}
