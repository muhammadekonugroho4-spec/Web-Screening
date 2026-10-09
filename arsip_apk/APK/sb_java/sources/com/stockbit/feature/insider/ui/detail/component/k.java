package com.stockbit.feature.insider.ui.detail.component;

import com.stockbit.usecase.insider.model.InsiderActivitySourceType;

/* loaded from: classes9.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final InsiderActivitySourceType f98717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98718b;

    public static final class a extends k {

        /* renamed from: c, reason: collision with root package name */
        public static final a f98719c = null;

        static {
            f98719c = new a();
        }

        public a() {
            super(InsiderActivitySourceType.SOURCE_TYPE_UNSPECIFIED, 0, null);
        }
    }

    public static final class b extends k {

        /* renamed from: c, reason: collision with root package name */
        public static final b f98720c = null;

        static {
            f98720c = new b();
        }

        public b() {
            super(InsiderActivitySourceType.SOURCE_TYPE_IDX, 1, null);
        }
    }

    public static final class c extends k {

        /* renamed from: c, reason: collision with root package name */
        public static final c f98721c = null;

        static {
            f98721c = new c();
        }

        public c() {
            super(InsiderActivitySourceType.SOURCE_TYPE_KSEI, 2, null);
        }
    }

    static {
    }

    public /* synthetic */ k(InsiderActivitySourceType r1, int r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public final InsiderActivitySourceType a() {
        return this.f98717a;
    }

    public final int b() {
        return this.f98718b;
    }

    public k(InsiderActivitySourceType r1, int r2) {
        this.f98717a = r1;
        this.f98718b = r2;
    }
}
