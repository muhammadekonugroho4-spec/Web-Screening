package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes.dex */
public class a extends o implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    public final AlertController f2433a;

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0026a {

        /* renamed from: P, reason: collision with root package name */
        private final AlertController.b f2434P;
        private final int mTheme;

        public C0026a(Context r2) {
            this(r2, a.l(r2, 0));
        }

        public a create() {
            a r02 = new a(this.f2434P.f2392a, this.mTheme);
            this.f2434P.a(r02.f2433a);
            r02.setCancelable(this.f2434P.f2408r);
            if (this.f2434P.f2408r == false) goto L5;
            r02.setCanceledOnTouchOutside(true);
        L5:
            r02.setOnCancelListener(this.f2434P.f2409s);
            r02.setOnDismissListener(this.f2434P.f2410t);
            DialogInterface.OnKeyListener r1 = this.f2434P.f2411u;
            if (r1 == null) goto L8;
            r02.setOnKeyListener(r1);
        L8:
            return r02;
        }

        public Context getContext() {
            return this.f2434P.f2392a;
        }

        public C0026a setAdapter(ListAdapter r2, DialogInterface.OnClickListener r3) {
            AlertController.b r02 = this.f2434P;
            r02.f2413w = r2;
            r02.f2414x = r3;
            return this;
        }

        public C0026a setCancelable(boolean r2) {
            this.f2434P.f2408r = r2;
            return this;
        }

        public C0026a setCursor(Cursor r2, DialogInterface.OnClickListener r3, String r4) {
            AlertController.b r02 = this.f2434P;
            r02.f2386K = r2;
            r02.f2387L = r4;
            r02.f2414x = r3;
            return this;
        }

        public C0026a setCustomTitle(View r2) {
            this.f2434P.f2397g = r2;
            return this;
        }

        public C0026a setIcon(int r2) {
            this.f2434P.f2394c = r2;
            return this;
        }

        public C0026a setIconAttribute(int r4) {
            TypedValue r02 = new TypedValue();
            this.f2434P.f2392a.getTheme().resolveAttribute(r4, r02, true);
            AlertController.b r42 = this.f2434P;
            r42.f2394c = r02.resourceId;
            return this;
        }

        @Deprecated
        public C0026a setInverseBackgroundForced(boolean r2) {
            this.f2434P.f2389N = r2;
            return this;
        }

        public C0026a setItems(int r3, DialogInterface.OnClickListener r4) {
            AlertController.b r02 = this.f2434P;
            r02.f2412v = r02.f2392a.getResources().getTextArray(r3);
            this.f2434P.f2414x = r4;
            return this;
        }

        public C0026a setMessage(int r3) {
            AlertController.b r02 = this.f2434P;
            r02.f2398h = r02.f2392a.getText(r3);
            return this;
        }

        public C0026a setMultiChoiceItems(int r3, boolean[] r4, DialogInterface.OnMultiChoiceClickListener r5) {
            AlertController.b r02 = this.f2434P;
            r02.f2412v = r02.f2392a.getResources().getTextArray(r3);
            AlertController.b r32 = this.f2434P;
            r32.f2385J = r5;
            r32.f2381F = r4;
            r32.f2382G = true;
            return this;
        }

        public C0026a setNegativeButton(int r3, DialogInterface.OnClickListener r4) {
            AlertController.b r02 = this.f2434P;
            r02.f2402l = r02.f2392a.getText(r3);
            this.f2434P.f2404n = r4;
            return this;
        }

        public C0026a setNegativeButtonIcon(Drawable r2) {
            this.f2434P.f2403m = r2;
            return this;
        }

        public C0026a setNeutralButton(int r3, DialogInterface.OnClickListener r4) {
            AlertController.b r02 = this.f2434P;
            r02.f2405o = r02.f2392a.getText(r3);
            this.f2434P.f2407q = r4;
            return this;
        }

        public C0026a setNeutralButtonIcon(Drawable r2) {
            this.f2434P.f2406p = r2;
            return this;
        }

        public C0026a setOnCancelListener(DialogInterface.OnCancelListener r2) {
            this.f2434P.f2409s = r2;
            return this;
        }

        public C0026a setOnDismissListener(DialogInterface.OnDismissListener r2) {
            this.f2434P.f2410t = r2;
            return this;
        }

        public C0026a setOnItemSelectedListener(AdapterView.OnItemSelectedListener r2) {
            this.f2434P.f2390O = r2;
            return this;
        }

        public C0026a setOnKeyListener(DialogInterface.OnKeyListener r2) {
            this.f2434P.f2411u = r2;
            return this;
        }

        public C0026a setPositiveButton(int r3, DialogInterface.OnClickListener r4) {
            AlertController.b r02 = this.f2434P;
            r02.f2399i = r02.f2392a.getText(r3);
            this.f2434P.f2401k = r4;
            return this;
        }

        public C0026a setPositiveButtonIcon(Drawable r2) {
            this.f2434P.f2400j = r2;
            return this;
        }

        public C0026a setRecycleOnMeasureEnabled(boolean r2) {
            this.f2434P.f2391P = r2;
            return this;
        }

        public C0026a setSingleChoiceItems(int r3, int r4, DialogInterface.OnClickListener r5) {
            AlertController.b r02 = this.f2434P;
            r02.f2412v = r02.f2392a.getResources().getTextArray(r3);
            AlertController.b r32 = this.f2434P;
            r32.f2414x = r5;
            r32.f2384I = r4;
            r32.f2383H = true;
            return this;
        }

        public C0026a setTitle(int r3) {
            AlertController.b r02 = this.f2434P;
            r02.f2396f = r02.f2392a.getText(r3);
            return this;
        }

        public C0026a setView(int r3) {
            AlertController.b r02 = this.f2434P;
            r02.f2416z = null;
            r02.f2415y = r3;
            r02.f2380E = false;
            return this;
        }

        public a show() {
            a r02 = create();
            r02.show();
            return r02;
        }

        public C0026a(Context r4, int r5) {
            this.f2434P = new AlertController.b(new ContextThemeWrapper(r4, a.l(r4, r5)));
            this.mTheme = r5;
        }

        public C0026a setIcon(Drawable r2) {
            this.f2434P.d = r2;
            return this;
        }

        public C0026a setMessage(CharSequence r2) {
            this.f2434P.f2398h = r2;
            return this;
        }

        public C0026a setTitle(CharSequence r2) {
            this.f2434P.f2396f = r2;
            return this;
        }

        public C0026a setItems(CharSequence[] r2, DialogInterface.OnClickListener r3) {
            AlertController.b r02 = this.f2434P;
            r02.f2412v = r2;
            r02.f2414x = r3;
            return this;
        }

        public C0026a setNegativeButton(CharSequence r2, DialogInterface.OnClickListener r3) {
            AlertController.b r02 = this.f2434P;
            r02.f2402l = r2;
            r02.f2404n = r3;
            return this;
        }

        public C0026a setNeutralButton(CharSequence r2, DialogInterface.OnClickListener r3) {
            AlertController.b r02 = this.f2434P;
            r02.f2405o = r2;
            r02.f2407q = r3;
            return this;
        }

        public C0026a setPositiveButton(CharSequence r2, DialogInterface.OnClickListener r3) {
            AlertController.b r02 = this.f2434P;
            r02.f2399i = r2;
            r02.f2401k = r3;
            return this;
        }

        public C0026a setView(View r2) {
            AlertController.b r02 = this.f2434P;
            r02.f2416z = r2;
            r02.f2415y = 0;
            r02.f2380E = false;
            return this;
        }

        public C0026a setMultiChoiceItems(CharSequence[] r2, boolean[] r3, DialogInterface.OnMultiChoiceClickListener r4) {
            AlertController.b r02 = this.f2434P;
            r02.f2412v = r2;
            r02.f2385J = r4;
            r02.f2381F = r3;
            r02.f2382G = true;
            return this;
        }

        public C0026a setSingleChoiceItems(Cursor r2, int r3, String r4, DialogInterface.OnClickListener r5) {
            AlertController.b r02 = this.f2434P;
            r02.f2386K = r2;
            r02.f2414x = r5;
            r02.f2384I = r3;
            r02.f2387L = r4;
            r02.f2383H = true;
            return this;
        }

        @Deprecated
        public C0026a setView(View r2, int r3, int r4, int r5, int r6) {
            AlertController.b r02 = this.f2434P;
            r02.f2416z = r2;
            r02.f2415y = 0;
            r02.f2380E = true;
            r02.f2376A = r3;
            r02.f2377B = r4;
            r02.f2378C = r5;
            r02.f2379D = r6;
            return this;
        }

        public C0026a setMultiChoiceItems(Cursor r2, String r3, String r4, DialogInterface.OnMultiChoiceClickListener r5) {
            AlertController.b r02 = this.f2434P;
            r02.f2386K = r2;
            r02.f2385J = r5;
            r02.f2388M = r3;
            r02.f2387L = r4;
            r02.f2382G = true;
            return this;
        }

        public C0026a setSingleChoiceItems(CharSequence[] r2, int r3, DialogInterface.OnClickListener r4) {
            AlertController.b r02 = this.f2434P;
            r02.f2412v = r2;
            r02.f2414x = r4;
            r02.f2384I = r3;
            r02.f2383H = true;
            return this;
        }

        public C0026a setSingleChoiceItems(ListAdapter r2, int r3, DialogInterface.OnClickListener r4) {
            AlertController.b r02 = this.f2434P;
            r02.f2413w = r2;
            r02.f2414x = r4;
            r02.f2384I = r3;
            r02.f2383H = true;
            return this;
        }
    }

    public a(Context r2, int r3) {
        super(r2, l(r2, r3));
        this.f2433a = new AlertController(getContext(), this, getWindow());
    }

    public static int l(Context r2, int r3) {
        if (((r3 >>> 24) & Constants.MAX_HOST_LENGTH) < 1) goto L5;
        return r3;
    L5:
        TypedValue r32 = new TypedValue();
        r2.getTheme().resolveAttribute(androidx.appcompat.a.f2317p, r32, true);
        return r32.resourceId;
    }

    public Button j(int r2) {
        return this.f2433a.c(r2);
    }

    public ListView k() {
        return this.f2433a.e();
    }

    @Override // androidx.appcompat.app.o, androidx.activity.C, android.app.Dialog
    public void onCreate(Bundle r1) {
        super.onCreate(r1);
        this.f2433a.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, KeyEvent r3) {
        if (this.f2433a.g(r2, r3) == false) goto L7;
        return true;
    L7:
        return super.onKeyDown(r2, r3);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, KeyEvent r3) {
        if (this.f2433a.h(r2, r3) == false) goto L7;
        return true;
    L7:
        return super.onKeyUp(r2, r3);
    }

    @Override // androidx.appcompat.app.o, android.app.Dialog
    public void setTitle(CharSequence r2) {
        super.setTitle(r2);
        this.f2433a.q(r2);
    }
}
