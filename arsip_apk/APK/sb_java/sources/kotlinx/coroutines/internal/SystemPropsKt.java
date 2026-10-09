package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String r02, int r1, int r2, int r3) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(r02, r1, r2, r3);
    }

    public static /* synthetic */ int systemProp$default(String r02, int r1, int r2, int r3, int r4, Object r5) {
        return SystemPropsKt__SystemProps_commonKt.systemProp$default(r02, r1, r2, r3, r4, r5);
    }

    public static final long systemProp(String r02, long r1, long r3, long r5) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(r02, r1, r3, r5);
    }

    public static /* synthetic */ long systemProp$default(String r02, long r1, long r3, long r5, int r7, Object r8) {
        return SystemPropsKt__SystemProps_commonKt.systemProp$default(r02, r1, r3, r5, r7, r8);
    }

    public static final String systemProp(String r02) {
        return SystemPropsKt__SystemPropsKt.systemProp(r02);
    }

    public static final String systemProp(String r02, String r1) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(r02, r1);
    }

    public static final boolean systemProp(String r02, boolean r1) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(r02, r1);
    }
}
