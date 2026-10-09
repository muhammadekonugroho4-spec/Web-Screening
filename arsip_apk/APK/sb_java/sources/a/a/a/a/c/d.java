package a.a.a.a.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.midtrans.sdk.uikit.models.CountryCodeModel;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1419b;

    /* renamed from: c, reason: collision with root package name */
    public Filter f1420c;

    public class a extends Filter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f1421a;

        public a(d r1) {
            this.f1421a = r1;
        }

        public String a(Object r1) {
            return ((CountryCodeModel) r1).b();
        }

        @Override // android.widget.Filter
        public /* bridge */ /* synthetic */ CharSequence convertResultToString(Object r1) {
            return a(r1);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence r6) {
            if (r6 == null) goto L12;
            ArrayList r02 = new ArrayList();
            Iterator r1 = d.a(this.f1421a).iterator();
        L5:
            if (r1.hasNext() == false) goto L9;
            CountryCodeModel r2 = (CountryCodeModel) r1.next();
            if (r2.b().toLowerCase().startsWith(r6.toString().toLowerCase()) == false) goto L5;
            r02.add(r2);
            goto L5
        L9:
            Filter.FilterResults r62 = new Filter.FilterResults();
            r62.values = r02;
            r62.count = r02.size();
            return r62;
        L12:
            return new Filter.FilterResults();
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence r1, Filter.FilterResults r2) {
            this.f1421a.clear();
            if (r2 != null) goto L5;
        L7:
            this.f1421a.notifyDataSetChanged();
            return;
        L5:
            if (r2.count <= 0) goto L7;
            this.f1421a.addAll((ArrayList) r2.values);
            goto L7
        }
    }

    public d(Context r1, int r2, ArrayList r3) {
        super(r1, r2);
        this.f1420c = new a(this);
        this.f1419b = r2;
        this.f1418a = r3;
    }

    public static /* synthetic */ ArrayList a(d r02) {
        return r02.f1418a;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.f1420c;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int r3, View r4, ViewGroup r5) {
        if (r4 != null) goto L4;
        r4 = LayoutInflater.from(r5.getContext()).inflate(this.f1419b, r5, false);
    L4:
        CountryCodeModel r32 = (CountryCodeModel) getItem(r3);
        ((TextView) r4.findViewById(com.midtrans.sdk.uikit.h.A2)).setText(r32.b());
        r4.setTag(r32);
        return r4;
    }
}
