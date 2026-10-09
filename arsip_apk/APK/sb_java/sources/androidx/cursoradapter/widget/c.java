package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public int f23541i;

    /* renamed from: j, reason: collision with root package name */
    public int f23542j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutInflater f23543k;

    public c(Context r1, int r2, Cursor r3, boolean r4) {
        super(r1, r3, r4);
        this.f23542j = r2;
        this.f23541i = r2;
        this.f23543k = (LayoutInflater) r1.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.a
    public View g(Context r2, Cursor r3, ViewGroup r4) {
        return this.f23543k.inflate(this.f23542j, r4, false);
    }

    @Override // androidx.cursoradapter.widget.a
    public View h(Context r2, Cursor r3, ViewGroup r4) {
        return this.f23543k.inflate(this.f23541i, r4, false);
    }
}
