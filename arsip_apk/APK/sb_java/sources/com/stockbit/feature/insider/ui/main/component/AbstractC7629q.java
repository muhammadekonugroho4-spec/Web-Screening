package com.stockbit.feature.insider.ui.main.component;

import com.stockbit.usecase.insider.model.InsiderActivitySourceType;

/* renamed from: com.stockbit.feature.insider.ui.main.component.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC7629q {

    /* renamed from: a, reason: collision with root package name */
    public final InsiderActivitySourceType f98945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98946b;

    /* renamed from: com.stockbit.feature.insider.ui.main.component.q$a */
    public static final class a extends AbstractC7629q {

        /* renamed from: c, reason: collision with root package name */
        public static final a f98947c = null;

        static {
            f98947c = new a();
        }

        public a() {
            super(InsiderActivitySourceType.SOURCE_TYPE_UNSPECIFIED, 0, null);
        }
    }

    /* renamed from: com.stockbit.feature.insider.ui.main.component.q$b */
    public static final class b extends AbstractC7629q {

        /* renamed from: c, reason: collision with root package name */
        public static final b f98948c = null;

        static {
            f98948c = new b();
        }

        public b() {
            super(InsiderActivitySourceType.SOURCE_TYPE_IDX, 1, null);
        }
    }

    /* renamed from: com.stockbit.feature.insider.ui.main.component.q$c */
    public static final class c extends AbstractC7629q {

        /* renamed from: c, reason: collision with root package name */
        public static final c f98949c = null;

        static {
            f98949c = new c();
        }

        public c() {
            super(InsiderActivitySourceType.SOURCE_TYPE_KSEI, 2, null);
        }
    }

    static {
    }

    public /* synthetic */ AbstractC7629q(InsiderActivitySourceType r1, int r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public final InsiderActivitySourceType a() {
        return this.f98945a;
    }

    public final int b() {
        return this.f98946b;
    }

    public AbstractC7629q(InsiderActivitySourceType r1, int r2) {
        this.f98945a = r1;
        this.f98946b = r2;
    }
}
