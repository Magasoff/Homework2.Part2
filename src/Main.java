public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int apple = 5;
        System.out.println("Значение переменной aplle с типом int равно " + apple);
        byte banana = 114;
        System.out.println("Значение переменной banana с типом byte равно " + banana);
        short citrus = 28456;
        System.out.println("Значение переменной citrus с типом short равно " + citrus);
        long pineapple = 7_569_284_234L;
        System.out.println("Значение переменной pineapple с типом long равно " + pineapple);
        float cherry = 25.384F;
        System.out.println("Значение переменной cherry с типом float равно " + cherry);
        double orange = 74.56;
        System.out.println("Значение переменной orange с типом double равно " + orange);

        System.out.println("Задание 2");
        double oneCase = 27.12;
        long twoCase = 987678965549l;
        float threeCase = 2.786f;
        char forCase = 569;
        int fiveCase = -159;
        short sixCase = 27897;
        byte sevenCase = 67;
        boolean eightCase = false;

        System.out.println("Задание 3");
        int studentsInFirstClassrom = 23;
        int studentsInSecondClassrom = 27;
        int studentsInThirdClassrom = 30;
        int paper = 480;
        int allPaper = paper / (studentsInFirstClassrom + studentsInSecondClassrom + studentsInThirdClassrom);
        System.out.println("На каждого ученика рассчитано " + allPaper + " листов бумаги");

        System.out.println("Задание 4");
        int bottleTwoMinutes = 16;
        int minutes = 2;
        int resurs = bottleTwoMinutes / minutes;
        int firstTimeInMinute = 20;
        System.out.println("За " + firstTimeInMinute + " минут машина произвела бутылок " + resurs * firstTimeInMinute + " штук ");
        int minutesDay = 24 * 60;
        System.out.println("За " + minutesDay + " минут машина произвела бутылок " + resurs * minutesDay + " штук ");
        int threeMinutesDay = 3 * minutesDay;
        System.out.println("За " + minutesDay + " минут машина произвела бутылок " + resurs * threeMinutesDay + " штук ");
        int monthMinutesDay = 10 * threeMinutesDay;
        System.out.println("За " + minutesDay + " минут машина произвела бутылок " + resurs * monthMinutesDay + " штук ");

        System.out.println("Задание 5");
        int totalPaint = 120;
        int brownPaint = 4;
        int whitePaint = 2;
        int schoolClassPaint = totalPaint / (brownPaint + whitePaint);
        System.out.println("Всего классов в школе " + schoolClassPaint);
        System.out.println("В школе, где " + schoolClassPaint + " классов, нужно " + whitePaint * schoolClassPaint + " банок белой краски и " + brownPaint * schoolClassPaint + " банок коричневой краски");

        System.out.println("Задание 6");
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalWeight = (bananas + milk + iceCream + eggs);
        System.out.println("Вес такого коктейля составляет " + totalWeight + " грамм");
        float kgWeight = totalWeight / 1000f;
        System.out.println("Вес коктейля составляет " + kgWeight + " кг");

        System.out.println("Задание 7");
        int weightBoxer = 7 * 1000; //кг в граммы
        int dayWeight = weightBoxer / 250;
        System.out.println("Уйдет на похудение, если каждый день спортсмен будет терять 250 грамм " + dayWeight + " дней");
        int twodayWeight = weightBoxer / 500;
        System.out.println("Уйдет на похудение, если каждый день спортсмен будет терять 500 грамм " + twodayWeight + " дней");
        int totalDayWeight = (dayWeight + twodayWeight) / 2;
        System.out.println("В среднем потребуется для похудения " + totalWeight + " дней");

        System.out.println("Задание 8");
        int salaryMasha = 67760;  // Зарплата Маши
        int salaryInYearMasha = salaryMasha * 12;
        int salaryIncreaseMasha = salaryMasha / 100 * 10; // Сколько должно прибавиться к зарплате
        int newSalaryMasha = salaryMasha + salaryIncreaseMasha; // Новая зарплата маши
        int monthlySalaryMasha = newSalaryMasha * 12; // Новая зарплата Маши в год
        int SalaryDifferenceMasha = monthlySalaryMasha - salaryInYearMasha;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей, Годовой доход вырос на " + monthlySalaryMasha + " рублей, разница между годовым доходом до повышения и после " + SalaryDifferenceMasha + " рублей");

        int salaryDenis = 83690;  // Зарплата Дениса
        int salaryInYearDenis = salaryDenis * 12;
        int salaryIncreaseDenis = salaryDenis / 100 * 10; // Сколько должно прибавиться к зарплате
        int newSalaryDenis = salaryDenis + salaryIncreaseDenis; // Новая зарплата Дениса
        int monthlySalaryDenis = newSalaryDenis * 12; // Новая зарплата Дениса в год
        int SalaryDifferenceDenis = monthlySalaryDenis - salaryInYearDenis; // Разница
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей, Годовой доход вырос на " + monthlySalaryDenis + " рублей, разница между годовым доходом до повышения и после " + SalaryDifferenceDenis + " рублей");

        int salaryKristina = 76230;  // Зарплата Кристины
        int salaryInYearKristina = salaryKristina * 12;
        int salaryIncreaseKristina = salaryKristina / 100 * 10; // Сколько должно прибавиться к зарплате
        int newSalaryKristina = salaryKristina + salaryIncreaseKristina; // Новая зарплата Кристины
        int monthlySalaryKristina = newSalaryKristina * 12; // Новая зарплата Кристины в год
        int SalaryDifferenceKristina = monthlySalaryKristina - salaryInYearKristina; // Разница
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей, Годовой доход вырос на " + monthlySalaryKristina + " рублей, разница между годовым доходом до повышения и после " + SalaryDifferenceKristina + " рублей");
    }
}