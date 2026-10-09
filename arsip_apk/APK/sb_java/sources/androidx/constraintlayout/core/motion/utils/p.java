package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public int[] f21175a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f21176b;

    /* renamed from: c, reason: collision with root package name */
    public int f21177c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f21178e;

    /* renamed from: f, reason: collision with root package name */
    public int f21179f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f21180g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f21181h;

    /* renamed from: i, reason: collision with root package name */
    public int f21182i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f21183j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f21184k;

    /* renamed from: l, reason: collision with root package name */
    public int f21185l;

    public p() {
        this.f21175a = new int[10];
        this.f21176b = new int[10];
        this.f21177c = 0;
        this.d = new int[10];
        this.f21178e = new float[10];
        this.f21179f = 0;
        this.f21180g = new int[5];
        this.f21181h = new String[5];
        this.f21182i = 0;
        this.f21183j = new int[4];
        this.f21184k = new boolean[4];
        this.f21185l = 0;
    }

    public void a(int r4, float r5) {
        int r02 = this.f21179f;
        int[] r1 = this.d;
        if (r02 < r1.length) goto L5;
        this.d = Arrays.copyOf(r1, r1.length * 2);
        float[] r03 = this.f21178e;
        this.f21178e = Arrays.copyOf(r03, r03.length * 2);
    L5:
        int[] r04 = this.d;
        int r12 = this.f21179f;
        r04[r12] = r4;
        float[] r42 = this.f21178e;
        this.f21179f = r12 + 1;
        r42[r12] = r5;
    }

    public void b(int r4, int r5) {
        int r02 = this.f21177c;
        int[] r1 = this.f21175a;
        if (r02 < r1.length) goto L5;
        this.f21175a = Arrays.copyOf(r1, r1.length * 2);
        int[] r03 = this.f21176b;
        this.f21176b = Arrays.copyOf(r03, r03.length * 2);
    L5:
        int[] r04 = this.f21175a;
        int r12 = this.f21177c;
        r04[r12] = r4;
        int[] r42 = this.f21176b;
        this.f21177c = r12 + 1;
        r42[r12] = r5;
    }

    public void c(int r4, String r5) {
        int r02 = this.f21182i;
        int[] r1 = this.f21180g;
        if (r02 < r1.length) goto L5;
        this.f21180g = Arrays.copyOf(r1, r1.length * 2);
        String[] r03 = this.f21181h;
        this.f21181h = (String[]) Arrays.copyOf(r03, r03.length * 2);
    L5:
        int[] r04 = this.f21180g;
        int r12 = this.f21182i;
        r04[r12] = r4;
        String[] r42 = this.f21181h;
        this.f21182i = r12 + 1;
        r42[r12] = r5;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f21177c + ", mCountFloat=" + this.f21179f + ", mCountString=" + this.f21182i + ", mCountBoolean=" + this.f21185l + '}';
    }
}
