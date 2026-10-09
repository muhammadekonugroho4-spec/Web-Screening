package com.clevertap.android.sdk.inapp.images.repo;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import kotlin.w;

/* loaded from: classes4.dex */
public interface f {

    public static final class a {
        public static /* synthetic */ w a(Pair r02) {
            return i(r02);
        }

        public static /* synthetic */ w b(Pair r02) {
            return j(r02);
        }

        public static /* synthetic */ w c(Pair r02) {
            return k(r02);
        }

        public static /* synthetic */ w d(Map r02) {
            return h(r02);
        }

        public static /* synthetic */ w e(Pair r02) {
            return l(r02);
        }

        public static void f(f r3, List r4) {
            p.l(r4, "urlMeta");
            r3.a(r4, new com.clevertap.android.sdk.inapp.images.repo.a(), new b(), new c());
        }

        public static void g(f r2, List r3, kotlin.jvm.functions.l r4) {
            p.l(r3, "urlMeta");
            p.l(r4, "completionCallback");
            r2.a(r3, r4, new d(), new e());
        }

        public static w h(Map r1) {
            p.l(r1, "it");
            return w.f180450a;
        }

        public static w i(Pair r1) {
            p.l(r1, "it");
            return w.f180450a;
        }

        public static w j(Pair r1) {
            p.l(r1, "it");
            return w.f180450a;
        }

        public static w k(Pair r1) {
            p.l(r1, "it");
            return w.f180450a;
        }

        public static w l(Pair r1) {
            p.l(r1, "it");
            return w.f180450a;
        }
    }

    void a(List r1, kotlin.jvm.functions.l r2, kotlin.jvm.functions.l r3, kotlin.jvm.functions.l r4);
}
