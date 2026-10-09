package androidx.paging;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/DiffingChangePayload;", "", "(Ljava/lang/String;I)V", "ITEM_TO_PLACEHOLDER", "PLACEHOLDER_TO_ITEM", "PLACEHOLDER_POSITION_CHANGE", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum DiffingChangePayload extends Enum<DiffingChangePayload> {
    public static final DiffingChangePayload ITEM_TO_PLACEHOLDER = null;
    public static final DiffingChangePayload PLACEHOLDER_POSITION_CHANGE = null;
    public static final DiffingChangePayload PLACEHOLDER_TO_ITEM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DiffingChangePayload[] f26655a = null;

    static {
        ITEM_TO_PLACEHOLDER = new DiffingChangePayload("ITEM_TO_PLACEHOLDER", 0);
        PLACEHOLDER_TO_ITEM = new DiffingChangePayload("PLACEHOLDER_TO_ITEM", 1);
        PLACEHOLDER_POSITION_CHANGE = new DiffingChangePayload("PLACEHOLDER_POSITION_CHANGE", 2);
        f26655a = a();
    }

    DiffingChangePayload(String r1, int r2) {
    }

    public static final /* synthetic */ DiffingChangePayload[] a() {
        return new DiffingChangePayload[]{ITEM_TO_PLACEHOLDER, PLACEHOLDER_TO_ITEM, PLACEHOLDER_POSITION_CHANGE};
    }

    public static DiffingChangePayload valueOf(String r1) {
        return (DiffingChangePayload) Enum.valueOf(DiffingChangePayload.class, r1);
    }

    public static DiffingChangePayload[] values() {
        return (DiffingChangePayload[]) f26655a.clone();
    }
}
