package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class ConstraintAttribute {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22174a;

    /* renamed from: b, reason: collision with root package name */
    public String f22175b;

    /* renamed from: c, reason: collision with root package name */
    public AttributeType f22176c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public float f22177e;

    /* renamed from: f, reason: collision with root package name */
    public String f22178f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22179g;

    /* renamed from: h, reason: collision with root package name */
    public int f22180h;

    public enum AttributeType extends Enum<AttributeType> {
        public static final AttributeType BOOLEAN_TYPE = null;
        public static final AttributeType COLOR_DRAWABLE_TYPE = null;
        public static final AttributeType COLOR_TYPE = null;
        public static final AttributeType DIMENSION_TYPE = null;
        public static final AttributeType FLOAT_TYPE = null;
        public static final AttributeType INT_TYPE = null;
        public static final AttributeType REFERENCE_TYPE = null;
        public static final AttributeType STRING_TYPE = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ AttributeType[] f22181a = null;

        static {
            INT_TYPE = new AttributeType("INT_TYPE", 0);
            FLOAT_TYPE = new AttributeType("FLOAT_TYPE", 1);
            COLOR_TYPE = new AttributeType("COLOR_TYPE", 2);
            COLOR_DRAWABLE_TYPE = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            STRING_TYPE = new AttributeType("STRING_TYPE", 4);
            BOOLEAN_TYPE = new AttributeType("BOOLEAN_TYPE", 5);
            DIMENSION_TYPE = new AttributeType("DIMENSION_TYPE", 6);
            REFERENCE_TYPE = new AttributeType("REFERENCE_TYPE", 7);
            f22181a = a();
        }

        AttributeType(String r1, int r2) {
        }

        public static /* synthetic */ AttributeType[] a() {
            return new AttributeType[]{INT_TYPE, FLOAT_TYPE, COLOR_TYPE, COLOR_DRAWABLE_TYPE, STRING_TYPE, BOOLEAN_TYPE, DIMENSION_TYPE, REFERENCE_TYPE};
        }

        public static AttributeType valueOf(String r1) {
            return (AttributeType) Enum.valueOf(AttributeType.class, r1);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) f22181a.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22182a = null;

        static {
            int[] r02 = new int[AttributeType.values().length];
            f22182a = r02;
            r02[AttributeType.REFERENCE_TYPE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L12
        L20:
            f22182a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
        L24:
            f22182a[AttributeType.STRING_TYPE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L14
        L34:
            f22182a[AttributeType.COLOR_TYPE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
        L22:
            f22182a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;     // Catch: NoSuchFieldError -> L16
        L26:
            f22182a[AttributeType.INT_TYPE.ordinal()] = 6;     // Catch: NoSuchFieldError -> L17
        L28:
            f22182a[AttributeType.FLOAT_TYPE.ordinal()] = 7;     // Catch: NoSuchFieldError -> L18
        L30:
            f22182a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;     // Catch: NoSuchFieldError -> L19
            return;
        }
    }

    public ConstraintAttribute(String r1, AttributeType r2, Object r3, boolean r4) {
        this.f22175b = r1;
        this.f22176c = r2;
        this.f22174a = r4;
        j(r3);
    }

    public static HashMap a(HashMap r7, View r8) {
        HashMap r02 = new HashMap();
        Class<?> r1 = r8.getClass();
        Iterator r2 = r7.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L20;
        String r3 = (String) r2.next();
        ConstraintAttribute r4 = (ConstraintAttribute) r7.get(r3);
    L7:
        if (r3.equals("BackgroundColor") == true) goto L8;
        r02.put(r3, new ConstraintAttribute(r4, r1.getMethod("getMap" + r3, null).invoke(r8, null)));     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L11 NoSuchMethodException -> L13
        goto L4
    L8:
        r02.put(r3, new ConstraintAttribute(r4, Integer.valueOf(((ColorDrawable) r8.getBackground()).getColor())));     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L11 NoSuchMethodException -> L13
    L11:
        e = move-exception;
        e.printStackTrace();
    L13:
        e = move-exception;
        e.printStackTrace();
    L9:
        e = move-exception;
        e.printStackTrace();
        goto L4
    L20:
        return r02;
    }

    public static void h(Context r12, XmlPullParser r13, HashMap r14) {
        TypedArray r132 = r12.obtainStyledAttributes(Xml.asAttributeSet(r13), e.s5);
        int r02 = r132.getIndexCount();
        String r1 = null;
        Object r3 = null;
        AttributeType r4 = null;
        int r5 = 0;
        boolean r6 = false;
    L3:
        if (r5 >= r02) goto L46;
        int r7 = r132.getIndex(r5);
        if (r7 != e.t5) goto L12;
        r1 = r132.getString(r7);
        if (r1 == null) goto L45;
        if (r1.length() <= 0) goto L45;
        r1 = Character.toUpperCase(r1.charAt(0)) + r1.substring(1);
    L45:
        r5 = r5 + 1;
        goto L3
    L12:
        if (r7 != e.D5) goto L15;
        r1 = r132.getString(r7);
        r6 = true;
        goto L45
    L15:
        if (r7 != e.u5) goto L18;
        r3 = Boolean.valueOf(r132.getBoolean(r7, false));
        r4 = AttributeType.BOOLEAN_TYPE;
        goto L45
    L18:
        if (r7 != e.w5) goto L22;
        AttributeType r32 = AttributeType.COLOR_TYPE;
        Object r42 = Integer.valueOf(r132.getColor(r7, 0));
    L20:
        Object r11 = r42;
        r4 = r32;
        r3 = r11;
        goto L45
    L22:
        if (r7 != e.v5) goto L25;
        r32 = AttributeType.COLOR_DRAWABLE_TYPE;
        r42 = Integer.valueOf(r132.getColor(r7, 0));
        goto L20
    L25:
        if (r7 != e.A5) goto L28;
        r32 = AttributeType.DIMENSION_TYPE;
        r42 = Float.valueOf(TypedValue.applyDimension(1, r132.getDimension(r7, 0.0f), r12.getResources().getDisplayMetrics()));
        goto L20
    L28:
        if (r7 != e.x5) goto L31;
        r32 = AttributeType.DIMENSION_TYPE;
        r42 = Float.valueOf(r132.getDimension(r7, 0.0f));
        goto L20
    L31:
        if (r7 != e.y5) goto L34;
        r32 = AttributeType.FLOAT_TYPE;
        r42 = Float.valueOf(r132.getFloat(r7, Float.NaN));
        goto L20
    L34:
        if (r7 != e.z5) goto L37;
        r32 = AttributeType.INT_TYPE;
        r42 = Integer.valueOf(r132.getInteger(r7, -1));
        goto L20
    L37:
        if (r7 != e.C5) goto L40;
        r32 = AttributeType.STRING_TYPE;
        r42 = r132.getString(r7);
        goto L20
    L40:
        if (r7 != e.B5) goto L45;
        r32 = AttributeType.REFERENCE_TYPE;
        int r43 = r132.getResourceId(r7, -1);
        if (r43 != (-1)) goto L44;
        r43 = r132.getInt(r7, -1);
    L44:
        r42 = Integer.valueOf(r43);
        goto L20
    L46:
        if (r1 == null) goto L49;
        if (r3 == null) goto L49;
        r14.put(r1, new ConstraintAttribute(r1, r4, r3, r6));
    L49:
        r132.recycle();
    }

    public static void i(View r11, HashMap r12) {
        Class<?> r3 = r11.getClass();
        Iterator r4 = r12.keySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L31;
        String r5 = (String) r4.next();
        ConstraintAttribute r6 = (ConstraintAttribute) r12.get(r5);
        if (r6.f22174a == true) goto L8;
        String r7 = "set" + r5;
    L32:
        int r8 = a.f22182a[r6.f22176c.ordinal()];     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
    L10:
        Class r9 = Float.TYPE;
        Class r10 = Integer.TYPE;
        switch(r8) {
            case 1: goto L26;
            case 2: goto L25;
            case 3: goto L24;
            case 4: goto L23;
            case 5: goto L22;
            case 6: goto L21;
            case 7: goto L20;
            case 8: goto L13;
            default: goto L4;
        };
    L13:
        r3.getMethod(r7, new Class[]{r9}).invoke(r11, new Object[]{Float.valueOf(r6.f22177e)});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        goto L4
    L20:
        r3.getMethod(r7, new Class[]{r9}).invoke(r11, new Object[]{Float.valueOf(r6.f22177e)});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        goto L4
    L21:
        r3.getMethod(r7, new Class[]{r10}).invoke(r11, new Object[]{Integer.valueOf(r6.d)});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        goto L4
    L22:
        Method r82 = r3.getMethod(r7, new Class[]{Drawable.class});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        ColorDrawable r92 = new ColorDrawable();     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        r92.setColor(r6.f22180h);     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        r82.invoke(r11, new Object[]{r92});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        goto L4
    L23:
        r3.getMethod(r7, new Class[]{r10}).invoke(r11, new Object[]{Integer.valueOf(r6.f22180h)});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        goto L4
    L24:
        r3.getMethod(r7, new Class[]{CharSequence.class}).invoke(r11, new Object[]{r6.f22178f});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        goto L4
    L25:
        r3.getMethod(r7, new Class[]{Boolean.TYPE}).invoke(r11, new Object[]{Boolean.valueOf(r6.f22179g)});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
        goto L4
    L26:
        r3.getMethod(r7, new Class[]{r10}).invoke(r11, new Object[]{Integer.valueOf(r6.d)});     // Catch: InvocationTargetException -> L14 IllegalAccessException -> L16 NoSuchMethodException -> L18
    L16:
        e = move-exception;
        Log.e("TransitionLayout", " Custom Attribute \"" + r5 + "\" not found on " + r3.getName());
        e.printStackTrace();
    L18:
        e = move-exception;
        Log.e("TransitionLayout", e.getMessage());
        Log.e("TransitionLayout", " Custom Attribute \"" + r5 + "\" not found on " + r3.getName());
        StringBuilder r52 = new StringBuilder();
        r52.append(r3.getName());
        r52.append(" must have a method ");
        r52.append(r7);
        Log.e("TransitionLayout", r52.toString());
    L14:
        e = move-exception;
        Log.e("TransitionLayout", " Custom Attribute \"" + r5 + "\" not found on " + r3.getName());
        e.printStackTrace();
        goto L4
    L8:
        r7 = r5;
        goto L32
    }

    public String b() {
        return this.f22175b;
    }

    public AttributeType c() {
        return this.f22176c;
    }

    public float d() {
        switch(a.f22182a[this.f22176c.ordinal()]) {
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L4;
        };
    L4:
        return Float.NaN;
    L7:
        return this.f22177e;
    L9:
        return this.f22177e;
    L11:
        return this.d;
    L13:
        throw new RuntimeException("Color does not have a single color to interpolate");
    L15:
        throw new RuntimeException("Cannot interpolate String");
    L17:
        if (this.f22179g == false) goto L20;
        return 1.0f;
    L20:
        return 0.0f;
    }

    public void e(float[] r11) {
        switch(a.f22182a[this.f22176c.ordinal()]) {
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L11;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        r11[0] = this.f22177e;
        return;
    L7:
        r11[0] = this.f22177e;
        return;
    L9:
        r11[0] = this.d;
        return;
    L11:
        int r02 = this.f22180h;
        int r2 = (r02 >> 24) & Constants.MAX_HOST_LENGTH;
        int r3 = (r02 >> 16) & Constants.MAX_HOST_LENGTH;
        int r4 = (r02 >> 8) & Constants.MAX_HOST_LENGTH;
        int r03 = r02 & Constants.MAX_HOST_LENGTH;
        float r32 = (float) Math.pow(r3 / 255.0f, 2.2d);
        float r42 = (float) Math.pow(r4 / 255.0f, 2.2d);
        float r04 = (float) Math.pow(r03 / 255.0f, 2.2d);
        r11[0] = r32;
        r11[1] = r42;
        r11[2] = r04;
        r11[3] = r2 / 255.0f;
        return;
    L14:
        throw new RuntimeException("Color does not have a single color to interpolate");
    L16:
        if (this.f22179g == false) goto L18;
        float r05 = 1.0f;
    L19:
        r11[0] = r05;
        return;
    L18:
        r05 = 0.0f;
        goto L19
    }

    public boolean f() {
        int r02 = a.f22182a[this.f22176c.ordinal()];
        if (r02 != 1) goto L5;
        return false;
    L5:
        if (r02 != 2) goto L7;
        return false;
    L7:
        if (r02 == 3) goto L12;
        return true;
    L12:
        return false;
    }

    public int g() {
        int r02 = a.f22182a[this.f22176c.ordinal()];
        if (r02 != 4) goto L5;
    L8:
        return 4;
    L5:
        if (r02 == 5) goto L8;
        return 1;
    }

    public void j(Object r3) {
        switch(a.f22182a[this.f22176c.ordinal()]) {
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L9;
            case 6: goto L15;
            case 7: goto L7;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f22177e = ((Float) r3).floatValue();
        return;
    L7:
        this.f22177e = ((Float) r3).floatValue();
        return;
    L9:
        this.f22180h = ((Integer) r3).intValue();
        return;
    L11:
        this.f22178f = (String) r3;
        return;
    L13:
        this.f22179g = ((Boolean) r3).booleanValue();
        return;
    L15:
        this.d = ((Integer) r3).intValue();
    }

    public ConstraintAttribute(ConstraintAttribute r2, Object r3) {
        this.f22174a = false;
        this.f22175b = r2.f22175b;
        this.f22176c = r2.f22176c;
        j(r3);
    }
}
