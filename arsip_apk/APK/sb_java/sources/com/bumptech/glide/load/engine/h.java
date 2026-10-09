package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f32788a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final h f32789b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final h f32790c = null;
    public static final h d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final h f32791e = null;

    public class a extends h {
        public a() {
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean c(DataSource r2) {
            if (r2 != DataSource.REMOTE) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean d(boolean r1, DataSource r2, EncodeStrategy r3) {
            if (r2 != DataSource.RESOURCE_DISK_CACHE) goto L5;
            return false;
        L5:
            if (r2 == DataSource.MEMORY_CACHE) goto L10;
            return true;
        L10:
            return false;
        }
    }

    public class b extends h {
        public b() {
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean c(DataSource r1) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean d(boolean r1, DataSource r2, EncodeStrategy r3) {
            return false;
        }
    }

    public class c extends h {
        public c() {
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean c(DataSource r2) {
            if (r2 != DataSource.DATA_DISK_CACHE) goto L5;
            return false;
        L5:
            if (r2 == DataSource.MEMORY_CACHE) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean d(boolean r1, DataSource r2, EncodeStrategy r3) {
            return false;
        }
    }

    public class d extends h {
        public d() {
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean c(DataSource r1) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean d(boolean r1, DataSource r2, EncodeStrategy r3) {
            if (r2 != DataSource.RESOURCE_DISK_CACHE) goto L5;
            return false;
        L5:
            if (r2 == DataSource.MEMORY_CACHE) goto L10;
            return true;
        L10:
            return false;
        }
    }

    public class e extends h {
        public e() {
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean c(DataSource r2) {
            if (r2 != DataSource.REMOTE) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean d(boolean r1, DataSource r2, EncodeStrategy r3) {
            if (r1 == false) goto L6;
            if (r2 != DataSource.DATA_DISK_CACHE) goto L6;
        L8:
            if (r3 != EncodeStrategy.TRANSFORMED) goto L13;
            return true;
        L13:
            return false;
        L6:
            if (r2 == DataSource.LOCAL) goto L8;
            return false;
        }
    }

    static {
        f32788a = new a();
        f32789b = new b();
        f32790c = new c();
        d = new d();
        f32791e = new e();
    }

    public h() {
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource r1);

    public abstract boolean d(boolean r1, DataSource r2, EncodeStrategy r3);
}
