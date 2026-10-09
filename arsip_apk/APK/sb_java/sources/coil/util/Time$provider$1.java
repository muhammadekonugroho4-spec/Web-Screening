package coil.util;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Time$provider$1 f30254a = null;

    static {
        f30254a = new Time$provider$1();
    }

    public Time$provider$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // kotlin.jvm.functions.a
    public /* bridge */ /* synthetic */ Object invoke() {
        return s();
    }

    public final Long s() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
