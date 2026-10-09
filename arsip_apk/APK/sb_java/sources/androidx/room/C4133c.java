package androidx.room;

/* renamed from: androidx.room.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4133c implements androidx.sqlite.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f27798b = null;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.sqlite.d f27799a;

    /* renamed from: androidx.room.c$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f27798b = new a(null);
    }

    public C4133c(androidx.sqlite.d r2) {
        kotlin.jvm.internal.p.l(r2, "delegate");
        this.f27799a = r2;
    }

    @Override // androidx.sqlite.d
    public void M0(int r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "value");
        this.f27799a.M0(r2, r3);
    }

    @Override // androidx.sqlite.d, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public boolean getBoolean(int r2) {
        return this.f27799a.getBoolean(r2);
    }

    @Override // androidx.sqlite.d
    public int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public String getColumnName(int r2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public double getDouble(int r2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public int getInt(int r2) {
        return this.f27799a.getInt(r2);
    }

    @Override // androidx.sqlite.d
    public long getLong(int r2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public boolean isNull(int r2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public void m(int r2, long r3) {
        this.f27799a.m(r2, r3);
    }

    @Override // androidx.sqlite.d
    public void o(int r2) {
        this.f27799a.o(r2);
    }

    @Override // androidx.sqlite.d
    public void p(int r2, double r3) {
        this.f27799a.p(r2, r3);
    }

    @Override // androidx.sqlite.d
    public void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public boolean u0() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public String u1(int r2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }
}
