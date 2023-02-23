package com.example.homework5;

public class Calculation {

    public final double gEarth = 9.80665;
    public final double gMars = 3.721;

    // содание пустого конструктора
    public Calculation() {
    }

    // метод вычисления массы топлива по величине груза
    public long massFuelCalculation(String input) {
        // проверка корректности вводимого значения
        if (input.contains(",")) { // если в вводимой строке есть запятая, то

            String inputMod = input.replace(",", "."); // заменим запятую на точку

            // конвертирование входного значения из String в float
            float inputFloat = Float.parseFloat(inputMod);

            // возват вычисленного значения
            return (long) (inputFloat * gEarth);

        } else {
            // конвертирование входного значения из String в float
            float inputFloat = Float.parseFloat(input);

            // возврат вычисленного значения
            return (long) ( 100 * inputFloat * gMars / gEarth);
        }
    }
}
