package com.stockbit.domain.model.type.unboxing;

import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.b;
import com.stockbit.search.SearchEntryPoint;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/stockbit/domain/model/type/unboxing/UnboxingStockFilterType;", "", "values", "", Constants.KEY_TITLE, "", "isActive", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;IZ)V", "getValues", "()Ljava/lang/String;", "getTitle", "()I", "()Z", "setActive", "(Z)V", "UNBOXING_CATEGORY_UNSPECIFIED", "UNBOXING_CATEGORY_SECTOR", "UNBOXING_CATEGORY_EMITTEN", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UnboxingStockFilterType extends Enum<UnboxingStockFilterType> {
    public static final UnboxingStockFilterType UNBOXING_CATEGORY_EMITTEN = null;
    public static final UnboxingStockFilterType UNBOXING_CATEGORY_SECTOR = null;
    public static final UnboxingStockFilterType UNBOXING_CATEGORY_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnboxingStockFilterType[] f86534a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86535b = null;
    private boolean isActive;
    private final int title;
    private final String values;

    static {
        UNBOXING_CATEGORY_UNSPECIFIED = new UnboxingStockFilterType("UNBOXING_CATEGORY_UNSPECIFIED", 0, "all", b.f80455j, true);
        String r2 = "UNBOXING_CATEGORY_SECTOR";
        int r3 = 1;
        String r4 = SearchEntryPoint.KEY_SECTOR;
        boolean r6 = false;
        UNBOXING_CATEGORY_SECTOR = new UnboxingStockFilterType(r2, r3, r4, b.f80457l, r6, 4, null);
        String r32 = "UNBOXING_CATEGORY_EMITTEN";
        int r42 = 2;
        String r5 = "emiten";
        boolean r7 = false;
        UNBOXING_CATEGORY_EMITTEN = new UnboxingStockFilterType(r32, r42, r5, b.f80456k, r7, 4, null);
        UnboxingStockFilterType[] r02 = a();
        f86534a = r02;
        f86535b = kotlin.enums.b.a(r02);
    }

    UnboxingStockFilterType(String r1, int r2, String r3, int r4, boolean r5) {
        this.values = r3;
        this.title = r4;
        this.isActive = r5;
    }

    public static final /* synthetic */ UnboxingStockFilterType[] a() {
        return new UnboxingStockFilterType[]{UNBOXING_CATEGORY_UNSPECIFIED, UNBOXING_CATEGORY_SECTOR, UNBOXING_CATEGORY_EMITTEN};
    }

    public static a getEntries() {
        return f86535b;
    }

    public static UnboxingStockFilterType valueOf(String r1) {
        return (UnboxingStockFilterType) Enum.valueOf(UnboxingStockFilterType.class, r1);
    }

    public static UnboxingStockFilterType[] values() {
        return (UnboxingStockFilterType[]) f86534a.clone();
    }

    public final int getTitle() {
        return this.title;
    }

    public final String getValues() {
        return this.values;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean r1) {
        this.isActive = r1;
    }

    /* synthetic */ UnboxingStockFilterType(String r7, int r8, String r9, int r10, boolean r11, int r12, i r13) {
        if ((r12 & 4) == 0) goto L5;
        r11 = false;
    L5:
        this(r7, r8, r9, r10, r11);
    }
}
