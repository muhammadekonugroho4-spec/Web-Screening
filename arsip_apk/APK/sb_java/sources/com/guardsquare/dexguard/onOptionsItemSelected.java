package com.guardsquare.dexguard;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class onOptionsItemSelected extends FilterInputStream {
    private static final short unregisterForContextMenu = 0;
    private int Movie;
    private int decodeByteArray;
    private int height;
    private int onContextItemSelected;
    private byte[] onOptionsItemSelected;
    private byte[] openContextMenu;
    private int registerForContextMenu;
    private byte[] setContentView;
    private int setTime;
    private int valueOf;
    private int values;
    private int width;

    static {
        unregisterForContextMenu = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    }

    public onOptionsItemSelected(InputStream r6, int[] r7, int r8, byte[] r9, int r10, int r11) throws IOException {
        super(r6);
        this.valueOf = Integer.MAX_VALUE;
        this.setContentView = new byte[8];
        this.onOptionsItemSelected = new byte[8];
        this.openContextMenu = new byte[8];
        this.registerForContextMenu = 8;
        this.width = 8;
        this.values = Math.min(Math.max(r10, 5), 16);
        this.Movie = r11;
        if (r11 != 3) goto L5;
        System.arraycopy(r9, 0, this.onOptionsItemSelected, 0, 8);
    L5:
        long r92 = ((r7[0] & 4294967295L) << 32) | (4294967295L & r7[1]);
        if (r8 != 0) goto L9;
        this.onContextItemSelected = (int) r92;
        long r72 = r92 >> 3;
        short r112 = unregisterForContextMenu;
        this.setTime = (int) ((r112 * r72) >> 32);
        this.decodeByteArray = (int) (r92 >> 32);
        this.height = (int) (r72 + r112);
        return;
    L9:
        int r73 = (int) r92;
        this.onContextItemSelected = r73;
        this.setTime = r73 * r8;
        this.decodeByteArray = r73 ^ r8;
        this.height = (int) (r92 >> 32);
    }

    private void setContentView() {
        if (this.Movie != 3) goto L5;
        byte[] r1 = this.setContentView;
        System.arraycopy(r1, 0, this.openContextMenu, 0, r1.length);
    L5:
        byte[] r12 = this.setContentView;
        boolean r6 = true;
        char r7 = 2;
        int r4 = ((((r12[0] << Ascii.CAN) & (-16777216)) + ((r12[1] << Ascii.DLE) & 16711680)) + ((r12[2] << 8) & 65280)) + (r12[3] & UnsignedBytes.MAX_VALUE);
        int r5 = ((((-16777216) & (r12[4] << Ascii.CAN)) + (16711680 & (r12[5] << Ascii.DLE))) + (65280 & (r12[6] << 8))) + (r12[7] & UnsignedBytes.MAX_VALUE);
        int r13 = 0;
    L6:
        int r132 = this.values;
        if (r13 >= r132) goto L9;
        short r14 = unregisterForContextMenu;
        boolean r17 = r6;
        r5 = r5 - (((((r132 - r13) * r14) + r4) ^ ((r4 << 4) + this.decodeByteArray)) ^ ((r4 >>> 5) + this.height));
        r4 = r4 - ((((r5 << 4) + this.onContextItemSelected) ^ ((r14 * (r132 - r13)) + r5)) ^ ((r5 >>> 5) + this.setTime));
        r13 = r13 + 1;
        r7 = r7;
        r6 = r17;
        goto L6
    L9:
        byte[] r15 = this.setContentView;
        r15[0] = (byte) (r4 >> 24);
        r15[r6 ? 1 : 0] = (byte) (r4 >> 16);
        r15[r7] = (byte) (r4 >> 8);
        r15[3] = (byte) r4;
        r15[4] = (byte) (r5 >> 24);
        r15[5] = (byte) (r5 >> 16);
        r15[6] = (byte) (r5 >> 8);
        r15[7] = (byte) r5;
        if (this.Movie != 3) goto L18;
        int r16 = 0;
    L12:
        if (r16 >= 8) goto L14;
        byte[] r3 = this.setContentView;
        r3[r16] = (byte) (r3[r16] ^ this.onOptionsItemSelected[r16]);
        r16 = r16 + 1;
        goto L12
    L14:
        byte[] r18 = this.openContextMenu;
        System.arraycopy(r18, 0, this.onOptionsItemSelected, 0, r18.length);
        return;
    }

    private int unregisterForContextMenu() throws IOException {
        if (this.valueOf != Integer.MAX_VALUE) goto L5;
        this.valueOf = ((FilterInputStream) this).in.read();
    L5:
        int r1 = 8;
        if (this.registerForContextMenu != 8) goto L24;
        byte[] r02 = this.setContentView;
        int r2 = this.valueOf;
        r02[0] = (byte) r2;
        if (r2 < 0) goto L22;
        int r22 = 1;
    L10:
        int r3 = ((FilterInputStream) this).in.read(this.setContentView, r22, 8 - r22);
        if (r3 <= 0) goto L14;
        r22 = r22 + r3;
        if (r22 < 8) goto L10;
    L14:
        if (r22 < 8) goto L20;
        setContentView();
        int r03 = ((FilterInputStream) this).in.read();
        this.valueOf = r03;
        this.registerForContextMenu = 0;
        if (r03 >= 0) goto L18;
        r1 = 8 - (this.setContentView[7] & UnsignedBytes.MAX_VALUE);
    L18:
        this.width = r1;
        goto L24
    L20:
        throw new IllegalStateException("unexpected block size");
    L22:
        throw new IllegalStateException("unexpected block size");
    L24:
        return this.width;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        unregisterForContextMenu();
        return this.width - this.registerForContextMenu;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        unregisterForContextMenu();
        int r02 = this.registerForContextMenu;
        if (r02 < this.width) goto L6;
        return -1;
    L6:
        byte[] r1 = this.setContentView;
        this.registerForContextMenu = r02 + 1;
        return r1[r02] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r5) throws IOException {
        long r02 = 0;
    L4:
        if (r02 >= r5) goto L8;
        if (read() == (-1)) goto L8;
        r02 = r02 + 1;
    L8:
        return r02;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r7, int r8, int r9) throws IOException {
        int r02 = r8 + r9;
        int r1 = r8;
    L3:
        if (r1 >= r02) goto L12;
        unregisterForContextMenu();
        int r2 = this.registerForContextMenu;
        if (r2 >= this.width) goto L6;
        byte[] r4 = this.setContentView;
        this.registerForContextMenu = r2 + 1;
        r7[r1] = r4[r2];
        r1 = r1 + 1;
        goto L3
    L6:
        if (r1 != r8) goto L10;
        return -1;
    L10:
        return r9 - (r02 - r1);
    L12:
        return r9;
    }
}
