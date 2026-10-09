package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public enum Modality extends Enum<Modality> {
    public static final Modality ABSTRACT = null;
    public static final a Companion = null;
    public static final Modality FINAL = null;
    public static final Modality OPEN = null;
    public static final Modality SEALED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Modality[] f177999a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final Modality a(boolean r1, boolean r2, boolean r3) {
            if (r1 == true) goto L4;
            if (r2 == true) goto L7;
            if (r3 == false) goto L12;
            return Modality.OPEN;
        L12:
            return Modality.FINAL;
        L7:
            return Modality.ABSTRACT;
        L4:
            return Modality.SEALED;
        }

        public a() {
        }
    }

    static {
        FINAL = new Modality("FINAL", 0);
        SEALED = new Modality("SEALED", 1);
        OPEN = new Modality("OPEN", 2);
        ABSTRACT = new Modality("ABSTRACT", 3);
        f177999a = a();
        Companion = new a(null);
    }

    Modality(String r1, int r2) {
    }

    public static final /* synthetic */ Modality[] a() {
        return new Modality[]{FINAL, SEALED, OPEN, ABSTRACT};
    }

    public static Modality valueOf(String r1) {
        return (Modality) Enum.valueOf(Modality.class, r1);
    }

    public static Modality[] values() {
        return (Modality[]) f177999a.clone();
    }
}
