package androidx.compose.ui.semantics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.a f19563a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.a f19564b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19565c;

    static {
    }

    public l(kotlin.jvm.functions.a r1, kotlin.jvm.functions.a r2, boolean r3) {
        this.f19563a = r1;
        this.f19564b = r2;
        this.f19565c = r3;
    }

    public final kotlin.jvm.functions.a a() {
        return this.f19564b;
    }

    public final boolean b() {
        return this.f19565c;
    }

    public final kotlin.jvm.functions.a c() {
        return this.f19563a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f19563a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f19564b.invoke()).floatValue() + ", reverseScrolling=" + this.f19565c + ')';
    }
}
