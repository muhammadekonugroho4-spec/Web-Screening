package com.google.android.material.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public class ScaledDrawableWrapper extends androidx.appcompat.graphics.drawable.a {
    private boolean mutated;
    private ScaledDrawableWrapperState state;

    public static final class ScaledDrawableWrapperState extends Drawable.ConstantState {
        private final int height;
        private final int width;
        private Drawable.ConstantState wrappedDrawableState;

        public ScaledDrawableWrapperState(Drawable.ConstantState r1, int r2, int r3) {
            this.wrappedDrawableState = r1;
            this.width = r2;
            this.height = r3;
        }

        public static /* synthetic */ int access$000(ScaledDrawableWrapperState r02) {
            return r02.width;
        }

        public static /* synthetic */ int access$100(ScaledDrawableWrapperState r02) {
            return r02.height;
        }

        public static /* synthetic */ Drawable.ConstantState access$202(ScaledDrawableWrapperState r02, Drawable.ConstantState r1) {
            r02.wrappedDrawableState = r1;
            return r1;
        }

        public boolean canConstantState() {
            if (this.wrappedDrawableState == null) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState r02 = this.wrappedDrawableState;
            if (r02 != null) goto L5;
            return 0;
        L5:
            return r02.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ScaledDrawableWrapper(this.wrappedDrawableState.newDrawable(), this.width, this.height);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources r4) {
            return new ScaledDrawableWrapper(this.wrappedDrawableState.newDrawable(r4), this.width, this.height);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources r3, Resources.Theme r4) {
            return new ScaledDrawableWrapper(this.wrappedDrawableState.newDrawable(r3, r4), this.width, this.height);
        }
    }

    public ScaledDrawableWrapper(Drawable r2, int r3, int r4) {
        super(r2);
        this.state = new ScaledDrawableWrapperState(getConstantStateFrom(r2), r3, r4);
    }

    private Drawable.ConstantState getConstantStateFrom(Drawable r1) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return r1.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.state.canConstantState() == true) goto L5;
        return null;
    L5:
        return this.state;
    }

    @Override // androidx.appcompat.graphics.drawable.a, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ScaledDrawableWrapperState.access$100(this.state);
    }

    @Override // androidx.appcompat.graphics.drawable.a, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ScaledDrawableWrapperState.access$000(this.state);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.mutated == false) goto L5;
    L10:
        return this;
    L5:
        if (super.mutate() != this) goto L10;
        Drawable r02 = getDrawable();
        if (r02 == null) goto L9;
        r02.mutate();
    L9:
        this.state = new ScaledDrawableWrapperState(getConstantStateFrom(r02), ScaledDrawableWrapperState.access$000(this.state), ScaledDrawableWrapperState.access$100(this.state));
        this.mutated = true;
        goto L10
    }

    @Override // androidx.appcompat.graphics.drawable.a
    public void setDrawable(Drawable r2) {
        super.setDrawable(r2);
        ScaledDrawableWrapperState r02 = this.state;
        if (r02 == null) goto L6;
        ScaledDrawableWrapperState.access$202(r02, getConstantStateFrom(r2));
        this.mutated = false;
        return;
    }
}
