package com.midtrans.sdk.corekit.models;

/* loaded from: classes6.dex */
public class CardViewModel {
    private SaveCardRequest cardDetail;
    private boolean isSelected;

    public CardViewModel(SaveCardRequest r1) {
        setCardDetail(r1);
        setIsSelected(false);
    }

    public SaveCardRequest getCardDetail() {
        return this.cardDetail;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCardDetail(SaveCardRequest r1) {
        this.cardDetail = r1;
    }

    public void setIsSelected(boolean r1) {
        this.isSelected = r1;
    }
}
