package com.stockbit.feature.insider.ui.company.component;

import com.stockbit.usecase.insider.model.InsiderActivitySourceType;

/* loaded from: classes9.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final InsiderActivitySourceType f98584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98585b;

    public static final class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final a f98586c = null;

        static {
            f98586c = new a();
        }

        public a() {
            super(InsiderActivitySourceType.SOURCE_TYPE_UNSPECIFIED, 0, null);
        }
    }

    public static final class b extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final b f98587c = null;

        static {
            f98587c = new b();
        }

        public b() {
            super(InsiderActivitySourceType.SOURCE_TYPE_IDX, 1, null);
        }
    }

    public static final class c extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final c f98588c = null;

        static {
            f98588c = new c();
        }

        public c() {
            super(InsiderActivitySourceType.SOURCE_TYPE_KSEI, 2, null);
        }
    }

    static {
    }

    public /* synthetic */ l(InsiderActivitySourceType r1, int r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public final InsiderActivitySourceType a() {
        return this.f98584a;
    }

    public final int b() {
        return this.f98585b;
    }

    public l(InsiderActivitySourceType r1, int r2) {
        this.f98584a = r1;
        this.f98585b = r2;
    }
}
