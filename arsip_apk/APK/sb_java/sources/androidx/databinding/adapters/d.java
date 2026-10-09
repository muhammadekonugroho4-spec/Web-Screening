package androidx.databinding.adapters;

import android.widget.RadioGroup;
import androidx.databinding.g;

/* loaded from: classes4.dex */
public abstract class d {

    public class a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup.OnCheckedChangeListener f23590a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f23591b;

        public a(RadioGroup.OnCheckedChangeListener r1, g r2) {
            this.f23590a = r1;
            this.f23591b = r2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup r2, int r3) {
            RadioGroup.OnCheckedChangeListener r02 = this.f23590a;
            if (r02 == null) goto L5;
            r02.onCheckedChanged(r2, r3);
        L5:
            this.f23591b.a();
        }
    }

    public static void a(RadioGroup r1, RadioGroup.OnCheckedChangeListener r2, g r3) {
        if (r3 != null) goto L5;
        r1.setOnCheckedChangeListener(r2);
        return;
    L5:
        r1.setOnCheckedChangeListener(new a(r2, r3));
    }
}
