package com.evrencoskun.tableview.sort;

/* loaded from: classes4.dex */
public enum SortState extends Enum<SortState> {
    public static final SortState ASCENDING = null;
    public static final SortState DESCENDING = null;
    public static final SortState UNSORTED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SortState[] f35468a = null;

    static {
        SortState r02 = new SortState("ASCENDING", 0);
        ASCENDING = r02;
        SortState r1 = new SortState("DESCENDING", 1);
        DESCENDING = r1;
        SortState r2 = new SortState("UNSORTED", 2);
        UNSORTED = r2;
        f35468a = new SortState[]{r02, r1, r2};
    }

    SortState(String r1, int r2) {
    }

    public static SortState valueOf(String r1) {
        return (SortState) Enum.valueOf(SortState.class, r1);
    }

    public static SortState[] values() {
        return (SortState[]) f35468a.clone();
    }
}
