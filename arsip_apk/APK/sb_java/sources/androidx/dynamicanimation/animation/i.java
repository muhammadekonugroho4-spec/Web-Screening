package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* loaded from: classes4.dex */
public abstract class i {
    final String mPropertyName;

    public class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FloatProperty f24004a;

        public a(String r1, FloatProperty r2) {
            this.f24004a = r2;
            super(r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public float getValue(Object r2) {
            return ((Float) this.f24004a.get(r2)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.i
        public void setValue(Object r2, float r3) {
            this.f24004a.setValue(r2, r3);
        }
    }

    public i(String r1) {
        this.mPropertyName = r1;
    }

    public static <T> i createFloatPropertyCompat(FloatProperty<T> r2) {
        return new a(r2.getName(), r2);
    }

    public abstract float getValue(Object r1);

    public abstract void setValue(Object r1, float r2);
}
