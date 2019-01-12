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

        Ingredient ingredient1 = new Ingredient();
        ingredient1.ingredientName = "woda";
        ingredient1.amount = 225;
        drink1.ingredient1 = ingredient1;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.ingredientName = "herbata";
        ingredient2.amount = 10;
        drink1.ingredient2 = ingredient2;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.ingredientName = "cukier";
        ingredient3.amount = 5;
        drink1.ingredient3 = ingredient3;

        System.out.println("INFORMACJE O NAPOJU:");
        System.out.printf("Nazwa: %s\nCena: %d\nZawartość alkoholu: %s\n", drink1.drinkName, drink1.price, czyZawieraAlkohol);
        System.out.printf("Składniki:\n- %s, %d ml\n", ingredient1.ingredientName, ingredient1.amount);
        System.out.printf("- %s, %d ml\n", ingredient2.ingredientName, ingredient2.amount);
        System.out.printf("- %s, %d ml\n", ingredient3.ingredientName, ingredient3.amount);

        int capacity = ingredient1.amount + ingredient2.amount + ingredient3.amount;

        System.out.println("Pojemność drinka: " + capacity + " ml.");

    }
}