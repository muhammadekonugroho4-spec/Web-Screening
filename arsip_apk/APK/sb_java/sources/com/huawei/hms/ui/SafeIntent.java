package com.huawei.hms.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class SafeIntent extends Intent {
    public SafeIntent(Intent r1) {
        if (r1 != null) goto L4;
        r1 = new Intent();
    L4:
        super(r1);
    }

    @Override // android.content.Intent
    public String getAction() {
        return super.getAction();
    L4:
        return "";
    }

    @Override // android.content.Intent
    public boolean[] getBooleanArrayExtra(String r1) {
        return super.getBooleanArrayExtra(r1);
    L5:
        return new boolean[0];
    }

    @Override // android.content.Intent
    public boolean getBooleanExtra(String r1, boolean r2) {
        return super.getBooleanExtra(r1, r2);
    L4:
        return r2;
    }

    @Override // android.content.Intent
    public Bundle getBundleExtra(String r1) {
        return super.getBundleExtra(r1);
    L5:
        return new Bundle();
    }

    @Override // android.content.Intent
    public byte[] getByteArrayExtra(String r1) {
        return super.getByteArrayExtra(r1);
    L5:
        return new byte[0];
    }

    @Override // android.content.Intent
    public byte getByteExtra(String r1, byte r2) {
        return super.getByteExtra(r1, r2);
    L4:
        return r2;
    }

    @Override // android.content.Intent
    public char[] getCharArrayExtra(String r1) {
        return super.getCharArrayExtra(r1);
    L5:
        return new char[0];
    }

    @Override // android.content.Intent
    public char getCharExtra(String r1, char r2) {
        return super.getCharExtra(r1, r2);
    L4:
        return r2;
    }

    @Override // android.content.Intent
    public CharSequence[] getCharSequenceArrayExtra(String r1) {
        return super.getCharSequenceArrayExtra(r1);
    L5:
        return new CharSequence[0];
    }

    @Override // android.content.Intent
    public ArrayList<CharSequence> getCharSequenceArrayListExtra(String r1) {
        return super.getCharSequenceArrayListExtra(r1);
    L5:
        return new ArrayList();
    }

    @Override // android.content.Intent
    public CharSequence getCharSequenceExtra(String r1) {
        return super.getCharSequenceExtra(r1);
    L4:
        return "";
    }

    @Override // android.content.Intent
    public double[] getDoubleArrayExtra(String r1) {
        return super.getDoubleArrayExtra(r1);
    L5:
        return new double[0];
    }

    @Override // android.content.Intent
    public double getDoubleExtra(String r1, double r2) {
        return super.getDoubleExtra(r1, r2);
    L4:
        return r2;
    }

    @Override // android.content.Intent
    public Bundle getExtras() {
        return super.getExtras();
    L5:
        return new Bundle();
    }

    @Override // android.content.Intent
    public float[] getFloatArrayExtra(String r1) {
        return super.getFloatArrayExtra(r1);
    L5:
        return new float[0];
    }

    @Override // android.content.Intent
    public float getFloatExtra(String r1, float r2) {
        return super.getFloatExtra(r1, r2);
    L4:
        return r2;
    }

    @Override // android.content.Intent
    public int[] getIntArrayExtra(String r1) {
        return super.getIntArrayExtra(r1);
    L5:
        return new int[0];
    }

    @Override // android.content.Intent
    public int getIntExtra(String r1, int r2) {
        return super.getIntExtra(r1, r2);
    L4:
        return r2;
    }

    @Override // android.content.Intent
    public ArrayList<Integer> getIntegerArrayListExtra(String r1) {
        return super.getIntegerArrayListExtra(r1);
    L5:
        return new ArrayList();
    }

    @Override // android.content.Intent
    public long[] getLongArrayExtra(String r1) {
        return super.getLongArrayExtra(r1);
    L5:
        return new long[0];
    }

    @Override // android.content.Intent
    public long getLongExtra(String r1, long r2) {
        return super.getLongExtra(r1, r2);
    L4:
        return r2;
    }

    @Override // android.content.Intent
    public Parcelable[] getParcelableArrayExtra(String r1) {
        return super.getParcelableArrayExtra(r1);
    L5:
        return new Parcelable[0];
    }

    @Override // android.content.Intent
    public <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String r1) {
        return super.getParcelableArrayListExtra(r1);
    L4:
        return null;
    }

    @Override // android.content.Intent
    public <T extends Parcelable> T getParcelableExtra(String r1) {
        return (T) super.getParcelableExtra(r1);
    L4:
        return null;
    }

    @Override // android.content.Intent
    public Serializable getSerializableExtra(String r1) {
        return super.getSerializableExtra(r1);
    L4:
        return null;
    }

    @Override // android.content.Intent
    public short[] getShortArrayExtra(String r1) {
        return super.getShortArrayExtra(r1);
    L5:
        return new short[0];
    }

    @Override // android.content.Intent
    public short getShortExtra(String r1, short r2) {
        return super.getShortExtra(r1, r2);
    L4:
        return r2;
    }

    @Override // android.content.Intent
    public String[] getStringArrayExtra(String r1) {
        return super.getStringArrayExtra(r1);
    L5:
        return new String[0];
    }

    @Override // android.content.Intent
    public ArrayList<String> getStringArrayListExtra(String r1) {
        return super.getStringArrayListExtra(r1);
    L5:
        return new ArrayList();
    }

    @Override // android.content.Intent
    public String getStringExtra(String r1) {
        return super.getStringExtra(r1);
    L4:
        return "";
    }

    @Override // android.content.Intent
    public boolean hasExtra(String r1) {
        return super.hasExtra(r1);
    L4:
        return false;
    }
}
