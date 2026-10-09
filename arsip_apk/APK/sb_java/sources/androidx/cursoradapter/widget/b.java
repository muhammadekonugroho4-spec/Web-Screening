package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes4.dex */
public class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public a f23540a;

    public interface a {
        void a(Cursor r1);

        Cursor b();

        CharSequence c(Cursor r1);

        Cursor d(CharSequence r1);
    }

    public b(a r1) {
        this.f23540a = r1;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object r2) {
        return this.f23540a.c((Cursor) r2);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence r3) {
        Cursor r32 = this.f23540a.d(r3);
        Filter.FilterResults r02 = new Filter.FilterResults();
        if (r32 == null) goto L6;
        r02.count = r32.getCount();
        r02.values = r32;
        return r02;
    L6:
        r02.count = 0;
        r02.values = null;
        return r02;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence r1, Filter.FilterResults r2) {
        Cursor r12 = this.f23540a.b();
        Object r22 = r2.values;
        if (r22 == null) goto L7;
        if (r22 == r12) goto L8;
        this.f23540a.a((Cursor) r22);
        return;
    L8:
        return;
    }
}
