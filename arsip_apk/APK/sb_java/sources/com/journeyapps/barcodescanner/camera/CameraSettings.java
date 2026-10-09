package com.journeyapps.barcodescanner.camera;

/* loaded from: classes6.dex */
public class CameraSettings {

    /* renamed from: a, reason: collision with root package name */
    public int f41073a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41074b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41075c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41076e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41077f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41078g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41079h;

    /* renamed from: i, reason: collision with root package name */
    public FocusMode f41080i;

    public enum FocusMode extends Enum<FocusMode> {
        public static final FocusMode AUTO = null;
        public static final FocusMode CONTINUOUS = null;
        public static final FocusMode INFINITY = null;
        public static final FocusMode MACRO = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ FocusMode[] f41081a = null;

        static {
            FocusMode r02 = new FocusMode("AUTO", 0);
            AUTO = r02;
            FocusMode r1 = new FocusMode("CONTINUOUS", 1);
            CONTINUOUS = r1;
            FocusMode r2 = new FocusMode("INFINITY", 2);
            INFINITY = r2;
            FocusMode r3 = new FocusMode("MACRO", 3);
            MACRO = r3;
            f41081a = new FocusMode[]{r02, r1, r2, r3};
        }

        FocusMode(String r1, int r2) {
        }

        public static FocusMode valueOf(String r1) {
            return (FocusMode) Enum.valueOf(FocusMode.class, r1);
        }

        public static FocusMode[] values() {
            return (FocusMode[]) f41081a.clone();
        }
    }

    public CameraSettings() {
        this.f41073a = -1;
        this.f41074b = false;
        this.f41075c = false;
        this.d = false;
        this.f41076e = true;
        this.f41077f = false;
        this.f41078g = false;
        this.f41079h = false;
        this.f41080i = FocusMode.AUTO;
    }

    public FocusMode a() {
        return this.f41080i;
    }

    public int b() {
        return this.f41073a;
    }

    public boolean c() {
        return this.f41076e;
    }

    public boolean d() {
        return this.f41079h;
    }

    public boolean e() {
        return this.f41075c;
    }

    public boolean f() {
        return this.f41078g;
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        return this.f41074b;
    }

    public void i(int r1) {
        this.f41073a = r1;
    }
}
