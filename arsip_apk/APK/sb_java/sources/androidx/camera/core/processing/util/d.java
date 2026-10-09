package androidx.camera.core.processing.util;

import androidx.camera.core.processing.util.a;
import com.google.firebase.crashlytics.internal.common.IdManager;

/* loaded from: classes.dex */
public abstract class d {

    public static abstract class a {
        public a() {
        }

        public abstract d a();

        public abstract a b(String r1);

        public abstract a c(String r1);

        public abstract a d(String r1);

        public abstract a e(String r1);
    }

    public d() {
    }

    public static a a() {
        return new a.b().e(IdManager.DEFAULT_VERSION_NAME).c(IdManager.DEFAULT_VERSION_NAME).d("").b("");
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
