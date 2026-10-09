package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.text.l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class l {

    public static class a {
        public static int a(TextView r02) {
            return r02.getBreakStrategy();
        }

        public static int b(TextView r02) {
            return r02.getHyphenationFrequency();
        }

        public static void c(TextView r02, int r1) {
            r02.setBreakStrategy(r1);
        }

        public static void d(TextView r02, ColorStateList r1) {
            r02.setCompoundDrawableTintList(r1);
        }

        public static void e(TextView r02, PorterDuff.Mode r1) {
            r02.setCompoundDrawableTintMode(r1);
        }

        public static void f(TextView r02, int r1) {
            r02.setHyphenationFrequency(r1);
        }
    }

    public static class b {
        public static DecimalFormatSymbols a(Locale r02) {
            return DecimalFormatSymbols.getInstance(r02);
        }
    }

    public static class c {
        public static String[] a(DecimalFormatSymbols r02) {
            return r02.getDigitStrings();
        }

        public static PrecomputedText.Params b(TextView r02) {
            return r02.getTextMetricsParams();
        }

        public static void c(TextView r02, int r1) {
            r02.setFirstBaselineToTopHeight(r1);
        }
    }

    public static class d {
        public static void a(TextView r02, int r1, float r2) {
            r02.setLineHeight(r1, r2);
        }
    }

    public static class e implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f23446a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f23447b;

        /* renamed from: c, reason: collision with root package name */
        public Class f23448c;
        public Method d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f23449e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f23450f;

        public e(ActionMode.Callback r1, TextView r2) {
            this.f23446a = r1;
            this.f23447b = r2;
            this.f23450f = false;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo r3, TextView r4) {
            Intent r42 = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(r4));
            ActivityInfo r32 = r3.activityInfo;
            return r42.setClassName(r32.packageName, r32.name);
        }

        public final List c(Context r4, PackageManager r5) {
            ArrayList r02 = new ArrayList();
            if ((r4 instanceof Activity) == false) goto L11;
            Iterator<ResolveInfo> r52 = r5.queryIntentActivities(a(), 0).iterator();
        L7:
            if (r52.hasNext() == false) goto L11;
            ResolveInfo r1 = r52.next();
            if (f(r1, r4) == false) goto L7;
            r02.add(r1);
        L11:
            return r02;
        }

        public ActionMode.Callback d() {
            return this.f23446a;
        }

        public final boolean e(TextView r2) {
            if ((r2 instanceof Editable) == true) goto L5;
            return false;
        L5:
            if (r2.onCheckIsTextEditor() == true) goto L7;
            return false;
        L7:
            if (r2.isEnabled() == false) goto L13;
            return true;
        L13:
            return false;
        }

        public final boolean f(ResolveInfo r4, Context r5) {
            if (r5.getPackageName().equals(r4.activityInfo.packageName) == false) goto L5;
            return true;
        L5:
            ActivityInfo r42 = r4.activityInfo;
            if (r42.exported == true) goto L8;
            return false;
        L8:
            String r43 = r42.permission;
            if (r43 != null) goto L11;
        L14:
            return true;
        L11:
            if (r5.checkSelfPermission(r43) == 0) goto L14;
            return false;
        }

        public final void g(Menu r9) {
            Context r02 = this.f23447b.getContext();
            PackageManager r1 = r02.getPackageManager();
            boolean r2 = this.f23450f;
            Class r3 = Integer.TYPE;
            if (r2 == true) goto L28;
            this.f23450f = true;
            Class<?> r22 = Class.forName("com.android.internal.view.menu.MenuBuilder");     // Catch: Throwable -> L7
            this.f23448c = r22;     // Catch: Throwable -> L7
            this.d = r22.getDeclaredMethod("removeItemAt", new Class[]{r3});     // Catch: Throwable -> L7
            this.f23449e = true;     // Catch: Throwable -> L7
        L7:
            this.f23448c = null;
            this.d = null;
            this.f23449e = false;
        L28:
            if (this.f23449e == true) goto L11;
        L13:
            Method r23 = r9.getClass().getDeclaredMethod("removeItemAt", new Class[]{r3});     // Catch: Throwable -> L27
        L14:
            int r32 = r9.size() - 1;     // Catch: Throwable -> L27
        L15:
            if (r32 < 0) goto L22;
            MenuItem r4 = r9.getItem(r32);     // Catch: Throwable -> L27
            if (r4.getIntent() == null) goto L21;
            if ("android.intent.action.PROCESS_TEXT".equals(r4.getIntent().getAction()) == false) goto L21;
            r23.invoke(r9, new Object[]{Integer.valueOf(r32)});     // Catch: Throwable -> L27
        L21:
            r32 = r32 - 1;
            goto L15
        L22:
            List r03 = c(r02, r1);
            int r24 = 0;
        L24:
            if (r24 >= r03.size()) goto L37;
            ResolveInfo r33 = (ResolveInfo) r03.get(r24);
            r9.add(0, 0, r24 + 100, r33.loadLabel(r1)).setIntent(b(r33, this.f23447b)).setShowAsAction(1);
            r24 = r24 + 1;
            goto L24
        L37:
            return;
        L11:
            if (this.f23448c.isInstance(r9) == false) goto L13;
            r23 = this.d;     // Catch: Throwable -> L27
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode r2, MenuItem r3) {
            return this.f23446a.onActionItemClicked(r2, r3);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode r2, Menu r3) {
            return this.f23446a.onCreateActionMode(r2, r3);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode r2) {
            this.f23446a.onDestroyActionMode(r2);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode r2, Menu r3) {
            g(r3);
            return this.f23446a.onPrepareActionMode(r2, r3);
        }
    }

    public static int a(TextView r1) {
        return r1.getPaddingTop() - r1.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView r1) {
        return r1.getPaddingBottom() + r1.getPaint().getFontMetricsInt().bottom;
    }

    public static int c(TextDirectionHeuristic r4) {
        TextDirectionHeuristic r02 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (r4 != r02) goto L5;
        return 1;
    L5:
        TextDirectionHeuristic r2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (r4 != r2) goto L9;
        return 1;
    L9:
        if (r4 != TextDirectionHeuristics.ANYRTL_LTR) goto L13;
        return 2;
    L13:
        if (r4 != TextDirectionHeuristics.LTR) goto L17;
        return 3;
    L17:
        if (r4 != TextDirectionHeuristics.RTL) goto L21;
        return 4;
    L21:
        if (r4 != TextDirectionHeuristics.LOCALE) goto L24;
        return 5;
    L24:
        if (r4 != r2) goto L27;
        return 6;
    L27:
        if (r4 != r02) goto L30;
        return 7;
    L30:
        return 1;
    }

    public static TextDirectionHeuristic d(TextView r4) {
        if ((r4.getTransformationMethod() instanceof PasswordTransformationMethod) == true) goto L5;
        boolean r2 = true;
        if (Build.VERSION.SDK_INT < 28) goto L20;
        if ((r4.getInputType() & 15) != 3) goto L20;
        byte r42 = Character.getDirectionality(c.a(b.a(r4.getTextLocale()))[0].codePointAt(0));
        if (r42 == 1) goto L18;
        if (r42 == 2) goto L18;
        return TextDirectionHeuristics.LTR;
    L18:
        return TextDirectionHeuristics.RTL;
    L20:
        if (r4.getLayoutDirection() == 1) goto L24;
        r2 = false;
    L24:
        switch(r4.getTextDirection()) {
            case 2: goto L41;
            case 3: goto L39;
            case 4: goto L37;
            case 5: goto L35;
            case 6: goto L33;
            case 7: goto L31;
            default: goto L25;
        };
    L25:
        if (r2 == false) goto L29;
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    L29:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    L31:
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    L33:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    L35:
        return TextDirectionHeuristics.LOCALE;
    L37:
        return TextDirectionHeuristics.RTL;
    L39:
        return TextDirectionHeuristics.LTR;
    L41:
        return TextDirectionHeuristics.ANYRTL_LTR;
    L5:
        return TextDirectionHeuristics.LTR;
    }

    public static l.a e(TextView r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        l.a.C0170a r02 = new l.a.C0170a(new TextPaint(r3.getPaint()));
        r02.b(a.a(r3));
        r02.c(a.b(r3));
        r02.d(d(r3));
        return r02.a();
    L5:
        return new l.a(c.b(r3));
    }

    public static void f(TextView r02, ColorStateList r1) {
        androidx.core.util.h.g(r02);
        a.d(r02, r1);
    }

    public static void g(TextView r02, PorterDuff.Mode r1) {
        androidx.core.util.h.g(r02);
        a.e(r02, r1);
    }

    public static void h(TextView r3, int r4) {
        androidx.core.util.h.d(r4);
        if (Build.VERSION.SDK_INT < 28) goto L6;
        c.c(r3, r4);
        return;
    L6:
        Paint.FontMetricsInt r02 = r3.getPaint().getFontMetricsInt();
        if (r3.getIncludeFontPadding() == false) goto L9;
        int r03 = r02.top;
    L11:
        if (r4 <= Math.abs(r03)) goto L14;
        int r42 = r4 + r03;
        r3.setPadding(r3.getPaddingLeft(), r42, r3.getPaddingRight(), r3.getPaddingBottom());
        return;
    L14:
        return;
    L9:
        r03 = r02.ascent;
        goto L11
    }

    public static void i(TextView r3, int r4) {
        androidx.core.util.h.d(r4);
        Paint.FontMetricsInt r02 = r3.getPaint().getFontMetricsInt();
        if (r3.getIncludeFontPadding() == false) goto L5;
        int r03 = r02.bottom;
    L7:
        if (r4 <= Math.abs(r03)) goto L10;
        int r42 = r4 - r03;
        r3.setPadding(r3.getPaddingLeft(), r3.getPaddingTop(), r3.getPaddingRight(), r42);
        return;
    L10:
        return;
    L5:
        r03 = r02.descent;
        goto L7
    }

    public static void j(TextView r2, int r3) {
        androidx.core.util.h.d(r3);
        if (r3 == r2.getPaint().getFontMetricsInt(null)) goto L6;
        r2.setLineSpacing(r3 - r0, 1.0f);
        return;
    }

    public static void k(TextView r2, int r3, float r4) {
        if (Build.VERSION.SDK_INT < 34) goto L6;
        d.a(r2, r3, r4);
        return;
    L6:
        j(r2, Math.round(TypedValue.applyDimension(r3, r4, r2.getResources().getDisplayMetrics())));
    }

    public static void l(TextView r2, androidx.core.text.l r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        throw null;
    L5:
        e(r2);
        throw null;
    }

    public static void m(TextView r02, int r1) {
        r02.setTextAppearance(r1);
    }

    public static void n(TextView r2, l.a r3) {
        r2.setTextDirection(c(r3.d()));
        r2.getPaint().set(r3.e());
        a.c(r2, r3.b());
        a.f(r2, r3.c());
    }

    public static ActionMode.Callback o(ActionMode.Callback r1) {
        if ((r1 instanceof e) == true) goto L5;
        return r1;
    L5:
        return ((e) r1).d();
    }

    public static ActionMode.Callback p(TextView r2, ActionMode.Callback r3) {
        if (Build.VERSION.SDK_INT <= 27) goto L5;
    L10:
        return r3;
    L5:
        if ((r3 instanceof e) == true) goto L10;
        if (r3 == null) goto L10;
        return new e(r3, r2);
    }
}
