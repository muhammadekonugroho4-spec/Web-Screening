package androidx.credentials.provider.utils;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23530a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final boolean a(String r3) {
            kotlin.jvm.internal.p.l(r3, "jsonString");
            if (r3.length() != 0) goto L9;
            return false;
        L9:
            new JSONObject(r3);     // Catch: Exception -> L8
            return true;
        L8:
            return false;
        }

        public a() {
        }
    }

    static {
        f23530a = new a(null);
    }
}
