class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i=0; i<CARD_NUM; i++) {
            int cardNum;
            boolean isKwang = false;

            int[] kwangArr = {1, 3, 8};

            cardNum = (int)(i+2) / 2;

            for (int element : kwangArr) {
                if (cardNum == element) {
                    isKwang = i % 2 == 1;
                }
            }
            cards[i] = new SutdaCard(cardNum, isKwang);
        }
    }

    void shuffle() {
        for (int i=0; i<cards.length; i++) {
            int j = (int)(Math.random() * cards.length);
            SutdaCard tmp = cards[i];
            cards[j] = cards[i];
            cards[i] = tmp;
        }
    }

    SutdaCard pick(int index) {
        if (index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard pick() {
        int index = (int)(Math.random() * cards.length);
        return pick(index);
    }

}

class SutdaCard {
    final int num;
    final boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        for (int i=0; i< deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}

// 54, 278