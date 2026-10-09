package androidx.camera.core;

import androidx.camera.core.impl.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class E {

    public static final class a implements androidx.camera.core.impl.Q {

        /* renamed from: a, reason: collision with root package name */
        public final List f4792a;

        public a(List r2) {
            if (r2 == null) goto L9;
            if (r2.isEmpty() == true) goto L9;
            this.f4792a = Collections.unmodifiableList(new ArrayList(r2));
            return;
        L9:
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }

        @Override // androidx.camera.core.impl.Q
        public List a() {
            return this.f4792a;
        }
    }

    public static androidx.camera.core.impl.Q a(androidx.camera.core.impl.T... r1) {
        return new a(Arrays.asList(r1));
    }

    public static androidx.camera.core.impl.Q b() {
        return a(new androidx.camera.core.impl.T[]{new T.a()});
    }
}
