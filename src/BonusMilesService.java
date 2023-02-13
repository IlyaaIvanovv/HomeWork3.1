public class BonusMilesService {

    public int calculate(int price){
        int miles; // переменная для кол-ва миль
        int bonus = 20; // 1 миля за 20 рублей
        miles = price / bonus;
        return miles; // мили на выходе
    }
}
