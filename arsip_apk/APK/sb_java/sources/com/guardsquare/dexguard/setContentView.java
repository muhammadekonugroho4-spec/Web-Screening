package com.guardsquare.dexguard;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class setContentView extends FilterInputStream {
    private int Movie;
    private int onContextItemSelected;
    private byte[] onOptionsItemSelected;
    private final int openContextMenu;
    private byte[] registerForContextMenu;
    private byte[] setContentView;
    private openContextMenu unregisterForContextMenu;
    private int valueOf;
    private int values;
    private int[] width;

    public setContentView(InputStream r3, int[] r4, byte[] r5, int r6, boolean r7, int r8) throws IOException {
        super(r3);
        this.values = Integer.MAX_VALUE;
        int r32 = Math.min(Math.max(r6, 3), 16);
        this.openContextMenu = r32;
        this.registerForContextMenu = new byte[8];
        byte[] r72 = new byte[8];
        this.setContentView = r72;
        this.onOptionsItemSelected = new byte[8];
        this.width = new int[2];
        this.Movie = 8;
        this.onContextItemSelected = 8;
        this.valueOf = r8;
        if (r8 != 2) goto L5;
        System.arraycopy(r5, 0, r72, 0, 8);
    L5:
        this.unregisterForContextMenu = new openContextMenu(r4, r32, true, false);
    }

    private void registerForContextMenu() {
        if (this.valueOf != 2) goto L5;
        byte[] r1 = this.registerForContextMenu;
        System.arraycopy(r1, 0, this.onOptionsItemSelected, 0, r1.length);
    L5:
        byte[] r12 = this.registerForContextMenu;
        int r122 = ((((r12[0] << Ascii.CAN) & (-16777216)) + ((r12[1] << Ascii.DLE) & 16711680)) + ((r12[2] << 8) & 65280)) + (r12[3] & UnsignedBytes.MAX_VALUE);
        int r13 = ((((-16777216) & (r12[4] << Ascii.CAN)) + (16711680 & (r12[5] << Ascii.DLE))) + (65280 & (r12[6] << 8))) + (r12[7] & UnsignedBytes.MAX_VALUE);
        int r15 = this.openContextMenu;
        openContextMenu r14 = this.unregisterForContextMenu;
        unregisterForContextMenu.unregisterForContextMenu(r122, r13, false, r15, r14.registerForContextMenu, r14.setContentView, this.width);
        int[] r16 = this.width;
        int r5 = r16[0];
        int r17 = r16[1];
        byte[] r123 = this.registerForContextMenu;
        r123[0] = (byte) (r5 >> 24);
        r123[1] = (byte) (r5 >> 16);
        r123[2] = (byte) (r5 >> 8);
        r123[3] = (byte) r5;
        r123[4] = (byte) (r17 >> 24);
        r123[5] = (byte) (r17 >> 16);
        r123[6] = (byte) (r17 >> 8);
        r123[7] = (byte) r17;
        if (this.valueOf != 2) goto L13;
        int r18 = 0;
    L8:
        if (r18 >= 8) goto L10;
        byte[] r3 = this.registerForContextMenu;
        r3[r18] = (byte) (r3[r18] ^ this.setContentView[r18]);
        r18 = r18 + 1;
        goto L8
    L10:
        byte[] r19 = this.onOptionsItemSelected;
        System.arraycopy(r19, 0, this.setContentView, 0, r19.length);
        return;
    }

    private int unregisterForContextMenu() throws IOException {
        if (this.values != Integer.MAX_VALUE) goto L5;
        this.values = ((FilterInputStream) this).in.read();
    L5:
        int r1 = 8;
        if (this.Movie != 8) goto L24;
        byte[] r02 = this.registerForContextMenu;
        int r2 = this.values;
        r02[0] = (byte) r2;
        if (r2 < 0) goto L22;
        int r22 = 1;
    L10:
        int r3 = ((FilterInputStream) this).in.read(this.registerForContextMenu, r22, 8 - r22);
        if (r3 <= 0) goto L14;
        r22 = r22 + r3;
        if (r22 < 8) goto L10;
    L14:
        if (r22 < 8) goto L20;
        registerForContextMenu();
        int r03 = ((FilterInputStream) this).in.read();
        this.values = r03;
        this.Movie = 0;
        if (r03 >= 0) goto L18;
        r1 = 8 - (this.registerForContextMenu[7] & UnsignedBytes.MAX_VALUE);
    L18:
        this.onContextItemSelected = r1;
        goto L24
    L20:
        throw new IllegalStateException("unexpected block size");
    L22:
        throw new IllegalStateException("unexpected block size");
    L24:
        return this.onContextItemSelected;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        unregisterForContextMenu();
        return this.onContextItemSelected - this.Movie;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        unregisterForContextMenu();
        int r02 = this.Movie;
        if (r02 < this.onContextItemSelected) goto L6;
        return -1;
    L6:
        byte[] r1 = this.registerForContextMenu;
        this.Movie = r02 + 1;
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
        int r2 = this.Movie;
        if (r2 >= this.onContextItemSelected) goto L6;
        byte[] r4 = this.registerForContextMenu;
        this.Movie = r2 + 1;
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
