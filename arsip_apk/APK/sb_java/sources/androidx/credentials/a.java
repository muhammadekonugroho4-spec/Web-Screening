package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {
    public static final C0180a Companion = null;
    private final Bundle data;
    private final String type;

    /* renamed from: androidx.credentials.a$a, reason: collision with other inner class name */
    public static final class C0180a {
        public /* synthetic */ C0180a(i r1) {
            this();
        }

        public final a a(String r2, Bundle r3) {
            p.l(r2, "type");
            p.l(r3, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (p.g(r2, "android.credentials.TYPE_PASSWORD_CREDENTIAL") == false) goto L8;
            return g.f23476c.a(r3);
        L8:
            if (p.g(r2, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") == false) goto L12;
            return h.f23479b.a(r3);
        L12:
            throw new FrameworkClassParsingException();     // Catch: FrameworkClassParsingException -> L13
        L14:
            return new c(r2, r3);
        }

        public C0180a() {
        }
    }

    static {
        Companion = new C0180a(null);
    }

    public a(String r2, Bundle r3) {
        p.l(r2, "type");
        p.l(r3, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.type = r2;
        this.data = r3;
    }

    public static final a createFrom(String r1, Bundle r2) {
        return Companion.a(r1, r2);
    }

    public final Bundle getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }
}
