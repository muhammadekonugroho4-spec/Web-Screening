package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: androidx.transition.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4165l {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f28449a = null;

    /* renamed from: androidx.transition.l$a */
    public class a extends Matrix {
        public a() {
        }

        public void a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix r1) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float r1, float r2, float r3) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float r1, float r2, float r3, float r4) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float r1, float r2, float r3, float r4) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float r1, float r2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix r1) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float r1, float r2, float r3) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float r1, float r2, float r3, float r4) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float r1, float r2, float r3, float r4) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float r1, float r2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix r1) {
            a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix r1, Matrix r2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] r1, int r2, float[] r3, int r4, int r5) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF r1, RectF r2, Matrix.ScaleToFit r3) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float r1, float r2, float r3) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float r1, float r2, float r3, float r4) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float r1, float r2, float r3, float r4) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float r1, float r2, float r3, float r4) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float r1, float r2) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] r1) {
            a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float r1) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float r1, float r2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float r1, float r2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float r1) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float r1, float r2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float r1, float r2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float r1) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float r1, float r2) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float r1, float r2) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float r1, float r2) {
            a();
        }
    }

    static {
        f28449a = new a();
    }
}
