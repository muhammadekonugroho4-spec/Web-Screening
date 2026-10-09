package androidx.compose.ui.focus;

/* loaded from: classes.dex */
public interface FocusProperties {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16980a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f16981a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final androidx.compose.ui.geometry.g f16982b = null;

        static {
            f16981a = new a();
            f16982b = new androidx.compose.ui.geometry.g(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
        }

        public a() {
        }

        public final androidx.compose.ui.geometry.g a() {
            return f16982b;
        }
    }

    static {
        f16980a = a.f16981a;
    }

    default FocusRequester a() {
        return FocusRequester.f16998b.b();
    }

    default FocusRequester b() {
        return FocusRequester.f16998b.b();
    }

    default FocusRequester d() {
        return FocusRequester.f16998b.b();
    }

    default FocusRequester e() {
        return FocusRequester.f16998b.b();
    }

    default androidx.compose.ui.geometry.g f() {
        return f16980a.a();
    }

    default FocusRequester g() {
        return FocusRequester.f16998b.b();
    }

    default FocusRequester getNext() {
        return FocusRequester.f16998b.b();
    }

    default FocusRequester getPrevious() {
        return FocusRequester.f16998b.b();
    }

    void h(boolean r1);

    default FocusRequester i() {
        return FocusRequester.f16998b.b();
    }

    default void j(kotlin.jvm.functions.l r1) {
    }

    boolean k();

    default kotlin.jvm.functions.l l() {
        return FocusProperties$onEnter$1.f16983g;
    }

    default kotlin.jvm.functions.l m() {
        return FocusProperties$onExit$1.f16984g;
    }

    default void n(kotlin.jvm.functions.l r1) {
    }

    default void o(androidx.compose.ui.geometry.g r1) {
    }
}
