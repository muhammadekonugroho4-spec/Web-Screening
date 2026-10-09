package androidx.databinding.adapters;

import android.widget.CompoundButton;
import androidx.databinding.g;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: androidx.databinding.adapters.a$a, reason: collision with other inner class name */
    public class C0187a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CompoundButton.OnCheckedChangeListener f23587a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f23588b;

        public C0187a(CompoundButton.OnCheckedChangeListener r1, g r2) {
            this.f23587a = r1;
            this.f23588b = r2;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton r2, boolean r3) {
            CompoundButton.OnCheckedChangeListener r02 = this.f23587a;
            if (r02 == null) goto L5;
            r02.onCheckedChanged(r2, r3);
        L5:
            this.f23588b.a();
        }
    }

    public static void a(CompoundButton r1, boolean r2) {
        if (r1.isChecked() == r2) goto L6;
        r1.setChecked(r2);
        return;
    }

    public static void b(CompoundButton r1, CompoundButton.OnCheckedChangeListener r2, g r3) {
        if (r3 != null) goto L5;
        r1.setOnCheckedChangeListener(r2);
        return;
    L5:
        r1.setOnCheckedChangeListener(new C0187a(r2, r3));
    }
}
