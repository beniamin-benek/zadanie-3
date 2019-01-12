class Main {

    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.drinkName = "herbata";
        drink1.price = 5;
        drink1.containsAlcohol = false;
        String czyZawieraAlkohol; //tłumaczenie na polski

        if (drink1.containsAlcohol)
            czyZawieraAlkohol = "zawiera";
        else
            czyZawieraAlkohol = "brak";

        drink1.ingredient1 = new Ingredient();
        drink1.ingredient1.ingredientName = "woda";
        drink1.ingredient1.amount = 225;

        drink1.ingredient2 = new Ingredient();
        drink1.ingredient2.ingredientName = "herbata";
        drink1.ingredient2.amount = 10;

        drink1.ingredient3 = new Ingredient();
        drink1.ingredient3.ingredientName = "cukier";
        drink1.ingredient3.amount = 5;

        System.out.println("INFORMACJE O NAPOJU:");
        System.out.printf("Nazwa: %s\nCena: %d zł\nZawartość alkoholu: %s\n", drink1.drinkName, drink1.price, czyZawieraAlkohol);
        System.out.printf("Składniki:\n- %s, %d ml\n",  drink1.ingredient1.ingredientName, drink1.ingredient1.amount);
        System.out.printf("- %s, %d ml\n", drink1.ingredient2.ingredientName, drink1.ingredient2.amount);
        System.out.printf("- %s, %d ml\n", drink1.ingredient3.ingredientName, drink1.ingredient3.amount);

        int capacity = drink1.ingredient1.amount + drink1.ingredient2.amount + drink1.ingredient3.amount;

        System.out.println("Pojemność drinka: " + capacity + " ml.");

    }
}