package com.bumptech.glide.util;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f33386a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f33387b = null;

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable r1) {
            l.v(r1);
        }
    }

    public class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable r1) {
            r1.run();
        }
    }

    static {
        f33386a = new a();
        f33387b = new b();
    }

    public static Executor a() {
        return f33387b;
    }

    public static Executor b() {
        return f33386a;
    }
}
