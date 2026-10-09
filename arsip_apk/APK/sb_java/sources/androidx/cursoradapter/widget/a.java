package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.cursoradapter.widget.b;

/* loaded from: classes4.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23531a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23532b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f23533c;
    public Context d;

    /* renamed from: e, reason: collision with root package name */
    public int f23534e;

    /* renamed from: f, reason: collision with root package name */
    public C0184a f23535f;

    /* renamed from: g, reason: collision with root package name */
    public DataSetObserver f23536g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.cursoradapter.widget.b f23537h;

    /* renamed from: androidx.cursoradapter.widget.a$a, reason: collision with other inner class name */
    public class C0184a extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f23538a;

        public C0184a(a r1) {
            this.f23538a = r1;
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r1) {
            this.f23538a.i();
        }
    }

    public class b extends DataSetObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f23539a;

        public b(a r1) {
            this.f23539a = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a r02 = this.f23539a;
            r02.f23531a = true;
            r02.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a r02 = this.f23539a;
            r02.f23531a = false;
            r02.notifyDataSetInvalidated();
        }
    }

    public a(Context r1, Cursor r2, boolean r3) {
        if (r3 == false) goto L5;
        int r32 = 1;
    L6:
        f(r1, r2, r32);
        return;
    L5:
        r32 = 2;
        goto L6
    }

    public void a(Cursor r1) {
        Cursor r12 = j(r1);
        if (r12 == null) goto L6;
        r12.close();
        return;
    }

    @Override // androidx.cursoradapter.widget.b.a
    public Cursor b() {
        return this.f23533c;
    }

    public abstract CharSequence c(Cursor r1);

    public abstract void e(View r1, Context r2, Cursor r3);

    public void f(Context r4, Cursor r5, int r6) {
        boolean r1 = false;
        if ((r6 & 1) != 1) goto L5;
        r6 = r6 | 2;
        this.f23532b = true;
    L6:
        if (r5 == null) goto L8;
        r1 = true;
    L8:
        this.f23533c = r5;
        this.f23531a = r1;
        this.d = r4;
        if (r1 == false) goto L11;
        int r42 = r5.getColumnIndexOrThrow("_id");
    L12:
        this.f23534e = r42;
        if ((r6 & 2) != 2) goto L15;
        this.f23535f = new C0184a(this);
        this.f23536g = new b(this);
    L16:
        if (r1 == false) goto L24;
        C0184a r43 = this.f23535f;
        if (r43 == null) goto L20;
        r5.registerContentObserver(r43);
    L20:
        DataSetObserver r44 = this.f23536g;
        if (r44 == null) goto L25;
        r5.registerDataSetObserver(r44);
        return;
    L25:
        return;
    L24:
        return;
    L15:
        this.f23535f = null;
        this.f23536g = null;
        goto L16
    L11:
        r42 = -1;
        goto L12
    L5:
        this.f23532b = false;
        goto L6
    }

    public abstract View g(Context r1, Cursor r2, ViewGroup r3);

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f23531a == false) goto L8;
        Cursor r02 = this.f23533c;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.getCount();
    L8:
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int r2, View r3, ViewGroup r4) {
        if (this.f23531a == false) goto L9;
        this.f23533c.moveToPosition(r2);
        if (r3 != null) goto L7;
        r3 = g(this.d, this.f23533c, r4);
    L7:
        e(r3, this.d, this.f23533c);
        return r3;
    L9:
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f23537h != null) goto L6;
        this.f23537h = new androidx.cursoradapter.widget.b(this);
    L6:
        return this.f23537h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int r2) {
        if (this.f23531a == false) goto L8;
        Cursor r02 = this.f23533c;
        if (r02 == null) goto L10;
        r02.moveToPosition(r2);
        return this.f23533c;
    L10:
        return null;
    L8:
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int r4) {
        if (this.f23531a == false) goto L10;
        Cursor r02 = this.f23533c;
        if (r02 == null) goto L10;
        if (r02.moveToPosition(r4) == false) goto L10;
        return this.f23533c.getLong(this.f23534e);
    L10:
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int r2, View r3, ViewGroup r4) {
        if (this.f23531a == false) goto L13;
        if (this.f23533c.moveToPosition(r2) == false) goto L11;
        if (r3 != null) goto L8;
        r3 = h(this.d, this.f23533c, r4);
    L8:
        e(r3, this.d, this.f23533c);
        return r3;
    L11:
        throw new IllegalStateException("couldn't move cursor to position " + r2);
    L13:
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context r1, Cursor r2, ViewGroup r3);

    public void i() {
        if (this.f23532b == false) goto L10;
        Cursor r02 = this.f23533c;
        if (r02 != null) goto L7;
        return;
    L7:
        if (r02.isClosed() == true) goto L12;
        this.f23531a = this.f23533c.requery();
        return;
    L12:
        return;
    }

    public Cursor j(Cursor r3) {
        Cursor r02 = this.f23533c;
        if (r3 != r02) goto L6;
        return null;
    L6:
        if (r02 == null) goto L13;
        C0184a r1 = this.f23535f;
        if (r1 == null) goto L10;
        r02.unregisterContentObserver(r1);
    L10:
        DataSetObserver r12 = this.f23536g;
        if (r12 == null) goto L13;
        r02.unregisterDataSetObserver(r12);
    L13:
        this.f23533c = r3;
        if (r3 == null) goto L23;
        C0184a r13 = this.f23535f;
        if (r13 == null) goto L18;
        r3.registerContentObserver(r13);
    L18:
        DataSetObserver r14 = this.f23536g;
        if (r14 == null) goto L21;
        r3.registerDataSetObserver(r14);
    L21:
        this.f23534e = r3.getColumnIndexOrThrow("_id");
        this.f23531a = true;
        notifyDataSetChanged();
        return r02;
    L23:
        this.f23534e = -1;
        this.f23531a = false;
        notifyDataSetInvalidated();
        return r02;
    }
}
