public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int add = 1100;
        int bonus;
        //balance - текущий баланс
        //add - сумма пополнения
        //bonus - для подсчета бонусного вознаграждения

        if (add > 1000) {
            bonus = add / 100;
            //бонус считается в условии, чтобы в дальнейшем можно было менять бонус в зависимости от условий
            balance = balance + add + bonus;
        } else {
            balance = balance + add;
        }
        System.out.println(balance);

    }
}
