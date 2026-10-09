package androidx.constraintlayout.core;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable {

    /* renamed from: r, reason: collision with root package name */
    public static int f20975r = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f20976a;

    /* renamed from: b, reason: collision with root package name */
    public String f20977b;

    /* renamed from: c, reason: collision with root package name */
    public int f20978c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f20979e;

    /* renamed from: f, reason: collision with root package name */
    public float f20980f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20981g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f20982h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f20983i;

    /* renamed from: j, reason: collision with root package name */
    public Type f20984j;

    /* renamed from: k, reason: collision with root package name */
    public b[] f20985k;

    /* renamed from: l, reason: collision with root package name */
    public int f20986l;

    /* renamed from: m, reason: collision with root package name */
    public int f20987m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20988n;

    /* renamed from: o, reason: collision with root package name */
    public int f20989o;

    /* renamed from: p, reason: collision with root package name */
    public float f20990p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f20991q;

    public enum Type extends Enum<Type> {
        public static final Type CONSTANT = null;
        public static final Type ERROR = null;
        public static final Type SLACK = null;
        public static final Type UNKNOWN = null;
        public static final Type UNRESTRICTED = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Type[] f20992a = null;

        static {
            UNRESTRICTED = new Type("UNRESTRICTED", 0);
            CONSTANT = new Type("CONSTANT", 1);
            SLACK = new Type("SLACK", 2);
            ERROR = new Type("ERROR", 3);
            UNKNOWN = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
            f20992a = a();
        }

        Type(String r1, int r2) {
        }

        public static /* synthetic */ Type[] a() {
            return new Type[]{UNRESTRICTED, CONSTANT, SLACK, ERROR, UNKNOWN};
        }

        public static Type valueOf(String r1) {
            return (Type) Enum.valueOf(Type.class, r1);
        }

        public static Type[] values() {
            return (Type[]) f20992a.clone();
        }
    }

    static {
    }

    public SolverVariable(Type r4, String r5) {
        this.f20978c = -1;
        this.d = -1;
        this.f20979e = 0;
        this.f20981g = false;
        this.f20982h = new float[9];
        this.f20983i = new float[9];
        this.f20985k = new b[16];
        this.f20986l = 0;
        this.f20987m = 0;
        this.f20988n = false;
        this.f20989o = -1;
        this.f20990p = 0.0f;
        this.f20991q = null;
        this.f20984j = r4;
    }

    public static void c() {
        f20975r++;
    }

    public final void a(b r4) {
        int r02 = 0;
    L3:
        int r1 = this.f20986l;
        if (r02 >= r1) goto L9;
        if (this.f20985k[r02] == r4) goto L7;
        r02 = r02 + 1;
        goto L3
    L7:
        return;
    L9:
        b[] r03 = this.f20985k;
        if (r1 < r03.length) goto L12;
        this.f20985k = (b[]) Arrays.copyOf(r03, r03.length * 2);
    L12:
        b[] r04 = this.f20985k;
        int r12 = this.f20986l;
        r04[r12] = r4;
        this.f20986l = r12 + 1;
    }

    public int b(SolverVariable r2) {
        return this.f20978c - r2.f20978c;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return b((SolverVariable) r1);
    }

    public final void d(b r5) {
        int r02 = this.f20986l;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L12;
        if (this.f20985k[r1] == r5) goto L7;
        r1 = r1 + 1;
    L7:
        if (r1 >= (r02 - 1)) goto L9;
        b[] r52 = this.f20985k;
        int r2 = r1 + 1;
        r52[r1] = r52[r2];
        r1 = r2;
        goto L7
    L9:
        this.f20986l--;
        return;
    }

    public void e() {
        this.f20977b = null;
        this.f20984j = Type.UNKNOWN;
        this.f20979e = 0;
        this.f20978c = -1;
        this.d = -1;
        this.f20980f = 0.0f;
        this.f20981g = false;
        this.f20988n = false;
        this.f20989o = -1;
        this.f20990p = 0.0f;
        int r2 = this.f20986l;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L5;
        this.f20985k[r4] = null;
        r4 = r4 + 1;
        goto L3
    L5:
        this.f20986l = 0;
        this.f20987m = 0;
        this.f20976a = false;
        Arrays.fill(this.f20983i, 0.0f);
    }

    public void g(d r4, float r5) {
        this.f20980f = r5;
        this.f20981g = true;
        this.f20988n = false;
        this.f20989o = -1;
        this.f20990p = 0.0f;
        int r1 = this.f20986l;
        this.d = -1;
        int r02 = 0;
    L3:
        if (r02 >= r1) goto L5;
        this.f20985k[r02].A(r4, this, false);
        r02 = r02 + 1;
        goto L3
    L5:
        this.f20986l = 0;
    }

    public void h(Type r1, String r2) {
        this.f20984j = r1;
    }

    public final void i(d r5, b r6) {
        int r02 = this.f20986l;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        this.f20985k[r2].B(r5, r6, false);
        r2 = r2 + 1;
        goto L3
    L5:
        this.f20986l = 0;
    }

    public String toString() {
        if (this.f20977b == null) goto L7;
        return "" + this.f20977b;
    L7:
        return "" + this.f20978c;
    }
}
