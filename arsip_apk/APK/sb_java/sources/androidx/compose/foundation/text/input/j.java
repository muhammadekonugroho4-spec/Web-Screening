package androidx.compose.foundation.text.input;

/* loaded from: classes.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10551a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f10552a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final j f10553b = null;

        static {
            f10552a = new a();
            int r3 = 0;
            f10553b = new b(r3, r3, 3, null);
        }

        public a() {
        }

        public final j a() {
            return f10553b;
        }
    }

    public static final class b implements j {

        /* renamed from: b, reason: collision with root package name */
        public final int f10554b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10555c;

        static {
        }

        public b(int r3, int r4) {
            this.f10554b = r3;
            this.f10555c = r4;
            boolean r02 = false;
            if (1 > r3) goto L6;
            if (r3 > r4) goto L6;
            r02 = true;
        L6:
            if (r02 == true) goto L9;
            androidx.compose.foundation.internal.e.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + r3 + ", " + r4);
            return;
        }

        public final int a() {
            return this.f10555c;
        }

        public final int b() {
            return this.f10554b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if (r5 != null) goto L9;
            return false;
        L9:
            if (b.class == r5.getClass()) goto L11;
            return false;
        L11:
            b r52 = (b) r5;
            if (this.f10554b == r52.f10554b) goto L15;
            return false;
        L15:
            if (this.f10555c == r52.f10555c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (this.f10554b * 31) + this.f10555c;
        }

        public String toString() {
            return "MultiLine(minHeightInLines=" + this.f10554b + ", maxHeightInLines=" + this.f10555c + ')';
        }

        public /* synthetic */ b(int r1, int r2, int r3, kotlin.jvm.internal.i r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = 1;
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = Integer.MAX_VALUE;
        L8:
            this(r1, r2);
        }
    }

    public static final class c implements j {

        /* renamed from: b, reason: collision with root package name */
        public static final c f10556b = null;

        static {
            f10556b = new c();
        }

        public c() {
        }

        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    static {
        f10551a = a.f10552a;
    }
}
