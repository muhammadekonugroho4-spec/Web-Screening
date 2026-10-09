package com.evrencoskun.tableview.sort;

import com.evrencoskun.tableview.layoutmanager.ColumnHeaderLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0362a f35469c = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f35470a;

    /* renamed from: b, reason: collision with root package name */
    public final ColumnHeaderLayoutManager f35471b;

    /* renamed from: com.evrencoskun.tableview.sort.a$a, reason: collision with other inner class name */
    public static class C0362a {

        /* renamed from: a, reason: collision with root package name */
        public final int f35472a;

        /* renamed from: b, reason: collision with root package name */
        public final SortState f35473b;

        public C0362a(int r1, SortState r2) {
            this.f35472a = r1;
            this.f35473b = r2;
        }

        public static /* synthetic */ SortState a(C0362a r02) {
            return r02.f35473b;
        }

        public static /* synthetic */ int b(C0362a r02) {
            return r02.f35472a;
        }
    }

    static {
        f35469c = new C0362a(-1, SortState.UNSORTED);
    }

    public a(ColumnHeaderLayoutManager r2) {
        this.f35470a = new ArrayList();
        this.f35471b = r2;
    }

    public final C0362a a(int r4) {
        int r02 = 0;
    L4:
        if (r02 >= this.f35470a.size()) goto L10;
        C0362a r1 = (C0362a) this.f35470a.get(r02);
        if (C0362a.b(r1) == r4) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r1;
    L10:
        return f35469c;
    }

    public SortState b(int r1) {
        return C0362a.a(a(r1));
    }
}
