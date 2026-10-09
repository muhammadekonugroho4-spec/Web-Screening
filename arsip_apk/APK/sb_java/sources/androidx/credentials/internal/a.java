package androidx.credentials.internal;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0181a f23481a = null;

    /* renamed from: androidx.credentials.internal.a$a, reason: collision with other inner class name */
    public static final class C0181a {
        public /* synthetic */ C0181a(i r1) {
            this();
        }

        public final boolean a(String r3) {
            p.l(r3, "jsonString");
            if (r3.length() != 0) goto L9;
            return false;
        L9:
            new JSONObject(r3);     // Catch: Exception -> L8
            return true;
        L8:
            return false;
        }

        public C0181a() {
        }
    }

    static {
        f23481a = new C0181a(null);
    }
}
