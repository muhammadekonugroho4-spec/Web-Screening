package C0;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class I extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f477b;

    public I(Ref$BooleanRef r1, kotlin.jvm.functions.a r2) {
        this.f476a = r1;
        this.f477b = r2;
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.a] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        if (this.f476a.element == true) goto L6;
        this.f477b.invoke();
    L6:
        return kotlin.w.f180450a;
    }
}
