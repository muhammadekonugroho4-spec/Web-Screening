package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.Set;

/* loaded from: classes.dex */
public interface H0 extends Config {
    @Override // androidx.camera.core.impl.Config
    default Object a(Config.a r2) {
        return e().a(r2);
    }

    @Override // androidx.camera.core.impl.Config
    default void b(String r2, Config.b r3) {
        e().b(r2, r3);
    }

    @Override // androidx.camera.core.impl.Config
    default Set c(Config.a r2) {
        return e().c(r2);
    }

    @Override // androidx.camera.core.impl.Config
    default Object d(Config.a r2, Object r3) {
        return e().d(r2, r3);
    }

    Config e();

    @Override // androidx.camera.core.impl.Config
    default boolean f(Config.a r2) {
        return e().f(r2);
    }

    @Override // androidx.camera.core.impl.Config
    default Object g(Config.a r2, Config.OptionPriority r3) {
        return e().g(r2, r3);
    }

    @Override // androidx.camera.core.impl.Config
    default Set h() {
        return e().h();
    }

    @Override // androidx.camera.core.impl.Config
    default Config.OptionPriority i(Config.a r2) {
        return e().i(r2);
    }
}
