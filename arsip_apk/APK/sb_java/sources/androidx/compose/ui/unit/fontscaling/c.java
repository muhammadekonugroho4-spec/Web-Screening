package androidx.compose.ui.unit.fontscaling;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c implements androidx.compose.ui.unit.fontscaling.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20628c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f20629a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f20630b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public static final /* synthetic */ float a(a r02, float r1, float[] r2, float[] r3) {
            return r02.b(r1, r2, r3);
        }

        public final float b(float r8, float[] r9, float[] r10) {
            float r5 = Math.abs(r8);
            float r6 = Math.signum(r8);
            int r02 = Arrays.binarySearch(r9, r5);
            if (r02 < 0) goto L7;
            float r82 = r10[r02];
        L6:
            return r6 * r82;
        L7:
            int r03 = -(r02 + 1);
            int r1 = r03 - 1;
            float r3 = 0.0f;
            if (r1 < (r9.length - 1)) goto L15;
            float r04 = r9[r9.length - 1];
            float r92 = r10[r9.length - 1];
            if (r04 != 0.0f) goto L13;
            return 0.0f;
        L13:
            return r8 * (r92 / r04);
        L15:
            if (r1 != (-1)) goto L18;
            float r93 = r9[0];
            float r2 = r10[0];
            float r12 = 0.0f;
        L19:
            r82 = d.f20631a.a(r12, r2, r3, r93, r5);
            goto L6
        L18:
            r3 = r9[r1];
            r93 = r9[r03];
            r12 = r10[r1];
            r2 = r10[r03];
            goto L19
        }

        public a() {
        }
    }

    static {
        f20628c = new a(null);
        d = 8;
    }

    public c(float[] r3, float[] r4) {
        if (r3.length != r4.length) goto L9;
        if (r3.length == 0) goto L9;
        this.f20629a = r3;
        this.f20630b = r4;
        return;
    L9:
        throw new IllegalArgumentException("Array lengths must match and be nonzero");
    }

    @Override // androidx.compose.ui.unit.fontscaling.a
    public float a(float r4) {
        return a.a(f20628c, r4, this.f20630b, this.f20629a);
    }

    @Override // androidx.compose.ui.unit.fontscaling.a
    public float b(float r4) {
        return a.a(f20628c, r4, this.f20629a, this.f20630b);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if ((r5 instanceof c) == true) goto L11;
        return false;
    L11:
        c r52 = (c) r5;
        if (Arrays.equals(this.f20629a, r52.f20629a) == true) goto L14;
    L16:
        return false;
    L14:
        if (Arrays.equals(this.f20630b, r52.f20630b) == false) goto L16;
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f20629a) * 31) + Arrays.hashCode(this.f20630b);
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("FontScaleConverter{fromSpValues=");
        String r1 = Arrays.toString(this.f20629a);
        p.k(r1, "toString(...)");
        r02.append(r1);
        r02.append(", toDpValues=");
        String r12 = Arrays.toString(this.f20630b);
        p.k(r12, "toString(...)");
        r02.append(r12);
        r02.append('}');
        return r02.toString();
    }
}
