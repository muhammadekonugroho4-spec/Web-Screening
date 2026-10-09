package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class F extends Resources {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f3352a;

    public F(Resources r4) {
        super(r4.getAssets(), r4.getDisplayMetrics(), r4.getConfiguration());
        this.f3352a = r4;
    }

    public final Drawable a(int r1) {
        return super.getDrawable(r1);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int r2) {
        return this.f3352a.getAnimation(r2);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int r2) {
        return this.f3352a.getBoolean(r2);
    }

    @Override // android.content.res.Resources
    public int getColor(int r2) {
        return this.f3352a.getColor(r2);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int r2) {
        return this.f3352a.getColorStateList(r2);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f3352a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int r2) {
        return this.f3352a.getDimension(r2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int r2) {
        return this.f3352a.getDimensionPixelOffset(r2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int r2) {
        return this.f3352a.getDimensionPixelSize(r2);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f3352a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int r2, Resources.Theme r3) {
        return androidx.core.content.res.h.f(this.f3352a, r2, r3);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int r3, int r4) {
        return androidx.core.content.res.h.g(this.f3352a, r3, r4, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int r2, int r3, int r4) {
        return this.f3352a.getFraction(r2, r3, r4);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String r2, String r3, String r4) {
        return this.f3352a.getIdentifier(r2, r3, r4);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int r2) {
        return this.f3352a.getIntArray(r2);
    }

    @Override // android.content.res.Resources
    public int getInteger(int r2) {
        return this.f3352a.getInteger(r2);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int r2) {
        return this.f3352a.getLayout(r2);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int r2) {
        return this.f3352a.getMovie(r2);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int r2, int r3, Object... r4) {
        return this.f3352a.getQuantityString(r2, r3, r4);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int r2, int r3) {
        return this.f3352a.getQuantityText(r2, r3);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int r2) {
        return this.f3352a.getResourceEntryName(r2);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int r2) {
        return this.f3352a.getResourceName(r2);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int r2) {
        return this.f3352a.getResourcePackageName(r2);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int r2) {
        return this.f3352a.getResourceTypeName(r2);
    }

    @Override // android.content.res.Resources
    public String getString(int r2) {
        return this.f3352a.getString(r2);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int r2) {
        return this.f3352a.getStringArray(r2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int r2) {
        return this.f3352a.getText(r2);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int r2) {
        return this.f3352a.getTextArray(r2);
    }

    @Override // android.content.res.Resources
    public void getValue(int r2, TypedValue r3, boolean r4) {
        this.f3352a.getValue(r2, r3, r4);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int r2, int r3, TypedValue r4, boolean r5) {
        this.f3352a.getValueForDensity(r2, r3, r4, r5);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int r2) {
        return this.f3352a.getXml(r2);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet r2, int[] r3) {
        return this.f3352a.obtainAttributes(r2, r3);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int r2) {
        return this.f3352a.obtainTypedArray(r2);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int r2) {
        return this.f3352a.openRawResource(r2);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int r2) {
        return this.f3352a.openRawResourceFd(r2);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String r2, AttributeSet r3, Bundle r4) {
        this.f3352a.parseBundleExtra(r2, r3, r4);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser r2, Bundle r3) {
        this.f3352a.parseBundleExtras(r2, r3);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration r2, DisplayMetrics r3) {
        super.updateConfiguration(r2, r3);
        Resources r02 = this.f3352a;
        if (r02 == null) goto L6;
        r02.updateConfiguration(r2, r3);
        return;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int r2, int r3, Resources.Theme r4) {
        return androidx.core.content.res.h.g(this.f3352a, r2, r3, r4);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int r2, int r3) {
        return this.f3352a.getQuantityString(r2, r3);
    }

    @Override // android.content.res.Resources
    public String getString(int r2, Object... r3) {
        return this.f3352a.getString(r2, r3);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int r2, CharSequence r3) {
        return this.f3352a.getText(r2, r3);
    }

    @Override // android.content.res.Resources
    public void getValue(String r2, TypedValue r3, boolean r4) {
        this.f3352a.getValue(r2, r3, r4);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int r2, TypedValue r3) {
        return this.f3352a.openRawResource(r2, r3);
    }
}
