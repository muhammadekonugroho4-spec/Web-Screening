package androidx.camera.core.impl;

import androidx.camera.core.impl.S;

/* loaded from: classes.dex */
public interface T {

    public static final class a implements T {

        /* renamed from: a, reason: collision with root package name */
        public final S f5324a;

        public a() {
            this.f5324a = new S.a().h();
        }

        @Override // androidx.camera.core.impl.T
        public S a() {
            return this.f5324a;
        }

        @Override // androidx.camera.core.impl.T
        public int getId() {
            return 0;
        }
    }

    S a();

    int getId();
}
