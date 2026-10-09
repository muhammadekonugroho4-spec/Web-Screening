package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class r extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24117a;

    /* renamed from: b, reason: collision with root package name */
    public final List f24118b;

    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24119a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f24120b;

        public a(Object r3) {
            this.f24120b = new AtomicInteger(0);
            this.f24119a = r3;
        }

        public final void a() {
            this.f24120b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            ((TextWatcher) this.f24119a).afterTextChanged(r2);
        }

        public final boolean b(Object r1) {
            return r1 instanceof m;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r2, int r3, int r4, int r5) {
            ((TextWatcher) this.f24119a).beforeTextChanged(r2, r3, r4, r5);
        }

        public final void c() {
            this.f24120b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable r2, Object r3, int r4, int r5) {
            if (this.f24120b.get() > 0) goto L5;
        L7:
            ((SpanWatcher) this.f24119a).onSpanAdded(r2, r3, r4, r5);
            return;
        L5:
            if (b(r3) == false) goto L7;
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable r9, Object r10, int r11, int r12, int r13, int r14) {
            if (this.f24120b.get() <= 0) goto L8;
            if (b(r10) == false) goto L8;
            return;
        L8:
            if (Build.VERSION.SDK_INT < 28) goto L10;
        L14:
            int r4 = r11;
            int r6 = r13;
        L15:
            ((SpanWatcher) this.f24119a).onSpanChanged(r9, r10, r4, r12, r6, r14);
            return;
        L10:
            if (r11 <= r12) goto L12;
            r11 = 0;
        L12:
            if (r13 <= r14) goto L14;
            r4 = r11;
            r6 = 0;
            goto L15
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable r2, Object r3, int r4, int r5) {
            if (this.f24120b.get() > 0) goto L5;
        L7:
            ((SpanWatcher) this.f24119a).onSpanRemoved(r2, r3, r4, r5);
            return;
        L5:
            if (b(r3) == false) goto L7;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r2, int r3, int r4, int r5) {
            ((TextWatcher) this.f24119a).onTextChanged(r2, r3, r4, r5);
        }
    }

    public r(Class r1, CharSequence r2) {
        super(r2);
        this.f24118b = new ArrayList();
        androidx.core.util.h.h(r1, "watcherClass cannot be null");
        this.f24117a = r1;
    }

    public static r c(Class r1, CharSequence r2) {
        return new r(r1, r2);
    }

    public void a() {
        b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Editable append(char r1) {
        return append(r1);
    }

    public final void b() {
        int r02 = 0;
    L4:
        if (r02 >= this.f24118b.size()) goto L6;
        ((a) this.f24118b.get(r02)).a();
        r02 = r02 + 1;
        goto L4
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable delete(int r1, int r2) {
        return delete(r1, r2);
    }

    public final void e() {
        int r1 = 0;
    L4:
        if (r1 >= this.f24118b.size()) goto L6;
        ((a) this.f24118b.get(r1)).onTextChanged(this, 0, length(), length());
        r1 = r1 + 1;
        goto L4
    }

    public final a f(Object r4) {
        int r02 = 0;
    L4:
        if (r02 >= this.f24118b.size()) goto L9;
        a r1 = (a) this.f24118b.get(r02);
        if (r1.f24119a == r4) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r1;
    L9:
        return null;
    }

    public final boolean g(Class r2) {
        if (this.f24117a != r2) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object r2) {
        if (h(r2) == false) goto L8;
        a r02 = f(r2);
        if (r02 == null) goto L8;
        r2 = r02;
    L8:
        return super.getSpanEnd(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object r2) {
        if (h(r2) == false) goto L8;
        a r02 = f(r2);
        if (r02 == null) goto L8;
        r2 = r02;
    L8:
        return super.getSpanFlags(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object r2) {
        if (h(r2) == false) goto L8;
        a r02 = f(r2);
        if (r02 == null) goto L8;
        r2 = r02;
    L8:
        return super.getSpanStart(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int r2, int r3, Class r4) {
        if (g(r4) == false) goto L10;
        a[] r22 = (a[]) super.getSpans(r2, r3, a.class);
        Object[] r32 = (Object[]) Array.newInstance(r4, r22.length);
        int r42 = 0;
    L6:
        if (r42 >= r22.length) goto L8;
        r32[r42] = r22[r42].f24119a;
        r42 = r42 + 1;
        goto L6
    L8:
        return r32;
    L10:
        return super.getSpans(r2, r3, r4);
    }

    public final boolean h(Object r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (g(r1.getClass()) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final void i() {
        int r02 = 0;
    L4:
        if (r02 >= this.f24118b.size()) goto L6;
        ((a) this.f24118b.get(r02)).c();
        r02 = r02 + 1;
        goto L4
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable insert(int r1, CharSequence r2) {
        return insert(r1, r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int r2, int r3, Class r4) {
        if (r4 != null) goto L4;
    L5:
        r4 = a.class;
    L7:
        return super.nextSpanTransition(r2, r3, r4);
    L4:
        if (g(r4) == false) goto L7;
        goto L5
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object r2) {
        if (h(r2) == false) goto L7;
        a r02 = f(r2);
        if (r02 == null) goto L8;
        r2 = r02;
    L8:
        super.removeSpan(r2);
        if (r02 == null) goto L12;
        this.f24118b.remove(r02);
        return;
    L12:
        return;
    L7:
        r02 = null;
        goto L8
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3) {
        return replace(r1, r2, r3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object r2, int r3, int r4, int r5) {
        if (h(r2) == false) goto L5;
        a r02 = new a(r2);
        this.f24118b.add(r02);
        r2 = r02;
    L5:
        super.setSpan(r2, r3, r4, r5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int r3, int r4) {
        return new r(this.f24117a, this, r3, r4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Editable append(CharSequence r1) {
        return append(r1);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int r1, int r2) {
        super.delete(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable insert(int r1, CharSequence r2, int r3, int r4) {
        return insert(r1, r2, r3, r4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3, int r4, int r5) {
        return replace(r1, r2, r3, r4, r5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Editable append(CharSequence r1, int r2, int r3) {
        return append(r1, r2, r3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int r1, CharSequence r2) {
        super.insert(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int r1, int r2, CharSequence r3) {
        b();
        super.replace(r1, r2, r3);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char r1) {
        return append(r1);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int r1, CharSequence r2, int r3, int r4) {
        super.insert(r1, r2, r3, r4);
        return this;
    }

    public r(Class r1, CharSequence r2, int r3, int r4) {
        super(r2, r3, r4);
        this.f24118b = new ArrayList();
        androidx.core.util.h.h(r1, "watcherClass cannot be null");
        this.f24117a = r1;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence r1) {
        return append(r1);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence r1, int r2, int r3) {
        return append(r1, r2, r3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int r1, int r2, CharSequence r3, int r4, int r5) {
        b();
        super.replace(r1, r2, r3, r4, r5);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence r1, int r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence r1, Object r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }
}
