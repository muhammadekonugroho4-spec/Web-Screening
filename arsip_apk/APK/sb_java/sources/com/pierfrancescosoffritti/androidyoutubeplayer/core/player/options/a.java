package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options;

import android.content.Context;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final b f43675b = null;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f43676a;

    /* renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.a$a, reason: collision with other inner class name */
    public static final class C0498a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0499a f43677b = null;

        /* renamed from: a, reason: collision with root package name */
        public final JSONObject f43678a;

        /* renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.a$a$a, reason: collision with other inner class name */
        public static final class C0499a {
            public /* synthetic */ C0499a(i r1) {
                this();
            }

            public C0499a() {
            }
        }

        static {
            f43677b = new C0499a(null);
        }

        public C0498a(Context r4) {
            p.l(r4, "context");
            this.f43678a = new JSONObject();
            a("autoplay", 0);
            a("mute", 0);
            a("controls", 0);
            a("enablejsapi", 1);
            a("fs", 0);
            b("origin", "https://" + r4.getPackageName());
            a("rel", 0);
            a("iv_load_policy", 3);
            a("cc_load_policy", 0);
        }

        public final void a(String r4, int r5) {
            this.f43678a.put(r4, r5);     // Catch: JSONException -> L4
            return;
        L5:
            throw new RuntimeException("Illegal JSON value " + r4 + ": " + r5);
        }

        public final void b(String r4, String r5) {
            this.f43678a.put(r4, r5);     // Catch: JSONException -> L4
            return;
        L5:
            throw new RuntimeException("Illegal JSON value " + r4 + ": " + r5);
        }

        public final a c() {
            return new a(this.f43678a, null);
        }

        public final C0498a d(int r2) {
            a("controls", r2);
            return this;
        }

        public final C0498a e(int r2) {
            a("fs", r2);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public final a a(Context r2) {
            p.l(r2, "context");
            return new C0498a(r2).d(1).c();
        }

        public b() {
        }
    }

    static {
        f43675b = new b(null);
    }

    public /* synthetic */ a(JSONObject r1, i r2) {
        this(r1);
    }

    public final String a() {
        String r02 = this.f43676a.getString("origin");
        p.k(r02, "getString(...)");
        return r02;
    }

    public String toString() {
        String r02 = this.f43676a.toString();
        p.k(r02, "toString(...)");
        return r02;
    }

    public a(JSONObject r1) {
        this.f43676a = r1;
    }
}
