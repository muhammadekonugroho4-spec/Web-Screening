package kotlin.reflect.jvm.internal.impl.util;

import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f180165a;

    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final a f180166b = null;

        static {
            f180166b = new a();
        }

        public a() {
            super(false, null);
        }
    }

    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        public final String f180167b;

        public b(String r3) {
            kotlin.jvm.internal.p.l(r3, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(false, null);
            this.f180167b = r3;
        }
    }

    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final c f180168b = null;

        static {
            f180168b = new c();
        }

        public c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final boolean a() {
        return this.f180165a;
    }

    public g(boolean r1) {
        this.f180165a = r1;
    }
}
