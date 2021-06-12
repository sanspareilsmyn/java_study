class Exercise7_19 {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (money > p.price) {
            money -= p.price;
            add(p);
        }
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] newCart = new Product[cart.length * 2];
            for (int j=0; j<cart.length; j++) {
                newCart[j] = cart[j];
            }
            cart = newCart;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        String productList = "";
        int moneySpent = 0;
        int moneyLeft;

        for (int j=0; j<i; j++){
            productList += cart[j].toString();
            productList += ",";
            moneySpent += cart[j].price;
        }
        moneyLeft = 1000 - moneySpent;

        System.out.println(productList);
        System.out.println(moneySpent);
        System.out.println(moneyLeft);

    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() { super(100); }

    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer() { super(200); }

    public String toString() {return "Computer";}
}

class Audio extends Product {
    Audio() { super(50); }

    public String toString() {return "Audio";}
}
