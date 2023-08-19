package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;

        while (counter <= printToInclusive) {
            boolean isPrime = true;
            int num = 2;

            //Перебираем числа. Если есть делитель, кроме 1 и counter, значит число составное
            while (num < counter) {
                if (counter % num == 0) {
                    isPrime = false;
                }
                num++;
            }

            //Если число простое, печатаем
            if (isPrime) {
                System.out.println(counter);
            }

            counter++;
        }
    }
}
