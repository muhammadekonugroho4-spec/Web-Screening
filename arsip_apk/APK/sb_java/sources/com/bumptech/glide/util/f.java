package com.bumptech.glide.util;

/* loaded from: classes4.dex */
public abstract class f {

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public volatile Object f33388a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f33389b;

        public a(b r1) {
            this.f33389b = r1;
        }

        @Override // com.bumptech.glide.util.f.b
        public Object get() {
            if (this.f33388a != null) goto L15;
            monitor-enter(this);
        L8:
            th = move-exception;
            throw th;
        L6:
            if (this.f33388a != null) goto L10;
            this.f33388a = k.d(this.f33389b.get());     // Catch: Throwable -> L8
        L10:
            monitor-exit(this);     // Catch: Throwable -> L8
        L15:
            return this.f33388a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b r1) {
        return new a(r1);
    }
}
