package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32459a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f32460a;

        public a() {
            this.f32460a = new HashMap();
        }

        public static /* synthetic */ Map a(a r02) {
            return r02.f32460a;
        }

        public e b() {
            return new e(this);
        }
    }

    public e(a r2) {
        this.f32459a = Collections.unmodifiableMap(new HashMap(a.a(r2)));
    }

    public boolean a(Class r2) {
        return this.f32459a.containsKey(r2);
    }
}
