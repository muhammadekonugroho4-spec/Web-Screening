package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class DataSet<T extends Entry> extends BaseDataSet<T> {
    protected List<T> mValues;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public enum Rounding extends Enum<Rounding> {
        private static final /* synthetic */ Rounding[] $VALUES = null;
        public static final Rounding CLOSEST = null;
        public static final Rounding DOWN = null;
        public static final Rounding UP = null;

        static {
            Rounding r02 = new Rounding("UP", 0);
            UP = r02;
            Rounding r1 = new Rounding("DOWN", 1);
            DOWN = r1;
            Rounding r2 = new Rounding("CLOSEST", 2);
            CLOSEST = r2;
            $VALUES = new Rounding[]{r02, r1, r2};
        }

        Rounding(String r1, int r2) {
        }

        public static Rounding valueOf(String r1) {
            return (Rounding) Enum.valueOf(Rounding.class, r1);
        }

        public static Rounding[] values() {
            return (Rounding[]) $VALUES.clone();
        }
    }

    public DataSet(List<T> r2, String r3) {
        super(r3);
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mValues = r2;
        if (r2 != null) goto L5;
        this.mValues = new ArrayList();
    L5:
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean addEntry(T r2) {
        if (r2 != null) goto L5;
        return false;
    L5:
        List<T> r02 = getValues();
        if (r02 != null) goto L8;
        r02 = new ArrayList();
    L8:
        calcMinMax(r2);
        return r02.add(r2);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void addEntryOrdered(T r4) {
        if (r4 != null) goto L5;
        return;
    L5:
        if (this.mValues != null) goto L7;
        this.mValues = new ArrayList();
    L7:
        calcMinMax(r4);
        if (this.mValues.size() > 0) goto L10;
    L13:
        this.mValues.add(r4);
        return;
    L10:
        if (this.mValues.get(r0.size() - 1).getX() <= r4.getX()) goto L13;
        this.mValues.add(getEntryIndex(r4.getX(), r4.getY(), Rounding.UP), r4);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMax() {
        List<T> r02 = this.mValues;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.isEmpty() == true) goto L13;
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        Iterator<T> r03 = this.mValues.iterator();
    L9:
        if (r03.hasNext() == false) goto L14;
        calcMinMax(r03.next());
        goto L9
    L14:
        return;
    }

    public void calcMinMaxX(T r3) {
        if (r3.getX() >= this.mXMin) goto L6;
        this.mXMin = r3.getX();
    L6:
        if (r3.getX() <= this.mXMax) goto L9;
        this.mXMax = r3.getX();
        return;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMaxY(float r3, float r4) {
        List<T> r02 = this.mValues;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.isEmpty() == true) goto L12;
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        int r32 = getEntryIndex(r3, Float.NaN, Rounding.DOWN);
        int r42 = getEntryIndex(r4, Float.NaN, Rounding.UP);
    L8:
        if (r32 > r42) goto L13;
        calcMinMaxY(this.mValues.get(r32));
        r32 = r32 + 1;
        goto L8
    L13:
        return;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void clear() {
        this.mValues.clear();
        notifyDataSetChanged();
    }

    public abstract DataSet<T> copy();

    public void copy(DataSet r1) {
        super.copy(r1);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<T> getEntriesForXValue(float r7) {
        ArrayList r02 = new ArrayList();
        int r1 = this.mValues.size() - 1;
        int r2 = 0;
    L3:
        if (r2 > r1) goto L19;
        int r3 = (r1 + r2) / 2;
        T r4 = this.mValues.get(r3);
        if (r7 == r4.getX()) goto L6;
        if (r7 > r4.getX()) goto L17;
        r1 = r3 - 1;
        goto L3
    L17:
        r2 = r3 + 1;
    L6:
        if (r3 <= 0) goto L10;
        if (this.mValues.get(r3 - 1).getX() != r7) goto L10;
        r3 = r3 - 1;
    L10:
        int r12 = this.mValues.size();
    L11:
        if (r3 >= r12) goto L19;
        T r22 = this.mValues.get(r3);
        if (r22.getX() != r7) goto L19;
        r02.add(r22);
        r3 = r3 + 1;
    L19:
        return r02;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryCount() {
        return this.mValues.size();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForIndex(int r2) {
        return this.mValues.get(r2);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForXValue(float r1, float r2, Rounding r3) {
        int r12 = getEntryIndex(r1, r2, r3);
        if (r12 > (-1)) goto L5;
        return null;
    L5:
        return this.mValues.get(r12);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(Entry r2) {
        return this.mValues.indexOf(r2);
    }

    public List<T> getValues() {
        return this.mValues;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getXMax() {
        return this.mXMax;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getXMin() {
        return this.mXMin;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMax() {
        return this.mYMax;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMin() {
        return this.mYMin;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntry(T r3) {
        if (r3 != null) goto L5;
        return false;
    L5:
        List<T> r1 = this.mValues;
        if (r1 != null) goto L8;
        return false;
    L8:
        boolean r32 = r1.remove(r3);
        if (r32 == false) goto L11;
        calcMinMax();
    L11:
        return r32;
    }

    public void setValues(List<T> r1) {
        this.mValues = r1;
        notifyDataSetChanged();
    }

    public String toSimpleString() {
        StringBuffer r02 = new StringBuffer();
        StringBuilder r1 = new StringBuilder();
        r1.append("DataSet, label: ");
        if (getLabel() != null) goto L5;
        String r2 = "";
    L6:
        r1.append(r2);
        r1.append(", entries: ");
        r1.append(this.mValues.size());
        r1.append("\n");
        r02.append(r1.toString());
        return r02.toString();
    L5:
        r2 = getLabel();
        goto L6
    }

    public String toString() {
        StringBuffer r02 = new StringBuffer();
        r02.append(toSimpleString());
        int r1 = 0;
    L4:
        if (r1 >= this.mValues.size()) goto L7;
        r02.append(this.mValues.get(r1).toString() + " ");
        r1 = r1 + 1;
        goto L4
    L7:
        return r02.toString();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(float r11, float r12, Rounding r13) {
        List<T> r02 = this.mValues;
        if (r02 != null) goto L5;
    L53:
        return -1;
    L5:
        if (r02.isEmpty() == true) goto L53;
        int r03 = this.mValues.size() - 1;
        int r2 = 0;
    L8:
        if (r2 >= r03) goto L21;
        int r3 = (r2 + r03) / 2;
        float r4 = this.mValues.get(r3).getX() - r11;
        int r6 = r3 + 1;
        float r5 = this.mValues.get(r6).getX() - r11;
        float r7 = Math.abs(r4);
        float r52 = Math.abs(r5);
        if (r52 < r7) goto L11;
        if (r7 < r52) goto L17;
        double r42 = r4;
        if (r42 >= 0.0d) goto L17;
        if (r42 >= 0.0d) goto L8;
    L17:
        r03 = r3;
    L11:
        r2 = r6;
        goto L8
    L21:
        if (r03 == (-1)) goto L52;
        float r1 = this.mValues.get(r03).getX();
        if (r13 != Rounding.UP) goto L30;
        if (r1 >= r11) goto L36;
        if (r03 >= (this.mValues.size() - 1)) goto L36;
        r03 = r03 + 1;
    L36:
        if (Float.isNaN(r12) == true) goto L52;
    L37:
        if (r03 <= 0) goto L41;
        if (this.mValues.get(r03 - 1).getX() != r1) goto L41;
        r03 = r03 - 1;
    L41:
        float r112 = this.mValues.get(r03).getY();
    L42:
        int r132 = r03;
    L43:
        r03 = r03 + 1;
        if (r03 >= this.mValues.size()) goto L48;
        T r22 = this.mValues.get(r03);
        if (r22.getX() != r1) goto L48;
        if (Math.abs(r22.getY() - r12) >= Math.abs(r112 - r12)) goto L43;
        r112 = r12;
    L48:
        return r132;
    L30:
        if (r13 != Rounding.DOWN) goto L36;
        if (r1 <= r11) goto L36;
        if (r03 <= 0) goto L36;
        r03 = r03 - 1;
    L52:
        return r03;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForXValue(float r2, float r3) {
        return (T) getEntryForXValue(r2, r3, Rounding.CLOSEST);
    }

    public void calcMinMaxY(T r3) {
        if (r3.getY() >= this.mYMin) goto L6;
        this.mYMin = r3.getY();
    L6:
        if (r3.getY() <= this.mYMax) goto L9;
        this.mYMax = r3.getY();
        return;
    }

    public void calcMinMax(T r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        calcMinMaxX(r1);
        calcMinMaxY(r1);
    }
}
