package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class Legend extends ComponentBase {
    private List<Boolean> mCalculatedLabelBreakPoints;
    private List<FSize> mCalculatedLabelSizes;
    private List<FSize> mCalculatedLineSizes;
    private LegendDirection mDirection;
    private boolean mDrawInside;
    private LegendEntry[] mEntries;
    private LegendEntry[] mExtraEntries;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    private float mFormToTextSpace;
    private LegendHorizontalAlignment mHorizontalAlignment;
    private boolean mIsLegendCustom;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private LegendOrientation mOrientation;
    private LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private LegendVerticalAlignment mVerticalAlignment;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    /* renamed from: com.github.mikephil.charting.components.Legend$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = null;

        static {
            int[] r02 = new int[LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = r02;
            r02[LegendOrientation.VERTICAL.ordinal()] = 1;     // Catch: NoSuchFieldError -> L6
        L8:
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[LegendOrientation.HORIZONTAL.ordinal()] = 2;     // Catch: NoSuchFieldError -> L7
            return;
        }
    }

    public enum LegendDirection extends Enum<LegendDirection> {
        private static final /* synthetic */ LegendDirection[] $VALUES = null;
        public static final LegendDirection LEFT_TO_RIGHT = null;
        public static final LegendDirection RIGHT_TO_LEFT = null;

        static {
            LegendDirection r02 = new LegendDirection("LEFT_TO_RIGHT", 0);
            LEFT_TO_RIGHT = r02;
            LegendDirection r1 = new LegendDirection("RIGHT_TO_LEFT", 1);
            RIGHT_TO_LEFT = r1;
            $VALUES = new LegendDirection[]{r02, r1};
        }

        LegendDirection(String r1, int r2) {
        }

        public static LegendDirection valueOf(String r1) {
            return (LegendDirection) Enum.valueOf(LegendDirection.class, r1);
        }

        public static LegendDirection[] values() {
            return (LegendDirection[]) $VALUES.clone();
        }
    }

    public enum LegendForm extends Enum<LegendForm> {
        private static final /* synthetic */ LegendForm[] $VALUES = null;
        public static final LegendForm CIRCLE = null;
        public static final LegendForm DEFAULT = null;
        public static final LegendForm EMPTY = null;
        public static final LegendForm LINE = null;
        public static final LegendForm NONE = null;
        public static final LegendForm SQUARE = null;

        static {
            LegendForm r02 = new LegendForm("NONE", 0);
            NONE = r02;
            LegendForm r1 = new LegendForm("EMPTY", 1);
            EMPTY = r1;
            LegendForm r2 = new LegendForm("DEFAULT", 2);
            DEFAULT = r2;
            LegendForm r3 = new LegendForm("SQUARE", 3);
            SQUARE = r3;
            LegendForm r4 = new LegendForm("CIRCLE", 4);
            CIRCLE = r4;
            LegendForm r5 = new LegendForm("LINE", 5);
            LINE = r5;
            $VALUES = new LegendForm[]{r02, r1, r2, r3, r4, r5};
        }

        LegendForm(String r1, int r2) {
        }

        public static LegendForm valueOf(String r1) {
            return (LegendForm) Enum.valueOf(LegendForm.class, r1);
        }

        public static LegendForm[] values() {
            return (LegendForm[]) $VALUES.clone();
        }
    }

    public enum LegendHorizontalAlignment extends Enum<LegendHorizontalAlignment> {
        private static final /* synthetic */ LegendHorizontalAlignment[] $VALUES = null;
        public static final LegendHorizontalAlignment CENTER = null;
        public static final LegendHorizontalAlignment LEFT = null;
        public static final LegendHorizontalAlignment RIGHT = null;

        static {
            LegendHorizontalAlignment r02 = new LegendHorizontalAlignment("LEFT", 0);
            LEFT = r02;
            LegendHorizontalAlignment r1 = new LegendHorizontalAlignment("CENTER", 1);
            CENTER = r1;
            LegendHorizontalAlignment r2 = new LegendHorizontalAlignment("RIGHT", 2);
            RIGHT = r2;
            $VALUES = new LegendHorizontalAlignment[]{r02, r1, r2};
        }

        LegendHorizontalAlignment(String r1, int r2) {
        }

        public static LegendHorizontalAlignment valueOf(String r1) {
            return (LegendHorizontalAlignment) Enum.valueOf(LegendHorizontalAlignment.class, r1);
        }

        public static LegendHorizontalAlignment[] values() {
            return (LegendHorizontalAlignment[]) $VALUES.clone();
        }
    }

    public enum LegendOrientation extends Enum<LegendOrientation> {
        private static final /* synthetic */ LegendOrientation[] $VALUES = null;
        public static final LegendOrientation HORIZONTAL = null;
        public static final LegendOrientation VERTICAL = null;

        static {
            LegendOrientation r02 = new LegendOrientation("HORIZONTAL", 0);
            HORIZONTAL = r02;
            LegendOrientation r1 = new LegendOrientation("VERTICAL", 1);
            VERTICAL = r1;
            $VALUES = new LegendOrientation[]{r02, r1};
        }

        LegendOrientation(String r1, int r2) {
        }

        public static LegendOrientation valueOf(String r1) {
            return (LegendOrientation) Enum.valueOf(LegendOrientation.class, r1);
        }

        public static LegendOrientation[] values() {
            return (LegendOrientation[]) $VALUES.clone();
        }
    }

    public enum LegendVerticalAlignment extends Enum<LegendVerticalAlignment> {
        private static final /* synthetic */ LegendVerticalAlignment[] $VALUES = null;
        public static final LegendVerticalAlignment BOTTOM = null;
        public static final LegendVerticalAlignment CENTER = null;
        public static final LegendVerticalAlignment TOP = null;

        static {
            LegendVerticalAlignment r02 = new LegendVerticalAlignment("TOP", 0);
            TOP = r02;
            LegendVerticalAlignment r1 = new LegendVerticalAlignment("CENTER", 1);
            CENTER = r1;
            LegendVerticalAlignment r2 = new LegendVerticalAlignment("BOTTOM", 2);
            BOTTOM = r2;
            $VALUES = new LegendVerticalAlignment[]{r02, r1, r2};
        }

        LegendVerticalAlignment(String r1, int r2) {
        }

        public static LegendVerticalAlignment valueOf(String r1) {
            return (LegendVerticalAlignment) Enum.valueOf(LegendVerticalAlignment.class, r1);
        }

        public static LegendVerticalAlignment[] values() {
            return (LegendVerticalAlignment[]) $VALUES.clone();
        }
    }

    public Legend() {
        this.mEntries = new LegendEntry[0];
        this.mIsLegendCustom = false;
        this.mHorizontalAlignment = LegendHorizontalAlignment.LEFT;
        this.mVerticalAlignment = LegendVerticalAlignment.BOTTOM;
        this.mOrientation = LegendOrientation.HORIZONTAL;
        this.mDrawInside = false;
        this.mDirection = LegendDirection.LEFT_TO_RIGHT;
        this.mShape = LegendForm.SQUARE;
        this.mFormSize = 8.0f;
        this.mFormLineWidth = 3.0f;
        this.mFormLineDashEffect = null;
        this.mXEntrySpace = 6.0f;
        this.mYEntrySpace = 0.0f;
        this.mFormToTextSpace = 5.0f;
        this.mStackSpace = 3.0f;
        this.mMaxSizePercent = 0.95f;
        this.mNeededWidth = 0.0f;
        this.mNeededHeight = 0.0f;
        this.mTextHeightMax = 0.0f;
        this.mTextWidthMax = 0.0f;
        this.mWordWrapEnabled = false;
        this.mCalculatedLabelSizes = new ArrayList(16);
        this.mCalculatedLabelBreakPoints = new ArrayList(16);
        this.mCalculatedLineSizes = new ArrayList(16);
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(3.0f);
    }

    public void calculateDimensions(Paint r27, ViewPortHandler r28) {
        float r2 = Utils.convertDpToPixel(this.mFormSize);
        float r3 = Utils.convertDpToPixel(this.mStackSpace);
        float r4 = Utils.convertDpToPixel(this.mFormToTextSpace);
        float r5 = Utils.convertDpToPixel(this.mXEntrySpace);
        float r6 = Utils.convertDpToPixel(this.mYEntrySpace);
        boolean r7 = this.mWordWrapEnabled;
        LegendEntry[] r8 = this.mEntries;
        int r9 = r8.length;
        this.mTextWidthMax = getMaximumEntryWidth(r27);
        this.mTextHeightMax = getMaximumEntryHeight(r27);
        int r10 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mOrientation.ordinal()];
        if (r10 != 1) goto L5;
        float r22 = Utils.getLineHeight(r27);
        float r32 = 0.0f;
        float r42 = 0.0f;
        float r52 = 0.0f;
        int r72 = 0;
        boolean r102 = false;
    L67:
        if (r72 >= r9) goto L99;
        LegendEntry r11 = r8[r72];
        if (r11.form == LegendForm.NONE) goto L71;
        boolean r12 = true;
    L73:
        if (Float.isNaN(r11.formSize) == false) goto L75;
        float r13 = r2;
    L76:
        String r112 = r11.label;
        if (r102 == true) goto L79;
        r52 = 0.0f;
    L79:
        if (r12 == false) goto L83;
        if (r102 == false) goto L82;
        r52 = r52 + r3;
    L82:
        r52 = r52 + r13;
    L83:
        if (r112 == null) goto L94;
        if (r12 == false) goto L88;
        if (r102 == true) goto L88;
        r52 = r52 + r4;
    L87:
        float r25 = r42;
        float r43 = r32;
        float r33 = r52;
        float r53 = r25;
    L90:
        float r34 = r33 + Utils.calcTextWidth(r27, r112);
        if (r72 >= (r9 - 1)) goto L93;
        r53 = r53 + (r22 + r6);
    L93:
        float r252 = r53;
        r52 = r34;
        r32 = r43;
        r42 = r252;
    L98:
        r32 = Math.max(r32, r52);
        r72 = r72 + 1;
    L88:
        if (r102 == false) goto L87;
        float r35 = Math.max(r32, r52);
        r53 = r42 + (r22 + r6);
        r102 = false;
        r43 = r35;
        r33 = 0.0f;
        goto L90
    L94:
        r52 = r52 + r13;
        if (r72 >= (r9 - 1)) goto L97;
        r52 = r52 + r3;
    L97:
        r102 = true;
        goto L98
    L75:
        r13 = Utils.convertDpToPixel(r11.formSize);
        goto L76
    L71:
        r12 = false;
        goto L73
    L99:
        this.mNeededWidth = r32;
        this.mNeededHeight = r42;
    L100:
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
        return;
    L5:
        if (r10 != 2) goto L100;
        float r103 = Utils.getLineHeight(r27);
        float r14 = Utils.getLineSpacing(r27) + r6;
        float r62 = r28.contentWidth() * this.mMaxSizePercent;
        this.mCalculatedLabelBreakPoints.clear();
        this.mCalculatedLabelSizes.clear();
        this.mCalculatedLineSizes.clear();
        int r113 = 0;
        float r122 = 0.0f;
        int r132 = -1;
        float r18 = 0.0f;
        float r19 = 0.0f;
    L8:
        if (r113 >= r9) goto L61;
        LegendEntry r15 = r8[r113];
        float r20 = r2;
        float r21 = r3;
        if (r15.form == LegendForm.NONE) goto L12;
        boolean r23 = true;
    L14:
        if (Float.isNaN(r15.formSize) == false) goto L16;
        float r36 = r20;
    L17:
        String r152 = r15.label;
        boolean r222 = r23;
        float r232 = r36;
        this.mCalculatedLabelBreakPoints.add(Boolean.FALSE);
        if (r132 != (-1)) goto L20;
        float r24 = 0.0f;
    L21:
        if (r152 == null) goto L27;
        float r182 = r24;
        this.mCalculatedLabelSizes.add(Utils.calcTextSize(r27, r152));
        if (r222 == false) goto L25;
        float r26 = r4 + r232;
    L26:
        r18 = (r182 + r26) + this.mCalculatedLabelSizes.get(r113).width;
        float r242 = r4;
    L34:
        if (r152 == null) goto L36;
    L37:
        float r29 = r19;
        if (r29 != 0.0f) goto L42;
        float r44 = 0.0f;
    L43:
        if (r7 == false) goto L53;
        if (r29 == 0.0f) goto L53;
        if ((r62 - r29) >= (r44 + r18)) goto L53;
        this.mCalculatedLineSizes.add(FSize.getInstance(r29, r103));
        r122 = Math.max(r122, r29);
        List<Boolean> r210 = this.mCalculatedLabelBreakPoints;
        if (r132 <= (-1)) goto L51;
        int r45 = r132;
    L52:
        r210.set(r45, Boolean.TRUE);
        float r211 = r18;
    L55:
        if (r113 != (r9 - 1)) goto L57;
        this.mCalculatedLineSizes.add(FSize.getInstance(r211, r103));
        r122 = Math.max(r122, r211);
    L57:
        r19 = r211;
    L58:
        if (r152 == null) goto L60;
        r132 = -1;
    L60:
        r113 = r113 + 1;
        r2 = r20;
        r3 = r21;
        r4 = r242;
        goto L8
    L51:
        r45 = r113;
    L53:
        r211 = r29 + (r44 + r18);
        goto L55
    L42:
        r44 = r5;
        goto L43
    L36:
        if (r113 != (r9 - 1)) goto L58;
    L25:
        r26 = 0.0f;
        goto L26
    L27:
        float r183 = r24;
        r242 = r4;
        this.mCalculatedLabelSizes.add(FSize.getInstance(0.0f, 0.0f));
        if (r222 == false) goto L30;
        float r37 = r232;
    L31:
        r18 = r183 + r37;
        if (r132 != (-1)) goto L34;
        r132 = r113;
        goto L34
    L30:
        r37 = 0.0f;
        goto L31
    L20:
        r24 = r18 + r21;
        goto L21
    L16:
        r36 = Utils.convertDpToPixel(r15.formSize);
        goto L17
    L12:
        r23 = false;
        goto L14
    L61:
        this.mNeededWidth = r122;
        float r104 = r103 * this.mCalculatedLineSizes.size();
        if (this.mCalculatedLineSizes.size() != 0) goto L64;
        int r114 = 0;
    L65:
        this.mNeededHeight = r104 + (r14 * r114);
        goto L100
    L64:
        r114 = this.mCalculatedLineSizes.size() - 1;
        goto L65
    }

    public List<Boolean> getCalculatedLabelBreakPoints() {
        return this.mCalculatedLabelBreakPoints;
    }

    public List<FSize> getCalculatedLabelSizes() {
        return this.mCalculatedLabelSizes;
    }

    public List<FSize> getCalculatedLineSizes() {
        return this.mCalculatedLineSizes;
    }

    public LegendDirection getDirection() {
        return this.mDirection;
    }

    public LegendEntry[] getEntries() {
        return this.mEntries;
    }

    public LegendEntry[] getExtraEntries() {
        return this.mExtraEntries;
    }

    public LegendForm getForm() {
        return this.mShape;
    }

    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public float getFormToTextSpace() {
        return this.mFormToTextSpace;
    }

    public LegendHorizontalAlignment getHorizontalAlignment() {
        return this.mHorizontalAlignment;
    }

    public float getMaxSizePercent() {
        return this.mMaxSizePercent;
    }

    public float getMaximumEntryHeight(Paint r7) {
        LegendEntry[] r02 = this.mEntries;
        int r1 = r02.length;
        float r2 = 0.0f;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L11;
        String r4 = r02[r3].label;
        if (r4 == null) goto L10;
        float r42 = Utils.calcTextHeight(r7, r4);
        if (r42 <= r2) goto L10;
        r2 = r42;
    L10:
        r3 = r3 + 1;
        goto L3
    L11:
        return r2;
    }

    public float getMaximumEntryWidth(Paint r10) {
        float r02 = Utils.convertDpToPixel(this.mFormToTextSpace);
        LegendEntry[] r1 = this.mEntries;
        int r2 = r1.length;
        float r3 = 0.0f;
        int r5 = 0;
        float r4 = 0.0f;
    L3:
        if (r5 >= r2) goto L19;
        LegendEntry r6 = r1[r5];
        if (Float.isNaN(r6.formSize) == false) goto L7;
        float r7 = this.mFormSize;
    L8:
        float r72 = Utils.convertDpToPixel(r7);
        if (r72 <= r4) goto L11;
        r4 = r72;
    L11:
        String r62 = r6.label;
        if (r62 == null) goto L17;
        float r63 = Utils.calcTextWidth(r10, r62);
        if (r63 <= r3) goto L17;
        r3 = r63;
    L17:
        r5 = r5 + 1;
        goto L3
    L7:
        r7 = r6.formSize;
        goto L8
    L19:
        return (r3 + r4) + r02;
    }

    public LegendOrientation getOrientation() {
        return this.mOrientation;
    }

    public float getStackSpace() {
        return this.mStackSpace;
    }

    public LegendVerticalAlignment getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public float getXEntrySpace() {
        return this.mXEntrySpace;
    }

    public float getYEntrySpace() {
        return this.mYEntrySpace;
    }

    public boolean isDrawInsideEnabled() {
        return this.mDrawInside;
    }

    public boolean isLegendCustom() {
        return this.mIsLegendCustom;
    }

    public boolean isWordWrapEnabled() {
        return this.mWordWrapEnabled;
    }

    public void resetCustom() {
        this.mIsLegendCustom = false;
    }

    public void setCustom(LegendEntry[] r1) {
        this.mEntries = r1;
        this.mIsLegendCustom = true;
    }

    public void setDirection(LegendDirection r1) {
        this.mDirection = r1;
    }

    public void setDrawInside(boolean r1) {
        this.mDrawInside = r1;
    }

    public void setEntries(List<LegendEntry> r2) {
        this.mEntries = (LegendEntry[]) r2.toArray(new LegendEntry[r2.size()]);
    }

    public void setExtra(List<LegendEntry> r2) {
        this.mExtraEntries = (LegendEntry[]) r2.toArray(new LegendEntry[r2.size()]);
    }

    public void setForm(LegendForm r1) {
        this.mShape = r1;
    }

    public void setFormLineDashEffect(DashPathEffect r1) {
        this.mFormLineDashEffect = r1;
    }

    public void setFormLineWidth(float r1) {
        this.mFormLineWidth = r1;
    }

    public void setFormSize(float r1) {
        this.mFormSize = r1;
    }

    public void setFormToTextSpace(float r1) {
        this.mFormToTextSpace = r1;
    }

    public void setHorizontalAlignment(LegendHorizontalAlignment r1) {
        this.mHorizontalAlignment = r1;
    }

    public void setMaxSizePercent(float r1) {
        this.mMaxSizePercent = r1;
    }

    public void setOrientation(LegendOrientation r1) {
        this.mOrientation = r1;
    }

    public void setStackSpace(float r1) {
        this.mStackSpace = r1;
    }

    public void setVerticalAlignment(LegendVerticalAlignment r1) {
        this.mVerticalAlignment = r1;
    }

    public void setWordWrapEnabled(boolean r1) {
        this.mWordWrapEnabled = r1;
    }

    public void setXEntrySpace(float r1) {
        this.mXEntrySpace = r1;
    }

    public void setYEntrySpace(float r1) {
        this.mYEntrySpace = r1;
    }

    public void setExtra(LegendEntry[] r1) {
        if (r1 != null) goto L4;
        r1 = new LegendEntry[0];
    L4:
        this.mExtraEntries = r1;
    }

    public void setCustom(List<LegendEntry> r2) {
        this.mEntries = (LegendEntry[]) r2.toArray(new LegendEntry[r2.size()]);
        this.mIsLegendCustom = true;
    }

    public void setExtra(int[] r6, String[] r7) {
        ArrayList r02 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= Math.min(r6.length, r7.length)) goto L14;
        LegendEntry r2 = new LegendEntry();
        int r3 = r6[r1];
        r2.formColor = r3;
        r2.label = r7[r1];
        if (r3 == 1122868) goto L12;
        if (r3 == 0) goto L12;
        if (r3 != 1122867) goto L13;
        r2.form = LegendForm.EMPTY;
    L13:
        r02.add(r2);
        r1 = r1 + 1;
    L12:
        r2.form = LegendForm.NONE;
        goto L13
    L14:
        this.mExtraEntries = (LegendEntry[]) r02.toArray(new LegendEntry[r02.size()]);
    }

    public Legend(LegendEntry[] r2) {
        this();
        if (r2 == null) goto L7;
        this.mEntries = r2;
        return;
    L7:
        throw new IllegalArgumentException("entries array is NULL");
    }
}
