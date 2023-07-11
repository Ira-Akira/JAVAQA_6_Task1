package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) { // income (увеличение) , expenses (уменьшение), threshold (порог, возможность отдыха)
        int balance = 0; // кол-во денег на счету
        int counter = 0; // счетчик месяцев на отдых

        for (int month = 0; month < 12; month++) { // цикл длится 12 раз раз в году
            if (balance >= threshold) { // возможность отдыха (баланс больше порога)
                balance = balance - expenses; // (balance -= expenses) уменьшение денег при желании отдохнуть
                balance = balance / 3; // (balance /= 3) по условию остаток ещё уменьшается на три раза
                counter++; // увеличение счетчика на
            } else {
                balance = balance + income; // (balance += income) увеличение баланса при желании поработать
                balance = balance - expenses; // (balance -= expenses) уменьшение на обязательные траты в месяц
            }
        }

        return counter;
    }
}
