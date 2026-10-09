package com.google.android.material.resources;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.j;
import androidx.core.content.res.h;
import androidx.core.i;
import com.google.android.material.R;

/* loaded from: classes5.dex */
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;
    public final String fontFamily;
    private final int fontFamilyResourceId;
    private boolean fontResolved;
    public String fontVariationSettings;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    private boolean systemFontLoadAttempted;
    public final boolean textAllCaps;
    private ColorStateList textColor;
    public final ColorStateList textColorHint;
    public final ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(Context r6, int r7) {
        this.fontResolved = false;
        this.systemFontLoadAttempted = false;
        TypedArray r1 = r6.obtainStyledAttributes(r7, j.c3);
        setTextSize(r1.getDimension(j.d3, 0.0f));
        setTextColor(MaterialResources.getColorStateList(r6, r1, j.g3));
        this.textColorHint = MaterialResources.getColorStateList(r6, r1, j.h3);
        this.textColorLink = MaterialResources.getColorStateList(r6, r1, j.i3);
        this.textStyle = r1.getInt(j.f3, 0);
        this.typeface = r1.getInt(j.e3, 1);
        int r2 = MaterialResources.getIndexWithValue(r1, j.p3, j.n3);
        this.fontFamilyResourceId = r1.getResourceId(r2, 0);
        this.fontFamily = r1.getString(r2);
        this.textAllCaps = r1.getBoolean(j.r3, false);
        this.shadowColor = MaterialResources.getColorStateList(r6, r1, j.j3);
        this.shadowDx = r1.getFloat(j.k3, 0.0f);
        this.shadowDy = r1.getFloat(j.l3, 0.0f);
        this.shadowRadius = r1.getFloat(j.m3, 0.0f);
        r1.recycle();
        TypedArray r62 = r6.obtainStyledAttributes(r7, R.styleable.MaterialTextAppearance);
        this.hasLetterSpacing = r62.hasValue(R.styleable.MaterialTextAppearance_android_letterSpacing);
        this.letterSpacing = r62.getFloat(R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        this.fontVariationSettings = r62.getString(MaterialResources.getIndexWithValue(r62, R.styleable.MaterialTextAppearance_fontVariationSettings, R.styleable.MaterialTextAppearance_android_fontVariationSettings));
        r62.recycle();
    }

    public static /* synthetic */ Typeface access$000(TextAppearance r02) {
        return r02.font;
    }

    public static /* synthetic */ Typeface access$002(TextAppearance r02, Typeface r1) {
        r02.font = r1;
        return r1;
    }

    public static /* synthetic */ boolean access$102(TextAppearance r02, boolean r1) {
        r02.fontResolved = r1;
        return r1;
    }

    private void createFallbackFont() {
        if (this.font != null) goto L8;
        String r02 = this.fontFamily;
        if (r02 == null) goto L8;
        this.font = Typeface.create(r02, this.textStyle);
    L8:
        if (this.font != null) goto L21;
        int r03 = this.typeface;
        if (r03 != 1) goto L12;
        this.font = Typeface.SANS_SERIF;
    L19:
        this.font = Typeface.create(this.font, this.textStyle);
        return;
    L12:
        if (r03 != 2) goto L14;
        this.font = Typeface.SERIF;
        goto L19
    L14:
        if (r03 == 3) goto L16;
        this.font = Typeface.DEFAULT;
        goto L19
    L16:
        this.font = Typeface.MONOSPACE;
        goto L19
    }

    private Typeface getSystemTypeface(Context r3) {
        if (this.systemFontLoadAttempted == false) goto L5;
        return null;
    L5:
        this.systemFontLoadAttempted = true;
        String r32 = readFontProviderSystemFontFamily(r3, this.fontFamilyResourceId);
        if (r32 != null) goto L8;
        return null;
    L8:
        Typeface r33 = Typeface.create(r32, 0);
        if (r33 != Typeface.DEFAULT) goto L12;
        return null;
    L12:
        return Typeface.create(r33, this.textStyle);
    }

    private boolean maybeLoadFontSynchronously(Context r4) {
        if (TextAppearanceConfig.shouldLoadFontSynchronously() == false) goto L7;
        getFont(r4);
        return true;
    L7:
        if (this.fontResolved == false) goto L9;
        return true;
    L9:
        int r02 = this.fontFamilyResourceId;
        if (r02 != 0) goto L12;
        return false;
    L12:
        Typeface r03 = h.c(r4, r02);
        if (r03 == null) goto L16;
        this.font = r03;
        this.fontResolved = true;
        return true;
    L16:
        Typeface r42 = getSystemTypeface(r4);
        if (r42 == null) goto L20;
        this.font = r42;
        this.fontResolved = true;
        return true;
    L20:
        return false;
    }

    @SuppressLint({"ResourceType"})
    private static String readFontProviderSystemFontFamily(Context r3, int r4) {
        Resources r32 = r3.getResources();
        if (r4 != 0) goto L5;
    L18:
        return null;
    L5:
        if (r32.getResourceTypeName(r4).equals("font") == false) goto L18;
        XmlResourceParser r42 = r32.getXml(r4);     // Catch: Throwable -> L19
    L9:
        if (r42.getEventType() == 1) goto L18;
        if (r42.getEventType() != 2) goto L16;
        if (r42.getName().equals("font-family") == false) goto L16;
        TypedArray r33 = r32.obtainAttributes(Xml.asAttributeSet(r42), i.f22938h);     // Catch: Throwable -> L19
        String r43 = r33.getString(i.f22946p);     // Catch: Throwable -> L19
        r33.recycle();     // Catch: Throwable -> L19
        return r43;
    L16:
        r42.next();     // Catch: Throwable -> L19
        goto L9
    }

    public Typeface getFallbackFont() {
        createFallbackFont();
        return this.font;
    }

    public Typeface getFont(Context r3) {
        if (this.fontResolved == false) goto L7;
        return this.font;
    L7:
        if (r3.isRestricted() == false) goto L17;
    L14:
        createFallbackFont();
        this.fontResolved = true;
        return this.font;
    L17:
        Typeface r32 = h.h(r3, this.fontFamilyResourceId);     // Catch: Exception -> L12 Throwable -> L16
        this.font = r32;     // Catch: Exception -> L12 Throwable -> L16
        if (r32 == null) goto L14;
        this.font = Typeface.create(r32, this.textStyle);     // Catch: Exception -> L12 Throwable -> L16
    L12:
        e = move-exception;
        Log.d(TAG, "Error loading font " + this.fontFamily, e);
        goto L14
    }

    public void getFontAsync(Context r5, final TextAppearanceFontCallback r6) {
        if (maybeLoadFontSynchronously(r5) == true) goto L5;
        createFallbackFont();
    L5:
        int r02 = this.fontFamilyResourceId;
        if (r02 != 0) goto L9;
        this.fontResolved = true;
    L9:
        if (this.fontResolved == false) goto L18;
        r6.onFontRetrieved(this.font, true);
        return;
    L18:
        h.j(r5, r02, new AnonymousClass1(this, r6), null);     // Catch: Exception -> L14 Resources.NotFoundException -> L16
        return;
    L16:
        this.fontResolved = true;
        r6.onFontRetrievalFailed(1);
        return;
    L14:
        e = move-exception;
        Log.d(TAG, "Error loading font " + this.fontFamily, e);
        this.fontResolved = true;
        r6.onFontRetrievalFailed(-3);
    }

    public String getFontVariationSettings() {
        return this.fontVariationSettings;
    }

    public ColorStateList getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setFontVariationSettings(String r1) {
        this.fontVariationSettings = r1;
    }

    public void setTextColor(ColorStateList r1) {
        this.textColor = r1;
    }

    public void setTextSize(float r1) {
        this.textSize = r1;
    }

    public void updateDrawState(Context r5, TextPaint r6, TextAppearanceFontCallback r7) {
        updateMeasureState(r5, r6, r7);
        ColorStateList r52 = this.textColor;
        if (r52 == null) goto L5;
        int r53 = r52.getColorForState(r6.drawableState, r52.getDefaultColor());
    L6:
        r6.setColor(r53);
        float r54 = this.shadowRadius;
        float r72 = this.shadowDx;
        float r02 = this.shadowDy;
        ColorStateList r1 = this.shadowColor;
        if (r1 == null) goto L9;
        int r12 = r1.getColorForState(r6.drawableState, r1.getDefaultColor());
    L10:
        r6.setShadowLayer(r54, r72, r02, r12);
        return;
    L9:
        r12 = 0;
        goto L10
    L5:
        r53 = -16777216;
        goto L6
    }

    public void updateMeasureState(Context r2, TextPaint r3, TextAppearanceFontCallback r4) {
        if (maybeLoadFontSynchronously(r2) == true) goto L5;
    L10:
        getFontAsync(r2, r3, r4);
        return;
    L5:
        if (this.fontResolved == false) goto L10;
        Typeface r02 = this.font;
        if (r02 == null) goto L10;
        updateTextPaintMeasureState(r2, r3, r02);
    }

    public void updateTextPaintMeasureState(Context r1, TextPaint r2, Typeface r3) {
        Typeface r12 = TypefaceUtils.maybeCopyWithFontWeightAdjustment(r1, r3);
        if (r12 == null) goto L5;
        r3 = r12;
    L5:
        r2.setTypeface(r3);
        int r13 = this.textStyle & (~r3.getStyle());
        if ((r13 & 1) == 0) goto L8;
        boolean r32 = true;
    L9:
        r2.setFakeBoldText(r32);
        if ((r13 & 2) == 0) goto L12;
        float r14 = -0.25f;
    L13:
        r2.setTextSkewX(r14);
        r2.setTextSize(this.textSize);
        r2.setFontVariationSettings(this.fontVariationSettings);
        if (this.hasLetterSpacing == false) goto L17;
        r2.setLetterSpacing(this.letterSpacing);
        return;
    L17:
        return;
    L12:
        r14 = 0.0f;
        goto L13
    L8:
        r32 = false;
        goto L9
    }

    public void getFontAsync(final Context r2, final TextPaint r3, final TextAppearanceFontCallback r4) {
        updateTextPaintMeasureState(r2, r3, getFallbackFont());
        getFontAsync(r2, new AnonymousClass2(this, r2, r3, r4));
    }
}
