package androidx.glance;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/glance/Visibility;", "", "(Ljava/lang/String;I)V", "Visible", "Invisible", "Gone", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum Visibility extends Enum<Visibility> {
    public static final Visibility Gone = null;
    public static final Visibility Invisible = null;
    public static final Visibility Visible = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Visibility[] f24646a = null;

    static {
        Visible = new Visibility("Visible", 0);
        Invisible = new Visibility("Invisible", 1);
        Gone = new Visibility("Gone", 2);
        f24646a = a();
    }

    Visibility(String r1, int r2) {
    }

    public static final /* synthetic */ Visibility[] a() {
        return new Visibility[]{Visible, Invisible, Gone};
    }

    public static Visibility valueOf(String r1) {
        return (Visibility) Enum.valueOf(Visibility.class, r1);
    }

    public static Visibility[] values() {
        return (Visibility[]) f24646a.clone();
    }
}
