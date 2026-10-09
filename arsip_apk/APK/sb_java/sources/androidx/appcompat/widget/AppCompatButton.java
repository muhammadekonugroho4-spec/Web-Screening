package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {
    private C2092i mAppCompatEmojiTextHelper;
    private final C2087d mBackgroundTintHelper;
    private final C2099p mTextHelper;

    public AppCompatButton(Context r2) {
        this(r2, null);
    }

    private C2092i getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper != null) goto L6;
        this.mAppCompatEmojiTextHelper = new C2092i(this);
    L6:
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L5;
        r02.b();
    L5:
        C2099p r03 = this.mTextHelper;
        if (r03 == null) goto L9;
        r03.b();
        return;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (U.f3578c == true) goto L5;
        C2099p r02 = this.mTextHelper;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return r02.e();
    L5:
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (U.f3578c == true) goto L5;
        C2099p r02 = this.mTextHelper;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return r02.f();
    L5:
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (U.f3578c == true) goto L5;
        C2099p r02 = this.mTextHelper;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return r02.g();
    L5:
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (U.f3578c == true) goto L5;
        C2099p r02 = this.mTextHelper;
        if (r02 == null) goto L11;
        return r02.h();
    L11:
        return new int[0];
    L5:
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (U.f3578c == true) goto L5;
        C2099p r02 = this.mTextHelper;
        if (r02 != null) goto L11;
        return 0;
    L11:
        return r02.i();
    L5:
        if (super.getAutoSizeTextType() != 1) goto L7;
        return 1;
    L7:
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.c();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.d();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        super.onLayout(r7, r8, r9, r10, r11);
        C2099p r02 = this.mTextHelper;
        if (r02 == null) goto L6;
        r02.o(r7, r8, r9, r10, r11);
        return;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        C2099p r12 = this.mTextHelper;
        if (r12 != null) goto L5;
        return;
    L5:
        if (U.f3578c == false) goto L7;
        return;
    L7:
        if (r12.l() == false) goto L12;
        this.mTextHelper.c();
        return;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().d(r2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws IllegalArgumentException {
        if (U.f3578c == false) goto L6;
        super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
        return;
    L6:
        C2099p r02 = this.mTextHelper;
        if (r02 == null) goto L10;
        r02.t(r2, r3, r4, r5);
        return;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) throws IllegalArgumentException {
        if (U.f3578c == false) goto L6;
        super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
        return;
    L6:
        C2099p r02 = this.mTextHelper;
        if (r02 == null) goto L10;
        r02.u(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
        if (U.f3578c == false) goto L6;
        super.setAutoSizeTextTypeWithDefaults(r2);
        return;
    L6:
        C2099p r02 = this.mTextHelper;
        if (r02 == null) goto L10;
        r02.v(r2);
        return;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        super.setBackgroundDrawable(r2);
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L6;
        r02.f(r2);
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L6;
        r02.g(r2);
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.p(this, r1));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().e(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(getEmojiTextViewHelper().a(r2));
    }

    public void setSupportAllCaps(boolean r2) {
        C2099p r02 = this.mTextHelper;
        if (r02 == null) goto L6;
        r02.s(r2);
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L6;
        r02.i(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L6;
        r02.j(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        this.mTextHelper.w(r2);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        this.mTextHelper.x(r2);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C2099p r02 = this.mTextHelper;
        if (r02 == null) goto L6;
        r02.q(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setTextSize(int r2, float r3) {
        if (U.f3578c == false) goto L6;
        super.setTextSize(r2, r3);
        return;
    L6:
        C2099p r02 = this.mTextHelper;
        if (r02 == null) goto L10;
        r02.A(r2, r3);
        return;
    }

    public AppCompatButton(Context r2, AttributeSet r3) {
        this(r2, r3, androidx.appcompat.a.f2320s);
    }

    public AppCompatButton(Context r1, AttributeSet r2, int r3) {
        super(J.b(r1), r2, r3);
        I.a(this, getContext());
        C2087d r12 = new C2087d(this);
        this.mBackgroundTintHelper = r12;
        r12.e(r2, r3);
        C2099p r13 = new C2099p(this);
        this.mTextHelper = r13;
        r13.m(r2, r3);
        r13.b();
        getEmojiTextViewHelper().c(r2, r3);
    }
}
