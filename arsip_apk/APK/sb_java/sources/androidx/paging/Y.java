package androidx.paging;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    public final int f26957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26959c;
    public final int d;

    public static final class a extends Y {

        /* renamed from: e, reason: collision with root package name */
        public final int f26960e;

        /* renamed from: f, reason: collision with root package name */
        public final int f26961f;

        public a(int r7, int r8, int r9, int r10, int r11, int r12) {
            super(r9, r10, r11, r12, null);
            this.f26960e = r7;
            this.f26961f = r8;
        }

        @Override // androidx.paging.Y
        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f26960e == r52.f26960e) goto L11;
        L21:
            return false;
        L11:
            if (this.f26961f != r52.f26961f) goto L21;
            if (d() != r52.d()) goto L21;
            if (c() != r52.c()) goto L21;
            if (a() != r52.a()) goto L21;
            if (b() != r52.b()) goto L21;
            return true;
        }

        public final int f() {
            return this.f26961f;
        }

        public final int g() {
            return this.f26960e;
        }

        @Override // androidx.paging.Y
        public int hashCode() {
            return (super.hashCode() + Integer.hashCode(this.f26960e)) + Integer.hashCode(this.f26961f);
        }

        public String toString() {
            return kotlin.text.r.p("ViewportHint.Access(\n            |    pageOffset=" + this.f26960e + ",\n            |    indexInPage=" + this.f26961f + ",\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", null, 1, null);
        }
    }

    public static final class b extends Y {
        public b(int r7, int r8, int r9, int r10) {
            super(r7, r8, r9, r10, null);
        }

        public String toString() {
            return kotlin.text.r.p("ViewportHint.Initial(\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", null, 1, null);
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26962a = null;

        static {
            int[] r02 = new int[LoadType.values().length];
            r02[LoadType.REFRESH.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r02[LoadType.PREPEND.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r02[LoadType.APPEND.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            f26962a = r02;
        }
    }

    public /* synthetic */ Y(int r1, int r2, int r3, int r4, kotlin.jvm.internal.i r5) {
        this(r1, r2, r3, r4);
    }

    public final int a() {
        return this.f26959c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f26958b;
    }

    public final int d() {
        return this.f26957a;
    }

    public final int e(LoadType r2) {
        kotlin.jvm.internal.p.l(r2, "loadType");
        int r22 = c.f26962a[r2.ordinal()];
        if (r22 == 1) goto L15;
        if (r22 == 2) goto L13;
        if (r22 != 3) goto L11;
        return this.f26958b;
    L11:
        throw new NoWhenBranchMatchedException();
    L13:
        return this.f26957a;
    L15:
        throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Y) == true) goto L8;
        return false;
    L8:
        Y r52 = (Y) r5;
        if (this.f26957a == r52.f26957a) goto L11;
    L17:
        return false;
    L11:
        if (this.f26958b != r52.f26958b) goto L17;
        if (this.f26959c != r52.f26959c) goto L17;
        if (this.d != r52.d) goto L17;
        return true;
    }

    public int hashCode() {
        return ((Integer.hashCode(this.f26957a) + Integer.hashCode(this.f26958b)) + Integer.hashCode(this.f26959c)) + Integer.hashCode(this.d);
    }

    public Y(int r1, int r2, int r3, int r4) {
        this.f26957a = r1;
        this.f26958b = r2;
        this.f26959c = r3;
        this.d = r4;
    }
}
