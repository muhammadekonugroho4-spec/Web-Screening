package androidx.compose.material;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/material/ScaffoldLayoutContent;", "", "<init>", "(Ljava/lang/String;I)V", "TopBar", "MainContent", "Snackbar", "Fab", "BottomBar", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
enum ScaffoldLayoutContent extends Enum<ScaffoldLayoutContent> {
    public static final ScaffoldLayoutContent BottomBar = null;
    public static final ScaffoldLayoutContent Fab = null;
    public static final ScaffoldLayoutContent MainContent = null;
    public static final ScaffoldLayoutContent Snackbar = null;
    public static final ScaffoldLayoutContent TopBar = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ScaffoldLayoutContent[] f11473a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f11474b = null;

    static {
        TopBar = new ScaffoldLayoutContent("TopBar", 0);
        MainContent = new ScaffoldLayoutContent("MainContent", 1);
        Snackbar = new ScaffoldLayoutContent("Snackbar", 2);
        Fab = new ScaffoldLayoutContent("Fab", 3);
        BottomBar = new ScaffoldLayoutContent("BottomBar", 4);
        ScaffoldLayoutContent[] r02 = a();
        f11473a = r02;
        f11474b = kotlin.enums.b.a(r02);
    }

    ScaffoldLayoutContent(String r1, int r2) {
    }

    public static final /* synthetic */ ScaffoldLayoutContent[] a() {
        return new ScaffoldLayoutContent[]{TopBar, MainContent, Snackbar, Fab, BottomBar};
    }

    public static kotlin.enums.a getEntries() {
        return f11474b;
    }

    public static ScaffoldLayoutContent valueOf(String r1) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, r1);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) f11473a.clone();
    }
}
