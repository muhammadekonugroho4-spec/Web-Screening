package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import android.os.Build;
import androidx.compose.ui.p;
import com.clevertap.android.sdk.Constants;
import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", Constants.KEY_ID, "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "Copy", "Paste", "Cut", "SelectAll", "Autofill", "titleResource", "getTitleResource", "order", "getOrder", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum MenuItemOption extends Enum<MenuItemOption> {
    public static final MenuItemOption Autofill = null;
    public static final MenuItemOption Copy = null;
    public static final MenuItemOption Cut = null;
    public static final MenuItemOption Paste = null;
    public static final MenuItemOption SelectAll = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MenuItemOption[] f19288a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f19289b = null;

    /* renamed from: id, reason: collision with root package name */
    private final int f19290id;
    private final int order;

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19291a = null;

        static {
            int[] r02 = new int[MenuItemOption.values().length];
            r02[MenuItemOption.Copy.ordinal()] = 1;     // Catch: NoSuchFieldError -> L10
        L15:
            r02[MenuItemOption.Paste.ordinal()] = 2;     // Catch: NoSuchFieldError -> L11
        L23:
            r02[MenuItemOption.Cut.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
        L17:
            r02[MenuItemOption.SelectAll.ordinal()] = 4;     // Catch: NoSuchFieldError -> L13
        L19:
            r02[MenuItemOption.Autofill.ordinal()] = 5;     // Catch: NoSuchFieldError -> L14
        L8:
            f19291a = r02;
        }
    }

    static {
        Copy = new MenuItemOption("Copy", 0, 0);
        Paste = new MenuItemOption("Paste", 1, 1);
        Cut = new MenuItemOption("Cut", 2, 2);
        SelectAll = new MenuItemOption("SelectAll", 3, 3);
        Autofill = new MenuItemOption("Autofill", 4, 4);
        MenuItemOption[] r02 = a();
        f19288a = r02;
        f19289b = kotlin.enums.b.a(r02);
    }

    MenuItemOption(String r1, int r2, int r3) {
        this.f19290id = r3;
        this.order = r3;
    }

    public static final /* synthetic */ MenuItemOption[] a() {
        return new MenuItemOption[]{Copy, Paste, Cut, SelectAll, Autofill};
    }

    public static kotlin.enums.a getEntries() {
        return f19289b;
    }

    public static MenuItemOption valueOf(String r1) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, r1);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) f19288a.clone();
    }

    public final int getId() {
        return this.f19290id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int r02 = a.f19291a[ordinal()];
        if (r02 != 1) goto L5;
        return R.string.copy;
    L5:
        if (r02 != 2) goto L7;
        return R.string.paste;
    L7:
        if (r02 != 3) goto L9;
        return R.string.cut;
    L9:
        if (r02 != 4) goto L11;
        return R.string.selectAll;
    L11:
        if (r02 != 5) goto L19;
        if (Build.VERSION.SDK_INT <= 26) goto L15;
        return R.string.autofill;
    L15:
        return p.f18882a;
    L19:
        throw new NoWhenBranchMatchedException();
    }
}
